package collection_assignment4;

import java.util.HashMap;
import java.util.Map;
public class ques4 {
    private String name;
    private int age;
    private String designation;
    private int salary;
    public ques4 (String name,int age,String designation,double salary){
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = (int) salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDesignation(){
        return designation;
    }
    public double getSalary(){
        return salary;
    }
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary;
    }
    public static void main(String[]args){
        ques4 emp1 = new ques4("Hema",23,"Software Developer",25000);
        ques4 emp2 = new ques4("Kritika",23,"System Engineer", 31000);
        ques4 emp3 = new ques4("Pankaj",23, "Associate System Engineer",29000);
        ques4 emp4 = new ques4("Vijay",21,"Tester", 60000);
        ques4 emp5 = new ques4("Swati",23,"Developer",62000);
        Map<ques4,Double> sal = new HashMap<>();
        sal.put(emp1,emp1.getSalary());
        sal.put(emp2,emp2.getSalary());
        sal.put(emp3,emp3.getSalary());
        sal.put(emp4,emp4.getSalary());
        sal.put(emp5,emp5.getSalary());

        for (Map.Entry<ques4,Double> entry : sal.entrySet()){
            System.out.println("Employee: "+entry.getKey().getName()+"\n Salary: "+entry.getKey().getSalary());
        }
    }
}
