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
        recursividad x = new recursividad();
        
        boolean res = x.wrapperPalindromo("ANNA");
        if(res)
        {
            System.out.println("Es una palabra palindromo");
        }
        else
        {
           System.out.println("No es una palabra palindromo"); 
        }
    }
    
}
