import java.util.Objects;

public class Car {
    private String carMake;
    private String carModel;
    private int capacity;
    private int miles;
    private int milesToService;

    public Car() {}

    public Car(String carMake, String carModel, int capacity, int miles, int milesToService) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.capacity = capacity;
        this.miles = miles;
        this.milesToService = milesToService;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getMilesToService() {
        return milesToService;
    }

    public void setMilesToService(int milesToService) {
        this.milesToService = milesToService;
    }

    public int calculateServiceMiles(int currentMiles) {
        return (currentMiles % 25000);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getCapacity() == car.getCapacity() && getMiles() == car.getMiles() && getMilesToService() == car.getMilesToService() && getCarMake().equals(car.getCarMake()) && getCarModel().equals(car.getCarModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarMake(), getCarModel(), getCapacity(), getMiles(), getMilesToService());
    }

    @Override
    public String toString() {
        return "Car{" +
                "carMake='" + carMake + '\'' +
                ", carModel='" + carModel + '\'' +
                ", capacity=" + capacity +
                ", miles=" + miles +
                ", milesToService=" + milesToService +
                '}';
    }
}

