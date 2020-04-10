/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is2trabajopatrones.GUI;

import is2trabajopatrones.GUI.InicioSesionAdministrador_GUI;

/**
 *
 * @author Equipo
 */
public class PantallaInicio_GUI extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicio_GUI
     */
    public PantallaInicio_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        BotonDeInicioDeSesion = new javax.swing.JButton();
        BotonDeRegistrarCuenta = new javax.swing.JButton();
        BotonDeFranquiciado = new javax.swing.JButton();
        BotonDeInicioSesionAdministrador = new javax.swing.JButton();
        NotaInicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione que desea hacer:");

        BotonDeInicioDeSesion.setText("Iniciar Sesion");
        BotonDeInicioDeSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeInicioDeSesionActionPerformed(evt);
            }
        });

        BotonDeRegistrarCuenta.setText("Registrarse");
        BotonDeRegistrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeRegistrarCuentaActionPerformed(evt);
            }
        });

        BotonDeFranquiciado.setText("Crear Franquicia");
        BotonDeFranquiciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeFranquiciadoActionPerformed(evt);
            }
        });

        BotonDeInicioSesionAdministrador.setText("Iniciar Como Administrador");
        BotonDeInicioSesionAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeInicioSesionAdministradorActionPerformed(evt);
            }
        });

        NotaInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NotaInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NotaInicial.setText("BIENVENIDO A LA MULTINACIONAL NOMBRE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(NotaInicial)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonDeRegistrarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonDeInicioDeSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonDeFranquiciado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonDeInicioSesionAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(NotaInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(BotonDeInicioDeSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonDeRegistrarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonDeFranquiciado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonDeInicioSesionAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDeInicioDeSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeInicioDeSesionActionPerformed
        InicioSesion_GUI inicioSesion = new InicioSesion_GUI();
        inicioSesion.setVisible(true);
        inicioSesion.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_BotonDeInicioDeSesionActionPerformed

    private void BotonDeRegistrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeRegistrarCuentaActionPerformed
        RegistroCuenta_GUI registroCuenta = new RegistroCuenta_GUI();
        registroCuenta.setVisible(true);
        registroCuenta.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_BotonDeRegistrarCuentaActionPerformed

    private void BotonDeFranquiciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeFranquiciadoActionPerformed
        CreaFranquicia_GUI creaFranquicia = new CreaFranquicia_GUI();
        creaFranquicia.setVisible(true);
        creaFranquicia.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_BotonDeFranquiciadoActionPerformed

    private void BotonDeInicioSesionAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeInicioSesionAdministradorActionPerformed
        InicioSesionAdministrador_GUI inicioSesionAdministrador = new InicioSesionAdministrador_GUI();
        inicioSesionAdministrador.setVisible(true);
        inicioSesionAdministrador.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_BotonDeInicioSesionAdministradorActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaInicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDeFranquiciado;
    private javax.swing.JButton BotonDeInicioDeSesion;
    private javax.swing.JButton BotonDeInicioSesionAdministrador;
    private javax.swing.JButton BotonDeRegistrarCuenta;
    private javax.swing.JLabel NotaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
