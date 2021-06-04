package exercise;

public class Frigate extends Vehicle implements SeaVessel{

    public Frigate() {
    }

    public Frigate(String name, int maxPassenger, int maxSpeed, int displacement) {
        super(name, maxPassenger, maxSpeed, displacement);
    }

    public void fireGun(){
        System.out.println("Fire!!!!");
    }

    @Override
    public String toString() {
        return "Frigate{" +
                "name='" + super.getName() + '\'' +
                ", maxPassenger=" + super.getMaxPassenger() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", displacement=" + super.getDisplacement() +
                '}';
    }

    @Override
    public void launch() {
        System.out.println("Launching in 3, 2, 1....");
    }
}
