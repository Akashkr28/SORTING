function bubbleSortRecursive(arr, n) {
    // Base case: If the array size is 1, return as it's already sorted
    if (n == 1) {
        return;
    }
  
    // One pass of bubble sort. After this pass, the largest element is moved to the end.
    for (let i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            // Swap arr[i] and arr[i + 1]
            let temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
  
    // Recursive call with the reduced array size
    bubbleSortRecursive(arr, n - 1);
}

// Helper function to start the recursive sorting
function bubbleSort(arr) {
    bubbleSortRecursive(arr, arr.length);
}

// Test the recursive bubble sort
let arr = [5, 4, 3, 2, 1];
bubbleSort(arr);
console.log(arr);
