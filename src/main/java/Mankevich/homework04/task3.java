package Mankevich.homework04;

import java.util.Random;
import java.util.Scanner;

/*3)Проверить произведение элементов какой диагонали больше.*/
public class task3 {
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
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < a; j++) {
                array[i][j] = rnd.nextInt(10);
                if (array[i][j] < 10) {
                    System.out.print("0" + array[i][j] + " ");
                } else
                    System.out.print(array[i][j] + " ");
            }
        }
        int sum_main = 0;
        int sum_collateral = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i==j) {
                    sum_main += array[i][j];
                }
                if ((i+j)==(a-1)) {
                    sum_collateral += array[i][j];
                }
            }
        }
        System.out.print("\nСумма элементов на главной диагонали: "+sum_main);
        System.out.print("\nСумма элементов на побочной диагонали: "+sum_collateral);
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < a; j++) {
                System.out.print(i+""+j+" ");
            }
        }
    }
}
