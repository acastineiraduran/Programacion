/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dam1
 */
public class EventoClaseInterna {

    JFrame marco;
    JPanel panel;
    JLabel etiqueta;
    JTextField lTexto;
    JTextArea aTexto;
    JButton bCopiar, bSair;

    public void iniciarComponentes() {

        // DEFINIMOS COMPONENTES
        marco = new JFrame(" COMPONENTES ");
        panel = new JPanel();
        etiqueta = new JLabel(" linea de texto ");
        lTexto = new JTextField();
        aTexto = new JTextArea();
        bCopiar = new JButton(" COPIAR "); // texto o imagen o ambas en param
        bSair = new JButton(); // lo ponemos despues 

        // DAMOSLLE CARACTERISTICAS
        marco.setBounds(0, 0, 800, 800); // primeros ceros para posicion
        panel.setBounds(5, 5, 750, 750);
        panel.setBackground(Color.red);
        etiqueta.setBounds(50, 100, 100, 50);
        lTexto.setBounds(200, 100, 200, 50);
        aTexto.setBounds(100, 300, 150, 200);
        bSair.setBounds(500, 600, 150, 100);
        bCopiar.setBounds(100, 600, 150, 100);
        bSair.setText(" SAIR "); // ponemos el texto aqui, para comprobar que tambien es posible
        bSair.setToolTipText("saimos do programa"); // cd ponemos cursor encima nos muestra eso

        //XESTION DE EVENTOS NUNHA CLASE INTERNA
        bCopiar.addActionListener(new Interna());
        bSair.addActionListener(new Interna());
        
        // ENGADIMOS COMPONENTES O PANEL
        panel.setLayout(null); // para que no me ponga distribucion horizontal x defec
        panel.add(etiqueta);
        panel.add(lTexto);
        panel.add(aTexto);
        panel.add(bCopiar);
        panel.add(bSair);

        // ENGADIMOS PANEL O MARCO
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

    class Interna implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object boton = e.getSource();
            if (boton == bCopiar) {
                aTexto.setText(lTexto.getText());
            } else if (boton == bSair) {
                lTexto.setText("");
                aTexto.setText("");
                //System.exit(0);
            }
        }

    }

}
