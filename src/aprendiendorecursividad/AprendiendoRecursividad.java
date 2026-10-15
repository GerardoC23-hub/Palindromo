/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aprendiendorecursividad;

/**
 * @author gerardo cruz Hernández
 * Carrera: TSU en Desarrollo de Software
 * Grado 4 Grupo C
 */
public class AprendiendoRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Palabras palíndromas
        System.out.println("reconocer " + (x.wrapperPalindromo("reconocer") ? "SÍ es una palabra palíndroma" : "NO es una palabra palíndroma"));
        System.out.println("radar " + (x.wrapperPalindromo("radar") ? "SÍ es una palabra palíndroma" : "NO es una palabra palíndroma"));
 
        // Palabras que no son palíndromas
        System.out.println("computadora " + (x.wrapperPalindromo("computadora") ? "SÍ es una palabra palíndroma" : "NO es una palabra palíndroma"));
        System.out.println("casa " + (x.wrapperPalindromo("casa") ? "SÍ es una palabra palíndroma" : "NO es una palabra palíndroma"));
 
        // Casos borde: cadena vacía y un solo carácter
        System.out.println("cadena vacía " + (x.wrapperPalindromo("") ? "SÍ es una palabra palíndroma" : "NO es una palabra palíndroma"));
        System.out.println("(a) un carácter)" + (x.wrapperPalindromo("a") ? "SÍ es una palabra palíndroma" : "NO es una palabra palíndroma"));
    }
    
}
