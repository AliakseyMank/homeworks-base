package Mankevich.homework06;

public class CivilAircraft extends AirTransport {
    private int numberOfPassengers = 0;
    private boolean bussnesClass = false;

    public CivilAircraft(int powerHp,int maxSpeed, int weight , String brand, int wingspan,int minTakeoff,int numberOfPassengers, boolean bussnesClass){
        super(powerHp, maxSpeed, weight, brand, wingspan, minTakeoff);
        this.bussnesClass = bussnesClass;
        this.numberOfPassengers = numberOfPassengers;

    }

    @Override
    public void showInfo() {
        System.out.println("Civil aircraft");
        super.showInfo();
        System.out.println("Number of passengers: "+this.numberOfPassengers);
        System.out.println("Is business class: "+this.bussnesClass);
    }
}
