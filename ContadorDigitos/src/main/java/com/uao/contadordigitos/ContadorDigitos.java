/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.contadordigitos;

import Modelo.LectorDigitos;
import javax.swing.JOptionPane;

public class ContadorDigitos {
    public static void main(String[] args) {
        // Pedir número al usuario con JOptionPane
        String input = JOptionPane.showInputDialog("Ingrese un número: ");
        int num = Integer.parseInt(input);
        LectorDigitos lector = new LectorDigitos(num);
        JOptionPane.showMessageDialog(null,
                "El número " + lector.getNumero() + " tiene " + lector.contarDigitos() + " dígitos.");
    }
}