package menu.Sentencias;

import java.util.Scanner;

public class mayoMenor {

    public  static  void comNum(){
        Scanner read= new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("--------------Bienvenido-------------");
        System.out.println("Ingrese el primer numero a comparar: ");
        num1=read.nextDouble();
        System.out.println("Ingrese el segundo numero a comparar: ");
        num2=read.nextDouble();
        if (num1>num2){
             System.out.println("El número "+num1+" es mayor que "+num2);
        }else {
            System.out.println("El número "+num2+" es mayor que "+num1);
        }
    }
}
