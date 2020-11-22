package Mankevich.homework07.task2;

import Mankevich.homework07.task2.Jacket.AddidasJacket;
import Mankevich.homework07.task2.Jacket.ReabokJacket;
import Mankevich.homework07.task2.shoes.AddidasShoes;
import Mankevich.homework07.task2.shoes.NikeShoes;
import Mankevich.homework07.task2.shoes.ReabokShoes;

public class Run {
    public static void main(String[] args) {
        Human human1 = new Human("Doric", new AddidasShoes() , new ReabokJacket());
        System.out.println(human1.getName());
        human1.takeOff();

        System.out.println();



        Human human2 = new Human("Валера",new NikeShoes() , new AddidasJacket());
        System.out.println(human2.getName());
        human2.takeOnn();

        System.out.println();


        Human human3 = new Human();
        human3.getJacket(new ReabokJacket());
        human3.getShoes(new ReabokShoes());
        human3.getName("Chort");
        System.out.println(human3.getName());
        human3.takeOnn();


    }
}

