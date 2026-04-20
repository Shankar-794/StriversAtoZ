# 🔹 Spiral Traversal of Matrix
## 🧩 Problem Statement: 
Given a Matrix, print the given matrix in spiral order.
### 📌 Examples
Input: Matrix[][] = { { 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 },{ 13, 14, 15, 16 } }
Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
Explanation: The output of matrix in spiral form.

Input: Matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 },{ 7, 8, 9 } }
Output: 1, 2, 3, 6, 9, 8, 7, 4, 5.
Explanation: The output of matrix in spiral form.
---
## 🧠 Algorithm
The brute force method simulates movement in four directions: right, down, left, and up while keeping track of which cells have already been visited using a separate matrix. This approach ensures that we never revisit any element and always stay within bounds. After moving in one direction as far as possible, we rotate the direction and keep repeating until all elements are visited.
Initialize a 2D boolean matrix `visited` of same size as input to keep track of visited cells.
Define direction arrays for right, down, left, and up movements.
Start at (0, 0), and begin with direction = 0 (right).
For each of the total elements in the matrix:
Add the current cell to result and mark it as visited.
Check if the next cell in the current direction is valid and not visited.
If valid, move to it; else rotate the direction and try the new direction.
Repeat this for total number of cells in the matrix.
### ⏲ Complexity Analysis

Time Complexity: O(m × n),Because we visit each element of the matrix exactly once, where `m` is the number of rows and `n` is the number of columns.

Space Complexity: O(1)We use only a few integer variables to keep track of boundaries (top, bottom, left, right). The `result` List is part of the output, so it's not counted as extra space.