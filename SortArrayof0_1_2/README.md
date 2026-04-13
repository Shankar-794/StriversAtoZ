# 🔹 Sort an array of 0s, 1s and 2s

## 🧩 Problem Statement: Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. The sorting must be done in-place, without making a copy of the original array.

### 📌 Examples
Input: nums = [1, 0, 2, 1, 0]
Output: [0, 0, 1, 1, 2]
Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two

Input: nums = [0, 0, 1, 1, 1]
Output: [0, 0, 1, 1, 1]
Explanation: The nums array in sorted order has 2 zeroes, 3 ones and zero twos.
---
## 🧠 Brute force Approach
Algorithm
We are given an array containing only 0s, 1s, and 2s. Since the values are fixed and known, the simplest approach is to first count how many 0s, 1s, and 2s are present in the array. After counting, we overwrite the original array based on the frequency of these values first fill it with 0s, then 1s, then 2s. This does not require any extra array and modifies the input array in-place.
Initialize three counters to count the frequency of 0s, 1s, and 2s
Loop through the array once and count each number
In the second loop, fill the array based on the frequency of each number: first 0s, then 1s, then 2s

### ⏲ Complexity Analysis
Time Complexity: O(n),We traverse the array twice: once to count, once to overwrite. Each operation is O(n).

Space Complexity: O(1), We use only a constant number of counters regardless of the input size. No extra array is used.
---
## 🧠 Optimal Approach
Algorithm
This approach is a direct implementation of the Dutch National Flag algorithm.

We divide the array into three partitions using three pointers – low, mid, and high.
From 0 to low-1, we’ll keep only 0s
From low to mid-1, only 1s
From high+1 to n-1, only 2
The range from mid to high is the unsorted zone we’re scanning and fixing. At each step:
If arr[mid] == 0, it belongs to the left section → swap with low, move both low and mid.
If arr[mid] == 1, it’s already in the middle section → just move mid.
If arr[mid] == 2, it belongs to the right section → swap with high, only move high.
When you swap with high, you don’t move mid because the incoming value might still be 0 or 2 which needs processing.This ensures we sort the array in one single pass without using extra space.
Start with three pointers at the beginning, middle, and end of the array.
Iterate while the middle pointer is less than or equal to the end pointer.
If the current element belongs to the front section:
Swap it with the element at the front boundary.
Move both front and middle boundaries forward.
If the current element belongs to the middle section:
Move the middle boundary forward.
If the current element belongs to the end section:
Swap it with the element at the end boundary.
Move the end boundary backward.
Repeat until all elements are in their correct zones.
### ⏲ Complexity Analysis
Time Complexity: O(n) The array is traversed only once using the `mid` pointer. Each element is checked at most once, and swaps are done in constant time.

Space Complexity: O(1) Only a few integer pointers (`low`, `mid`, `high`) are used. Sorting is done in-place, requiring no additional space.