/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg5.pkg1;

/**
 * Clase principal de la actividad.
 * Desde aqui se abre la ventana para calcular el IMC.
 *
 * @author usutarde
 */
public class Actividad51 {

    /**
     * Inicia el programa y muestra la ventana del IMC.
     *
     * @param args argumentos del programa (no se utilizan)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiVentana mv= new MiVentana();
        MiVentanaIMC mvimc= new MiVentanaIMC();
        mvimc.setVisible(true);
    }
    
}
