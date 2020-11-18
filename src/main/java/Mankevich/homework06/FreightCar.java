package Mankevich.homework06;

public class FreightCar extends TerrestrialTransport{
    public int getLifting() {
        return lifting;
    }

    public void setLifting(int lifting) {
        this.lifting = lifting;
    }

    int lifting;

    @Override
    public String showInfo() {
        System.out.printf("Брэнд- %s\n Мощность в ватах - %s\nМощность в лошадиных силах - %s\nМаксимальная скорость - %s\nВес " +
                        "транспорта в кг - %s\nКоличество колёс - %s\nРасход - %s\nГрузоподъемность - %s\n "
                ,brand,powerVat,calculatePower(powerVat),maxSpeed,weight,numberOfWheels,fuelCons,lifting);
        return null;
    }
}
