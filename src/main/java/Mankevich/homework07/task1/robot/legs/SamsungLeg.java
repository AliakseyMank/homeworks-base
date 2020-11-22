package Mankevich.homework07.task1.robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price){
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шаг ногой Самсунг");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
