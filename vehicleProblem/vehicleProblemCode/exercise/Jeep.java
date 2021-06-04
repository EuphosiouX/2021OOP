package exercise;

public class Jeep extends Vehicle implements LandVehicle{

    public Jeep() {
    }

    public Jeep(String name, int maxPassenger, int maxSpeed, int numWheels) {
        super(name, maxPassenger, maxSpeed, numWheels);
    }

    public void soundHorn(){
        System.out.println("Beep Beep!!!");
    }

    @Override
    public String toString() {
        return "Jeep{" +
                "name='" + super.getName() + '\'' +
                ", maxPassenger=" + super.getMaxPassenger() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", numWheels=" + super.getNumWheels() +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Im driving here!!!");
    }
}
