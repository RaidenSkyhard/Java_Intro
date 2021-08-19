package ejercicios7;
//EJERCICIOS 7 Operadores aritméticos

import java.util.Scanner;

public class Ejercicios7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a,b,suma,resta,mult,div,resto;
        
        System.out.println("Digite un numero: ");
        a = entrada.nextFloat();
        System.out.println("Digite otro: ");
        b = entrada.nextFloat();
        
        suma = a+b;
        resta = a-b;
        mult = a*b;
        div = a/b;
        resto = a%b;
        
        System.out.println("La suma de los números es: "+suma);
        System.out.println("La resta de los números es: "+resta);
        System.out.println("La multiplicación de los números es: "+mult);
        System.out.println("La división de los números es: "+div);
        System.out.println("El residuo es: "+resto);
    }
    
}
