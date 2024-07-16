### INSERTION SORT (Time and Space Complexity) Java Code

```java
public class insertionSort {
    public static void insertionsort(int[] arr){
        // worst case time and space
        /**
         * Space: O(1)
         * Time: O(n^2)
         */
        for(int i = 1; i < arr.length; i++){
            int element = arr[i];
            int j;
            for(j = i-1; j >= 0; j--){
                if(arr[j] > element){
                    arr[j+1] = arr[j];
                } else {
                    // arr[j] <= element
                    break;
                }
            }
            arr[j+1] = element;
        }
    }
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        insertionsort(arr);
        for(int i : arr) {
            System.out.println(i); 
        }
    }
}
```

### Time Complexity Analysis

1. **Outer Loop (Line 6 - 15):**
   - The outer loop runs from `i = 1` to `i < arr.length`, which is `n-1` iterations where `n` is the length of the array.
   - So, the outer loop runs `O(n)` times.

2. **Inner Loop (Line 10 - 13):**
   - In the worst case, the inner loop runs from `j = i-1` down to `j >= 0`, which is `i` iterations.
   - For each iteration of the outer loop, the inner loop may run up to `i` times in the worst case.
   - When `i = 1`, inner loop runs 1 time.
   - When `i = 2`, inner loop runs 2 times.
   - When `i = 3`, inner loop runs 3 times.
   - ...
   - When `i = n-1`, inner loop runs `n-1` times.

Summing up the number of iterations of the inner loop gives:
\[ 1 + 2 + 3 + \ldots + (n-1) = \frac{(n-1)n}{2} \]

This sum is on the order of \(O(n^2)\). Therefore, the overall time complexity is \(O(n^2)\).

### Space Complexity Analysis

- The space complexity considers the amount of extra memory used by the algorithm, not counting the input array.
- The variables `element` and `j` used in the function are of constant size.
- No additional data structures are used that grow with the size of the input.

Thus, the space complexity is \(O(1)\).

### Summary
- **Time Complexity:** \(O(n^2)\) in the worst case.
- **Space Complexity:** \(O(1)\) in the worst case.
