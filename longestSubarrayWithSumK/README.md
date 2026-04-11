Longest Subarray with given Sum K(Positives)

Problem Statement: Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

Examples
Example 1:
Input:
 nums = [10, 5, 2, 7, 1, 9], k = 15  
Output:
 4  
Explanation:
 The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

Example 2:
Input:
 nums = [-3, 2, 1], k = 6  
Output:
 0  
Explanation:
 There is no sub-array in the array that sums to 6. Therefore, the output is 0.

-----------------------------------------------------------------------------------------
Brute Force
Algorithm
We first run a loop with index i to select every possible starting index of the subarray. These starting indices range from 0 to n-1 where n is the size of the array.
Inside this loop, we run another loop with index j to select the ending index of the subarray. For each subarray starting at index i, the ending index j can range from i to n-1.
Next, for each subarray starting from index i and ending at index j (i.e., arr[i...j]), we run an additional loop to calculate the sum of all the elements in that subarray.
If the sum equals k, we consider its length, which is (j - i + 1). Among all such subarrays, we keep track of the maximum length by comparing all the lengths found so far.

Complexity Analysis
Time Complexity: O(n3), where n is the size of the array. This is because we have three nested loops: one for the starting index, one for the ending index, and one for calculating the sum of the subarray.

Space Complexity: O(1), as we are using a constant amount of space for variables and not using any additional data structures that grow with input size.

------------------------------------------------------------------------------------

Optimal Approach
Algorithm
Two pointers, left and right, are used to maintain the current window of elements in the array. These pointers represent the start and end of the current subarray.
A variable, sum, is used to keep track of the sum of the elements in the current window between left and right.
The right pointer expands the window by including new elements, increasing the sum.
If the sum of the window exceeds k, the left pointer shrinks the window by removing elements from the start until the sum is less than or equal to k.
If the sum of the current window equals k, the maximum length of such a subarray is updated.
The process continues until the right pointer traverses the entire array.
Finally, the maximum length of the subarray with sum k is returned as the result.

Time Complexity: O(N), where N is the size of the array. The algorithm traverses the array once with two pointers, making it linear in time complexity.

Space Complexity: O(1), as it uses a constant amount of space.