//Douglas Cunha 2209373
//ADS 2024

import javax.swing.JOptionPane;

public class FormCadastroProprietario extends javax.swing.JFrame {

    private static FormCadastroProprietario cadastroProprietarioUnico;
    private Proprietario proprietario;

    public FormCadastroProprietario() {
        initComponents();
    }

    //Singleton
    public static FormCadastroProprietario getCadastroProprietario() {
        if (cadastroProprietarioUnico == null) {
            cadastroProprietarioUnico = new FormCadastroProprietario();
        }
        return cadastroProprietarioUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblCodFazendeiro = new javax.swing.JLabel();
        ctCep = new javax.swing.JTextField();
        ctCodFazendeiro = new javax.swing.JTextField();
        ctNome = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO DO PROPRIETÁRIO");
        jLabel1.setToolTipText("CENTER");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome");

        lblCep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCep.setText("Cep");

        lblCodFazendeiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodFazendeiro.setText("Cod. Fazendeiro");

        ctCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCepActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><center>Provérbios 14:23 (NVI):<br>\"Todo trabalho árduo traz proveito,<br>mas o só falar leva à pobreza.\"</center></html>\n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                    .addComponent(ctCodFazendeiro)
                    .addComponent(ctCep)
                    .addComponent(ctNome)
                    .addComponent(lblCodFazendeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCep, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodFazendeiro))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctCodFazendeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCepActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        salvarProprietario();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        cancelarCadastro();
    }//GEN-LAST:event_btCancelarActionPerformed

    public void exibirInformacoesProprietario() {
        String nome = ctNome.getText().trim();
        String cep = ctCep.getText().trim();
        String codFazendeiro = ctCodFazendeiro.getText().trim();
        JOptionPane.showMessageDialog(null,
                "Nome: " + nome + "\n"
                + "CEP: " + cep + "\n"
                + "Código do Fazendeiro: " + codFazendeiro,
                "Informações do Proprietário",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void salvarProprietario() {
        try {
            String nome = ctNome.getText();
            String cep = ctCep.getText();
            int codFazendeiro = Integer.parseInt(ctCodFazendeiro.getText());
            this.proprietario = new Proprietario(cep, nome, codFazendeiro);
            JOptionPane.showMessageDialog(this, "Proprietário cadastrado com sucesso!");

            String[] options = {"Vaca", "Cavalo", "Porco"};
            int escolha = JOptionPane.showOptionDialog(this,
                    "Escolha o tipo de animal para cadastrar:",
                    "Cadastro de Animal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);
            switch (escolha) {
                case 0:
                    FormCadastroVaca.getCadastroVaca().setVisible(true);
                    break;
                case 1:
                    FormCadastroCavalo.getCadastroCavalo().setVisible(true);
                    break;
                case 2:
                    FormCadastroPorco.getCadastroPorco().setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Nenhuma opção selecionada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }

            this.setVisible(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código do Fazendeiro inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void solicitarInformacoesProprietario() {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do Proprietário:");
        String cep = JOptionPane.showInputDialog(null, "Informe o CEP do Proprietário:");
        String codFazendeiro = JOptionPane.showInputDialog(null, "Informe o Código do Fazendeiro:");

        if (nome != null && cep != null && codFazendeiro != null) {
            proprietario = new Proprietario(cep, nome, Integer.parseInt(codFazendeiro));
            JOptionPane.showMessageDialog(null, "Proprietário cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancelarCadastro() {
        int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar o cadastro e sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            this.setVisible(false);  // Fecha o formulário sem salvar
        }
    }

    public Proprietario getProprietario() {
        if (proprietario == null) {
            solicitarInformacoesProprietario();
        }
        return proprietario;
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
            java.util.logging.Logger.getLogger(FormCadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroProprietario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField ctCep;
    private javax.swing.JTextField ctCodFazendeiro;
    private javax.swing.JTextField ctNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCodFazendeiro;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
