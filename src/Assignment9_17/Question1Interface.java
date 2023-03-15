package Assignment9_17;

public interface Question1Interface{
    //making a public method in the interface
    default void publicMethod() {
        System.out.println("This is a public method.");
        System.out.println("Now calling private method through public method.");
        //calling the private method in public method.
        privateMethod();
    }
    //making a private method in the interface.
    private static void privateMethod() {
        System.out.println("***************");
        System.out.println("This is a private method.");
    }
}
class Question1 implements Question1Interface{
    public static void main(String[] args) {
        Question1 obj = new Question1();
        obj.publicMethod();
    }
}
