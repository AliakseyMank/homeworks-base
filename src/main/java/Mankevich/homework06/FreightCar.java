package Mankevich.homework06;

public class FreightCar extends TerrestrialTransport{

    private int countOfFreight;
    private int yourFreigt;

    public FreightCar(int powerHp, int maxSpeed, int weight, String brand, int numberOfWheels, int countOfFuel, int countOfFreight,int yourFreigt){
        super(powerHp, maxSpeed, weight, brand, numberOfWheels, countOfFuel);
        this.countOfFreight = countOfFreight;
        this.yourFreigt=yourFreigt;

    }

    @Override
    public void showInfo() {
        System.out.println("Freight car");
        super.showInfo();
        System.out.println("Count of Freight: "+this.countOfFreight);
        System.out.println("Your freight: "+this.yourFreigt);
        System.out.println(freightTest(this.countOfFreight,this.yourFreigt));
    }

    private String freightTest(int countOfFreight, int yourFreight){
        String result="";
        if (this.countOfFreight>this.yourFreigt) result = "Грузовик загружен ";
        else {
            result = "Нужен грузовик поболше";
        }
        return result;

    }
}

