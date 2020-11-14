package Mankevich.homework1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        int a;
        String ff;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите (целое, положительное) число программистов");
        a=input.nextInt();
        if(a==1){
            ff=" программист";
        }else if (a<5 & a>0) ff = " программиста";
        else {
            ff=" программистов";
        }
        System.out.println(a+ff);
    }
}
