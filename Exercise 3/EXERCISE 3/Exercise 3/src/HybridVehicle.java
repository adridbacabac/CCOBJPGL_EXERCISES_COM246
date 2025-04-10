public class HybridVehicle extends Hybrid {
    protected String carName;

    HybridVehicle(String carName) {
        this.carName = carName;
    }

    void displayInfo() {
        System.out.println("Hybrid Vehicle: " + carName);
    }
}