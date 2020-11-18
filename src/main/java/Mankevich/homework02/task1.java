package Mankevich.homework02;
/*1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?*/
import java.io.PrintStream;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        double result,l = 10;//сумма и путь на момент конца первого дня
        result=l;//
        for (int i=2;i<8;i++){
            l*=1.1;
            result+=l;
            System.out.println("день номер № "+i);
            System.out.printf("Пробежал на момент конца этого дня = %5.2f\n", result);

        }
        System.out.printf("Спортсмен пробежал за 7 дней = %5.2f", result);
        System.out.print("км");

    }

}
