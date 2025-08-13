// RollerCoaster.java
// Concrete class extending Ride with roller coaster specific attribute

public class RollerCoaster extends Ride {
    private int numberOfLoops;

    public RollerCoaster() {
        super();
        this.numberOfLoops = 0;
    }

    public RollerCoaster(String rideName, int maxRider, double minHeight, int numberOfLoops) {
        super(rideName, maxRider, minHeight);
        this.numberOfLoops = numberOfLoops;
    }

    public int getNumberOfLoops() {
        return numberOfLoops;
    }

    public void setNumberOfLoops(int numberOfLoops) {
        this.numberOfLoops = numberOfLoops;
    }

    // Override to print ride details with loops
    public void showRideDetails() {
        System.out.println("RollerCoaster: " + getRideName() + ", Max Riders: " + getMaxRider() + ", Min Height: " + getMinHeight() + ", Loops: " + numberOfLoops);
    }
}

