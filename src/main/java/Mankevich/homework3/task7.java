package Mankevich.homework3;

import java.util.Random;

/*7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив.*/
public class task7 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int k=0;
        int [] mass = new int[12];
        for (int i = 0; i<12 ; i++){
            mass[i]= rnd.nextInt(15);
            System.out.print(mass[i]+" ");
        }
        for (int i = 0 ; i<12 ; i++){
            if( mass[i]>mass[k]) k = i;
            else continue;
        }
        System.out.println("\n самое большое значение в массиве= "+mass[k]+"\n Индекс этого элемента = "+k);
    }
}
