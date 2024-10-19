//Douglas Cunha 2209373
//ADS 2024

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    FormCadastroProprietario cadastroProprietario = FormCadastroProprietario.getCadastroProprietario();

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuItemIniciar = new javax.swing.JMenuItem();
        menoSair = new javax.swing.JMenu();
        meniItemSair = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Sistemas de Cadastro de Animais ");

        menuCadastro.setText("Cadastro");

        menuItemIniciar.setText("Iniciar Cadastro");
        menuItemIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIniciarActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemIniciar);

        menuBar.add(menuCadastro);

        menoSair.setText("Sair");

        meniItemSair.setText("Sair");
        meniItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniItemSairActionPerformed(evt);
            }
        });
        menoSair.add(meniItemSair);

        menuBar.add(menoSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(440, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meniItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniItemSairActionPerformed
        sair();
    }//GEN-LAST:event_meniItemSairActionPerformed

    private void menuItemIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIniciarActionPerformed
        FormCadastroProprietario.getCadastroProprietario().setVisible(true);
    }//GEN-LAST:event_menuItemIniciarActionPerformed

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null,
                "Deseja realmente sair?",
                "Sair",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if (resp == 0) {
            this.dispose();
        }
    }
   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem meniItemSair;
    private javax.swing.JMenu menoSair;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemIniciar;
    // End of variables declaration//GEN-END:variables
}
