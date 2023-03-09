package Assignment_F2_streams;
interface My_interface {
    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

public class Question2 implements My_interface {
    public static void main(String[] args) {
        Question2 obj = new Question2();
        obj.defaultMethod();
    }
}



