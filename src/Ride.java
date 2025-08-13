// Ride.java
// Abstract class implementing RideInterface, base for all rides

import java.util.*;

public abstract class Ride implements RideInterface {
    private String rideName;
    private int maxRider;          // Maximum visitors per ride cycle
    private double minHeight;      // Minimum height requirement in meters
    private Employee rideOperator; // Employee operating the ride

    // Queue to store waiting visitors (FIFO)
    private Queue<Visitor> visitorQueue;

    // History of visitors who have taken the ride
    private List<Visitor> visitorHistory;

    private int numOfCycles;       // How many times the ride has run

    // Default constructor
    public Ride() {
        this.rideName = "";
        this.maxRider = 1;
        this.minHeight = 0.0;
        this.rideOperator = null;
        this.visitorQueue = new LinkedList<>();
        this.visitorHistory = new LinkedList<>();
        this.numOfCycles = 0;
    }

    // Parameterized constructor
    public Ride(String rideName, int maxRider, double minHeight) {
        this.rideName = rideName;
        this.maxRider = maxRider;
        this.minHeight = minHeight;
        this.rideOperator = null;
        this.visitorQueue = new LinkedList<>();
        this.visitorHistory = new LinkedList<>();
        this.numOfCycles = 0;
    }

    // Getters and setters for ride properties
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(double minHeight) {
        this.minHeight = minHeight;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    // Queue-related methods

    // Add visitor to queue if they meet height requirement
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor.getHeight() < this.minHeight) {
            System.out.println(visitor.getName() + " does not meet the minimum height requirement for " + rideName);
            return;
        }
        visitorQueue.add(visitor);
        System.out.println(visitor.getName() + " added to queue for " + rideName);
    }

    // Remove visitor from queue (FIFO)
    @Override
    public void removeVisitorFromQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("Queue is empty. No visitor to remove.");
            return;
        }
        Visitor removedVisitor = visitorQueue.poll();
        System.out.println(removedVisitor.getName() + " removed from the queue.");
    }

    // Print all visitors in queue
    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("Queue for " + rideName + " is empty.");
            return;
        }
        System.out.println("Visitors currently in queue for " + rideName + ":");
        for (Visitor v : visitorQueue) {
            System.out.println(v);
        }
    }

    // Run one ride cycle
    @Override
    public void runOneCycle() {
        if (rideOperator == null) {
            System.out.println("Cannot run " + rideName + " because there is no operator assigned.");
            return;
        }
        if (visitorQueue.isEmpty()) {
            System.out.println("No visitors waiting to ride " + rideName);
            return;
        }

        int ridersThisCycle = 0;
        System.out.println("Running one cycle of " + rideName);
        while (ridersThisCycle < maxRider && !visitorQueue.isEmpty()) {
            Visitor currentVisitor = visitorQueue.poll();
            System.out.println(currentVisitor.getName() + " is riding " + rideName);
            addVisitorToHistory(currentVisitor);
            ridersThisCycle++;
        }
        numOfCycles++;
        System.out.println("Cycle complete. Total cycles run: " + numOfCycles);
    }

    // Visitor history methods
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        visitorHistory.add(visitor);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return visitorHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return visitorHistory.size();
    }

    @Override
    public void printRideHistory() {
        if (visitorHistory.isEmpty()) {
            System.out.println("No visitors have taken the ride " + rideName + " yet.");
            return;
        }
        System.out.println("Visitors who have taken " + rideName + ":");
        for (Visitor v : visitorHistory) {
            System.out.println(v);
        }
    }
}
