package Formulario;

import javax.swing.JOptionPane;

public class frmCalculadora extends javax.swing.JFrame {

    public frmCalculadora() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNro1 = new javax.swing.JLabel();
        lblNro2 = new javax.swing.JLabel();
        txtNro1 = new javax.swing.JTextField();
        txtNro2 = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnSeno = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnCoseno = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnTangente = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNro1.setText("Nro1");

        lblNro2.setText("Nro2");

        txtNro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNro1ActionPerformed(evt);
            }
        });

        txtNro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNro2ActionPerformed(evt);
            }
        });

        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnPotencia.setText("Potencia");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnRestar.setText("Restar");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnSeno.setText("Seno");
        btnSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenoActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnCoseno.setText("Coseno");
        btnCoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosenoActionPerformed(evt);
            }
        });

        btnDividir.setText("Dividir");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnTangente.setText("Tangente");
        btnTangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangenteActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRaiz.setText("Raiz");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        btnFactorial.setText("Factorial");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMultiplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFactorial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNro2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(lblNro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNro1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(txtNro2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPotencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTangente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNro1)
                    .addComponent(txtNro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNro2)
                    .addComponent(txtNro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumar)
                    .addComponent(btnRestar)
                    .addComponent(btnMultiplicar)
                    .addComponent(btnDividir)
                    .addComponent(btnFactorial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCoseno)
                    .addComponent(btnSeno)
                    .addComponent(btnPotencia)
                    .addComponent(btnTangente)
                    .addComponent(btnRaiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNro1ActionPerformed
      
    }//GEN-LAST:event_txtNro1ActionPerformed

    private void txtNro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNro2ActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        //registrar los numeros para la suma
        
        Operaciones operaciones = new Operaciones();
        double nro1, nro2, suma;
        
       nro1 = Double.parseDouble(txtNro1.getText().toString());
       nro2 = Double.parseDouble(txtNro2.getText().toString()); 
       operaciones.setNro1(nro1);
       operaciones.setNro2(nro2);
       suma = operaciones.Sumar();
       JOptionPane.showConfirmDialog(rootPane,"La suma es: "+ suma);
    
        
        
        
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
       
        //restar con sobrecarga de parametros al llamar al constructor
        Operaciones operaciones = new Operaciones();
       double nro1, nro2, restar;
       nro1 = Double.parseDouble(txtNro1.getText().toString());
       nro2 = Double.parseDouble(txtNro2.getText().toString()); 
       operaciones.setNro1(nro1);
       operaciones.setNro2(nro2);
       restar = operaciones.Restar();
       JOptionPane.showMessageDialog(rootPane, "la es resta es: " + restar);
        
        
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        
       double nro1, nro2, multiplicar;
       nro1 = Double.parseDouble(txtNro1.getText().toString());
       nro2 = Double.parseDouble(txtNro2.getText().toString()); 
       Operaciones operaciones = new Operaciones();
       operaciones.setNro1(nro1);
       operaciones.setNro2(nro2);
       multiplicar = operaciones.Multiplicar();
       JOptionPane.showMessageDialog(rootPane, "la multiplicacion es: " + multiplicar);
             
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        double nro1, nro2;
      
       nro1 = Double.parseDouble(txtNro1.getText());
       nro2 = Double.parseDouble(txtNro2.getText()); 
       Operaciones operaciones = new Operaciones();
       operaciones.setNro1(nro1);
       operaciones.setNro2(nro2);
       String dividir = operaciones.Dividir();
       JOptionPane.showMessageDialog(rootPane, "la division es: " + dividir);
       
        
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
       double nro1, nro2, fac;
       nro1 = Double.parseDouble(txtNro1.getText().toString());
       nro2 = Double.parseDouble(txtNro2.getText().toString()); 
       Operaciones operaciones = new Operaciones();
       operaciones.setNro1(nro1);
       operaciones.setNro2(nro2);
       fac= operaciones.Factorial();
       JOptionPane.showMessageDialog(rootPane, "el factorial es: " + fac);
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
       double nro1, nro2, pot;
       nro1 = Double.parseDouble(txtNro1.getText().toString());
       nro2 = Double.parseDouble(txtNro2.getText().toString()); 
       Operaciones operaciones = new Operaciones();
       operaciones.setNro1(nro1);
       operaciones.setNro2(nro2);
       pot = operaciones.Potencia();
       JOptionPane.showMessageDialog(rootPane, "la mptencia es: " + pot);
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenoActionPerformed
       double nro1, nro2, sen;
       nro1 = Double.parseDouble(txtNro1.getText().toString());
       nro2 = Double.parseDouble(txtNro2.getText().toString()); 
       Operaciones operaciones = new Operaciones();
       operaciones.setNro1(nro1);
       operaciones.setNro2(nro2);
       sen= operaciones.Seno();
       JOptionPane.showMessageDialog(rootPane, "la multiplicacion es: " + sen);
    }//GEN-LAST:event_btnSenoActionPerformed

    private void btnCosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosenoActionPerformed
       double nro1, nro2, cos;
       nro1 = Double.parseDouble(txtNro1.getText().toString());
       nro2 = Double.parseDouble(txtNro2.getText().toString()); 
       Operaciones operaciones = new Operaciones();
       operaciones.setNro1(nro1);
       operaciones.setNro2(nro2);
       cos= operaciones.Coseno();
       JOptionPane.showMessageDialog(rootPane, "el coseno es : " + cos);
    }//GEN-LAST:event_btnCosenoActionPerformed

    private void btnTangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangenteActionPerformed
        double nro1, nro2,tan;
       nro1 = Double.parseDouble(txtNro1.getText().toString());
       nro2 = Double.parseDouble(txtNro2.getText().toString()); 
       Operaciones operaciones = new Operaciones();
       operaciones.setNro1(nro1);
       operaciones.setNro2(nro2);
       tan = operaciones.Tangente();
       JOptionPane.showMessageDialog(rootPane, "la tangente es: " + tan);
    }//GEN-LAST:event_btnTangenteActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
       double nro1, nro2,rai;
       nro1 = Double.parseDouble(txtNro1.getText().toString());
       nro2 = Double.parseDouble(txtNro2.getText().toString()); 
       Operaciones operaciones = new Operaciones();
       operaciones.setNro1(nro1);
       operaciones.setNro2(nro2);
       rai= operaciones.Tangente();
       JOptionPane.showMessageDialog(rootPane, "la raiz es: " + rai);
       
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNro1.setText("");
        txtNro2.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
    
    
  
    
       
    
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
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoseno;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeno;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTangente;
    private javax.swing.JLabel lblNro1;
    private javax.swing.JLabel lblNro2;
    private javax.swing.JTextField txtNro1;
    private javax.swing.JTextField txtNro2;
    // End of variables declaration//GEN-END:variables
}
