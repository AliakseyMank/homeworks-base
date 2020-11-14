package Mankevich.homework2;/*5)Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/
import java.util.*;
public class task5 {
    public static void main(String[] args) {
        double sm = 2.54;
        int dm=1;
        double rez = 2.54;

        do{
            if(dm==1){
                System.out.print("dm   "+"sm");
            }
            System.out.print("\n"+dm);
            System.out.printf("  %5.2f",rez);
            dm++;
            rez=sm*dm;
        }while(dm<=20);
    }
}
