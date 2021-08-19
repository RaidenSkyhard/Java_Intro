package ejercicios16;
/*EJERCICIOS 16 Hacer un programa que calcule el cuadrado de la suma
(a+b)cua2 = a2 +2ab +b2
*/

import java.util.Scanner;

public class Ejercicios16 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double a, b, c, a2, b2;
        System.out.println("Ingrese el primer número: ");
        a = in.nextDouble();
        a2 = Math.sqrt(a); 
        System.out.println("Ingrese el siguiente número: ");
        b = in.nextDouble();
        b2 = Math.sqrt(b);
        c = a2+(2*a*b)+b2;
        System.out.println("La suma de cuadrados es: "+c);
    }
    
}
