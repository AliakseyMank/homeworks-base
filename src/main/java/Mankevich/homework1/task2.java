package Mankevich.homework1;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("ВВедите длину первой стороны треугольника");
        a = input.nextDouble();
        System.out.println("ВВедите длину второй стороны треугольника");
        b = input.nextDouble();
        System.out.println("ВВедите длину второй стороны треугольника");
        c = input.nextDouble();
        if(a+b>c & b+c>a & a+c>b){
            System.out.println("Треугольник со сторонами: " + a +", "+ b +", "+ c + " - возможен" );
        }else {
            System.out.println("Треугольник со сторонами: " + a +", "+ b +", "+ c + " - не возможен" );
        }
    }
}
