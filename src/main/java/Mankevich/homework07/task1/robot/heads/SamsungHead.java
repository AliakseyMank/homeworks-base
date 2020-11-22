package Mankevich.homework07.task1.robot.heads;

public class SamsungHead implements IHead {
    int price;
    public SamsungHead(int price) {
        this.price = price;
    }
    public SamsungHead() {

    }
    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

