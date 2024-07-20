// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively. Merge nums1 and nums2 into a single array sorted in non-decreasing order. The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.


public class merge2sortedarrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // actual length of nums1 is m+n, which we will use to store the final result

        int i = 0, j = 0, k = 0;

        int[] result = new int[m + n];

        while ( i < m && j < n) { // this loop ends when either i == m or j == n
            if(nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                k++;
                i++;
            } else {
                result[k] = nums2[j];
                k++;
                j++;
            }
        }

        // if i == m, nums1 is exhausted
        // we have elements left in nums2, lets fill that directly
        while(j < n) {
            result[k] = nums2[j];
            k++;
            j++;
        }

        // if j == n, nums2 is exhausted
        // we have elements left in nums1, lets fill that directly
        while(i < m) {
            result[k] = nums1[i];
            k++;
            i++;
        }

        k = 0;
        while(k < m + n) {
            nums1[k] = result[k];
            k++;
        }


    }
}