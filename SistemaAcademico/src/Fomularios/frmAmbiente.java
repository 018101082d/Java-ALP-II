/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fomularios;

import Academico.Alumno;
import Academico.Ambiente;
import static Fomularios.frmAlumno.alumno;
import javax.swing.JOptionPane;

/**
 *
 * @author JHP
 */
public class frmAmbiente extends javax.swing.JFrame {

    /**
     * Creates new form frmambiente
     */
    public frmAmbiente() {
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

        lblNroAula = new javax.swing.JLabel();
        lblAforo = new javax.swing.JLabel();
        lblTipoAula = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        txtNroAula = new javax.swing.JTextField();
        txtAforo = new javax.swing.JTextField();
        txtTipoAula = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnComodidad = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNroAula.setText("Nro de Aula");

        lblAforo.setText("Aforo");

        lblTipoAula.setText("Tipo de Aula");

        lblUbicacion.setText("Ubicacion");

        btnIngresar.setText("Ingresar()");
        btnIngresar.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnComodidad.setText("Comodidad()");
        btnComodidad.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnComodidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComodidadActionPerformed(evt);
            }
        });

        btnReservar.setText("Reservar()");
        btnReservar.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNroAula)
                                    .addComponent(lblAforo)
                                    .addComponent(lblUbicacion)
                                    .addComponent(lblTipoAula))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAforo, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(txtTipoAula, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUbicacion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNroAula)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnComodidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReservar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnRegistrar)
                        .addGap(36, 36, 36)
                        .addComponent(btnMostrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNroAula)
                    .addComponent(txtNroAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAforo)
                    .addComponent(txtAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoAula)
                    .addComponent(txtTipoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUbicacion)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(btnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnComodidad)
                    .addComponent(btnReservar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        JOptionPane.showMessageDialog(rootPane,ambiente.Ingresar().toString());
    }//GEN-LAST:event_btnIngresarActionPerformed
    static Ambiente ambiente = new Ambiente();
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int aula = Integer.parseInt(txtNroAula.getText().toString());
        int aforo = Integer.parseInt(txtAforo.getText().toString());
        String tipo = txtTipoAula.getText().toString();
        String ubicacion = txtUbicacion.getText().toString();
       
        //enviar
        ambiente.setNroaula(aula);
        ambiente.setAforo(aforo);
        ambiente.setTipoaula(tipo);
        ambiente.setUbicacion(ubicacion);
        

        //mensaje de verificaicon correcta
        JOptionPane.showMessageDialog(rootPane, "se registro correctamente");

        //limpiar la caja de texto
        txtNroAula.setText("");
        txtAforo.setText("");
        txtTipoAula.setText("");
        txtUbicacion.setText("");        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnComodidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComodidadActionPerformed
        JOptionPane.showMessageDialog(rootPane,ambiente.Comodidad().toString());
    }//GEN-LAST:event_btnComodidadActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        JOptionPane.showMessageDialog(rootPane,ambiente.Resevar().toString());
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int aula = ambiente.getNroaula();
        int aforo = ambiente.getAforo();
        String tipo = ambiente.getTipoaula();
        String ubicacion = ambiente.getUbicacion();
                
        JOptionPane.showMessageDialog(rootPane, "Número de Aula: "+aula+" Aforo: "+ aforo+" Tipo de AUla: "+tipo+" Ubicación: "+ 
                ubicacion);
        
    }//GEN-LAST:event_btnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAmbiente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComodidad;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JLabel lblAforo;
    private javax.swing.JLabel lblNroAula;
    private javax.swing.JLabel lblTipoAula;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JTextField txtAforo;
    private javax.swing.JTextField txtNroAula;
    private javax.swing.JTextField txtTipoAula;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
