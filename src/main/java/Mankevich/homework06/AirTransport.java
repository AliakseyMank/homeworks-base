package Mankevich.homework06;

public class AirTransport extends Transport{
    protected int wingspan = 0;
    protected int minTakeoff = 0;

    public AirTransport(int powerHp,int maxSpeed, int weight , String brand, int wingspan,int minTakeoff){
        super(powerHp,maxSpeed,weight,brand);
        this.wingspan = wingspan;
        this.minTakeoff = minTakeoff;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Wingspan: "+this.wingspan);
        System.out.println("Min len of runway m: "+this.minTakeoff);
    }
}
