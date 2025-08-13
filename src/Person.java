// Person.java
// Abstract base class representing a person in the theme park system

public abstract class Person {
    private String name;
    private int age;
    private String address;
    private double height;  // Height in meters (for ride restrictions)

    // Default constructor
    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
        this.height = 0.0;
    }

    // Parameterized constructor
    public Person(String name, int age, String address, double height) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.height = height;
    }

    // Getters and setters for all instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // toString method for printing Person details
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "', height=" + height + "}";
    }
}
