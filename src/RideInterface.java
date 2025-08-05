// RideInterface - defines behaviors that every Ride must implement
public interface RideInterface {

    // Part 3 - Methods for managing ride queue
    void addVisitorToQueue(Visitor v);
    void removeVisitorFromQueue();
    void printQueue();

    // Part 4A - Methods for ride history tracking
    void addVisitorToHistory(Visitor v);
    boolean checkVisitorFromHistory(Visitor v);
    int numberOfVisitors();
    void printRideHistory();

    // Part 5 - Ride operation
    void runOneCycle();
}
