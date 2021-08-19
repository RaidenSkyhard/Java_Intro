package ejercicios12;
/*EJERCICIOS 12 Programa que calcula e imprime el salario semanal
de un empleado a partir de sus horas semanales trabajadas y de su
salario por hora
*/

import java.util.Scanner;

public class Ejercicios12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float horas, salario, total;
        System.out.println("Ingrese su salario por hora: ");
        horas = in.nextFloat();
        System.out.print("\nIngrese sus horas trabajadas: ");
        salario = in.nextFloat();
        
        total = horas*salario;
        
        System.out.println("El salario que le corresponde es de: "+total);
    }
    
}
