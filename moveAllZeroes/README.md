Move all Zeros to the end of the array

Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

Examples
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
Input : 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation : All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
=====================================================
Brute Force Approach
Algorithm
The extremely naive solution, we can think of, involves the use of an extra array. The algorithm is as follows.
Suppose, there are N-X zeros and X non-zero elements in the array. We will first copy those X non-zero elements from the original array to a temporary array.
Then, we will copy the elements from the temporary array one by one and fill the first X places of the original array.
The last N-X places of the original array will be then filled with zero. Now, our task is completed.
------------------------------------------------------
Complexity Analysis
Time Complexity: O(N), we can move all zeroes to end in linear time.
Space Complexity: O(N), additional space used for temporary array.

=======================================================

Optimal Approach
Algorithm
We can optimize the approach using 2 pointers i.e. i and j. The pointer j will point to the first 0 in the array and i will point to the next index.

Assume, the given array is {1, 0, 2, 3, 2, 0, 0, 4, 5, 1}. Now, initially, we will place the 2-pointers like the following:
First, we iterate through the array to locate the position of the first zero, using a pointer j. If no zero is found, no further steps are needed.
Next, we set a second pointer i to j + 1 and start moving it forward through the array.
While moving i, whenever we encounter a non-zero element a[i], we swap it with the element at index j. After the swap, since j now holds a non-zero value, we increment j to point to the next zero.
-----------------------------------------------
Complexity Analysis
Time Complexity: O(N), we can move all zeroes to end in linear time.
Space Complexity: O(1), constant additional space is used.