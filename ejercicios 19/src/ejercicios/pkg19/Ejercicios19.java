package ejercicios.pkg19;
//EJERCICIOS 19: Sentencia if else

/* ESTRUCTURA
if(condición){
    instruccion1;
}
else{
    instruccion2;
}
ajjasjas como el YandereDev
*/

import javax.swing.JOptionPane;
public class Ejercicios19 {
    public static void main(String[] args) {
        int a, dato = 5;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 5: "));
        /* SE PUEDEN USAR OPERADORES
        != Distinto de
        > mayor que
        < menor que
        == igual que
        <= menor o igual que
        >= mayor o igual que
        */
        if (a == dato){
            JOptionPane.showMessageDialog(null,"El número es 5");
        }
        else{
            JOptionPane.showMessageDialog(null,"El número no es 5");
        }
    }
    
}
