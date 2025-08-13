// AssignmentTwo.java
// Main class to test the theme park visitor management system

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo app = new AssignmentTwo();

        app.partThree();
        app.partFourA();
        app.partFive();

    }

    public void partThree() {
        System.out.println("--- Part 3: Queue Interface Demo ---");

        RollerCoaster rc = new RollerCoaster("Thunder Loop", 3, 1.3, 5);
        Employee operator = new Employee("Lori", 35, "245 Street", 1.75, "Ride Operator", 50000);
        rc.setRideOperator(operator);

        // Create Visitors
        Visitor v1 = new Visitor("Niven", 25, "Addr1", 1.6, "Adult", true);
        Visitor v2 = new Visitor("Doreen", 17, "Addr2", 1.5, "Teen", false);
        Visitor v3 = new Visitor("Molly", 12, "Addr3", 1.2, "Child", false);
        Visitor v4 = new Visitor("Hancock", 22, "Addr4", 1.7, "Adult", true);
        Visitor v5 = new Visitor("Natalie", 30, "Addr5", 1.8, "Adult", true);

        // Add Visitors to queue
        rc.addVisitorToQueue(v1);
        rc.addVisitorToQueue(v2);
        rc.addVisitorToQueue(v3);  // Visitor Should fail height check should fail if minHeight is 1.3m
        rc.addVisitorToQueue(v4);
        rc.addVisitorToQueue(v5);

        rc.printQueue();

        // Remove a visitor from the queue
        rc.removeVisitorFromQueue();

        rc.printQueue();
    }

    public void partFourA() {
        System.out.println("--- Part 4A: Visitor History Demo ---");

        RollerCoaster rc = new RollerCoaster("Thunder Loop", 3, 1.3, 5);
        Employee operator = new Employee("Steve", 35, "123 Street", 1.75, "Ride Operator", 50000);
        rc.setRideOperator(operator);

        // Create Visitors
        Visitor v1 = new Visitor("Niven", 25, "Addr1", 1.6, "Adult", true);
        Visitor v2 = new Visitor("Doreen", 17, "Addr2", 1.5, "Teen", false);
        Visitor v3 = new Visitor("Molly", 22, "Addr4", 1.7, "Adult", true);

        // Add Visitors to history
        rc.addVisitorToHistory(v1);
        rc.addVisitorToHistory(v2);
        rc.addVisitorToHistory(v3);

        rc.printRideHistory();

        System.out.println("Is Doreen in history? " + rc.checkVisitorFromHistory(v2));
        System.out.println("Number of visitors who took the ride: " + rc.numberOfVisitors());
    }

    public void partFive() {
        System.out.println("--- Part 5: Running a Ride Cycle ---");

        RollerCoaster rc = new RollerCoaster("Thunder Loop", 3, 1.3, 5);
        Employee operator = new Employee("Steve", 35, "123 Street", 1.75, "Ride Operator", 50000);
        rc.setRideOperator(operator);

        // Create Visitors
        Visitor v1 = new Visitor("Niven", 25, "Addr1", 1.6, "Adult", true);
        Visitor v2 = new Visitor("Doreen", 17, "Addr2", 1.5, "Teen", false);
        Visitor v3 = new Visitor("Molly", 22, "Addr4", 1.7, "Adult", true);
        Visitor v4 = new Visitor("Hancock", 30, "Addr5", 1.8, "Adult", true);

        // Add Visitors to queue
        rc.addVisitorToQueue(v1);
        rc.addVisitorToQueue(v2);
        rc.addVisitorToQueue(v3);
        rc.addVisitorToQueue(v4);

        rc.printQueue();

        // Run one ride cycle
        rc.runOneCycle();

        rc.printQueue();

        rc.printRideHistory();
    }
}
