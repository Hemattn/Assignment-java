package assignment1;

public class QueOne {
    //Static variables created
    static String FirstName="Hema";
    static String LastName="Patidar";
    static int Age=15;
    //static block created
    static{
        System.out.println("Displaying using a static block: ");
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(Age);
    }
    //static method created
    public static void display(){
        System.out.println("Displaying using a static method: ");
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(Age);
    }

    public static void main(String[] args) {
        QueOne obj= new QueOne();
        obj.display();
    }

}
