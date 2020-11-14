package Mankevich.homework2;/*3)Вычислить: 1+2+4+8+…+256*/
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        int result=0;
        for(int i = 1;i <= 256;i *= 2){
            System.out.println("i на этом цикле = " + i);
            System.out.println("result на этом цикле = " + result);

            result+=i;
        }
        System.out.println("result на этом цикле = " + result);
    }
}
