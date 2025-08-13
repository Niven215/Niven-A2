// FerrisWheel.java
// Concrete class extending Ride with ferris wheel specific attribute

public class FerrisWheel extends Ride {
    private int numberOfCabins;

    public FerrisWheel() {
        super();
        this.numberOfCabins = 0;
    }

    public FerrisWheel(String rideName, int maxRider, double minHeight, int numberOfCabins) {
        super(rideName, maxRider, minHeight);
        this.numberOfCabins = numberOfCabins;
    }

    public int getNumberOfCabins() {
        return numberOfCabins;
    }

    public void setNumberOfCabins(int numberOfCabins) {
        this.numberOfCabins = numberOfCabins;
    }

    // Override to print ride details with cabins
    public void showRideDetails() {
        System.out.println("FerrisWheel: " + getRideName() + ", Max Riders: " + getMaxRider() + ", Min Height: " + getMinHeight() + ", Cabins: " + numberOfCabins);
    }
}
