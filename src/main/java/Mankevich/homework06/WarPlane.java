package Mankevich.homework06;

public class WarPlane extends AirTransport {
    private int numberOfRockets = 0;
    private boolean ejectSystem = false;

    public WarPlane(int powerHp,int maxSpeed, int weight , String brand, int wingspan,int minTakeoff,int numberOfRockets,boolean ejectSystem) {
        super(powerHp, maxSpeed, weight, brand, wingspan, minTakeoff);
        this.numberOfRockets = numberOfRockets;
        this.ejectSystem = ejectSystem;
    }

    @Override
    public void showInfo() {
        System.out.println("War plane");
        super.showInfo();
        System.out.println("Is eject system: "+this.ejectSystem);
        System.out.println("Number of rockets: "+this.numberOfRockets);
    }
}
