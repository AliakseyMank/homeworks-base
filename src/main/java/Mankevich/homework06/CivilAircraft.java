package Mankevich.homework06;

public class CivilAircraft extends AirTransport {
    int numberOfPassengers;

    public String showInfo() {
        System.out.printf("Брэнд- %s\n Мощность в ватах - %s\nМощность в лошадиных силах - %s\nМаксимальная скорость - %s\nВес " +
                        "транспорта в кг - %s\nРазмах крыльев в м - %s\nМинимальная длина взлётной полосы - %s\nЧисло пассажиров - %s\n"
                , brand, powerVat, calculatePower(powerVat), maxSpeed, weight, wingspan, minTakeoff, numberOfPassengers);
        return null;
    }
}
