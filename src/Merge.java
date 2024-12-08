public class Merge{
    //-----------------------------------------------------
    // Title: Merge
    //Author: Poyraz Koca
    // Description:provides methods for sorting arrays of Comparable objects using the MergeSort algorithm
    //-----------------------------------------------------

    private static Comparable[] aux; // auxiliary array for merges

    //--------------------------------------------------------
//Summary: Sorts an array of Comparable objects using the MergeSort algorithm.
//Precondition: 'a' is an array of Comparable objects.
//Postcondition: Sorts the array 'a' in non-decreasing order.
//--------------------------------------------------------
    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length];
        //Allocate space just once.
        sort(a, 0, a.length - 1);
    }

    //--------------------------------------------------------
// Summary: Assigns a value to the variable whose
// name is given.
// Precondition: varName is a char and varValue is an
// integer
// Postcondition: The value of the variable is set.
//-------------------------------------------------------
    private static void sort(Comparable[] a, int lo, int hi)
    { // Sort a[lo..hi].


        if (hi <= lo) return;

        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid); // Sort left half.
        sort(a, mid+1, hi); // Sort right half.
        merge(a, lo, mid, hi); // Merge results (code on page 271).
    }


    //--------------------------------------------------------
    // Summary: Merges two sorted subarrays into one sorted array.
    // Precondition: a is an array of Comparable objects, lo, mid, and hi are integer indices indicating the range of the subarrays.
    // Postcondition: The subarrays a[lo..mid] and a[mid+1..hi] are merged into one sorted array a[lo..hi].
    //--------------------------------------------------------
    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) aux[k] = a[k];
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
    //--------------------------------------------------------
// Summary: Compares two Comparable objects in descending order.
// Precondition: v and w are Comparable objects.
// Postcondition: Returns true if v is greater than w; otherwise, returns false.
//--------------------------------------------------------
    private static boolean greater(Comparable v, Comparable w) {

        return v.compareTo(w) > 0; // Compare in descending order.
    }
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

}