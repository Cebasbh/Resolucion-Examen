/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exámen;

/**
 *
 * @author sebas
 */
public class Ejercicio_Java_4 {

    public static void main(String[] args) {
        String[] lista = {"a", "b", "d", "f", "a"};
        
        String[] letras = new String[lista.length];
        int[] cantidades = new int[lista.length];
        int totalUnicas = 0;

        for (int i = 0; i < lista.length; i++) {
            String letra = lista[i];
            boolean encontrada = false;

            for (int j = 0; j < totalUnicas; j++) {
                if (letras[j].equals(letra)) {
                    cantidades[j]++;
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                letras[totalUnicas] = letra;
                cantidades[totalUnicas] = 1;
                totalUnicas++;
            }
        }

        for (int i = 0; i < totalUnicas; i++) {
            System.out.println(letras[i] + ": " + cantidades[i]);
        }
    }
}
