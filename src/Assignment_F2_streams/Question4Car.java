package Assignment_F2_streams;

import java.util.Optional;

public class Question4Car {
    private String make;
    private String model;
    private Optional<Integer> year;

    public Question4Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = Optional.ofNullable(year);
    }

    public String getDescription() {
        if (year.isPresent()) {
            return year.get() + " " + make + " " + model;
        } else {
            return make + " " + model;
        }
    }

    public static void main(String[] args) {
        Question4Car car1 = new Question4Car("Toyota", "Camry", 2022);
        Question4Car car2 = new Question4Car("Honda", "Accord", null);

        System.out.println(car1.getDescription()); // Output: 2022 Toyota Camry
        System.out.println(car2.getDescription()); // Output: Honda Accord
    }
}

