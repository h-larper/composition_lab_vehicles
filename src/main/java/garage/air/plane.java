package garage.air;

import garage.Vehicle;

public class plane extends Vehicle implements IAirVehicle {

    private boolean radar;
    private int numberOfCrew;
    private int numberOfPassengers;
    private IAirVehicle airVehicle;

    public plane(float weight, int maxSpeed, boolean radar, int numberOfCrew, int numberOfPassengers) {
        super(weight, maxSpeed);
        this.radar = radar;
        this.numberOfCrew = numberOfCrew;
        this.numberOfPassengers = numberOfPassengers;
        this.airVehicle = airVehicle;
    }

    public int getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

}
