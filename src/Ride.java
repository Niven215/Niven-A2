public class Ride {
    // Instance variables suitable for a Ride
    private String rideName;
    private int minHeight; // in cm, for example
    private Employee operator; // the employee in charge of operating the ride

    // Default constructor
    public Ride() {
        this.rideName = "";
        this.minHeight = 0;
        this.operator = null;
    }

    // Parameterized constructor
    public Ride(String rideName, int minHeight, Employee operator) {
        this.rideName = rideName;
        this.minHeight = minHeight;
        this.operator = operator;
    }

    // Getter and Setter for rideName
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    // Getter and Setter for minHeight
    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    // Getter and Setter for operator (Employee)
    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    // toString method
    @Override
    public String toString() {
        return "Ride{rideName='" + rideName + "', minHeight=" + minHeight +
                ", operator=" + (operator != null ? operator.getName() : "None") + "}";
    }
}

