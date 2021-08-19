package ejercicios15;
/*EJERCICIOS 15 La calificacion final de un estudiante se
calcula con base en 4 aspectos, participación, primer parcial, 
segundo parcial, examen final y entran por 10%, 25%, 25%, 40%$.
Calcular e imprimir la calificación final.
*/

import java.util.Scanner;

public class Ejercicios15 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float part, parc1, parc2, fin, calificacion;
        System.out.println("Ingrese su calificación de participaciones: ");
        part = in.nextFloat();
        System.out.println("Ingrese su calificación del primer parcial: ");
        parc1 = in.nextFloat();
        System.out.println("Ingrese su calificación del segundo parcial: ");
        parc2 = in.nextFloat();
        System.out.println("Ingrese su calificación de su examen final: ");
        fin = in.nextFloat();
        
        part *= .1f;
        parc1 *= .25f;
        parc2 *= .25f;
        fin *= .4f;
        
        calificacion = part+parc1+parc2+fin;
        System.out.println("La calificación es: "+calificacion);
        
    }
    
}
