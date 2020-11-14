package Mankevich.homework3;

import java.util.Random;

/*6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.*/
public class task6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int mass[]= new int[4];
        for (int i=0 ; i<4 ; i++){
            mass[i]= rnd.nextInt(10);
            System.out.print(mass[i]+" ");
        }
        if (mass[0] < mass[1] && mass[1] < mass[2] && mass[2] < mass[3]){
            System.out.println("Возрастающая последовательность");
        }
        else if (mass[0] > mass[1] && mass[1] > mass[2] && mass[2] > mass[3]){
            System.out.println("Убывающая последовательность");
        }
        else {System.out.println("Нет последовательности");}
    }
}
