# 🔹 Longest Consecutive Sequence in an Array
## 🧩 Problem Statement:
Given an array nums of n integers.
Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.
### 📌 Examples
Example 1:
Input:
 nums = [100, 4, 200, 1, 3, 2]  
Output:
 4  
Explanation:
 The longest sequence of consecutive elements in the array is [1, 2, 3, 4], which has a length of 4. This sequence can be formed regardless of the initial order of the elements in the array.

Example 2:
Input:
 nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]  
Output:
 9  
Explanation:
 The longest sequence of consecutive elements in the array is [0, 1, 2, 3, 4, 5, 6, 7, 8], which has a length of 9.
---
## 🧠 Brute Force
Algorithm
As you iterate through each number in the array, begin by checking if consecutive numbers like (x+1, x+2, x+3), and so on, exist in the array. The occurrence of the next consecutive number can be checked by using a linear search.
When you find consecutive numbers, start counting them using a counter. Increment this counter each time you find the next consecutive number in the sequence.
This counter effectively keeps track of how long the current consecutive sequence is as you move through the array and find more consecutive numbers.
Dry Run: Please refer to the video for the dry run.
### ⏲ Complexity Analysis
Time Complexity: O(n2), where n is the number of elements in the array. This is because for each element, we may need to perform a linear search through the entire array to find consecutive numbers.

Space Complexity: O(1), as we are using a constant amount of extra space for variables.
---
## 🧠 Better
Better Approach
Algorithm
Begin by sorting the entire array in ascending order. This step helps group consecutive numbers together, simplifying the sequence detection process.
Use a loop to iterate through each element of the sorted array.
Track consecutive sequences by comparing each element arr[i] with the lastSmaller variable. If arr[i] - 1 == lastSmaller, increment the length of the current sequence (cnt) and update lastSmaller to arr[i].
Skip the current element if arr[i] equals lastSmaller, as it's already part of a sequence.
If arr[i] is greater than lastSmaller + 1, start a new sequence from arr[i] by updating lastSmaller to arr[i] and reset cnt to 1.
Throughout the iteration, compare cnt with longest and update longest to store the maximum sequence length encountered.
Note: Here, we are distorting the given array by sorting it.
### ⏲ Complexity Analysis
Time Complexity: O(n log n), where n is the number of elements in the array. This is due to the sorting step, which is the most time-consuming operation in this approach.

Space Complexity: O(1), as we are using only a constant amount of extra space.
---