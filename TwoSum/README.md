# 🔹 Two Sum : Check if a pair with given sum exists in Array


## 🧩 Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

## 📌 Examples

Input: N = 5, arr[] = {2,6,5,8,11}, target = 14
Output : YES
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for first variant for second variant output will be : [1,3].

Input: N = 5, arr[] = {2,6,5,8,11}, target = 15
Output : NO.
Explanation: There exist no such two numbers whose sum is equal to the target.
---
## 🧠 Brute force Approach
### Algorithm
For each element of the given array, we will try to search for another element such that its sum is equal to the target. If such two numbers exist, we will return the indices or “YES” accordingly.
First, we will use a loop (say i) to select the indices of the array one by one.
For every index i, we will traverse through the remaining array using another loop (say j) to find the other number such that the sum is equal to the target (i.e. arr[i] + arr[j] = target).
Observation: In every iteration, if the inner loop starts from index 0, we will be checking the same pair of numbers multiple times. For example, in iteration 1, for i = 0, we will check for the pair arr[0] and arr[1]. Again in iteration 2, for i = 1, we will check arr[1] and arr[0]. So, to eliminate these same pairs, we will start the inner loop from i + 1.

## ⏰ Complexity Analysis

Time Complexity: O(N²) because we use two nested loops to check every possible pair of elements in the array, where N is the size of the array.

Space Complexity: O(1) as we use a constant amount of extra space regardless of input size.
---
## 🧠 Optimal Approach

### Algorithm

Basically, in the previous approach we selected one element and then searched for the other one using a loop. Here instead of using a loop, we will use the HashMap to check if the other element i.e. target (selected element) exists. Thus we can trim down the time complexity of the problem.

And for the second variant, we will store the element along with its index in the HashMap. Thus we can easily retrieve the index of the other element i.e. target (selected element) without iterating the array.
We will select the element of the array one by one using a loop (say i).
Then we will check if the other required element (i.e. target - arr[i]) exists in the HashMap.
If that element exists, then we will return “YES” for the first variant or we will return the current index i.e. i, and the index of the element found using map i.e. mp[target - arr[i]].
If that element does not exist, then we will just store the current element in the HashMap along with its index. Because in the future, the current element might be a part of our answer.
Finally, if we are out of the loop, that means there is no such pair whose sum is equal to the target. In this case, we will return either “NO” or {-1, -1} as per the variant of the question.

## ⏰ Complexity Analysis

Time Complexity: O(N) because we traverse the array only once, and each lookup or insertion in the hash map takes O(1) on average, where N is the size of the array.

Space Complexity: O(N) since in the worst case we may store all elements of the array in the hash map.