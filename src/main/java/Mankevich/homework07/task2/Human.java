package Mankevich.homework07.task2;

import Mankevich.homework07.task2.Jacket.AllJackets;
import Mankevich.homework07.task2.shoes.AllShoes;

public class Human implements Clothes{

    private String Name;
    private AllJackets jacket;
    private AllShoes shoes;

    public Human(String name, AllShoes shoes, AllJackets jacket) {
        this.Name = name;
        this.shoes = shoes;
        this.jacket = jacket;
    }
    public Human(){}

    public String getName() {
        return Name;
    }

    public void takeOff(){
        shoes.takeOff();
        jacket.jacketOff();
    }
    public void takeOnn(){
        shoes.takeOnn();
        jacket.jacketOnn();
    }

    public AllShoes getShoes(){
        return shoes;
    }
    public void getShoes(AllShoes shoes) {
        this.shoes = shoes;
    }

    public AllJackets getJacket(){
        return jacket;
    }
    public void getJacket(AllJackets jacket){
        this.jacket = jacket;
    }

    public String getName(String Name){
        this.Name = Name;
        return Name;
    }
}
