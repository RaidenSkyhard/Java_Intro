package ejercicios17;
/*EJERCICIOS 17: Hacer un programa que, dado un número total de horas
devuelve el número de semanas, días y horas equivalentes.
Por ejemplo, dado un total de 1000 horas, debe mostar 5 semanas,
6 días y 16 horas.
*/
import java.util.Scanner;

public class Ejercicios17 {

    public static void main(String[] args) {
        float a, sem, dia, hora;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Calculadora de horas");
        System.out.print("Digite las horas a calcular: ");
        a = in.nextFloat();
        sem = (a/168);
        dia = (a%168/24);
        hora = (a%24);
        System.out.println("Las semanas son: "+sem);
        System.out.println("Los días son: "+dia);
        System.out.println("Las horas son: "+hora);
    }
    
}
