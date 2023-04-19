import java.util.*;

public class Rideshare {
    private int region;
    private ArrayList<Driver> drivers;
    private ArrayList<Rider> riders;

    public Rideshare() {}

    public Rideshare(int region, ArrayList<Driver> drivers, ArrayList<Rider> riders) {
        this.region = region;
        this.drivers = drivers;
        this.riders = riders;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public ArrayList<Rider> getRiders() {
        return riders;
    }

    public void setRiders(ArrayList<Rider> riders) {
        this.riders = riders;
    }

    public void addDriver(Driver newDriver) {
        drivers.add(newDriver);
    }

    public void addRider(Rider newRider) {
        riders.add(newRider);
    }

    public ArrayList<Driver> getDriversByHomeRegion(int region) {
        ArrayList<Driver> matchingDrivers = new ArrayList<>();
        for (Driver driver : drivers) {
            if (driver.getHomeRegion() == region) {
                matchingDrivers.add(driver);
            }
        }
        return matchingDrivers;
    }
    
    public ArrayList<Driver> getDriversByDestinationRegion(int region) {
        ArrayList<Driver> matchingDrivers = new ArrayList<>();
        for (Driver driver : drivers) {
            if (driver.getDestinationRegion() == region) {
                matchingDrivers.add(driver);
            }
        }
        return matchingDrivers;
    }

    public ArrayList<Rider> getRidersByHomeRegion(int region) {
        ArrayList<Rider> matchingRiders = new ArrayList<>();
        for (Rider rider : riders) {
            if (rider.getHomeRegion() == region) {
                matchingRiders.add(rider);
            }
        }
        return matchingRiders;
    }

    public ArrayList<Rider> getRidersByDestinationRegion(int region) {
        ArrayList<Rider> matchingRiders = new ArrayList<>();
        for (Rider rider : riders) {
            if (rider.getDestinationRegion() == region) {
                matchingRiders.add(rider);
            }
        }
        return matchingRiders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rideshare rideshare = (Rideshare) o;
        return getRegion() == rideshare.getRegion() && Objects.equals(getDrivers(), rideshare.getDrivers()) && Objects.equals(getRiders(), rideshare.getRiders());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegion(), getDrivers(), getRiders());
    }

    @Override
    public String toString() {
        return "Rideshare{" +
                "region=" + region +
                ", drivers=" + drivers +
                ", riders=" + riders +
                '}';
    }
}
