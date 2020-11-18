package Mankevich.homework02;

public class task8 {
    public static void main(String[] args) {

        int i;
        int j;
        int k;
        for ( i=0; i<4; i++ ) {
            for (k = i; k < 4; k++) {
                System.out.print(" ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(".");
            }
            System.out.println();
        }
        System.out.println();
        for ( i=0; i<4; i++ ){
            for (k =i; k >= 0; k--) {
                System.out.print(" ");}
            for (j =i; j < 4 ; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
