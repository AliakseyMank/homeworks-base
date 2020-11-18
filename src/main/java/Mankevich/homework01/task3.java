package Mankevich.homework01;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число");
        a=input.nextInt();
        if (a>0) a++;
        else if (a<0) a -= 2;
        else a=10;
        System.out.println("результат: " + a);
    }
}