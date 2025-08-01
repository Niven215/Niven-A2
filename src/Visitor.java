public class Visitor extends Person {
    // Instance variables specific to Visitor
    private String ticketType;
    private boolean hasMembership;

    // Default constructor
    public Visitor() {
        super("", 0, ""); // default values for Person
        this.ticketType = "";
        this.hasMembership = false;
    }

    // Parameterized constructor
    public Visitor(String name, int age, String address, String ticketType, boolean hasMembership) {
        super(name, age, address); // calling the superclass constructor
        this.ticketType = ticketType;
        this.hasMembership = hasMembership;
    }

    // Getter and Setter for ticketType
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    // Getter and Setter for hasMembership
    public boolean isHasMembership() {
        return hasMembership;
    }

    public void setHasMembership(boolean hasMembership) {
        this.hasMembership = hasMembership;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Visitor{ticketType='" + ticketType + "', hasMembership=" + hasMembership + "}";
    }
}
