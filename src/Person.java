// Abstract class Person - base class for Employee and Visitor
public abstract class Person {
    // Common attributes for all people
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setAddress(String address) { this.address = address; }

    // toString method to return formatted person details
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}
