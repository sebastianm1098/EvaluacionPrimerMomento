package notas;

import java.util.Scanner;

public class notas {

    static Scanner sc = new Scanner(System.in);
    public static void main(String []args){
        double [] notas = new double[4];

        for (int i = 0; i < notas.length; i++){
            System.out.println("Ingrese la nota " + (i+1) + " De la materia");
            notas[i] = sc.nextDouble();

        }

        double suma=0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / notas.length;
        System.out.println("Notas del estudiante:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + " es: " + notas[i]);
        }
        System.out.println("Promedio de las notas: " + promedio);
    }
}
