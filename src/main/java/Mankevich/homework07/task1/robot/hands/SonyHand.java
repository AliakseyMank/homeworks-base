package Mankevich.homework07.task1.robot.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price){
        this.price = price;

    }
    @Override
    public void upHand() {
        System.out.println("Поднял руку Сони");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
