package exercise;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel{

    public Hovercraft() {
    }

    public Hovercraft(String name, int maxPassenger, int maxSpeed, int numWheels, int displacement) {
        super(name, maxPassenger, maxSpeed, numWheels, displacement);
    }

    public void enterLand(){
        System.out.println("Im on land...");
    }

    public void enterSea(){
        System.out.println("Im on sea...");
    }

    @Override
    public String toString() {
        return "Hovercraft{" +
                "name='" + super.getName() + '\'' +
                ", maxPassenger=" + super.getMaxPassenger() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", numWheels=" + super.getNumWheels() +
                ", displacement=" + super.getDisplacement() +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Im driving here!!!");
    }

    @Override
    public void launch() {
        System.out.println("Launching in 3, 2, 1....");
    }
}
