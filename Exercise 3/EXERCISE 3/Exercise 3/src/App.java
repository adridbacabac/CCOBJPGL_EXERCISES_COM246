public class App {
    public static void main(String[] args) throws Exception {

        HybridVehicle sedan = new HybridSedan("HYbrid Sedan");
        sedan.displayInfo();
        sedan.chargeBattery();
        sedan.fillGas();

        System.out.println();

        HybridVehicle pickup = new HybridPickup("Hybrid Pickup");
        pickup.displayInfo();
        pickup.chargeBattery();
        pickup.fillGas();

        CarWash carwash = new CarWash();
        carwash.wash(sedan);
        carwash.wash(pickup);

    }
}
