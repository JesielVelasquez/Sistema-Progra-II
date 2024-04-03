/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2.arraylist;

import java.util.ArrayList;

/**
 *
 * @author Jesiel Velasquez
 */
public class ArrayList_1 {

    public static void main(String[] args) {
        ArrayList<String> arregloCadena = new ArrayList<String>();
        //AÑADIR 10 ELEMENTOS EN EL ArrayList
        for (int i = 1; i <= 10; i++) {
            arregloCadena.add("Elemento" + i);
        }
        //MOSTRAR EL ArrayList
        for (String x : arregloCadena) {
            System.out.println(x);
        }
    }

}
