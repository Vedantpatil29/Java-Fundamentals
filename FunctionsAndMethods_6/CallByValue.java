/*
CALL BY VALUE (JAVA)

- In call by value, copy of actual value is passed to function
- Original variable is not affected
- Java uses call by value for all function calls
- Changes made inside function do not affect caller variable
- Used for primitive data types:
  int, float, char, boolean, double

Example:
int a = 10;
change(a);   // copy of a is passed
*/

class Test {
    static void change(int x) {
        x = 20;   // changes only the copy
    }

    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);  // Output: 10
    }
}
