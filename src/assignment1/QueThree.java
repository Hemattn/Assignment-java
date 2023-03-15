package assignment1;
import java.util.Scanner;
public class QueThree {

    public static double areaOfCircle(int r){
        double area=3.14*r*r;
        return area;
    }
    public static double circumferenceOfCircle(int r){
        double c=2*3.14*r;
        return c;
    }

    public static void main(String[] args ){
        QueThree q3= new QueThree();
        System.out.println("*Menu*");
        System.out.println("1. Area of a circle.");
        System.out.println("2. Circumference of a circle.");
        System.out.println("3. Exit.");
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int choice=s.nextInt();
//        Scanner s= new Scanner(System.in);
        System.out.println("Enter radius : ");
        int r=s.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println(areaOfCircle(r));
                break;
            case 2:
                System.out.println( circumferenceOfCircle(r));
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("wrong choice");
        }

    }
}
