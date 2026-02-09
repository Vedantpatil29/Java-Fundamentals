/*
===========================
2D ARRAY IN MEMORY (JAVA)
===========================

Java does NOT store 2D arrays in continuous memory like C.
A 2D array in Java is actually an "array of arrays".

----------------------------------
Declaration:
----------------------------------
int arr[][] = new int[3][4];

This means:
- arr is a reference to an array of size 3
- Each element of arr points to another 1D array of size 4

----------------------------------
Memory Representation:
----------------------------------

arr
 |
 |----> arr[0] ----> [10][20][30][40]
 |
 |----> arr[1] ----> [50][60][70][80]
 |
 |----> arr[2] ----> [90][100][110][120]

- arr is stored in heap memory
- arr[0], arr[1], arr[2] are references
- Each row is a separate 1D array in heap
- Rows may NOT be stored in contiguous memory

----------------------------------
Accessing Elements:
----------------------------------
arr[0][2]  // accesses 3rd element of 1st row
arr[2][1]  // accesses 2nd element of 3rd row

----------------------------------
Jagged Array (Important for Exams):
----------------------------------
int jagged[][] = new int[3][];
jagged[0] = new int[2];
jagged[1] = new int[4];
jagged[2] = new int[3];

Here:
- Each row has different column size
- Possible ONLY because Java uses array of arrays

----------------------------------
Key Points to Remember:
----------------------------------
✔ 2D array = array of references
✔ Stored in heap memory
✔ Rows can have different sizes
✔ Not stored in single continuous block

----------------------------------
Comparison with C:
----------------------------------
C: 2D array stored in continuous memory
Java: 2D array stored as array of arrays
*/
