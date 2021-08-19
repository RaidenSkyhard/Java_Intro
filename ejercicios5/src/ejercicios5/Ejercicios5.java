package ejercicios5;
//Ejercicio entrada de datos 29 de Julio de 2020

//Se importa la librería
import java.util.Scanner;
public class Ejercicios5 {
    public static void main(String[] args) {
        //Definimos la entrada
        Scanner entrada = new Scanner(System.in);
        
        //Con int
        int numero;
        System.out.print("Digite un número: ");
        numero = entrada.nextInt();
        System.out.println("El número es: "+numero);
        
        //Con float
        float a;
        System.out.print("Digite un flotante: ");
        a = entrada.nextFloat();
        System.out.println("El float es: "+a);
        
        //Con double
        double b;
        System.out.print("Digite un double: ");
        b = entrada.nextDouble();
        System.out.println("El double es: "+b);
        
        //Con cadenas
        
        //next
        String c;
        System.out.print("Digite una cadena: ");
        c = entrada.next();
        System.out.println("La cadena es: "+c);
        
        //nextLine
        String d;
        System.out.print("Digite una cadena: ");
        d = entrada.nextLine();
        System.out.println("La cadena es: "+d);
        
        //char
        char e;
        System.out.print("Digite un caracter: ");
        e = entrada.next().charAt(0);
        System.out.println("La letra es: "+e);
        
    }
    
}
