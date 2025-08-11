// RideInterface.java
// Interface to define common behavior for all rides in the theme park
public interface RideInterface {

    /**
     * Displays the details of the ride (name, capacity, min height, etc.).
     * Any ride implementing this interface must define how details are shown.
     */
    void showRideDetails();

    /**
     * Adds a visitor to the ride queue if they meet requirements.
     * @param visitorName - the name of the visitor to add
     */
    void addToQueue(String visitorName);

    /**
     * Removes and returns the next visitor from the queue.
     * @return The name of the visitor removed from the queue.
     */
    String removeFromQueue();

    /**
     * Shows the number of people currently in the queue.
     * @return The queue size.
     */
    int getQueueSize();
}
