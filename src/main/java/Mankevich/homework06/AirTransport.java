package Mankevich.homework06;

public abstract class AirTransport extends Transport{
    int wingspan;
    int minTakeoff;

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinTakeoff() {
        return minTakeoff;
    }

    public void setMinTakeoff(int minTakeoff) {
        this.minTakeoff = minTakeoff;
    }


}
