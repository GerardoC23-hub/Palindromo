/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendiendorecursividad;

/**
 *
 * @author gerardo cruz Hernández
 * Carrera: TSU en Desarrollo de Software
 * Grado 4 Grupo C
 */
public class recursividad {
    // Método recursivo: comparo las letras de los extremos y me acerco al centro
    private boolean esPalindromo(String palabra, int inicio, int finalL) {
        //caso base
        // Si las letras de los extremos son distintas, no es palíndromo
        if (palabra.charAt(inicio) != palabra.charAt(finalL)) {
            return false; 
        }
        // Si los índices se encuentran o se cruzan, ya no queda nada que comparar
        if (inicio >= finalL) {
            return true;
        }
        // Paso recursivo: las letras coinciden, sigo con la parte de adentro
        return esPalindromo(palabra, inicio + 1, finalL - 1);
    }
    
    // Wrapper: es el método público que prepara la palabra e inicia la recursión
    public boolean wrapperPalindromo(String palabra)
    { 
        boolean res;
        // Reviso que la palabra no sea null ni esté vacía
        if(palabra != null && !palabra.isEmpty())
        {
            // Paso a minúsculas y quito los espacios para comparar bien
            palabra = palabra.toLowerCase().replace(" ", "");
            // Llamo al recursivo con el primer y el último índice
            return  esPalindromo(palabra, 0, palabra.length()-1);
            
        }
        // Si era null o estaba vacía devuelvo false
        return false;
    }
}
