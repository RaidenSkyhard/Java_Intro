package ejercicios13;
/*EJERCICIOS 13 Guillermo tiene N dólares, Luis tiene la mitad de
dinero de Guillermo, Juan tiene la mitad de la suma de Luis y
Guillermo.
Hacer un programa que calcule e imprima la cantidad de dinero
que tienen entre los 3.
*/

import java.util.Scanner;

public class Ejercicios13 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float guille, luis, juan, suma;
        System.out.println("Dolares de Guillermo: ");
        guille = in.nextFloat();
        luis = guille/2;
        System.out.println("Luis tiene: "+luis);
        juan = (guille+luis)/2;
        System.out.println("Juan tiene: "+juan);
        suma = guille+luis+juan;
        System.out.println("La suma de los 3 es de: "+suma);
    }
    
}
