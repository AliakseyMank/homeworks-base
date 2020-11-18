package Mankevich.homework06;

public abstract class Transport {
    int powerVat;
    int maxSpeed;
    int weight;
    String brand;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        maxSpeed = maxSpeed;
    }

    public int getPowerVat() {
        return powerVat;
    }

    public void setPowerVat(int powerVat) {
        this.powerVat = powerVat;
    }
    public double calculatePower(int power){
        double powerMuscle = power*0.76;
        return powerMuscle;
    }
    public abstract String showInfo();
}

