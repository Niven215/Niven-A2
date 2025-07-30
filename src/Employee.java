public class Employee extends Person {
    // Instance variables specific to Employee
    private String jobTitle;
    private String shift;

    // Default constructor
    public Employee() {
        super("", 0, ""); // calling Person's constructor with default values
        this.jobTitle = "";
        this.shift = "";
    }

    // Parameterized constructor
    public Employee(String name, int age, String address, String jobTitle, String shift) {
        super(name, age, address); // calling Person's constructor
        this.jobTitle = jobTitle;
        this.shift = shift;
    }

    // Getter and Setter for jobTitle
    public String get
