package Mankevich.homework1;

import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        int cont=0,positive=0,negative=0,zero=0;
        double a;
        Scanner input = new Scanner(System.in);
        while (cont<3) {
            System.out.println("Введите число");
            a = input.nextDouble();
            if (a>0){
                positive++;
            }else if(a<0){
                negative++;
            }else zero++;
            cont++;
        }
        System.out.println("Положительных чисел: " + positive);
    }
}
