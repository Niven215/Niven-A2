// RideInterface.java
// Interface defining the key methods a ride must implement

public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);      // Add a visitor to the ride queue
    void removeVisitorFromQueue();                 // Remove a visitor from the queue
    void printQueue();                             // Print visitors currently in queue
    void runOneCycle();                            // Run the ride for one cycle
    void addVisitorToHistory(Visitor visitor);    // Add visitor to ride history (past riders)
    boolean checkVisitorFromHistory(Visitor visitor); // Check if visitor has taken the ride before
    int numberOfVisitors();                        // Number of visitors who have taken the ride
    void printRideHistory();                       // Print list of visitors who took the ride
}
