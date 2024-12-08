
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//-----------------------------------------------------
// Title: QuickSort
// Author: Poyraz Koca
// Description:sorting arrays of Comparable objects using the QuickSort algorithm
//-----------------------------------------------------


public class QuickSort
{
    public static final Random range = new Random();


 /*public static void sort(Comparable[] a)
 {
 shuffle(a); // Eliminate dependence on input.
 sort(a, 0, a.length - 1);
 } */



    //--------------------------------------------------------
    // Summary: Sorts an array of Comparable objects using a shuffling method to eliminate dependence on input order.
    // Precondition: a is an array of Comparable objects.
    // Postcondition: The array a is sorted in non-decreasing order.
    //--------------------------------------------------------
    public static void sort(Comparable[] a)

    {
        shuffle(a); // Eliminate dependence on input.


        sort(a, 0, a.length - 1);

    }
    private static void sort (Comparable[] a, int lo, int hi) {


        if (hi <= lo) return;


        int j = partition(a, lo, hi);

        // Partition (see page 291).
        sort(a, lo, j-1); // Sort left part a[lo .. j-1].
        sort(a, j+1, hi); // Sort right part a[j+1 .. hi].
    }

    //--------------------------------------------------------
    // Summary: Partitions a subarray of Comparable objects using the value at index 'lo' as the pivot.
    // Precondition: 'a' is an array of Comparable objects. 'lo' and 'hi' are indices specifying the
    // range of the subarray to partition.
    // Postcondition: Partitions the subarray 'a[lo..hi]' such that elements less than the pivot are
    // on the left side and elements greater than the pivot are on the right side. Returns the index
    // of the pivot after partitioning.
    //--------------------------------------------------------
    static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi+1;
        Comparable v = a[lo];
        while (true) {
            while (less(v, a[++i])) if (i == hi) break;
            while (less(a[--j], v)) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    //--------------------------------------------------------
    // Summary: Compares two Comparable objects.
    // Precondition: 'v' and 'w' are Comparable objects.
    // Postcondition: Returns true if 'v' is less than 'w' according to their natural ordering,
    // and false otherwise.
    //--------------------------------------------------------
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    //--------------------------------------------------------
//Summary: Exchanges the positions of two elements in an array.
//Precondition: 'a' is an array of Comparable objects. 'i' and 'j' are indices
//specifying the positions of the elements to exchange.
//Postcondition: Exchanges the elements at indices 'i' and 'j' in the array 'a'.
//--------------------------------------------------------
    public static void exch(Comparable[] a, int i, int j) {

        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    //--------------------------------------------------------
//Summary: Shuffles the elements of an array randomly.
//Precondition: 'a' is an array of objects.
//Postcondition: Rearranges the elements of the array 'a' in random order.
//--------------------------------------------------------
    public static void shuffle(Object[] a) {


//     for (int i = 0; i < a.length; i++) {
//
//			int r = i + range.nextInt(a.length - i); // between i and a.length-1
//         Object temp = a[i];
//         a[i] = a[r];

//         a[r] = temp;
        List<Comparable> list = new ArrayList<>();

        for (Object item : a) {
            list.add((Comparable)item);
        }
        Collections.shuffle(list);
        list.toArray(a);
    }

}
