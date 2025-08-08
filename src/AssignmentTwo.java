public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo app = new AssignmentTwo();

        // Run each part step-by-step
        app.partThree();
        app.partFourA();
        app.partFourB();
        app.partFive();  // Will implement this in next step
    }

    // --------------------------------
    // Part 3 – Queue demonstration
    // --------------------------------
    public void partThree() {
        System.out.println("\n--- PART 3: Visitor Queue ---");

        Employee e1 = new Employee("Sarah", 28, "Staff Village", "Ride Operator", "Morning");
        Ride rollerCoaster = new Ride("Roller Coaster", 5, e1);

        // Create Visitors
        Visitor v1 = new Visitor("Alice", 22, "Perth", "Day Pass", false);
        Visitor v2 = new Visitor("Bob", 30, "Sydney", "VIP Pass", true);
        Visitor v3 = new Visitor("Charlie", 25, "Melbourne", "Day Pass", true);
        Visitor v4 = new Visitor("Diana", 35, "Brisbane", "Season Pass", false);
        Visitor v5 = new Visitor("Ethan", 29, "Adelaide", "Day Pass", false);

        // Add 5 visitors to queue
        rollerCoaster.addVisitorToQueue(v1);
        rollerCoaster.addVisitorToQueue(v2);
        rollerCoaster.addVisitorToQueue(v3);
        rollerCoaster.addVisitorToQueue(v4);
        rollerCoaster.addVisitorToQueue(v5);

        // Remove 1 visitor from queue
        rollerCoaster.removeVisitorFromQueue();

        // Print queue
        rollerCoaster.printQueue();
    }

    // --------------------------------
    // Part 4A – LinkedList Ride History
    // --------------------------------
    public void partFourA() {
        System.out.println("\n--- PART 4A: Visitor History ---");

        Ride hauntedHouse = new Ride("Haunted House", 3, null);

        // Add Visitors to history
        Visitor v1 = new Visitor("Liam", 19, "Gold Coast", "Day Pass", true);
        Visitor v2 = new Visitor("Emma", 27, "Perth", "VIP Pass", false);
        Visitor v3 = new Visitor("Noah", 31, "Darwin", "Day Pass", false);
        Visitor v4 = new Visitor("Olivia", 24, "Canberra", "Season Pass", true);
        Visitor v5 = new Visitor("James", 21, "Hobart", "VIP Pass", false);

        hauntedHouse.addVisitorToHistory(v1);
        hauntedHouse.addVisitorToHistory(v2);
        hauntedHouse.addVisitorToHistory(v3);
        hauntedHouse.addVisitorToHistory(v4);
        hauntedHouse.addVisitorToHistory(v5);

        // Check for a specific visitor
        hauntedHouse.checkVisitorFromHistory(v3);

        // Print number of visitors
        System.out.println("🔢 Total Visitors in Ride History: " + hauntedHouse.numberOfVisitors());

        // Print all ride history
        hauntedHouse.printRideHistory();
    }

    // --------------------------------
    // Part 4B – Sorting Visitors
    // --------------------------------
    public void partFourB() {
        System.out.println("\n--- PART 4B: Sorted Visitor History ---");

        Ride dropTower = new Ride("Drop Tower", 4, null);

        Visitor v1 = new Visitor("Zoe", 26, "Melbourne", "VIP", true);
        Visitor v2 = new Visitor("Adam", 33, "Brisbane", "Day Pass", false);
        Visitor v3 = new Visitor("Mia", 21, "Sydney", "Season Pass", true);
        Visitor v4 = new Visitor("Ben", 29, "Perth", "VIP", false);
        Visitor v5 = new Visitor("Eva", 24, "Darwin", "Day Pass", true);

        dropTower.addVisitorToHistory(v1);
        dropTower.addVisitorToHistory(v2);
        dropTower.addVisitorToHistory(v3);
        dropTower.addVisitorToHistory(v4);
        dropTower.addVisitorToHistory(v5);

        System.out.println("📋 Before sorting:");
        dropTower.printRideHistory();

        // Sort using VisitorComparator
        dropTower.getRideHistory().sort(new VisitorComparator());

        System.out.println("✅ After sorting by Name and Age:");
        dropTower.printRideHistory();
    }

    // Part 5 will come next...
    public void partFive() {
        System.out.println("\n--- PART 5: Run One Ride Cycle ---");
        // Will be implemented in next step
    }
}
