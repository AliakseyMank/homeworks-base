package Mankevich.homework07.task1.robot.heads;
public class ToshibaHead implements IHead {

    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Head say Hello Toshiba");

    }

    @Override
    public int getPrice() {
        return price;
    }
    }
