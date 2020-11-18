package Mankevich.homework03;

import java.util.Random;

/*4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
        массив на экран в строку. Замените каждый элемент с нечётным индексом на
        ноль. Снова выведете массив на экран на отдельной строке.*/
public class task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] mass = new int [20];
        for (int i = 0; i < 20 ; i++){
            mass[i] = rnd.nextInt(20);
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 20 ; i++){
            if (i % 2 != 0){
                mass[i]=0;
            }
            System.out.print(mass[i]+" ");

        }

    }
}
