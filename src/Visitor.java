// Visitor.java
// Visitor class extends Person, representing theme park visitors

public class Visitor extends Person {
    private String ticketType;
    private boolean hasMembership;

    // Default constructor
    public Visitor() {
        super();
        this.ticketType = "";
        this.hasMembership = false;
    }

    // Parameterized constructor including Person variables and Visitor-specific variables
    public Visitor(String name, int age, String address, double height, String ticketType, boolean hasMembership) {
        super(name, age, address, height);
        this.ticketType = ticketType;
        this.hasMembership = hasMembership;
    }

    // Getters and setters for Visitor-specific variables
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public boolean isHasMembership() {
        return hasMembership;
    }

    public void setHasMembership(boolean hasMembership) {
        this.hasMembership = hasMembership;
    }

    // toString method for printing Visitor details
    @Override
    public String toString() {
        return super.toString() + ", Visitor{ticketType='" + ticketType + "', hasMembership=" + hasMembership + "}";
    }
}
