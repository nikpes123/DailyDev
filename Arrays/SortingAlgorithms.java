package Arrays;

import java.util.Arrays;

public class SortingAlgorithms {

    /*
    Bubble Sort: A simple sorting algorithm that repeatedly compares
    adjacent elements in a list(Array) and swaps them if they are in the wrong
    order. This process continues until the list is sorted.
    In each iteration of bubble sort, the largest unsorted element is moved to
    its correct position at the end of the array through a series of swaps.
    Time complexity: O(n²) for average and worst cases.

    Use Cases:
    -> Small datasets where simplicity is more important than speed.
    -> Teaching and understanding basic sorting logic.
    -> Situations where minimal code and readability are priorities.
    */
    public int[] bubble(int[] myArray){
        int length = myArray.length;
        for(int i = 0; i < length -1; i++){
            for(int j = 0; j < length -i -1; j ++){   //length - i - 1 ==> bcz in every iteration the largest number is swapped and we need one less iteration next time.
                if(myArray[j] > myArray[j + 1]){
                    int temp = myArray[j + 1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }

    /*
    Selection Sort: A sorting algorithm that repeatedly selects the smallest 
    (or largest) element from the unsorted portion of the list(Array) and swaps 
    it with the first element of the unsorted portion. This process continues 
    until the list is sorted.
    Time complexity: O(n²) for average and worst cases.

    Use Cases:
    -> Small datasets where memory usage is a concern (in-place sorting).
    -> Teaching and understanding selection-based sorting techniques.
    -> Situations requiring minimal swaps compared to Bubble Sort.
    */
    public int[] selection(int [] myArray){
        int n = myArray.length;
        for(int i =  0; i < n; i++){
            int min = i;
            // find min
            for (int j = i; j < n; j++){
                if(myArray[min] > myArray[j]){
                    min = j;
                }
            }
            int temp = myArray[i];
            myArray[i] = myArray[min];
            myArray[min] = temp;
        }
        return myArray;
    }
    /*
    Quick Sort: A divide-and-conquer sorting algorithm that partitions the list 
    (Array) into two smaller sublists based on a pivot element such that elements 
    smaller than the pivot go to the left and larger ones go to the right. It then 
    recursively sorts the sublists. 
    Time complexity: O(n log n) on average, O(n²) in the worst case.

    Use Cases:
    -> Sorting large datasets efficiently.
    -> Cases where in-place sorting is preferred to save memory.
    -> Applications requiring fast and versatile sorting.
    */
    static void quicksort(int[] array, int low, int high){ 
        if (low < high){
            int position = partition(array, low, high);
            quicksort(array, low, position-1); // Left Sub-Array.
            quicksort(array, position +1, high); // Right Sub-Array.
        }
    }  
    static int partition (int[] array, int low, int high){
        int pivot = array[high];
        int i  =  low - 1;
        for (int j = low; j < high; j++ ){
            if (array[j] <= pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[i+1];
        array[i + 1] = array[high];
        array[high] = temp;
    return i + 1;
    }    
  
    /*
    Merge Sort: A divide-and-conquer sorting algorithm that splits the array 
    into two halves, recursively sorts each half, and then merges the sorted halves 
    to produce the final sorted array. 
    Time complexity: O(n log n) for all cases (average, worst, and best).

    Use Cases:
    -> Sorting large datasets with stable ordering (preserves equal elements' order).
    -> Applications requiring efficient sorting with guaranteed O(n log n) time.
    -> Scenarios where additional memory usage for temporary arrays is acceptable.
    */
    static void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int mid = (right - left)/2 + left;

            mergeSort(arr, left, mid); // First half of the array, the left half.
            mergeSort(arr, mid + 1, right); // Second half of the array, the right half.
            
            merge(arr, left, mid, right); // Merge when it has reached to the single value in Array.   
        }
    }
    static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1; // + 1 is bcz we want to add the mid value in the left array.
        int n2 = right - mid;

        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1); 
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right + 1);  // copyOfRange(arr, inc, excl)

        int i = 0; int j = 0; int k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            } else{
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 5, 2};
        SortingAlgorithms.quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }   
}