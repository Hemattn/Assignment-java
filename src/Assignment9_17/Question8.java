package Assignment9_17;

import java.io.*;
public class Question8{
    public static void main(String[] args) {
        try (Class1 c1= new Class1();
             Class2 c2 = new Class2();
             Class3 c3= new Class3()) {
            c1.display1();
            c2.display2();
            c3.display3();
            int x = 5 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
class Class1 implements AutoCloseable {
    void display1() { System.out.println("Autocloseable 1"); }
    public void close()
    {
        System.out.println("Autocloseable 1 class closed");
    }

}
class Class2 implements AutoCloseable {
    void display2() { System.out.println("Autocloseable 2"); }
    public void close()
    {
        System.out.println("Autocloseable 2 class closed");
    }

}
class Class3 implements AutoCloseable {
    void display3() { System.out.println("Autocloseable 3 "); }
    public void close()
    {
        System.out.println("Autocloseable 3 class closed");
    }

}