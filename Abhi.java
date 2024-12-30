import java.util.Scanner;

class Abhi {
    public static void main(String[] args) {
        int q = 1;
        for (int j = 1; j <= 4; j++) {

            for (int o = 5; o >= q;o--) {
                System.out.print(" ");
                

            }
            q++;
                for (int i = 1; i <= 4; i++) {
    
                    System.out.print("*");

            }
            System.out.println();
        }
    }
}