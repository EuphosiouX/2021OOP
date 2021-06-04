package exercise;

public class PoliceCar extends Vehicle implements IsEmergency, LandVehicle{

    private boolean onDuty;

    public PoliceCar() {
    }

    public PoliceCar(String name, int maxPassenger, int maxSpeed, int numWheels, boolean onDuty) {
        super(name, maxPassenger, maxSpeed, numWheels);
        this.onDuty = onDuty;
    }

    @Override
    public String toString() {
        return "PoliceCar{" +
                "name='" + super.getName() + '\'' +
                ", maxPassenger=" + super.getMaxPassenger() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", numWheels=" + super.getNumWheels() +
                ", onDuty=" + isOnDuty() +
                '}';
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    @Override
    public void soundSiren() {
        System.out.println("Wii U!! Wii U!!");
    }

    @Override
    public void drive() {
        System.out.println("Im driving here!!!");
    }
}
