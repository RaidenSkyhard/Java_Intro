package ejercicios11;
//Ejercicios 11 Operadores ejercicios: Hacer un programa que calcule e imprima la summa de tres calificaciones
import java.util.Scanner;
public class Ejercicios11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa calcula e imprime la suma de 3 calificaciones");
        float a,b,c,suma;
        System.out.println("Ingrese la primer calificacion: ");
        a = in.nextFloat();
        System.out.print("\nIngrese la segunda calificacion: ");
        b = in.nextFloat();
        System.out.print("\nIngrese la tercer calificacion: ");
        c = in.nextFloat();
        
        suma = a+b+c;
        
        System.out.println("La suma de las calificaciones es: "+suma);
    }
    
}
