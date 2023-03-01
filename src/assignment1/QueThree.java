package assignment1;
import java.util.Scanner;
public class QueThree {

    public double Area_circle(int r){
        double area=3.14*r*r;
        return area;
    }
    public double Circumference(int r){
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
                System.out.println(q3.Area_circle(r));
                break;
            case 2:
                System.out.println( q3.Circumference(r));
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("wrong choice");
        }

    }
}
