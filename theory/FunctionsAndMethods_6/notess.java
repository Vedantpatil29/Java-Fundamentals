/*
===============================
        FUNCTIONS IN JAVA
===============================

1. What is a Function (Method)?
--------------------------------
- A function is a block of code that performs a specific task.
- It runs only when it is called.
- Helps in:
  ✔ Code reusability
  ✔ Better readability
  ✔ Easy debugging

--------------------------------
2. Syntax of a Function
--------------------------------

returnType functionName(parameters) {
    // function body
    // code to be executed
    return value;   // optional (depends on returnType)
}

--------------------------------
3. Parts of a Function
--------------------------------
- returnType : 
    - Data type of value returned by function
    - Example: int, float, void
- functionName :
    - Name of the function
- parameters :
    - Values passed to function (optional)
- return statement :
    - Sends value back to calling function

--------------------------------
4. Types of Functions in Java
--------------------------------

A) Based on Return Type

1. void function
----------------
- Does not return any value

Example:
void printHello() {
    System.out.println("Hello");
}

2. Non-void function
--------------------
- Returns a value

Example:
int add(int a, int b) {
    return a + b;
}

--------------------------------
B) Based on Parameters

1. Function without parameters
-------------------------------
- Takes no input

Example:
void greet() {
    System.out.println("Good Morning");
}

2. Function with parameters
---------------------------
- Takes input values

Example:
int square(int n) {
    return n * n;
}

--------------------------------
5. Calling a Function
--------------------------------
- Function is executed when it is called

Example:
add(5, 10);

--------------------------------
6. main() Function
--------------------------------
- Entry point of Java program
- Program starts execution from main()

Syntax:
public static void main(String args[]) {
    // code
}

--------------------------------
7. static Keyword
--------------------------------
- static functions belong to class, not object
- main() is static because JVM calls it directly

--------------------------------
8. Function Overloading
--------------------------------
- Multiple functions with same name but different parameters
- Happens at compile time

Example:
int add(int a, int b) {
    return a + b;
}

int add(int a, int b, int c) {
    return a + b + c;
}

--------------------------------
9. Return Statement
--------------------------------
- Ends function execution
- Returns value to caller

Example:
return result;

--------------------------------
10. Advantages of Functions
--------------------------------
✔ Reduces code repetition
✔ Improves modularity
✔ Easy to maintain
✔ Improves readability

--------------------------------
END OF FUNCTIONS NOTES
--------------------------------
*/
