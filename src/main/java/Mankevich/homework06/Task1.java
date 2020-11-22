package Mankevich.homework06;

public class Task1 {
    public static void main(String[] args) {


        /*Создание объекта конечного класса и присвоение ему ссылки.
         * Присваивание значения полям. Военный самолёт.*/
        WarPlane warPlane = new WarPlane(500,200,1500,"belavia",150,1500,5,true);
        warPlane.showInfo();
        System.out.println();
        System.out.println();

        CivilAircraft civilAircraft = new CivilAircraft(500,200,1500,"Air_Jordan",200,2000,55,false);
        civilAircraft.showInfo();
        System.out.println();
        System.out.println();

        PassengerCar passengerCar = new PassengerCar(100,235,1500,"bmw",4,4,"sedan",5);
        passengerCar.showInfo();
        System.out.println();
        System.out.println();

        FreightCar freightCar = new FreightCar(350,250,2600,"Scalia",8,5,1000,3500);
        freightCar.showInfo();
        System.out.println();
        System.out.println();
    }
}
