// Employee.java
// Employee class extends Person, representing staff working at the theme park

public class Employee extends Person {
    private String jobTitle;
    private double salary;

    // Default constructor
    public Employee() {
        super();
        this.jobTitle = "";
        this.salary = 0.0;
    }

    // Parameterized constructor including Person variables
    public Employee(String name, int age, String address, double height, String jobTitle, double salary) {
        super(name, age, address, height);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getters and setters for Employee-specific variables
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method for printing Employee details
    @Override
    public String toString() {
        return super.toString() + ", Employee{jobTitle='" + jobTitle + "', salary=" + salary + "}";
    }
}
