# 🔹 next_permutation : find next lexicographically greater permutation
## 🧩 Problem Statement:
Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).
### 📌 Examples
Input: Arr[] = {1,3,2}
Output: {2,1,3}
Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
Input : Arr[] = {3,2,1}
Output: {1,2,3}
Explanation : As we see all permutations of {1,2,3}, we find {3,2,1} at the last position. So, we have to return the lowest permutation.
---
## 🧠 Brute-Force Approach
Algorithm
The brute force approach to find the next permutation is to find all possible permutations of the array and then look for next permutation.
Find all possible permutations of elements present and store them.
Sort the permutations and search input from all possible permutations. Print the next permutation present right after it.
If the current permutation is the last, return the first permutation in the list.
### ⏲ Complexity Analysis
Time Complexity: O(N!*N), since we are generating all possible permutations, it takes N! time.
Space Complexity: O(N!), storing all permutations.
---
## 🧠 Optimal Approach
Algorithm
We want to rearrange the array to form the next greater permutation. If that's not possible (i.e., it's the last permutation), we return the smallest one (i.e., sorted ascendingly).

To find this next permutation with minimal change, we need to find a digit that can be increased slightly to make the number bigger and then rearrange the remaining part to be the smallest possible.
Traverse from the end and find the first index where the current digit is smaller than the next one (this is the "breaking point").
Then again traverse from the end to find the first digit greater than the breaking point digit and swap them.
Finally, reverse the part of the array to the right of the breaking point to get the smallest next permutation.
If no such breaking point exists (entire array is descending), just reverse the whole array.
### ⏲ Complexity Analysis
Time Complexity: O(N), we find the breaking point and reverse the subarray in linear time.
Space Complexity: O(1), constant additional space is used.