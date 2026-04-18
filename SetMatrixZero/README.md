# 🔹 Set Matrix Zero
## 🧩 Problem Statement: 
Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix..
### 📌 Examples
Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
---
## 🧠 Brute force Approach
Algorithm
Think of the matrix as a chessboard. If you see a zero somewhere, you need to wipe out its whole row and column to zero. In brute force, the moment you find a zero, you immediately mark its entire row and column. But here’s the trap if you set them to zero immediately, we might mess up future checks because a newly placed zero could cause extra unwanted zeroing. To avoid that, we use a special marker value (like -1 or something that can’t exist in the input) to mark places where zeros should be placed later. Once the scanning is done, we do a second pass and replace all markers with 0.
Traverse the entire matrix.
If an element is zero:
Mark all elements in its row (except already zero) as -1.
Mark all elements in its column (except already zero) as -1.
Once the full traversal is complete, replace all -1 with 0.
### ⏲ Complexity Analysis
Time Complexity: O(m * n * (m + n)), We iterate through every cell (m * n), and for each zero, we potentially mark its entire row (O(n)) and column (O(m)), leading to O(m * n * (m + n)) overall.

Space Complexity: O(1), We are not using any extra data structures, only modifying the matrix in place (apart from a few variables).
---
## 🧠 Better Approach
Algorithm
Instead of marking directly in the matrix, keep two extra arrays:
One to track which rows need to be zeroed.
One to track which columns need to be zeroed.
When you find a zero, mark its row index in the row array and column index in the col array. After the scan, you go back and zero out all marked rows and columns. This avoids accidental over-zeroing in the first pass.
Create a row array of size m (rows) and a col array of size n (columns) initialized to false.
First pass: Traverse the matrix, and when you find a zero:
Mark the corresponding row index in row array.
Mark the corresponding col index in col array.
Second pass: Traverse the matrix again, and if either the row or col is marked, set the cell to zero.
### ⏲ Complexity Analysis
Time Complexity: O(m × n),We make two passes over the matrix.First pass to identify rows and columns to be zeroed (O(m × n)).Second pass to update the matrix using the markers (O(m × n)).Total time is proportional to the number of cells in the matrix, so O(m × n).
Space Complexity: O(m + n),We store two extra arrays one for m rows and one for n columns. No other extra space is used besides these arrays.
---
## 🧠 Optimal Approach
Algorithm
Instead of using separate arrays, we use the first row and first column of the matrix itself to store whether a row or column needs to be zeroed. We also store two flags:
firstRowZero:Was the first row supposed to be all zero?
firstColZero:Was the first column supposed to be all zero?
Then:
First pass: Mark zeros in the first row and column for any zero found in the rest of the matrix.
Second pass: Use those markers to set rows and columns to zero.
Finally, handle the first row and column separately based on the flags. This is super space-efficient because we’re reusing the input matrix itself to store markers.
Check if the first row has any zero and store in a boolean flag.
Check if the first column has any zero and store in a boolean flag.
Traverse the rest of the matrix:
If a cell is zero, mark its row in the first column and its column in the first row as zero.
Traverse again (excluding first row and column), setting cells to zero if their row marker or column marker is zero.
Finally, update the first row and first column based on the stored flags.
### ⏲ 