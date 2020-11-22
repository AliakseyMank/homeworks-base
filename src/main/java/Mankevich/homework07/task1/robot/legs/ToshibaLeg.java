package Mankevich.homework07.task1.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price){
        this.price = price;
    }


    @Override
    public void step() {
        System.out.println("Шаг ногой тошиба");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
