package Mankevich.homework3;

import java.util.Random;
import java.util.Scanner;

/*10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.*/
public class task10 {
    public static void main(String[] args) {
        Random rnd =new Random();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Введите целое число больше 3: ");
            while (!sc.hasNextInt()){
                System.out.println("Это не целое число. Попробуйте снова");
                sc.next();
            }
            n=sc.nextInt();
        }while (n<=3);
        System.out.println("Предел значений и размер массива: "+n);
        int [] mass = new int[n];
        System.out.print("Весь массив:");
        int m=0;
        for (int i = 0 ; i<n; i++){
            mass[i]= rnd.nextInt((n+1));
            System.out.print(mass[i]+" ");
            if (mass[i]%2==0 && mass[i]!=0){
                m++;
            }
        }
        System.out.println("\nЧисло чётных элементов массива:= "+m);
        int [] mass2 = new int[m];
        System.out.print("Массив из чётных чисел: ");
        int k=0;
        for (int i = 0; i<n; i++){
            if (mass[i]%2==0 && mass[i]!=0) {
                mass2[k] = mass[i];
                k++;
            }
        }
        for (int i=0; i<k; i++){
            System.out.print(mass2[i]+" ");
        }
    }
}
