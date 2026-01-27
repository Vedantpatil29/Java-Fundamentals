// ================================
// SCOPE IN JAVA
// ================================

// Scope refers to the region of a program
// where a variable or method is accessible
// and can be used.

// Outside its scope, a variable cannot be accessed.

// --------------------------------
// TYPES OF SCOPE IN JAVA
// --------------------------------
// 1. Class Scope  //in oops
// 2. Method Scope
// 3. Block Scope
// 4. Constructor Scope  //in oops
// 5. Loop Scope   //in oops

// ================================
// 1. CLASS SCOPE
// ================================

// Variables declared inside a class
// but outside all methods are called
// class scope variables.

// Also known as:
// - Instance variables (non-static)
// - Static variables (if declared static)

// Accessible by all methods of the class.

class ClassScopeExample {

    int x = 10;           // instance variable
    static int y = 20;    // static variable

    void display() {
        System.out.println(x); // accessible
        System.out.println(y); // accessible
    }
}

// ================================
// 2. METHOD SCOPE
// ================================

// Variables declared inside a method
// are called method scope variables.

// They are accessible only inside that method.
// They are destroyed when the method execution ends.

class MethodScopeExample {

    void show() {
        int a = 5;   // method scope variable
        System.out.println(a);
    }

    // System.out.println(a);  // ❌ ERROR: a not accessible here
}

// ================================
// 3. BLOCK SCOPE
// ================================

// Variables declared inside a block { }
// are called block scope variables.

// Block can be:
// - if block
// - else block
// - switch block
// - any { } braces

class BlockScopeExample {

    void test() {

        if (true) {
            int b = 10;     // block scope
            System.out.println(b);
        }

        // System.out.println(b); // ❌ ERROR: b out of scope
    }
}

// ================================
// 4. CONSTRUCTOR SCOPE
// ================================

// Variables declared inside a constructor
// are accessible only within that constructor.

class ConstructorScopeExample {

    ConstructorScopeExample() {
        int c = 15;    // constructor scope
        System.out.println(c);
    }

    // c is not accessible outside constructor
}

// ================================
// 5. LOOP SCOPE
// ================================

// Variables declared inside loops
// are accessible only inside the loop.

class LoopScopeExample {

    void loopTest() {

        for (int i = 0; i < 5; i++) { // i has loop scope
            System.out.println(i);
        }

        // System.out.println(i); // ❌ ERROR: i out of scope
    }
}

// ================================
// IMPORTANT POINTS
// ================================

// - Scope is determined by { } braces
// - Variables with same name can exist
//   in different scopes
// - Inner scope can access outer scope variables
// - Outer scope cannot access inner scope variables

// ================================
// EXAM DEFINITION
// ================================

// Scope in Java defines the area of a program
// where a variable can be accessed and used.
