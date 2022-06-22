package menu.colegio;

import java.util.Scanner;

public class notasAlumno {

    public  static  void notaAlumno(){
            Scanner read= new Scanner(System.in);
            String nombreAlum="";
            double nota1;
            double nota2;
            double nota3;
            double promedio;

            System.out.println("---------Bienvenido-------------");
            System.out.println("Ingrese el nombre del alumno: ");
            nombreAlum=read.nextLine().toUpperCase();
            System.out.println("Ingrese la primer nota del alumno: ");
            nota1=read.nextInt();
            System.out.println("Ingrese la segunda nota del alumno: ");
            nota2=read.nextInt();
            System.out.println("Ingrese la tercer nota del alumno: ");
            nota3=read.nextInt();
            while ((nota1<0 || nota1>10)||(nota2<0 || nota2>10)||(nota3<0 || nota3>10)){
                System.out.println("Ingrese nuevamente números entre 1 y 10");
                System.out.println("Ingrese la primer nota del alumno: ");
                nota1=read.nextInt();
                System.out.println("Ingrese la segunda nota del alumno: ");
                nota2=read.nextInt();
                System.out.println("Ingrese la tercer nota del alumno: ");
                nota3=read.nextInt();
            }
            promedio=(nota1+nota2+nota3)/3;
            if (promedio>8 && promedio<11){
                System.out.println("El alumno "+nombreAlum+" esta promocionado con un promedio de: "+promedio);
            }else  if (promedio>5 && promedio<9){
                System.out.println("El alumno "+nombreAlum+" esta aprobado con un promedio de: "+promedio);
            }else {
                System.out.println("El alumno "+nombreAlum+" esta desaprobado con un promedio de: "+promedio);
            }

    }


}

