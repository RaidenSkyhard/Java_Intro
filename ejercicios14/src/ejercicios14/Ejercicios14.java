package ejercicios14;
/*EJERCICIOS 14 Una compañia de venta de carros paga a sus empleados
$1000 mensuales, más una comisión de $150 por cada carro vendido
más el 5% del valor de cada carro.
Hace un programa que calcule e imprima el salario mensual de cada
empleado dado
*/

import java.util.Scanner;

public class Ejercicios14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base = 1000, comis, comi150 , comicarro, vend, salario;
        System.out.println("¿Cuantos autos vendió el empleado? ");
        comis = in.nextFloat();
        comi150 = comis;
        comi150 *= 150;
        System.out.println("¿Cuanto vale cada carro? ");
        comicarro = in.nextFloat();
        comicarro *=.05;
        vend = comicarro*comis;
        salario = base+comi150+vend;
        System.out.println("El salario del empleado es: "+salario);
        
    }
    
}
