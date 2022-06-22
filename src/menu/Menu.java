package menu;

import java.util.Scanner;

import static menu.Sentencias.mayoMenor.comNum;
import static menu.Super.compraMercado.totalFactura;
import static menu.colegio.notasAlumno.notaAlumno;
import static menu.numeros.Conteo.conteoNumeros;
import static menu.repetirfrase.Frase.repetirFrase;
import static menu.triangulo.TriangulosVarios.triangulos;

public class Menu {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int opcion;
        boolean salida=true;
        System.out.println("------------Bienvenido---------------");
        while (salida) {
            System.out.println("Ingrese el número de la operacion que desea realizar: ");
            System.out.println("1.Programa número mayor o menor\n2.Programa colegio\n3.Programa supermercado\n4.Programa repetir frase" +
                    "\n5.Programa conteo de números\n6.Programa de triangulos\n7.Salir");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    comNum();
                    break;
                case 2:
                    notaAlumno();
                    break;
                case 3:
                    totalFactura();
                    break;
                case 4:
                    repetirFrase();
                    break;
                case 5:
                    conteoNumeros();

                case 6:
                    triangulos();
                    break;
                case 7:
                    System.out.println("Adios!");
                    salida=false;
                    break;

                default:
                    System.out.println("Ingresó una opción incorrecta");
            }
        }


    }
}
