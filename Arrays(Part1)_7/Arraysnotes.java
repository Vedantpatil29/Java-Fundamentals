// ================================
// ARRAYS IN JAVA (DETAILED NOTES)
// ================================

// An array is a collection of elements
// of the SAME data type stored in
// CONTIGUOUS memory locations.

// Each element is accessed using an INDEX.
// Indexing in Java starts from 0.

// --------------------------------
// WHY ARRAYS ARE NEEDED?
// --------------------------------
// - To store multiple values in one variable
// - Reduces code length
// - Easy data management
// - Fast access using index

// Example without array:
// int a = 10, b = 20, c = 30;

// Example with array:
// int[] arr = {10, 20, 30};

// ================================
// ARRAY DECLARATION
// ================================

// Syntax:
// dataType[] arrayName;

// Example:
int[] numbers;

// OR
int numbers2[];

// ================================
// ARRAY INITIALIZATION
// ================================

// 1. Declaration + Initialization together
int[] arr1 = {10, 20, 30, 40};

// 2. Declaration first, then allocation
int[] arr2;
arr2 = new int[5];   // default values = 0

// Assigning values
arr2[0] = 5;
arr2[1] = 10;

// ================================
// DEFAULT VALUES IN ARRAY
// ================================

// int      -> 0
// float    -> 0.0
// double   -> 0.0
// char     -> '\u0000'
// boolean  -> false
// String   -> null

// ================================
// ACCESSING ARRAY ELEMENTS
// ================================

// Using index
int first = arr1[0];   // 10
int last  = arr1[3];   // 40

// ================================
// ARRAY LENGTH
// ================================

// length is a PROPERTY, not a method
int size = arr1.length;

// arr1.length -> total number of elements

// ================================
// TRAVERSING ARRAY
// ================================

// Using for loop
for (int i = 0; i < arr1.length; i++) {
    System.out.println(arr1[i]);
}

// Using enhanced for loop (for-each)
for (int value : arr1) {
    System.out.println(value);
}

// ================================
// TAKING ARRAY INPUT FROM USER
// ================================

/*
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int[] arr = new int[n];

for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
}
*/

// ================================
// TYPES OF ARRAYS IN JAVA
// ================================

// 1. One-Dimensional Array
// 2. Two-Dimensional Array
// 3. Multi-Dimensional Array

// ================================
// 1. ONE-DIMENSIONAL ARRAY
// ================================

int[] oneD = {1, 2, 3, 4};

// ================================
// 2. TWO-DIMENSIONAL ARRAY
// ================================

// Also called Matrix

int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

// Access element
int x = matrix[0][1];  // 2

// Traversing 2D array
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

// ================================
// MEMORY REPRESENTATION
// ================================

// Arrays are objects in Java
// Stored in Heap memory
// Array name stores reference to the array

// ================================
// IMPORTANT ARRAY OPERATIONS
// ================================

// - Traversal
// - Insertion
// - Deletion
// - Searching
// - Sorting

// ================================
// COMMON ARRAY ERRORS
// ================================

// ArrayIndexOutOfBoundsException
// Occurs when index < 0 or index >= array.length

// Example:
// arr1[10];  // ❌ Error

// ================================
// ADVANTAGES OF ARRAYS
// ================================

// - Fast access
// - Easy to store multiple values
// - Efficient memory usage

// ================================
// LIMITATIONS OF ARRAYS
// ================================

// - Fixed size (cannot grow or shrink)
// - Stores only same data type
// - Insertion and deletion is costly

// ================================
// ARRAY VS ARRAYLIST (BASIC IDEA)
// ================================

// Array      -> Fixed size
// ArrayList  -> Dynamic size

// ================================
// EXAM DEFINITION
// ================================

// An array is a data structure that stores
// multiple values of the same data type
// in a contiguous memory location.
