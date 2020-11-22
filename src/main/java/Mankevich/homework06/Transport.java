package Mankevich.homework06;

public class Transport {
    int powerHp =0;
    int maxSpeed=0;
    int weight=0;
    String brand="";

    private double kwInHp(int powerHp){
        this.powerHp = powerHp;
        double powerkW = 0.74* powerHp;
        return powerkW;
    }

    //зачем передавать значения полям если они и так имеют такие же названия
    Transport(int powerHp, int maxSpeed, int weight, String brand){
        this.powerHp = powerHp;
        this.maxSpeed=maxSpeed;
        this.weight=weight;
        this.brand=brand;
    }
    public void showInfo(){
        System.out.println("Power HP: "+this.powerHp);
        System.out.println("Max speed: "+this.maxSpeed);
        System.out.println("Weight: "+this.weight);
        System.out.println("Brand: "+this.brand);
        System.out.println("Powet kW: "+kwInHp(this.powerHp));
    }

}

