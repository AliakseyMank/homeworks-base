package Mankevich.homework2;/*2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

public class task2 {
    public static void main(String[] args) {
        int n = 1;
        int t=0;
        while (t<24){
            System.out.println("Прошло времени = " + t);
            System.out.println("Количество амёб на данный момент = " + n);
            n=n*2;
            t+=3;
        }
        System.out.println("За = " + t);
        System.out.println("Суммарное количество амёб = " + n);
    }
}
