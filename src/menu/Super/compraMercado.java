package menu.Super;

import java.util.Scanner;

public class compraMercado {

    public  static void  totalFactura(){
        Scanner read=new Scanner(System.in);
        double total=0;
        int medioPago;
        String producto="";
        double precio;
        System.out.println("---------------Bienvenido-----------");
        System.out.println("Ingrese el nombre del producto: ");
        producto=read.nextLine().toLowerCase();
        System.out.println("Ingrese el valor del producto: ");
        precio=read.nextDouble();
        do {
            System.out.println("Ingrese el medio de pago\n1.Efectivo\n2.Tarjeta\n3.Debito");
            medioPago=read.nextInt();
            switch (medioPago){
                case 1:
                    total=precio-precio*0.15;
                    System.out.println("El precio total del producto "+producto+" es: "+total);
                    break;
                case 2:
                    total=precio+precio*0.10;
                    System.out.println("El precio total del producto "+producto+" es: "+total);
                    break;
                case 3:
                    total=precio;
                    System.out.println("El precio total del producto "+producto+" es: "+total);
                    break;
                default:
                    System.out.println("No ingreso un valor correcto, vuelva a ingresarlo");
                    break;
            }
        }while (medioPago<1 || medioPago>3);

    }


}
