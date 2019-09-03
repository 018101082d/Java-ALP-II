package Formulario;

import javax.swing.JOptionPane;
import universidad.Docente;

public class frmDocente extends javax.swing.JFrame {
 
    public frmDocente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNroDNI = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblFacultad = new javax.swing.JLabel();
        lblHorasLaborales = new javax.swing.JLabel();
        lblAsignatura = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnAsistir = new javax.swing.JButton();
        btnEnseñar = new javax.swing.JButton();
        btnEvaluar = new javax.swing.JButton();
        btnAsesorar = new javax.swing.JButton();
        txtNroDNI = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtFacultad = new javax.swing.JTextField();
        txtHorasLaborales = new javax.swing.JTextField();
        txtAsignatura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNroDNI.setText("Nro DNI");

        lblTitulo.setText("Titulo");

        lblFacultad.setText("Facultad");

        lblHorasLaborales.setText("Horas Laborles");

        lblAsignatura.setText("Asignatura");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnAsistir.setText("Asistir()");
        btnAsistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistirActionPerformed(evt);
            }
        });

        btnEnseñar.setText("Enseñar()");
        btnEnseñar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnseñarActionPerformed(evt);
            }
        });

        btnEvaluar.setText("Evaluar()");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        btnAsesorar.setText("Asesorar()");
        btnAsesorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsesorarActionPerformed(evt);
            }
        });

        txtNroDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroDNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNroDNI)
                            .addComponent(lblTitulo)
                            .addComponent(lblFacultad)
                            .addComponent(lblHorasLaborales)
                            .addComponent(lblAsignatura))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAsignatura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtHorasLaborales, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFacultad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNroDNI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnRegistrar)
                        .addGap(35, 35, 35)
                        .addComponent(btnMostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnAsistir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnseñar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEvaluar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAsesorar)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNroDNI)
                    .addComponent(txtNroDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultad)
                    .addComponent(txtFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasLaborales)
                    .addComponent(txtHorasLaborales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsignatura)
                    .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnMostrar))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsistir)
                    .addComponent(btnEnseñar)
                    .addComponent(btnEvaluar)
                    .addComponent(btnAsesorar))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNroDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroDNIActionPerformed
        
        
        
    }//GEN-LAST:event_txtNroDNIActionPerformed

    //declarar un objeto docente
    
    static Docente docente = new Docente();
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        int nrodni = Integer.parseInt(txtNroDNI.getText().toString());
        int horaslaborales = Integer.parseInt(txtHorasLaborales.getText().toString());
        String titulo = txtTitulo.getText().toString();
        String facultad = txtFacultad.getText().toString();
        String asignatura= txtAsignatura.getText().toString();
            
        
        //enviar datos al objeto
        
        docente.setNroDni(nrodni);
        docente.setHorasLaborales(horaslaborales);
        docente.setTitulo(titulo);
        docente.setFacultad(facultad);
        docente.setAsignatura(asignatura);
        
        //mensaje de verificacion
        JOptionPane.showMessageDialog(rootPane, "Usted se registro correctamente");
        
       //limpiar caja de textos
       txtTitulo.setText("");
       txtFacultad.setText("");
       txtAsignatura.setText("");
       txtHorasLaborales.setText("");
       txtNroDNI.setText("");
       
       //enfocar en la caja de texto
       
       txtNroDNI.requestFocus();    
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
        //mostrar propiedades del objeto docente
        
        int nrodni = docente.getNroDni();
        String titulo = docente.getTitulo();
        String facultad = docente.getFacultad();
        int horaslaborales = docente.getHorasLaborales();
        String asignatura = docente.getAsignatura();
        
       JOptionPane.showMessageDialog(rootPane, " Nro de DNI: " + String.valueOf(nrodni) + " Titulo " + titulo + " Facultad " + facultad + 
               " horas laborales: " + String.valueOf(horaslaborales ) + " asignatura " + asignatura );
    
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnAsistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistirActionPerformed
       
        //llamar al metodo asistir del objeto docente
        
        JOptionPane.showMessageDialog(rootPane, docente.Asistir().toString());
        
        
    }//GEN-LAST:event_btnAsistirActionPerformed

    private void btnEnseñarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnseñarActionPerformed
        // llamar al metodo enseñar del objeto docente 
        JOptionPane.showMessageDialog(rootPane, docente.Enseñar().toString());
        
    }//GEN-LAST:event_btnEnseñarActionPerformed

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
       // llamar al metodo evaluar del objeto docente 
        JOptionPane.showMessageDialog(rootPane, docente.Evaluar().toString());
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void btnAsesorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsesorarActionPerformed
        // llamar al metodo asesorar del objeto docente 
        
         JOptionPane.showMessageDialog(rootPane, docente.Asesorar().toString());
    }//GEN-LAST:event_btnAsesorarActionPerformed
    

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
            java.util.logging.Logger.getLogger(frmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsesorar;
    private javax.swing.JButton btnAsistir;
    private javax.swing.JButton btnEnseñar;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblFacultad;
    private javax.swing.JLabel lblHorasLaborales;
    private javax.swing.JLabel lblNroDNI;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtFacultad;
    private javax.swing.JTextField txtHorasLaborales;
    private javax.swing.JTextField txtNroDNI;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
