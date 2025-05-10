/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exámen;

/**
 *
 * @author sebas
 */
public class Ejercicio_Java_3 {


 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 int[] lista = {3,4,5,5,10,4};
 int sumaimpar = 0;
 int sumapar = 0;
 for (int i = 0; i < lista.length; i++) {
    int j = lista[i];
    if (j%2 == 0)
        {
        sumapar = sumapar + j;
        }
    else
        sumaimpar = sumaimpar + j;
    }
 System.out.println("Suma par: " + sumapar);
 System.out.println("Suma impar: " + sumaimpar);
 int resultado = sumapar - sumaimpar;
 System.out.println("Resultado pedido (Pares - Impares): " + resultado);
 }



}
