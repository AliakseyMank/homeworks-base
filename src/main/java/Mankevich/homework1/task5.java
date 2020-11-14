package Mankevich.homework1;

import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        int cont=1,positive=0,negative=0,zero=0;
        double a;
        Scanner input = new Scanner(System.in);
        while (cont<4) {
            System.out.println("Введите "+ cont +" число");
            a = input.nextDouble();
            if (a>0){
                positive++;
            }else if(a<0){
                negative++;
            }else zero++;
            cont++;
        }
        System.out.println("Положительных чисел: " + positive);
        System.out.println("Отрицательных чисел: " + negative);

    }
}