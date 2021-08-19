package ejercicios22;
//EJERCICIOS 22: Pedir dos números y decir cual es el mayor o si son iguales

import javax.swing.JOptionPane;
public class Ejercicios22 {

    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero:"));
        
        if (a!=b){
            if (a>b){
                JOptionPane.showMessageDialog(null,"El número mayor es el "+a);
            }
            else{
                JOptionPane.showMessageDialog(null,"El número mayor es el "+b);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Los números son iguales");   
        }
    }
    
}
