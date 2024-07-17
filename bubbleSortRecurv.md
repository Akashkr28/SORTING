### Recursive Bubble Sort Implementation

```javascript
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
```

### Explanation

1. **Base Case**: The recursion stops when the array size becomes 1 (`n == 1`), as an array with one element is already sorted.

    ```javascript
    if (n == 1) {
        return;
    }
    ```

2. **Recursive Step**: In each recursive call, the function performs one pass of bubble sort, moving the largest unsorted element to the end of the array.

    ```javascript
    for (let i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            let temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    ```

3. **Recursive Call**: After one pass, the function calls itself with a reduced array size (`n - 1`).

    ```javascript
    bubbleSortRecursive(arr, n - 1);
    ```

### Time Complexity

- **Worst-case Time Complexity**: In the worst case, where the array is sorted in reverse order, the function will make \(n-1\) recursive calls. Each call involves a pass through the array with \(n-1\) comparisons in the first call, \(n-2\) in the second call, and so on. This results in a total of:

    \[
    (n-1) + (n-2) + (n-3) + ... + 1 + 0 = \frac{(n-1) \cdot n}{2}
    \]

    Therefore, the worst-case time complexity is \(O(n^2)\).

- **Best-case Time Complexity**: Similar to the iterative version, if the array is already sorted, the function still performs \(n-1\) recursive calls and each call involves a pass through the array, making the best-case time complexity \(O(n^2)\).

- **Average-case Time Complexity**: Assuming the average number of swaps is comparable to the worst case, the average-case time complexity is also \(O(n^2)\).

### Space Complexity

- **Auxiliary Space**: The space complexity is determined by the recursion stack. In the worst case, the maximum depth of the recursion stack is \(n\), resulting in an auxiliary space complexity of \(O(n)\).

    Each recursive call adds a new frame to the stack, and there are \(n\) such calls in the worst case.

### Summary

- **Worst-case Time Complexity**: \(O(n^2)\)
- **Best-case Time Complexity**: \(O(n^2)\)
- **Average-case Time Complexity**: \(O(n^2)\)
- **Space Complexity**: \(O(n)\)

This recursive implementation of bubble sort highlights its inefficiency for large datasets, similar to the iterative version, but demonstrates a different approach to solving the problem.