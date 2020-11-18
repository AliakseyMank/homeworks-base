package Mankevich.homework06;
/*Результат работы метода должен вывести такую строчку:
За время (ваше введённое время) ч, автомобиль (марка автомобиля)
двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
проедет (xxx) км и израсходует (xxx) литров топлива.*/

public class PassengerCar extends TerrestrialTransport {

    public void met1(int time){
        double way = time*maxSpeed;
        double fuel= (double) way*fuelCons/100;
        System.out.printf("За время %s ч, автомобиль %s\nдвигаясь с максимальной скоростью %s км/ч\nпроедет %s км и израсходует %5.2f литров топлива", time, brand, maxSpeed, way, fuel);

    }

    String bodyTipe;

    public String getBodyTipe() {
        return bodyTipe;
    }
    public void setBodyTipe(String bodyTipe) {
        this.bodyTipe = bodyTipe;
    }

    @Override
    public String showInfo() {
        System.out.printf("Брэнд- %s\n Мощность в ватах - %s\nМощность в лошадиных силах - %s\nМаксимальная скорость - %s\nВес " +
                        "транспорта в кг - %s\nКоличество колёс - %s\nРасход - %s\nТип кузова - %s\n "
                ,brand,powerVat,calculatePower(powerVat),maxSpeed,weight,numberOfWheels,fuelCons,bodyTipe);
        return null;
    }
}
