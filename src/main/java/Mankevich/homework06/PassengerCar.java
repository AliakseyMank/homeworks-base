package Mankevich.homework06;
/*Результат работы метода должен вывести такую строчку:
За время (ваше введённое время) ч, автомобиль (марка автомобиля)
двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
проедет (xxx) км и израсходует (xxx) литров топлива.*/

public class PassengerCar extends TerrestrialTransport {

    private String bodyTipe = "";
    private int countOfPeople = 0;

    public PassengerCar(int powerHp, int maxSpeed, int weight, String brand,
                        int numberOfWheels, int countOfFuel,String bodyTipe, int countOfPeople) {
        super(powerHp, maxSpeed, weight, brand, numberOfWheels, countOfFuel);
        this.bodyTipe = bodyTipe;
        this.countOfPeople = countOfPeople;
    }

    @Override
    public void showInfo() {
        System.out.println("Passengers car");
        super.showInfo();
        System.out.println("Body tipe: "+ this.bodyTipe);
        System.out.println("Count of people: "+this.countOfPeople);

    }
}
