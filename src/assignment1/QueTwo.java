package assignment1;
import java.util.*;

public class QueTwo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String inputString = "";
            System.out.println("Enter text: and 'XDONE' to exit");
            while (true) {
                String s = sc.nextLine();
                if (s.equals("XDONE")) {
                    break;
                }
                inputString += s + "\n";
            }
            System.out.println("text Entered : ");
            System.out.println(inputString);
        }
    }
