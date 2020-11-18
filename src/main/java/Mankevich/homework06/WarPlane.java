package Mankevich.homework06;

public class WarPlane extends AirTransport{
    int numbOfRockets;
    boolean baleOut;
    String strBaleOut;

    public int getNumbOfRockets() {
        return numbOfRockets;
    }

    public void setNumbOfRockets(int numbOfRockets) {
        this.numbOfRockets = numbOfRockets;
    }

    public boolean isBaleOut() {
        return baleOut;
    }

    public void setBaleOut(boolean baleOut) {
        this.baleOut = baleOut;
    }

    {
        if (baleOut) {
            strBaleOut = "Есть возможность катапультирования";
        } else {
            strBaleOut = "Нет возможности катапультирования";
        }
    }
    @Override
    public String showInfo() {
        System.out.printf("Брэнд- %s\n Мощность в ватах - %s\nМощность в лошадиных силах - %s\nМаксимальная скорость - %s\nВес " +
                        "транспорта в кг - %s\nРазмах крыльев - %s\nМинимальная длина взлётной полосы в м - %s\n%s\nКоличество рокет на борту - %s\n "
                ,brand,powerVat,calculatePower(powerVat),maxSpeed,weight,wingspan,minTakeoff,strBaleOut,numbOfRockets);
        return null;
    }
}
