package Mankevich.homework03;

import java.util.Random;
import java.util.Scanner;

/*9)Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее
сообщение*/
public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int a=0;
        do {
            System.out.println("ВВедите целое положительное число:");
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не целое число.Попробуйте снова.");
                sc.next();
            }
            a=sc.nextInt();
        }while (a<=0);
        System.out.println("Массив размерностью:" + a);
        int [] mass = new int[a];
        System.out.print("Элементы массива: ");
        for (int i = 0; i < a; i++){
            mass[i]= rnd.nextInt(16);
            System.out.print(mass[i]+" ");
        }
        int half1=0;
        int half2=0;
        for (int i=0; i<(a/2); i++){
            half1+=mass[i];
        }
        System.out.println("\nCумма первой половины= " + half1);
        if (a%2==0){
            for (int i=(a-1); i>=(a/2); i--) {
                half2 += mass[i];
            }
        }else
            for (int i=(a-1); i>(a/2); i--) {
                half2 += mass[i];
            }
        System.out.println("Cумма второй половины= " + half2);
        if(half1>half2){
            System.out.println("Первая половина больше");
        }else if (half1<half2){
            System.out.println("Вторая половина больше");
        }else
            System.out.println("Половины равны");
    }
}
