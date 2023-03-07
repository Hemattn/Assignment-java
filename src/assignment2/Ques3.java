package assignment2;

public class Ques3 {
    public static void main(String[] args) {
        try{
            Class.forName("file.txt");
        }catch(ClassNotFoundException e){
            System.out.println("Class not found exception handled");

        }
    }
}
