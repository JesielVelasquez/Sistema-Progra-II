package semana3.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;

/**
 *
 * @author Jesiel Velasquez
 */
public class Componentes_Ventana {

    public Componentes_Ventana() {
        JFrame jf = new JFrame("JFrame I");
        jf.setLayout(new FlowLayout());
        JButton jb1 = new JButton("Boton 1");
        jf.add(jb1);

        JLabel miLabel = new JLabel();
        miLabel.setText("Esto es un Label");
        jf.add(miLabel);

        JButton miBoton = new JButton();
        miBoton.setText("Boton");
        jf.add(miBoton);

        JCheckBox miCheckBox = new JCheckBox();
        miCheckBox.setText("Check");
        jf.add(miCheckBox);

        JRadioButton miRadioButton = new JRadioButton();
        miRadioButton.setText("Radio");
        jf.add(miRadioButton);

        JToggleButton miToggleButton = new JToggleButton();
        miToggleButton.setText("Activar");
        jf.add(miToggleButton);

        JComboBox<String> miCombo = new JComboBox<>();
        miCombo.addItem("Opciones");
        miCombo.addItem("Soltero");
        miCombo.addItem("Viudo");
        miCombo.addItem("Acompanyado");
        miCombo.addItem("Separado");
        jf.add(miCombo);

        JSeparator separadorHorizontal = new JSeparator();
        jf.add(separadorHorizontal);

        JSlider miDeslizador = new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
        jf.add(miDeslizador);

        JSpinner miSpinner = new JSpinner();
        jf.add(miSpinner);

        JProgressBar miBarra = new JProgressBar();
        jf.add(miBarra);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 250);
        jf.setVisible(true);
    }

    public Componentes_Ventana(JRadioButton miRadioButton) {
        JFrame jf = new JFrame("JFrame II");
        jf.setLayout(new FlowLayout());
        jf.add(miRadioButton);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 250);
        jf.setVisible(true);
    }

    public Componentes_Ventana(JButton button) {
        JFrame jf = new JFrame("JFrame III");
        jf.setLayout(new FlowLayout());
        jf.add(button);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 250);
        jf.setVisible(true);
    }

    public Componentes_Ventana(JButton button, JComboBox<String> combo) {
        JFrame jf = new JFrame("JFrame IV");
        jf.setLayout(new FlowLayout());
        jf.add(button);
        jf.add(combo);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 250);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        JRadioButton miRadioButton = new JRadioButton("Soltero");
        JButton boton = new JButton("Guardar");
        JButton boton1 = new JButton("Modificar");
        JComboBox<String> combo = new JComboBox<>();
        combo.addItem("Opciones");
        combo.addItem("Masculino");
        combo.addItem("Femenino");

        new Componentes_Ventana();
        new Componentes_Ventana(miRadioButton);
        new Componentes_Ventana(boton);
        new Componentes_Ventana(boton1, combo);
    }
}
