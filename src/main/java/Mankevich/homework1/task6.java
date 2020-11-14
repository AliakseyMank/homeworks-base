package Mankevich.homework1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        double a, b;
        String ff;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        a = input.nextDouble();
        System.out.println("Введите 2 число: ");
        b = input.nextDouble();
        if (a > b) {
            ff = "Первое число больше второго.";
        } else if (b > a) {
            ff = "Второе число больше первого.";
        } else ff = "Числа равны.";
        System.out.println(ff);
    }
}
