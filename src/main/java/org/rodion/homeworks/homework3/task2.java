package org.rodion.homeworks.homework3;

import java.util.Random;
import java.util.Scanner;

/*2)Вывести нечетные элементы находящиеся под главной
диагональю(включительно).*/
public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int a;
        do{
            System.out.println("Введите размер матрицы: ");
            while (!input.hasNextInt()){
                System.out.println("Не корректный ввод. Попробуйте снова");
                input.next();
            }
            a = input.nextInt();
        }while (a<=0);
        int [][]  array = new int[a][a];
        System.out.println("Первоначальная матрица");
        for(int i = 0 ; i < a ; i++){
            System.out.println();
            for(int j=0; j < a ; j++){
                array[i][j]=rnd.nextInt(51);
                if (array[i][j]<10){
                    System.out.print("0"+array[i][j]+" ");
                }else
                    System.out.print(array[i][j]+" ");
            }
        }
        System.out.print("\nЭлементы ниже главной диагонали: ");
        for (int i = 0 ; i < a; i++){
            for (int j = 0; j <= i ; j++){
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println("\nИзменённая матрица");
        for (int i = 0 ; i < a; i++){
            System.out.println();
            for (int j = 0; j < a ; j++){
                if(j <= i){
                    if (array[i][j]<10){
                        System.out.print("0"+array[i][j]+" ");
                    }
                    else
                        System.out.print(array[i][j]+" ");
                }else
                    System.out.print("00 ");
            }
        }
    }
}
