package Mankevich.homework03;

import java.util.Random;

/*5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).*/
public class task5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int summmass1=0;
        int summmass2=0;
        int [] mass1 = new int[5];
        int [] mass2 = new int[5];
        for (int i = 0; i<5 ; i++){
            mass1[i]=rnd.nextInt(15);
            System.out.print(mass1[i]+" ");
            summmass1 += mass1[i];
        }
        System.out.println();
        for (int i = 0; i<5 ; i++){
            mass2[i]=rnd.nextInt(15);
            System.out.print(mass2[i]+" ");
            summmass2 += mass2[i];
        }
        System.out.println("\nСумма значений из первого массива= "+summmass1+
                "\nСумма значений из второго массива= "+summmass2);
        if ((summmass1/5)<(summmass2/5)){
            System.out.println("Среднее арифметическое первого массива меньше второго!");
        }
        else if ((summmass1/5)>(summmass2/5)){
            System.out.println("Среднее арифметическое первого массива больше второго!");
        }
        else
            System.out.println("Средние арифметические равны!");
    }
}