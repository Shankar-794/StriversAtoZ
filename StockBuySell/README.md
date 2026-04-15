# 🔹 Stock Buy And Sell
## 🧩 Problem Statement: 
You are given an array of prices where prices[i] is the price of a given stock on an ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
### 📌 Examples
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
---
## 🧠 Brute Force Approach
Algorithm
We try every possible pair of days (buy day and sell day after buy) and calculate the profit. The maximum profit among all these pairs is our answer. If no profit is possible, return 0.
Loop through all days to consider each as a possible buy day.
For each buy day, loop through all future days to consider them as sell days.
Calculate the profit for each (buy, sell) pair.
Track the maximum profit seen.the maximum profit seen.
### ⏲ Complexity Analysis

Time Complexity: O(n²) Because for each element, we are checking every future element nested loops.

Space Complexity: O(1) No extra space used, only variables for storing max profit.
---
## 🧠 Optimal Approach
Algorithm
The idea is to track the minimum price so far while traversing the array and calculate the profit if we sold today. This way, we can constantly update the maximum profit without using nested loops. We’re basically simulating:
What’s the lowest price we’ve seen so far?
What’s the profit if we sold today?
Is it better than our best so far?
Initialize a variable to store the minimum price so far, set it to a very large value initially.
Initialize a variable to store the maximum profit seen so far, set it to 0 initially.
Loop through each price in the array.
Update the minimum price if the current price is smaller.
Calculate the profit if the stock were bought at the minimum price and sold at the current price.
Update the maximum profit if this new profit is higher.
Return the maximum profit after the loop ends.
### ⏲ Complexity Analysis

Time Complexity: O(n),This is because we are iterating through the array of prices exactly once. There are no nested loops or recursive calls.

Space Complexity: O(1),Only two variables are used to store the minimum price and maximum profit, regardless of the input size.