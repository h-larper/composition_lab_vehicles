import garage.land.Car;
import garage.engine.CombustionEngine;
import garage.engine.ElectricEngine;
import garage.engine.IEngine;
import garage.water.Speedboat;

public class Runner {

    public static void main(String[] args) {

        //composing a method for a car:
        IEngine combustionEngine = new CombustionEngine(99, "01/01/2024");      // creating an engine object first; needed to fill in parameters below for car class
        Car hondaJazz = new Car(1300, 150, "hatchback", combustionEngine);
        System.out.println(hondaJazz.getHorsePower());                      // asking hondaJazz to print out horsepower

        IEngine electricEngine = new ElectricEngine(399, 100);      // created a new engine object
        //swapping engines in the hondaJazz
        hondaJazz.setEngine(electricEngine);
        System.out.println(hondaJazz.getHorsePower());                      // printing out new horsepower


        IEngine combustionEngine2 = new CombustionEngine(120, "02/02/2023");
        Speedboat dashBoat = new Speedboat(2000, 200, false, "Displacement", combustionEngine);
        System.out.println(dashBoat.getEngine());

        IEngine electricEngine2 = new ElectricEngine(330, 100);
        dashBoat.setEngine(electricEngine2);
        System.out.println(dashBoat.getEngine());


    }



}
