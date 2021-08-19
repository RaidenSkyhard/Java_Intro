package ejercicios18;
/*EJERCICIOS 18: Construir un programa que calcule y muestre por pantalla
las raíces de la ecuación de segundo gradp de coeficientes reales
*/
import java.util.Scanner;
public class Ejercicios18 {
    public static void main(String[] args) {
        double a, b, c, res1, res2, expb, exp = 2, oper;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa calcula las raíces de la ecuación de "
                + "segundo grado de coeficientes reales de la forma ax2+bx+c=0.");
        System.out.println("Digite su a: ");
        a = in.nextDouble();
        System.out.println("Digite su b: ");
        b = in.nextDouble();
        System.out.println("Digite su c: ");
        c = in.nextDouble();
        
        expb = Math.pow(b,exp);
        oper = (expb - 4*a*c);
        
        /* En la raiz está el error - NO HAY RAÍCES NEGATIVAS - 
        Don pendejo olvidó eso de las raíces
        */
        double raiz = Math.sqrt(oper);
        
        res1 = ((-b+raiz)/(2*a));
        res2 = ((-b-raiz)/(2*a));
        
        System.out.println("La raíz positiva es : "+res1);
        System.out.println("La raíz negativa es : "+res2);
        
    }
    
}
