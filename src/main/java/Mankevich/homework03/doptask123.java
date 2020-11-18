package Mankevich.homework03;

import java.util.Random;
import java.util.Scanner;

//1) Найти произведение элементов, кратных 3
//2) Найти среднее арифметическое элементов с нечетными номерами.
//3) Найти средне арифметическое элементов массива, превосходящих некоторое число С.
public class doptask123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        do{
            System.out.println("ВВедите некоторое число С (меньше 10)");
            while (!sc.hasNextInt()){
                System.out.println("Некорректный ввод.Попробуйте снова.");
                sc.next();
            }
            c = sc.nextInt();
        }while (c>10 || c<=0);
        int [] mass = new int[10];
        Random rnd = new Random();
        int product = 1;
        int summ=0;
        int summ1=0;
        int n=0;
        int n1=0;
        double simplemean;
        System.out.print("Одномерный массив размерностью 10 со случайными значениями до 10: ");

        for ( int i = 0; i < 10; i++) {
            mass[i] = rnd.nextInt(10);
            System.out.print(mass[i] + " ");
            if (mass[i]%3==0 && mass[i]!=0){
                product*=mass[i];
            }
            if (i%2!=0 && i!=0){
                summ += mass[i];
                n++;
            }
            if (mass[i]>c){
                summ1 += mass[i];
                n1++;
            }
        }
        System.out.print("\nРезультат произведения чисел кратных 3:= "+product);
        simplemean= (double) summ/n;
        System.out.printf("\nСреднее арифметическое элементов с нечётными индексами: %4.2f",simplemean);
        simplemean= (double) summ1/n1;
        System.out.printf("\nСреднее арифметическое элементов больше введенного с: %4.2f",simplemean);
    }
}
