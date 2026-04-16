# 🔹 Leaders in an Array
## 🧩 Problem Statement:
Given an array of integers, return the integers which are greater than the elements to their right.
### 📌 Examples
Example 1:
Input:
 arr = [4, 7, 1, 0]  
Output:
 7 1 0  
Explanation:
 The rightmost element (0) is always a leader.  
7 and 1 are greater than the elements to their right, making them leaders as well.

Example 2:
Input:
 arr = [10, 22, 12, 3, 0, 6]  
Output:
 22 12 6  
Explanation:
 6 is a leader because there are no elements after it.  
12 is greater than all the elements to its right (3, 0, 6), and 22 is greater than 12, 3, 0, 6, making them leaders as well.
---
## 🧠 Brute Force
Brute Force
Algorithm
In this brute force approach, we start by checking all the elements from the start of the array to the end to determine if an element is greater than all the elements to its right (i.e., the leader).
We use nested loops for this:
The outer loop checks each element in the array to see if it is a leader.
The inner loop checks if there is any element to the right that is greater than the element being currently processed by the outer loop.
Begin by initializing the outer loop pointer at the start element and set it as the current leader.
If any element traversed is found to be greater than the current leader, the element is not considered a leader, and the outer loop pointer is incremented by 1, setting the next element as the current leader.
If no other element to the right is greater than the current element, it is added to the answer array as a leader element.
