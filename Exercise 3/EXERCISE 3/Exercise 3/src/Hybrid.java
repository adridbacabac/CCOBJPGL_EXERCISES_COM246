public class Hybrid extends Electric {
    InternalCombustion ic = new InternalCombustion();

    @Override
    public void chargeBattery() {
        System.out.println("charging battery");
    }

    public void fillGas() {
        System.out.println("refueling gas");
    }
}