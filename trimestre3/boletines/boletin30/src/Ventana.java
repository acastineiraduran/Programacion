
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dam1
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApelido = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApelido = new javax.swing.JTextField();
        desplegableDam = new javax.swing.JComboBox<>();
        botonAgregarTaboa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        etiquetaNombre.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaNombre.setText("NOME");

        etiquetaApelido.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaApelido.setText("APELIDO");

        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        campoApelido.setBackground(new java.awt.Color(255, 255, 255));
        campoApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApelidoActionPerformed(evt);
            }
        });

        desplegableDam.setBackground(new java.awt.Color(255, 255, 255));
        desplegableDam.setForeground(new java.awt.Color(0, 0, 0));
        desplegableDam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAM 1", "DAM 2", "ASIR 1", "ASIR 2" }));
        desplegableDam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegableDamActionPerformed(evt);
            }
        });

        botonAgregarTaboa.setBackground(new java.awt.Color(204, 255, 255));
        botonAgregarTaboa.setForeground(new java.awt.Color(0, 0, 0));
        botonAgregarTaboa.setText("AGREGAR TABOA");
        botonAgregarTaboa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTaboaActionPerformed(evt);
            }
        });

        tablaRegistros.setBackground(new java.awt.Color(255, 255, 255));
        tablaRegistros.setForeground(new java.awt.Color(0, 0, 0));
        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nome", "Apelido", "Curso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRegistros.setToolTipText("");
        tablaRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaRegistros.setGridColor(new java.awt.Color(0, 0, 0));
        tablaRegistros.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tablaRegistros.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaRegistros.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tablaRegistrosComponentAdded(evt);
            }
        });
        tablaRegistros.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tablaRegistrosInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRegistros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaApelido)
                    .addComponent(etiquetaNombre))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(campoApelido))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregarTaboa)
                    .addComponent(desplegableDam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNombre)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(desplegableDam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(etiquetaApelido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregarTaboa)
                            .addComponent(campoApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApelidoActionPerformed

    private void desplegableDamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegableDamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desplegableDamActionPerformed
    /**
     * Añade registros a la tabal una vez se pulsa ese botón. Una vez añadidos se borra
     * los campos de los que cogio los registros
     * 
     * la clase <code>DefaultTableModel</code> se utiliza en java para editar tablas GUI
     * 
     * @param evt 
     */
    private void botonAgregarTaboaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarTaboaActionPerformed
        String nombre = campoNombre.getText();
        String apellido = campoApelido.getText();
        String curso = (String) desplegableDam.getSelectedItem();
        
        Object[] fila = {nombre, apellido, curso};

        DefaultTableModel modelo = (DefaultTableModel) tablaRegistros.getModel();
        modelo.addRow(fila);

        campoNombre.setText("");
        campoApelido.setText("");
        desplegableDam.setSelectedIndex(0);
    }//GEN-LAST:event_botonAgregarTaboaActionPerformed

    private void tablaRegistrosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tablaRegistrosComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaRegistrosComponentAdded

    private void tablaRegistrosInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tablaRegistrosInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_tablaRegistrosInputMethodTextChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarTaboa;
    private javax.swing.JTextField campoApelido;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> desplegableDam;
    private javax.swing.JLabel etiquetaApelido;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegistros;
    // End of variables declaration//GEN-END:variables
}
