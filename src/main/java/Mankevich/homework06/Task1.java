package Mankevich.homework06;

public class Task1 {
    public static void main(String[] args) {
        /*Создание объекта конечного класса и присвоение ему ссылки.
        * Присваивание значения полям. Легковой автомобиль.*/
        PassengerCar passCar = new PassengerCar();
        passCar.brand="Shkoda";
        passCar.bodyTipe="sedan";
        passCar.numberOfWheels=4;
        passCar.weight=1500;
        passCar.maxSpeed=140;
        passCar.powerVat=75;
        passCar.fuelCons=6.5;

        /*Создание объекта конечного класса и присвоение ему ссылки.
         * Присваивание значения полям. Грузовой автомобиль.*/
        FreightCar freightCar = new FreightCar();
        freightCar.brand="Tasmania";
        freightCar.lifting=2000;
        freightCar.maxSpeed=100;
        freightCar.numberOfWheels=5;
        freightCar.weight=2000;
        freightCar.powerVat=300;

        /*Создание объекта конечного класса и присвоение ему ссылки.
         * Присваивание значения полям. Пассажирский самолёт.*/
        CivilAircraft civilAircraft = new CivilAircraft();
        civilAircraft.wingspan=200;
        civilAircraft.minTakeoff=1500;
        civilAircraft.brand="Cattery";
        civilAircraft.maxSpeed=600;
        civilAircraft.powerVat=500;
        civilAircraft.weight=25000;
        civilAircraft.numberOfPassengers=200;

        /*Создание объекта конечного класса и присвоение ему ссылки.
         * Присваивание значения полям. Военный самолёт.*/
        WarPlane warPlane = new WarPlane();
        warPlane.baleOut=true;
        warPlane.brand="Belvia";
        warPlane.maxSpeed=500;
        warPlane.minTakeoff=2000;
        warPlane.numbOfRockets=10;
        warPlane.powerVat=250;
        warPlane.weight=20000;
        warPlane.wingspan=150;

        System.out.println("Легковой автомобиль");
        passCar.showInfo();
        System.out.println("Грузовой автомобиль");
        freightCar.showInfo();
        System.out.println("Пассажирский самолёт");
        civilAircraft.showInfo();
        System.out.println("Военный самолёт");
        warPlane.showInfo();
        passCar.met1(5);
    }
}
