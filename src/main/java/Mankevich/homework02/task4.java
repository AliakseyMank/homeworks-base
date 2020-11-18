package Mankevich.homework02;
/*4)Составьте программу, вычисляющую A*B, не пользуясь операцией
умножения.*/
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ВВедите первое число: ");
        int a=input.nextInt();
        System.out.println("ВВедите второе число: ");
        int b=input.nextInt();
        int result=0;
        while(b>0){
            result+=a;
            b=b-1;
            System.out.println("result= "+result);
            System.out.println("b= "+b);
        }
        System.out.println("Результат умножения: " + result);
    }
}

