package Assignment_F2_streams;
interface MyInterface {
    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

// To access the default method, you can create an instance of a class that implements the interface and call the method on it.
public class Question2 implements MyInterface {
    public static void main(String[] args) {
        Question2 obj = new Question2();
        obj.defaultMethod(); // Output: This is a default method.
    }
}

// To access the static method, you can call it directly on the interface.


