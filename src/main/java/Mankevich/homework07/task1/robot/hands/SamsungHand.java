package Mankevich.homework07.task1.robot.hands;

public class SamsungHand implements IHand{
    private int price;
    public SamsungHand(int price){
        this.price = price;
    }
    @Override
    public void upHand() {
        System.out.println("Поднял руку Самсунг");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
