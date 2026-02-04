/*
========================
SORTING IN JAVA - NOTES
========================

Sorting:
---------
Sorting is the process of arranging elements of an array or list
in a specific order.
The most common orders are:
1) Ascending order  (small → large)
2) Descending order (large → small)

Why sorting is important?
--------------------------
1) Makes searching faster (Binary Search works only on sorted data)
2) Makes data easier to understand
3) Used in ranking, scheduling, data analysis
4) Improves efficiency of many algorithms

Types of Sorting Techniques:
-----------------------------
Sorting algorithms are mainly classified into:
1) Comparison-based sorting
2) Non-comparison-based sorting

--------------------------------
1) BUBBLE SORT
--------------------------------
Idea:
-----
Repeatedly compare adjacent elements and swap them if they are
in the wrong order.
The largest element "bubbles" to the end in each pass.

Steps:
------
1) Compare arr[0] and arr[1], swap if needed
2) Compare arr[1] and arr[2], swap if needed
3) Continue till end of array
4) Repeat for n-1 passes

Time Complexity:
----------------
Best Case:    O(n)        (when array is already sorted)
Average Case: O(n^2)
Worst Case:   O(n^2)

Space Complexity:
-----------------
O(1)  (In-place sorting)

Stable:
-------
Yes (relative order of equal elements is maintained)

--------------------------------
2) SELECTION SORT
--------------------------------
Idea:
-----
Find the minimum element from the unsorted part
and place it at the beginning.

Steps:
------
1) Assume first element is minimum
2) Find the smallest element in remaining array
3) Swap it with the first element
4) Repeat for next position

Time Complexity:
----------------
Best Case:    O(n^2)
Average Case: O(n^2)
Worst Case:   O(n^2)

Space Complexity:
-----------------
O(1)  (In-place)

Stable:
-------
No (can change relative order)

--------------------------------
3) INSERTION SORT
--------------------------------
Idea:
-----
Works like arranging playing cards in hand.
Each element is placed at its correct position
in the already sorted part.

Steps:
------
1) Assume first element is sorted
2) Take next element (key)
3) Compare key with previous elements
4) Shift elements and insert key at correct position

Time Complexity:
----------------
Best Case:    O(n)        (already sorted)
Average Case: O(n^2)
Worst Case:   O(n^2)

Space Complexity:
-----------------
O(1)

Stable:
-------
Yes

--------------------------------
4) COUNTING SORT
--------------------------------
Idea:
-----
Counts the frequency of each element
and uses it to place elements in sorted order.

Note:
-----
Works only for non-negative integers
and when range is not very large.

Steps:
------
1) Find maximum element
2) Create count array of size max+1
3) Store frequency of each element
4) Place elements in original array using count array

Time Complexity:
----------------
O(n + k)   (k = range of elements)

Space Complexity:
-----------------
O(k)

Stable:
-------
Yes

--------------------------------
5) MERGE SORT
--------------------------------
Idea:
-----
Divide and Conquer algorithm.
Divides array into two halves, sorts them,
and then merges them.

Steps:
------
1) Divide array into two halves
2) Recursively sort both halves
3) Merge the sorted halves

Time Complexity:
----------------
Best Case:    O(n log n)
Average Case: O(n log n)
Worst Case:   O(n log n)

Space Complexity:
-----------------
O(n)  (extra space for merging)

Stable:
-------
Yes

--------------------------------
6) QUICK SORT
--------------------------------
Idea:
-----
Divide and Conquer algorithm.
Chooses a pivot element and places it
at its correct position.

Steps:
------
1) Choose a pivot element
2) Partition array into two parts
   (elements < pivot and elements > pivot)
3) Recursively sort both parts

Time Complexity:
----------------
Best Case:    O(n log n)
Average Case: O(n log n)
Worst Case:   O(n^2)   (when pivot is always smallest/largest)

Space Complexity:
-----------------
O(log n)  (recursive stack)

Stable:
-------
No

--------------------------------
COMPARISON SUMMARY
--------------------------------
Algorithm        Time Complexity        Stable   In-Place
---------------------------------------------------------
Bubble Sort      O(n^2)                 Yes      Yes
Selection Sort   O(n^2)                 No       Yes
Insertion Sort   O(n^2)                 Yes      Yes
Counting Sort    O(n + k)               Yes      No
Merge Sort       O(n log n)              Yes      No
Quick Sort       O(n log n) avg          No       Yes

--------------------------------
IMPORTANT EXAM POINTS
--------------------------------
1) In-place sorting means no extra memory is used
2) Stable sorting maintains relative order
3) Bubble & Insertion are good for small data
4) Merge sort is best for large data
5) Quick sort is fastest in practice but not stable
6) Counting sort is fastest when range is small

========================
END OF NOTES
========================
*/
