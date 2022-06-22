package triangulo;

import java.util.Scanner;

public class TriangulosVarios {
    
    public static void triangulos(){
        Scanner read=new Scanner(System.in);
        int alto;
        System.out.println("----------------Bienvenido------------");
        System.out.println("Ingrese el alto del triangulo: ");
        alto=read.nextInt();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------");
        for (int i = 0; i < alto; i++) {
            for (int j = alto-1-i; j >= 0; j--) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------");
        for (int i = 0; i < alto; i++) {
            for (int j = alto-1-i; j >=0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
