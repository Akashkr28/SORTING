public class bubbleSort {
    
    public static void bubblesort(int[] arr){ 
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            boolean isSwapped = false;
            for(int j = 0; j < n - i - 1; j++){ // why j < n-1 --> because in every iteration we push the biggest element at last so no need to compare
                if(arr[j] > arr[j +1]) {
                    // adjacent element swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            // if no swapping occured then array is sorted
            if(isSwapped = false) return; //return from function as array is sorted
        }
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        bubblesort(arr);
        for(int i : arr) {
            System.out.println(i);
        }
    }

}
