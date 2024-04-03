/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2.practica2;

import java.awt.Container;
import javax.swing.JDialog;

/**
 *
 * @author Jesiel Velasquez
 */
public class VentanaDialogo extends JDialog {

    private Container contenedor;

    //CONSTRUCTOR DE CLASE VACIO
    public VentanaDialogo() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        //ASIGNAMOS UN TITULO A LA BARRA DE TITULO
        setTitle("Programacion 2");

        //TAMAÑO DE LA VENTANA
        setSize(300, 200);

        //PONER LA PANTALLA EN EL CENTRO DE LA PANTALLA
        setLocationRelativeTo(null);
    }

}
