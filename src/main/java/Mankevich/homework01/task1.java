package Mankevich.homework01;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        int a,b;
        String symb,coc;
        Scanner input = new Scanner(System.in);
        System.out.println("ВВедите число: ");
        a = input.nextInt();
        symb = (a>0)?"положительное":"отрицательное";
        if(a==0) {
            symb = "нейтральное";
        }
        b = getCountsOfDigits(a);
        switch (b) {
            case 1:
                coc = "однозначное";
                break;
            case 2:
                coc = "двухзначное";
                break;
            case 3:
                coc = "трёхзначное";
                break;
            case 4:
                coc = "четырёхзначное";
                break;
            case 5:
                coc = "пятизначное";
                break;
            case 6:
                coc = "шестизначное";
                break;
            case 7:
                coc = "семизначное";
                break;
            case 8:
                coc = "восьмизначное";
                break;
            case 9:
                coc = "девятизначное";
                break;
            case 10:
                coc = "десятизначное";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + b);
        }
        System.out.println("Вы ввели "+coc+" "+symb+" число");
    }
    static public int getCountsOfDigits(int number) {
        int count;
        count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}
