// Ride.java
// Represents a theme park ride in the PRVMS system

import java.util.LinkedList;
import java.util.Queue;

public class Ride {
    // Instance variables for ride details
    private String rideName;
    private double minHeight; // Minimum height in meters
    private int maxCapacity;

    // Queue to store visitors waiting for the ride
    private Queue<Visitor> rideQueue;

    // Default constructor
    public Ride() {
        this.rideName = "Unknown Ride";
        this.minHeight = 0.0;
        this.maxCapacity = 0;
        this.rideQueue = new LinkedList<>();
    }

    // Parameterized constructor
    public Ride(String rideName, double minHeight, int maxCapacity) {
        this.rideName = rideName;
        this.minHeight = minHeight;
        this.maxCapacity = maxCapacity;
        this.rideQueue = new LinkedList<>();
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(double minHeight) {
        this.minHeight = minHeight;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Queue<Visitor> getRideQueue() {
        return rideQueue;
    }

    // Method to add a visitor to the ride queue
    public boolean addVisitorToQueue(Visitor visitor) {
        if (rideQueue.size() < maxCapacity) {
            if (visitor.getHeight() >= minHeight) {
                rideQueue.add(visitor);
                System.out.println(visitor.getName() + " added to " + rideName + " queue.");
                return true;
            } else {
                System.out.println(visitor.getName() + " is too short for this ride.");
                return false;
            }
        } else {
            System.out.println("Queue for " + rideName + " is full.");
            return false;
        }
    }

    // Method to remove visitor from the queue (when they ride)
    public Visitor removeVisitorFromQueue() {
        if (!rideQueue.isEmpty()) {
            Visitor v = rideQueue.poll();
            System.out.println(v.getName() + " has taken the ride: " + rideName);
            return v;
        } else {
            System.out.println("No visitors in queue for " + rideName);
            return null;
        }
    }

    // Method to display ride info
    public void displayRideInfo() {
        System.out.println("Ride Name: " + rideName);
        System.out.println("Minimum Height: " + minHeight + "m");
        System.out.println("Max Capacity: " + maxCapacity);
        System.out.println("Current Queue Size: " + rideQueue.size());
    }
}
