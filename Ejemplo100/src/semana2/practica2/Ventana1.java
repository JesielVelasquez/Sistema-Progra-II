/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2.practica2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Jesiel Velasquez
 */
public class Ventana1 {

    public Ventana1() {
        JFrame jf = new JFrame("Titulo del JFrame");
        jf.setLayout(new FlowLayout());
        Dimension d = new Dimension();
        jf.setSize(400, 250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setLocation((int) ((d.getWidth() / 2) + 290), 50);
    }

    public static void main(String[] args) {
        Ventana1 ventana1 = new Ventana1();
    }
}
