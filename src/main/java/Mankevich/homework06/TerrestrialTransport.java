package Mankevich.homework06;

public class TerrestrialTransport extends Transport {
    protected int numberOfWheels = 0;
    protected double countOfFuel = 0.0;

    public TerrestrialTransport(int powerHp, int maxSpeed, int weight, String brand, int numberOfWheels, int countOfFuel){
        super(powerHp, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.countOfFuel = countOfFuel;

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Number of wheels: "+this.numberOfWheels);
        System.out.println("Count of fuel: "+this.countOfFuel);
    }
}

