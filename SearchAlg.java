

public class SearchAlg {
    public int binarySearch(int[] arr, int key, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            if (arr[mid] > key) {
                binarySearch(arr, key, low, mid -1);
            } else if (arr[mid] < key) {
                binarySearch(arr, key, mid + 1, high);
            } else{
                return mid;
            }
        }
        return -1;      
    }

    public static void main(String[] args) {
        SearchAlg obj = new SearchAlg();
        int[] input = {4, 6, 2, 98, 5, 9, 10};
        int ans = obj.binarySearch(input, 98, 0, input.length-1);
        System.out.println(ans);

        
    }

}
    

