// Time Complexity: O(log n), where n is the length of the array.
// Space Complexity: O(1), as no extra space is used.

// Approach: In a sorted array starting from 1, each element should be equal to its index + 1 if no number is missing before or at that index.
// Use binary search to move towards the right if arr[mid] equals mid + 1, otherwise search towards the left, including mid.
// Once both pointers meet, return l + 1 as the missing number.

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    int missingNumber(int arr[]) {
        int l = 0;
        int r = arr.length;
        while(l<r){
            int mid = l +(r-l)/2;
            if(arr[mid] == mid+1){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return l+1;
        
    }
}
