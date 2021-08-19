package ejercicios.pkg20;
//EJERCICIOS 20: Sentencia switch

/* ESTRUCTURA

switch(dato){
    case 1: Instruccion 1;
            break;

    case 2: Instruccion 2;
            break;
            .
            .
            .
    case n: Instruccion n;
            break;

    default: Caso contrario;
            break;
    
    }

ajasjajs lo que debió usar el YandereDev
*/

import javax.swing.JOptionPane;

public class Ejercicios20 {

    public static void main(String[] args) {
       int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite"
                + "una opción del 1 al 3"));
        switch(dato){
            case 1:
                JOptionPane.showMessageDialog(null,"Opción 1");
                break;

            case 2:
                JOptionPane.showMessageDialog(null,"Opción 2");
                break;
           
            case 3:
                JOptionPane.showMessageDialog(null,"Opción 3");
                break;
                
            default:
                JOptionPane.showInputDialog(null,"Opcion no válida");
                break;
                
        }
    }
    
}
