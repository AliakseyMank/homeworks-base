package Mankevich.homework07.task1.robot;

import Mankevich.homework07.task1.robot.hands.*;
import Mankevich.homework07.task1.robot.heads.*;
import Mankevich.homework07.task1.robot.legs.*;



import java.awt.*;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.setHead(new SonyHead(1600));
        robot1.setHand(new ToshibaHand(2000));
        robot1.setLeg(new SamsungLeg(3100));
        robot1.action();
        System.out.println("Стоимость 1-го робота: "+robot1.getPrice());

        System.out.println();
        System.out.println();


        Robot robot2 = new Robot();
        robot2.setHead(new ToshibaHead(2000));
        robot2.setHand(new SonyHand(2500));
        robot2.setLeg(new SonyLeg(2000));
        robot2.action();
        System.out.println("Стоимость 2-го робота: "+robot2.getPrice());

        System.out.println();
        System.out.println();


        Robot robot3 = new Robot();
        robot3.setHead(new SamsungHead(2000));
        robot3.setHand(new SamsungHand(3000));
        robot3.setLeg(new ToshibaLeg(3700));
        robot3.action();
        System.out.println("Стоимость 3-го робота: "+robot3.getPrice());

        if (robot1.getPrice()> robot2.getPrice() && robot1.getPrice()>robot3.getPrice()){
            System.out.println("\nПервый робот самый дорогой!");
        }else if(robot2.getPrice()> robot1.getPrice() && robot2.getPrice()>robot3.getPrice()){
            System.out.println("\nВторой робот самый дорогой!");
        }else if(robot3.getPrice()> robot1.getPrice() && robot3.getPrice()>robot2.getPrice()){
            System.out.println("\nТретий робот самый дорогой!");
        }else {
            System.out.println("\nХз вообще что происходит");
        }
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
    */
    }
}
