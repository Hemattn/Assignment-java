package Assignment9_17;

public class Question11 {
    public static void main(String[] args)
    {
        record student(String name, int age, int id){
            static int counter=0;
            static void increase(){
                counter++;
            }
            student{
                increase();
            }
        };
        student s1=new student("Hema",24,1);
        student s2=new student("Divya",23,2);
        System.out.println(s1.equals(s2));
        System.out.println("counter="+student.counter);
    }
}