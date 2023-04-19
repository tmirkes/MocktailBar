import java.util.*;

public class Driver {
    private String name;
    private int homeRegion;
    private int destinationRegion;
    private boolean active;
    private ArrayList<Car> vehicles;

    public Driver() {}

    public Driver(String name, int homeRegion, int destinationRegion, boolean active, ArrayList<Car> vehicles) {
        this.name = name;
        this.homeRegion = homeRegion;
        this.destinationRegion = destinationRegion;
        this.active = active;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHomeRegion() {
        return homeRegion;
    }

    public void setHomeRegion(int homeRegion) {
        this.homeRegion = homeRegion;
    }

    public int getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(int destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public ArrayList<Car> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Car> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Car newCar) {
        vehicles.add(newCar);
    }

    public boolean isValidDriver() {
        return this.active;
    }

    public void toggleActivityState() {
        if (this.active) {
            this.active = false;
            this.vehicles = new ArrayList<Car>();
        } else {
            this.active = true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return getHomeRegion() == driver.getHomeRegion() && getDestinationRegion() == driver.getDestinationRegion() && isActive() == driver.isActive() && getName().equals(driver.getName()) && Objects.equals(getVehicles(), driver.getVehicles());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHomeRegion(), getDestinationRegion(), isActive(), getVehicles());
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", homeRegion=" + homeRegion +
                ", destinationRegion=" + destinationRegion +
                ", active=" + active +
                ", vehicles=" + vehicles +
                '}';
    }
}
