package Nivel2;

import javax.swing.*;

public class Prueba {
    public static void main (String[] args){
        String mensaje="";
        int num1=0;
        int num2=0;

        mensaje = "Ingrese el primer numero";
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        mensaje = "Ingrese el segundo numero";
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        JOptionPane.showMessageDialog(null,"Se va a generar un numero aleatorio entre "+num1+" y "+num2);
        JOptionPane.showMessageDialog(null, "El numero es: "+Funciones.generarAleatorio(num1,num2));
    }
}
