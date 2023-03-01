package assignment1;
public class QueFive {
        String firstname;
        String lastname;
        int age;
        String designation;
        QueFive(){
            String firstname="kritika";
            String lastname="pharswal";
            int age=22;
            String designation="trainee";
        }
        QueFive(String a, String b, int c, String d){
            this.firstname=a;
            this.lastname=b;
            this.age=c;
            this.designation=d;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public int getAge() {
            return age;
        }

        public String getDesignation() {
            return designation;
        }

        // toString
        @Override
        public String toString()
        {
            return "Employee { " +
                    "First Name - " + firstname + " | " +
                    "Last Name - " + lastname + " | " +
                    "Age - " + age + " | " +
                    "Designation - " + designation + " }";
        }

        public static void main(String[] args)
        {
            QueFive e1 = new QueFive();
            QueFive e2 = new QueFive("Aaditya", "Kashyap", 22, "Trainee");
            e1.setFirstname("Raj");
            e1.setLastname("Chaubey");
            e2.getDesignation();
            System.out.println(e1.toString());
            System.out.println(e2.toString());
        }
}

