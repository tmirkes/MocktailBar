import java.util.Objects;

public class Rider {
    private String name;
    private int homeRegion;
    private int destinationRegion;
    private String tripType;

    public Rider() {}

    public Rider(String name, int homeRegion, int destinationRegion, String tripType) {
        this.name = name;
        this.homeRegion = homeRegion;
        this.destinationRegion = destinationRegion;
        this.tripType = tripType;
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

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rider rider = (Rider) o;
        return getHomeRegion() == rider.getHomeRegion() && getDestinationRegion() == rider.getDestinationRegion() && getName().equals(rider.getName()) && Objects.equals(getTripType(), rider.getTripType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHomeRegion(), getDestinationRegion(), getTripType());
    }

    @Override
    public String toString() {
        return "Rider{" +
                "name='" + name + '\'' +
                ", homeRegion=" + homeRegion +
                ", destinationRegion=" + destinationRegion +
                ", tripType='" + tripType + '\'' +
                '}';
    }
}
