// ================================
// FUNCTION (METHOD) OVERLOADING
// ================================

// Method Overloading means having
// more than one method with the SAME NAME
// but DIFFERENT PARAMETERS in the same class.

// Difference in parameters can be:
// 1. Number of parameters
// 2. Data type of parameters
// 3. Order of parameters

// Return type alone CANNOT be used to overload a method.

// --------------------------------
// WHY METHOD OVERLOADING?
// --------------------------------
// - Improves code readability
// - Increases code reusability
// - Makes program easy to understand
// - Same operation, different inputs

// --------------------------------
// RULES OF METHOD OVERLOADING
// --------------------------------
// 1. Method name must be same
// 2. Parameter list must be different
// 3. Happens at compile time
// 4. Also called Compile-Time Polymorphism

// --------------------------------
// EXAMPLE 1: Different Number of Parameters
// --------------------------------
class OverloadingExample1 {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

// --------------------------------
// EXAMPLE 2: Different Data Types
// --------------------------------
class OverloadingExample2 {

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }
}

// --------------------------------
// EXAMPLE 3: Different Order of Parameters
// --------------------------------
class OverloadingExample3 {

    static void display(int a, char ch) {
        System.out.println(a + " " + ch);
    }

    static void display(char ch, int a) {
        System.out.println(ch + " " + a);
    }
}

// --------------------------------
// INVALID METHOD OVERLOADING
// --------------------------------
// This is NOT allowed because only
// return type is different

/*
static int show(int a) {
    return a;
}

static double show(int a) {   // ❌ ERROR
    return a;
}
*/

// --------------------------------
// IMPORTANT POINTS TO REMEMBER
// --------------------------------
// - Method overloading is decided at compile time
// - JVM selects the method based on arguments passed
// - main() method can also be overloaded
// - Constructors can also be overloaded

// --------------------------------
// EXAM TIP
// --------------------------------
// Definition:
// Method Overloading is a feature of Java
// that allows a class to have multiple methods
// with the same name but different parameters.
