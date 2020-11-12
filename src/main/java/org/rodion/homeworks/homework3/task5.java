package org.rodion.homeworks.homework3;

import java.util.Random;
import java.util.Scanner;

/*5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
строкой и т. д.)*/
public class task5 {
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
        int [][] trans = new int [a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                trans[j][i]=array[i][j];
            }
        }
        System.out.print("\nТранспонированная матрица: ");
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < a; j++) {
                if (trans[i][j] < 10) {
                    System.out.print("0" + trans[i][j] + " ");
                } else
                    System.out.print(trans[i][j] + " ");
            }
        }
    }
}