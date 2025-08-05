// Employee class that extends Person - for theme park staff
public class Employee extends Person {
    // Attributes specific to staff
    private String jobTitle;
    private String shift;

    // Default constructor
    public Employee() {
        super(); // Calls Person's default constructor
        this.jobTitle = "";
        this.shift = "";
    }

    // Parameterized constructor
    public Employee(String name, int age, String address, String jobTitle, String shift) {
        super(name, age, address); // Calls Person's constructor with parameters
        this.jobTitle = jobTitle;
        this.shift = shift;
    }

    // Getter and Setter for jobTitle
    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    // Getter and Setter for shift
    public String getShift() { return shift; }
    public void setShift(String shift) { this.shift = shift; }

    // toString method to return full Employee details
    @Override
    public String toString() {
        return super.toString() + ", Job Title: " + jobTitle + ", Shift: " + shift;
    }
}
