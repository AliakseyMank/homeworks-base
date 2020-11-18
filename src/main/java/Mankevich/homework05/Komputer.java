package Mankevich.homework05;

import java.util.Random;
import java.util.Scanner;

public class Komputer {
    Random rnd = new Random();
    String cpu;
    int ram;
    int hdd;
    int fullCycleResoursse;
    static boolean conditionOfComputer=true;
    //если true компьютер работает, если false сломан
    String computerBroken = "Компьютер сломан";

    void displayinfo() {
        System.out.printf("CPU -%s \tRAM -%s \tHDD -%s\t " +
                "Ресурс полных циклов -%s", cpu, ram, hdd, fullCycleResoursse);
    }
    void computerOnn(){
        if (conditionOfComputer==true){
            System.out.print("\nКомпьютер включился!");
            workOrHaveError();
        }else {
            System.out.print(computerBroken);
        }
    }
    void workOrHaveError(){
        int a = rnd.nextInt(2);
        if (a==0){
            System.out.print("Произошла ошибка.Введите 0 или 1 для решения.");
            int error = rnd.nextInt(2);
            Scanner scn=new Scanner(System.in);
            if (scn.hasNextInt()){
                System.out.println("Удача на вашей стороне.Компьютер продолжает работу.");
            }else conditionOfComputer=false;
        }else
            System.out.print("Компьютер продолжает работу без ошибки.");
    }
}
