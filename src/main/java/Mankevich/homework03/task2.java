package Mankevich.homework03;

/*2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
        порядке (99 97 95 93 … 7 5 3 1).*/
public class task2 {
    public static void main(String[] args) {
        int[]odd=new int[50]; //объявление и создание массива
        int k=0;
        for (int i=1 ; i < 100 ; i++){  //перебор чисел циклом
            if(i % 2 != 0 ) { // условие на нечётность
                odd[k]=i; // присвоение значения элементу массива при выполнении условия
                k++;
            }
        }
        for (int r=0; r<50; r++){
            System.out.print(odd[r] +"   ");// вывод в строку по порядку
        }
        System.out.println();
        for (int m=49; m>=0; m--) {
            System.out.print(odd[m] + "   ");// вывод в строку в обратной последовательности
        }
    }
}
