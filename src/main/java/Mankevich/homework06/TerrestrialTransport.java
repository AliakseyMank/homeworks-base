package Mankevich.homework06;

public abstract class TerrestrialTransport extends Transport {
    int numberOfWheels;

    public double getFuelCons() {
        return fuelCons;
    }

    public void setFuelCons(int fuelCons) {
        this.fuelCons = fuelCons;
    }

    double fuelCons;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        if (this.numberOfWheels<4){
            System.out.println("Its not a car!");
        }else
            this.numberOfWheels = numberOfWheels;
    }
}
