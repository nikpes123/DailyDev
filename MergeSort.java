

import java.util.Arrays;

public class MergeSort {
    public void merge(int[] my_array, int left, int mid, int right){
        int n_left = mid-left +1; // we do +1 because we wish to include the mid element in the left array
        int n_right = right-mid; 
        int[] left_array = Arrays.copyOfRange(my_array, left, mid+1); 
        int[] right_array = Arrays.copyOfRange(my_array, mid+1, right+1); 
        int i =  0, j = 0, k = left;
        while (i < n_left && j < n_right){
            if (left_array[i] < right_array[j]){
                my_array[k++] = left_array[i++];
                i++;
            } else {
                my_array[k++] = right_array[j++];
            }
        }
        while (i < n_left){
            my_array[k++] = left_array[i++];
        }
        while (j < n_right){
            my_array[k++] = right_array[j++];
        }
    }
    public void merge_sort(int[] my_array, int left, int right){
        if (left < right){
            int mid = left + (right-left) / 2; //mid could be left+right/2, but that may give an Overflow error when array is too large
            merge_sort(my_array, left, mid);

            merge_sort(my_array, mid+1, right);

            merge(my_array, left, mid, right);
        }
    }
    public void selection_sort(int[] my_array){
        for (int i = 0; i < my_array.length; i++){
            int min = i;
            for (int j = i; j < my_array.length; j++){
                if (my_array[min] > my_array[j]){
                    min = j;
                }
            }
            int temp = my_array[min];
            my_array[min] = my_array[i];
            my_array[i] = temp;
        }
    }
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int [] array = {12, 14, 56, 23, 8};
        ms.merge_sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}