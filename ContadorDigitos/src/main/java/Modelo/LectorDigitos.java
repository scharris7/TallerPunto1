/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class LectorDigitos {
    private int numero;

    public LectorDigitos(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Metodo para contar los digitos
    public int contarDigitos() {
        int n = Math.abs(numero);
        if (n == 0) return 1;

        int contador = 0;
        while (n > 0) {
            n = n / 10;
            contador++;
        }
        return contador;
    }
}