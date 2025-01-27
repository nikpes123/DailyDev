package Arrays;

public class SearchingAlgorithms {

    /*  
    A simple search algorithm that traverses each element of a list 
    sequentially to find a target value. It stops when the value is found 
    or the end of the list is reached. Time complexity: O(n).

    Use Cases:
    -> Searching in small or unsorted datasets.
    -> Checking for the existence of an item in a list.
    -> Finding duplicate elements in a dataset.
    */
    public int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    /*
    Binary Search: A search algorithm for sorted datasets. 
    It compares the target with the middle element, 
    then eliminates half the data based on whether the target is smaller or larger,
    repeating until the target is found or the range is empty. Time complexity: O(log n).

    Use Cases:
    -> earching in large, sorted datasets.
    -> Efficiently finding indices or elements.
    -> Solving problems like finding roots or bounds in sorted ranges.
    */

    public int binarySearch(int[] arr, int key, int low, int high) {
        if (low >= high) {
            return -1;
        }
        int mid = low + (high - low) / 2; // high+low/2 may lead to Integer out of bounds
        if (arr[mid] == key) {
            return mid;
        } else if (key > arr[mid]) {
            return binarySearch(arr, key, mid + 1, high);
        } else {
            return binarySearch(arr, key, low, mid - 1);
        }
    }
    public static void main(String[] args) {
        SearchingAlgorithms obj = new SearchingAlgorithms();
        int[] array = {1, 2, 3, 5, 6, 8, 9, 10};
        System.out.println(obj.linearSearch(array, 23));
        System.out.println(obj.binarySearch(array, 3 , 0 , array.length-1));
    }
}