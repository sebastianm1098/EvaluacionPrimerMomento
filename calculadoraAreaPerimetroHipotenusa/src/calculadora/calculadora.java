package calculadora;

import java.util.Scanner;

public class calculadora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("""
                Bienvenido a la calculadora\n
                Que desea calcular?\n
                1.Calcular area\n
                2.Calcular el primetro\n
                3.Calcular la hipotenusa\n
                4.Salir d ela calculadora""");
         int opc = sc.nextInt();
         switch (opc){
             case 1:
                    area();
                    break;
             case 2:
                    perimetro();
                    break;
             case 3:
                    hipotenusa();
                    break;
             case 4:
                 System.out.println("Gracias por utilizar la calculadora, Hasta luego");
                 break;
             case 5:
                 System.out.println("Opcion invalida porfavor ingrese una opcion valida");
                 menu();
                 break;
         }
    }

    public static void area(){
        System.out.println("""
                Bienvenido a calcular el area\n
                Proporciona los siguientes datos""");
        System.out.println("Ingrese la base ");
        int base = sc.nextInt();
        System.out.println("Ingrese la altura");
        int altura = sc.nextInt();

        double area = (base*altura)/2;

        System.out.println("El area del triangulo rectangulo segun los datos proporcionados es: "+area);
        menu();
    }
    public static void perimetro(){
        System.out.println("""
                Bienvenido a calcular del perimetro\n
                Proporciona los siguientes datos""");
        System.out.println("Longitud del lado 1");
        int lado1 = sc.nextInt();
        System.out.println("Longitud del lado 2");
        int lado2 = sc.nextInt();
        System.out.println("Longitud del lado 3");
        int lado3 = sc.nextInt();

        double perimetro= lado1+ lado2+ lado3;

        System.out.println("El perimetro dle treangulo rectagulo segun los datos propocionados debe ser:"+perimetro);
        menu();
    }

    public static void hipotenusa(){
        System.out.println("""
                Bienvenido a calcular de la hipotenusa\n
                Proporciona los siguientes datos""");
        System.out.println("Ingrese la longitud del lado 1");
        int lado1 = sc.nextInt();
        System.out.println("Ingrese la longitud del Lado 2");
        int lado2 = sc.nextInt();

        double hipotenusa = Math.hypot(lado1, lado2);
        System.out.println("La longitud de la hipotenusa segun los datos proporcionados es: "+hipotenusa);
        menu();
    }
}
