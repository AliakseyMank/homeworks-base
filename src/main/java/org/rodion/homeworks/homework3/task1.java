package org.rodion.homeworks.homework3;

import java.util.Random;
import java.util.Scanner;

/*1) Почитать сумму четных элементов стоящих на главной диагонали.*/
public class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //создаём объект типа Scanner
        Random r= new Random(); // создаём объект типа Random
        int n;
        do {
            System.out.println("ВВедите размерность матрицы: ");
            while (!sc.hasNextInt()) {
                System.out.println("Некорректный ввод: ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        int mass [][]=new int[n][n]; //инициализация маccива размером NxN
        for(int i=0; i<n;i++){ //Заполнение массива случайными числами от 0 до 9
            for(int j=0; j<n; j++){
                mass[i][j]=r.nextInt(51);
            }
        }
        for(int i=0; i<n;i++){
            System.out.println();
            for(int j=0; j<n; j++) {
                if (mass[i][j] < 10) {
                    System.out.print("0" + mass[i][j] + " ");
                } else
                    System.out.print(mass[i][j] + " ");
            }
        }
        int summ=0;
        for(int i=0; i<n ; i++){
            if (mass [i][i]%2==0){
                summ += mass [i][i];
            }
        }
        System.out.println("\nСумма чётных элементов на главной диагонали: "+summ);
    }
}
