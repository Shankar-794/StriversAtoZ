# 🔹 Length of the Longest Subarray with Zero Sum

## 🧩 Problem Statement

Given an integer array `arr`, find the length of the longest subarray whose sum is equal to **0**.

A subarray is a contiguous part of the array.

---

## 📌 Examples

### Example 1:

```
Input: arr = [1, -1, 3, 2, -2, -3, 3]
Output: 5
Explanation: The subarray [3, 2, -2, -3] has sum = 0 and length = 4 (or another valid longest subarray).
```

### Example 2:

```
Input: arr = [1, 2, -3, 3]
Output: 3
Explanation: The subarray [1, 2, -3] has sum = 0.
```

---

## 🧠 Approach

### 🔸 Brute Force (O(n²))

* Iterate over all possible subarrays.
* Calculate the sum for each subarray.
* If the sum equals 0, update the maximum length.

#### Steps:

1. Fix a starting index.
2. Expand the ending index.
3. Maintain running sum.
4. If sum becomes 0 → update max length.

---

### 🔸 Optimal Approach (Prefix Sum + HashMap) — O(n)

#### 💡 Key Insight:

If the same prefix sum appears again, it means the subarray between those indices has sum = 0.

#### Algorithm:

1. Initialize:

   * `sum = 0`
   * `maxLength = 0`
   * HashMap to store `{prefixSum → first index}`

2. Traverse the array:

   * Add current element to `sum`
   * If `sum == 0` → update `maxLength = i + 1`
   * If `sum` already exists in map:

     * Subarray found → length = `i - previousIndex`
     * Update `maxLength`
   * Else:

     * Store `sum` with current index

---

## ⏱️ Complexity Analysis

| Approach    | Time Complexity | Space Complexity |
| ----------- | --------------- | ---------------- |
| Brute Force | O(n²)           | O(1)             |
| Optimal     | O(n)            | O(n)             |

---
## 🔥 Key Takeaways

* Prefix sum is extremely powerful for subarray problems.
* Repeating prefix sum ⇒ zero sum subarray exists.
* Always store the **first occurrence** of prefix sum.



