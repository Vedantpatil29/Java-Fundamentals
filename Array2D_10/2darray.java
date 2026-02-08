/*
====================================================
            2D ARRAYS IN JAVA – NOTES
====================================================

1. WHAT IS A 2D ARRAY?
----------------------------------------------------
- A 2D array is an array of arrays.
- It is used to store data in the form of rows and columns.
- Example: matrix, table, marks of students, etc.

Syntax:
datatype[][] arrayName;

Example:
int[][] arr;

----------------------------------------------------

2. MEMORY REPRESENTATION
----------------------------------------------------
- In Java, a 2D array is NOT stored as a continuous block.
- It is an array of references, where each reference points
  to a 1D array (row).
- Rows can have different column sizes (jagged arrays).

----------------------------------------------------

3. DECLARATION OF 2D ARRAY
----------------------------------------------------
Different valid ways:

int[][] arr;
int arr[][];
int[] arr[];

----------------------------------------------------

4. INITIALIZATION OF 2D ARRAY
----------------------------------------------------

(A) STATIC INITIALIZATION
------------------------
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

- Number of rows = 3
- Number of columns = 3

(B) DYNAMIC INITIALIZATION
--------------------------
int[][] arr = new int[3][4];

- 3 rows
- 4 columns
- Default value for int = 0

----------------------------------------------------

5. ACCESSING ELEMENTS
----------------------------------------------------
Syntax:
arrayName[rowIndex][columnIndex]

Example:
arr[0][0]  // first row, first column
arr[2][1]  // third row, second column

----------------------------------------------------

6. TRAVERSING A 2D ARRAY
----------------------------------------------------
- Use nested loops.
- Outer loop → rows
- Inner loop → columns

Example:
for(int i = 0; i < arr.length; i++) {           // rows
    for(int j = 0; j < arr[i].length; j++) {    // columns
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}

----------------------------------------------------

7. TAKING INPUT IN 2D ARRAY
----------------------------------------------------
- Usually done using Scanner class.

Example:
Scanner sc = new Scanner(System.in);
int[][] arr = new int[3][3];

for(int i = 0; i < arr.length; i++) {
    for(int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();
    }
}

----------------------------------------------------

8. PRINTING A 2D ARRAY
----------------------------------------------------
- Same nested loop logic is used.

----------------------------------------------------

9. LENGTH IN 2D ARRAYS
----------------------------------------------------
arr.length
→ gives number of rows

arr[i].length
→ gives number of columns in that row

----------------------------------------------------

10. JAGGED ARRAY
----------------------------------------------------
- A 2D array where each row has different number of columns.

Example:
int[][] arr = new int[3][];
arr[0] = new int[2];
arr[1] = new int[4];
arr[2] = new int[3];

----------------------------------------------------

11. PASSING 2D ARRAY TO A METHOD
----------------------------------------------------
- 2D arrays are passed by reference.

Example:
static void printArray(int[][] arr) {
    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

----------------------------------------------------

12. RETURNING 2D ARRAY FROM A METHOD
----------------------------------------------------
Example:
static int[][] createMatrix() {
    int[][] arr = {
        {1, 2},
        {3, 4}
    };
    return arr;
}

----------------------------------------------------

13. COMMON OPERATIONS ON 2D ARRAYS
----------------------------------------------------
- Sum of all elements
- Row-wise sum
- Column-wise sum
- Transpose of matrix
- Searching an element
- Maximum / Minimum element

----------------------------------------------------

14. EXAMPLE: SUM OF ELEMENTS
----------------------------------------------------
int sum = 0;
for(int i = 0; i < arr.length; i++) {
    for(int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
    }
}

----------------------------------------------------

15. EXAMPLE: TRANSPOSE OF MATRIX
----------------------------------------------------
Original matrix:
arr[i][j]

Transpose:
transpose[j][i]

----------------------------------------------------

16. ADVANTAGES OF 2D ARRAYS
----------------------------------------------------
- Organizes data in tabular form
- Easy representation of matrices
- Useful in real-world problems

----------------------------------------------------

17. DISADVANTAGES OF 2D ARRAYS
----------------------------------------------------
- Fixed size
- Memory wastage in some cases
- Slower compared to 1D arrays

----------------------------------------------------

18. IMPORTANT EXAM POINTS
----------------------------------------------------
✔ Java stores 2D arrays as array of arrays
✔ arr.length → rows
✔ arr[i].length → columns
✔ Index starts from 0
✔ Nested loops are required

====================================================
                 END OF NOTES
====================================================
*/
