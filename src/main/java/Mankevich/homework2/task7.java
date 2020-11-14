package Mankevich.homework2;

/*7)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99*/
public class task7 {
    public static void main(String[] args) {
        int rez=0;
        for(int i = 1;i<=100;i++){
            if (i%2==1){
                rez+=i;
                System.out.println("i= "+i);
                System.out.println("result= " + rez);
            }
        }
        System.out.println("finish result= " + rez);
    }
}
