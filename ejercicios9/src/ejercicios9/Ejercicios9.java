package ejercicios9;
//EJERCICIOS 9 Operador de incremento y decremento

import java.util.Scanner;

public class Ejercicios9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int x = 5, y;
        
        y = ++x;
        
        //Se pueden poner de forma ++x para aumentar y despues asignar
        
        //x++ --> x = x+1; x-- es decremento
        
        System.out.println(y);
    }
    
}
