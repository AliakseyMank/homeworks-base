package Mankevich.homework4;

import java.util.Random;
import java.util.Scanner;

/*4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно)*/
public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int a;
        do {
            System.out.println("Введите размер матрицы: ");
            while (!input.hasNextInt()) {
                System.out.println("Не корректный ввод. Попробуйте снова");
                input.next();
            }
            a = input.nextInt();
        } while (a <= 0);
        int[][] array = new int[a][a];
        System.out.print("Первоначальная матрица");
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < a; j++) {
                array[i][j] = rnd.nextInt(51);
                if (array[i][j] < 10) {
                    System.out.print("0" + array[i][j] + " ");
                } else
                    System.out.print(array[i][j] + " ");
            }
        }
        int summ = 0;
        System.out.print("\nСуммируемые элементы: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i+j) < (a-1)){
                    summ += array[i][j];
                    System.out.print(array[i][j]+" ");
                }
            }
        }
        System.out.print("\nСумма элементов стоящих выше побочной диагонали: "+summ );
    }
}
