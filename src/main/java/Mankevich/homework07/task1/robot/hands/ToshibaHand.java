package Mankevich.homework07.task1.robot.hands;

public class ToshibaHand implements IHand {

    private int price;

    public ToshibaHand(int price){
        this.price = price;
    }
    @Override
    public void upHand() {
        System.out.println("Поднял руку Тошиба");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
