package Assignment_F2_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question5_EmpDemo {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Snow Doe", 4500L, "Delhi"),
                new Employee("Meridith Heaven Grey", 5000L, "Seattle"),
                new Employee("Derek Honey Shepherd", 7000L, "Paris"),
                new Employee("Christina Lovely Yang", 8500L, "Tokyo"),
                new Employee("Deepak Pratik Kumar", 4500L, "Delhi"),
                new Employee("Falguni Rashi Pathak", 6000L, "Delhi")
        );

        Set<String> FirstNames = employees.stream()
                .filter(e -> e.getSalary() < 5000 && e.getCity().equalsIgnoreCase("Delhi"))
                .map(e -> e.getFullName().split(" ")[0])
                .distinct()
                .collect(Collectors.toSet());

        System.out.println("Unique first names are: " + FirstNames);
    }

}

class Employee {
    private String fullName;
    private Long salary;
    private String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public Long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}
