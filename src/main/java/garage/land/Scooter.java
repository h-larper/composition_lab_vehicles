package garage.land;

import garage.Vehicle;
import garage.land.ILandVehicle;

public class Scooter extends Vehicle implements ILandVehicle {

    private int numberOfWheels;

    public Scooter(float weight, int maxSpeed, boolean hasBreaks){
        super(weight, maxSpeed);
        this.numberOfWheels = 2;
    }

    public void doTailWhip(){
        System.out.println("Doing some rad moves");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
