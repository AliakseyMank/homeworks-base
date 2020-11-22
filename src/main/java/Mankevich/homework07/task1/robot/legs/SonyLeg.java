package Mankevich.homework07.task1.robot.legs;

public class SonyLeg implements ILeg{
    private int price = 0;

    public SonyLeg(int price){
        this.price = price;
    }


    @Override
    public void step() {
        System.out.println("Шаг ногой Сони");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
