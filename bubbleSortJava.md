# bubbleSort --> Time and Space Complexity (Using Java)

Let's break down the time and space complexity of the given Java code for the bubble sort algorithm.

### Time Complexity

Bubble sort works by repeatedly stepping through the list to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which means the list is sorted.

Here’s the breakdown of the time complexity for the `bubblesort` method:

1. **Outer Loop (for loop with `i`)**: This loop runs `n` times, where `n` is the length of the array. Each iteration of this loop corresponds to one pass through the array.

    ```java
    for (int i = 0; i < n; i++) {
    ```

2. **Inner Loop (for loop with `j`)**: This loop runs `n - i - 1` times in each pass, reducing by one in each iteration of the outer loop since the last elements are already sorted after each pass.

    ```java
    for (int j = 0; j < n - i - 1; j++) {
    ```

3. **Worst-case Time Complexity**: In the worst case, the array is in reverse order, and the inner loop will run `n-i-1` times for each `i` from `0` to `n-1`. The number of comparisons in each pass is approximately:

    \[
    (n-1) + (n-2) + (n-3) + ... + 1 + 0 = \frac{(n-1) \cdot n}{2}
    \]

    Therefore, the worst-case time complexity of bubble sort is \(O(n^2)\).

4. **Best-case Time Complexity**: If the array is already sorted, the algorithm will only need one pass through the array, making the best-case time complexity \(O(n)\) because the algorithm will exit early due to the `isSwapped` flag being `false` after the first pass.

    ```java
    if (isSwapped == false) return;
    ```

### Space Complexity

The space complexity of the bubble sort algorithm is determined by the amount of extra memory it uses, not including the input array.

1. **Auxiliary Space**: Bubble sort uses a constant amount of additional space because it only requires a few extra variables for swapping and the `isSwapped` flag.

    ```java
    boolean isSwapped = false;
    int temp;
    ```

    Since the additional memory used does not depend on the size of the input array, the space complexity is \(O(1)\).

### Summary

- **Worst-case Time Complexity**: \(O(n^2)\)
- **Best-case Time Complexity**: \(O(n)\)
- **Average-case Time Complexity**: \(O(n^2)\) (assuming the average number of swaps is comparable to the worst case)
- **Space Complexity**: \(O(1)\)

This means bubble sort is not very efficient for large datasets, but it is simple to implement and can be useful for small or nearly sorted arrays.