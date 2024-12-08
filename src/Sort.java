//-----------------------------------------------------
// Title: Sort
//Author: Poyraz Koca
// Description:sorting arrays of Comparable objects using the QuickSort algorithm
//-----------------------------------------------------
public class Sort {
    //--------------------------------------------------------
    // Summary: Sorts an array of integers using the Insertion Sort algorithm in descending order.
    // Precondition: 'array' is an array of integers.
    // Postcondition: Sorts the elements of the array 'array' in descending order using the
    // Insertion Sort algorithm.
    //--------------------------------------------------------
    public static void InsertionSort(int[] array) {
        for(int i=1;i<array.length;i++) {
            int temp = array[i];
            int j= i-1;
            while(j>=0 &&temp>array[j]) {
                array[j+1]=  array[j];
                j--;

            }
            array[j+1]=temp;
        }
    }
    //--------------------------------------------------------
    // Summary: Sorts an array of floats using the Insertion Sort algorithm in descending order.
    // Precondition: 'array' is an array of floats.
    // Postcondition: Sorts the elements of the array 'array' in descending order using the
    // Insertion Sort algorithm.
    //--------------------------------------------------------
    public static void InsertionSort(float[] array) {
        for(int i=1;i<array.length;i++) {
            float temp = array[i];
            int j=i-1;
            while(j>=0 && temp>array[j]) {


                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }
}