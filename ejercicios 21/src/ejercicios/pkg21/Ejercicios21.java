package ejercicios.pkg21;
/*EJERCICIOS 21: Condicionales - determinar si un número es
múltiplo de 10
*/

import javax.swing.JOptionPane;
public class Ejercicios21 {

    public static void main(String[] args) {
        int a;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite el dato:"));
        
        if(a%10 == 0){
            JOptionPane.showMessageDialog(null,"Sí es múltiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null,"No es múltiplo de 10");
        }
    }
    
}
