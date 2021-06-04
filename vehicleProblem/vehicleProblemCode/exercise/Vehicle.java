package exercise;

public abstract class Vehicle {
    private String name;
    private int maxPassenger;
    private int maxSpeed;
    private int numWheels;
    private int displacement;

    public Vehicle() {
    }

    public Vehicle(String name, int maxPassenger, int maxSpeed, int x) {
        this.name = name;
        this.maxPassenger = maxPassenger;
        this.maxSpeed = maxSpeed;

        if(x<100) {
            this.numWheels = x;
        }
        else {
            this.displacement = x;
        }
    }

    public Vehicle(String name, int maxPassenger, int maxSpeed, int numWheels, int displacement) {
        this.name = name;
        this.maxPassenger = maxPassenger;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
        this.displacement = displacement;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public int getNumWheels() {
        return numWheels;
    }

    public int getDisplacement() {
        return displacement;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", maxPassenger=" + maxPassenger +
                ", maxSpeed=" + maxSpeed +
                ", numWheels=" + numWheels +
                ", displacement=" + displacement +
                '}';
    }
}
