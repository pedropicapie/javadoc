/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioarreglo63960;

/**
 *
 * @author Adrian
 */
public class LaboratorioArreglo63960 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int[] arreglo;
            int tamañoArreglo = 5;
            arreglo = new int[tamañoArreglo];
            System.out.println("Los " + arreglo.length +" elementos del arreglo: ");
            System.out.println(arreglo[0]);
            System.out.println(arreglo[1]);
            System.out.println(arreglo[2]);
            System.out.println(arreglo[3]);
            System.out.println(arreglo[4]);
            
            int[] calificaciones = { 10, 8, 6, 9, 9, 7};
            System.out.println("Los " + calificaciones.length +" elementos de calificaciones: ");
            System.out.println("Elemento 1: " + calificaciones[0]);
            System.out.println("Elemento 2: " + calificaciones[1]);
            System.out.println("Elemento 3: " + calificaciones[2]);
            System.out.println("Elemento 4: " + calificaciones[3]);
            System.out.println("Elemento 5: " + calificaciones[4]);
            System.out.println("Elemento 6: " + calificaciones[5]);
            
            int[][] matriz = new int[2][2];
            matriz[0][0] = 11;
            matriz[0][1] = 12;
            matriz[1][0] = 21;
            matriz[1][1] = 22;
            System.out.println("Una matriz de 2 x 2:");
            System.out.println("[" + matriz[0][0] + " " + matriz[0][1] + "]");
            System.out.println("[" + matriz[1][0] + "" + matriz[1][1] + "]");
            
            int[][] noMatriz = { {1, 2, 3} , {4, 5} , {6, 7, 8, 9} };
            System.out.println("Una no-­‐matriz inicializada automáticamente: ");
            System.out.println("[" + noMatriz[0][0] + " " + noMatriz[0][1] +" " + noMatriz[0][2] + "]");
            System.out.println("[" + noMatriz[1][0] + " "+ noMatriz[1][1] +"]");
            System.out.println("[" + noMatriz[2][0] + " " + noMatriz[2][1] +" " + noMatriz[2][2] + " " + noMatriz[2][3] + "]");
    }
    
}
