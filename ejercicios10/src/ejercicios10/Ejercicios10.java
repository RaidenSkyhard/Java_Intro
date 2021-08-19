package ejercicios10;
//EJERCICIOS 10 Clase Math

//Buscar en Google Métodos de la clase Math
public class Ejercicios10 {

    public static void main(String[] args) {
        //forma original raiz cuadrada
        double raiz = Math.sqrt(36.64);
        System.out.println(raiz);
        
        //convirtiendo a int
        int a = (int)Math.sqrt(9);
        System.out.println(a);
        
        //exponente - elevar a una potencia
        double base = 5, exponente = 3;
        double resultado = Math.pow(base,exponente);
        System.out.println(resultado);
        
        //redondear un numero round
        
        //1. con double
        double b = 4.33;
        long result2 = Math.round(b);
        
        System.out.println(result2);
        
        //2. con float
        float c = 4.33f;
        int result3 = Math.round(c);
        
        System.out.println(result3);
        
        
        //Numero random
        
        double random = Math.random();
        
        System.out.println(random);
        
    }
    
}
