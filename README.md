# Striver's SDE Sheet, 2023

Java solutions for array problems from that sheet. Two packages, `Arrays` and `Arrays_2`. Each folder has a README that names its problems. There is no build file. `Next_Permutation.java` and `Pascals_Triangle.java` are empty classes. Every other file has a `main` that runs one sample and prints the result.

## Arrays

`Kadanes_Algorithm.java` returns the maximum subarray sum. A negative running sum is reset to 0, so an all-negative array comes back as 0. A slower double loop is commented out.

`Set_Matrix_Zeros.java` zeroes a matrix in place. If a cell is 0, its row and column are marked in the first row and first column, then applied. Brute-force and extra-array versions are commented out.

`Sort_Array_0s_1s_2s.java` sorts an array of 0, 1, and 2 with three pointers.

`Stock_Buy_And_Sell.java` walks the prices once and keeps the best profit from one buy and one sell. A double loop is commented out.

## Arrays_2

`Rotate_Matrix.java` rotates a square matrix 90 degrees clockwise: transpose, then reverse each row.

`Merge_Overlapping_Subintervals.java` sorts intervals by the start value and merges the ones that overlap.

`Merger_2_Sorted_Arrays.java` merges two arrays without a third array. It swaps values that are on the wrong side, then sorts each array. The file name spells merger with an extra r.

`Find_Duplicates.java` finds one repeated value with a count array. The class is not public.

`Repeating_Missing_Number.java` finds the repeated number and the missing number from the sum and the sum of squares.

## Run

From the repo root, so the folder name matches the package:

```bash
javac Arrays/Kadanes_Algorithm.java
java Arrays.Kadanes_Algorithm
```

The same two commands work for the other files that have a `main`. Use `Arrays_2/Rotate_Matrix.java` and `java Arrays_2.Rotate_Matrix`, and likewise for the rest of that folder, including `java Arrays_2.Find_Duplicates`.
