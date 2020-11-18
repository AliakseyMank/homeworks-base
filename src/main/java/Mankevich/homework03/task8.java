package Mankevich.homework03;

import java.util.Random;

/*8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.*/
public class task8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] mass1= new int[10];
        int [] mass2= new int[10];
        double [] mass3 = new double[10];
        int nn=0;
        for (int i = 0 ; i<10 ; i++){
            mass1[i]=rnd.nextInt(10);
            mass2[i]=rnd.nextInt(10);
            if (mass2[i] != 0){ //чтобы не было инфинити
                // mass3[i]= (double) mass1[i] / mass2[i];
                if (mass3[i]%1==0){
                    nn++;}
            }
            else continue;
        }
        System.out.print("Первый массив: ");
        for (int i = 0 ; i<10 ; i++) {
            System.out.print(mass1[i]+", ");
        }
        System.out.print("\nВторой массив: ");
        for (int i = 0 ; i<10 ; i++) {
            System.out.print(mass2[i]+", ");
        }
        System.out.print("\nТретий массив: ");
        for (int i = 0 ; i<10 ; i++) {
            System.out.printf("%4.2f ",mass3[i]);
        }
        System.out.print("\nКоличество целочисленных значений 3го массива= " + nn);
    }
}
