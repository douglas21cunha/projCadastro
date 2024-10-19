//Douglas Cunha 2209373
//ADS 2024

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadastroVaca extends javax.swing.JFrame {

    private Animal animal;
    private static BDAnimais bdAnimais = new BDAnimais();

    private static FormCadastroVaca cadastroVacaUnico;

    private FormCadastroVaca() {
        initComponents();

    }

    // Singleton
    public static FormCadastroVaca getCadastroVaca() {
        if (cadastroVacaUnico == null) {
            cadastroVacaUnico = new FormCadastroVaca();
        }
        return cadastroVacaUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        ctPeso = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        ctId = new javax.swing.JTextField();
        lblPeso1 = new javax.swing.JLabel();
        ctIdade = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lblLeite = new javax.swing.JLabel();
        ctLeite = new javax.swing.JTextField();
        lblPartos = new javax.swing.JLabel();
        ctPartos = new javax.swing.JTextField();
        lblProdCarne = new javax.swing.JLabel();
        ctProdCarne = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimal = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInformacoes = new javax.swing.JMenu();
        menuItemProprietario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Animal");

        lblId.setText("Id");

        ctPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPesoActionPerformed(evt);
            }
        });

        lblPeso.setText("Idade");

        ctId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctIdActionPerformed(evt);
            }
        });

        lblPeso1.setText("Peso");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lblLeite.setText("Qunatidade de Leite / L");

        lblPartos.setText("Qtd. Partos");

        lblProdCarne.setText("Prod. Carne");

        btConsultar.setText("Consultar pelo Id");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        tblAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Peso", "Idade", "Qtd. leite", "Qtd. Partos", "Prod. Carne"
            }
        ));
        jScrollPane1.setViewportView(tblAnimal);

        btAlterar.setText("Alrterar pelo Id");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir pelo Id");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro Para Vaca");

        menuInformacoes.setText("Informações");

        menuItemProprietario.setText("Proprietário");
        menuItemProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProprietarioActionPerformed(evt);
            }
        });
        menuInformacoes.add(menuItemProprietario);

        jMenuBar1.add(menuInformacoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPeso1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblProdCarne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(lblPartos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(153, 153, 153))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblLeite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(ctProdCarne, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ctPeso, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ctId, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ctIdade)
                        .addComponent(ctLeite, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ctPartos, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(233, 233, 233))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPeso1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ctPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLeite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctLeite, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPartos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctPartos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblProdCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctProdCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(346, 346, 346))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPesoActionPerformed

    private void ctIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctIdActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrarVaca();
        listarTabvaca();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
        listarTabvaca();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listarTabvaca();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void menuItemProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProprietarioActionPerformed
        FormCadastroProprietario.getCadastroProprietario().exibirInformacoesProprietario();
    }//GEN-LAST:event_menuItemProprietarioActionPerformed

    public void excluir() {
        try {
            int id = Integer.parseInt(ctId.getText());
            Animal animal = bdAnimais.consAnimalPorId(id);

            if (animal != null) {

                ctId.setText(Integer.toString(animal.getId()));
                ctPeso.setText(Float.toString(animal.getPeso()));
                ctIdade.setText(Integer.toString(animal.getIdade()));

                if (animal instanceof Vaca) {
                    Vaca vaca = (Vaca) animal;
                    ctLeite.setText(Integer.toString(vaca.getLeite()));
                    ctPartos.setText(Integer.toString(vaca.getPartos()));
                    ctProdCarne.setText(Float.toString(vaca.getProdCarne()));
                }

                // Confirmação de exclusão
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Confirmação de exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    bdAnimais.removeAnimal(id);
                    JOptionPane.showMessageDialog(null, "Animal excluído com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                    limpar();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Não existe Animal com este ID", "ID inexistente", JOptionPane.ERROR_MESSAGE);
                limpar();
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O ID deve ser um número inteiro!", "Erro de ID", JOptionPane.ERROR_MESSAGE);
            ctId.setText("");
            ctId.requestFocus();
        }
    }

    private boolean validarId(Vaca vaca) {
        while (true) {
            String idText = ctId.getText().trim();
            if (idText.isEmpty() || !idText.matches("\\d+")) {
                ctId.setText("");
                JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira apenas números.", "Erro de ID", JOptionPane.ERROR_MESSAGE);
                ctId.requestFocus();
                return false;
            }
            int id = Integer.parseInt(idText);
            if (id <= 0) {
                ctId.setText("");  // Limpa a caixa de texto
                JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira um número positivo.", "Erro de ID", JOptionPane.ERROR_MESSAGE);
                ctId.requestFocus();
                return false;
            }
            vaca.setId(id);
            return true;
        }
    }

    // Validação de Peso
    private boolean validarDadosComuns(Vaca vaca) {
        String pesoText = ctPeso.getText().trim();
        if (pesoText.isEmpty() || !pesoText.matches("\\d+(\\.\\d+)?")) {
            ctPeso.setText("");
            JOptionPane.showMessageDialog(null, "Peso inválido. Por favor, insira apenas números.", "Erro de Peso", JOptionPane.ERROR_MESSAGE);
            ctPeso.requestFocus();
            return false;
        }
        float peso = Float.parseFloat(pesoText);

        String idadeText = ctIdade.getText().trim();
        if (idadeText.isEmpty() || !idadeText.matches("\\d+")) {
            ctIdade.setText("");
            JOptionPane.showMessageDialog(null, "Idade inválida. Por favor, insira apenas números.", "Erro de Idade", JOptionPane.ERROR_MESSAGE);
            ctIdade.requestFocus();
            return false;
        }
        int idade = Integer.parseInt(idadeText);
        vaca.setPeso(peso);
        vaca.setIdade(idade);
        return true;
    }

    private boolean validarLeite(Vaca vaca) {
        String leiteText = ctLeite.getText().trim();
        if (leiteText.isEmpty() || !leiteText.matches("\\d+")) {  //
            JOptionPane.showMessageDialog(null, "Quantidade de leite inválida. Por favor, insira um valor numérico.", "Erro de Quantidade de Leite", JOptionPane.ERROR_MESSAGE);
            ctLeite.requestFocus();
            return false;
        }
        int quantidadeLeite = Integer.parseInt(leiteText);
        vaca.setLeite(quantidadeLeite);
        return true;
    }

    private boolean validarPartos(Vaca vaca) {
        String partosText = ctPartos.getText().trim();
        if (partosText.isEmpty() || !partosText.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Número de partos inválido. Por favor, insira um valor numérico.", "Erro de Número de Partos", JOptionPane.ERROR_MESSAGE);
            ctPartos.requestFocus();
            return false;
        }
        vaca.setPartos(Integer.parseInt(partosText));
        return true;
    }

    private boolean validarProdCarne(Vaca vaca) {
        String prodCarneText = ctProdCarne.getText().trim();
        if (prodCarneText.isEmpty() || !prodCarneText.matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "Produção de carne inválida. Por favor, insira um valor numérico.", "Erro de Produção de Carne", JOptionPane.ERROR_MESSAGE);
            ctProdCarne.requestFocus();
            return false;
        }
        vaca.setProdCarne(Float.parseFloat(prodCarneText));
        return true;
    }

    public void cadastrarDadosComuns(Animal animal) {
        try {
            animal.setId(Integer.parseInt(ctId.getText()));
            animal.setPeso(Float.parseFloat(ctPeso.getText()));
            animal.setIdade(Integer.parseInt(ctIdade.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null,
                    "Por favor, insira valores válidos!",
                    "Erro de Formato",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cadastrarVaca() {
        Vaca vaca = new Vaca();

        if (!validarId(vaca) || !validarDadosComuns(vaca) || !validarLeite(vaca)
                || !validarPartos(vaca) || !validarProdCarne(vaca)) {
            return;
        }

        // Salva a vaca no BDAnimais
        Animal cadastrado = bdAnimais.cadAnimal(vaca);
        if (cadastrado != null) {
            JOptionPane.showMessageDialog(null,
                    "Animal cadastrado com sucesso!",
                    "Cadastro OK",
                    JOptionPane.INFORMATION_MESSAGE);
            limpar(); // Limpa os campos após o cadastro bem-sucedido
        } else {
            JOptionPane.showMessageDialog(null,
                    "Já existe um animal com esse ID.",
                    "Erro de Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }

    public void listarDadosComuns(Animal animal) {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        modelo.addRow(new Object[]{
            animal.getId(),
            animal.getPeso(),
            animal.getIdade()
        });
    }

    //Listar dados da Vaca
    public void listarDadosVaca(Vaca vaca) {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        int lastRow = modelo.getRowCount() - 1;

        modelo.setValueAt(vaca.getLeite(), lastRow, 3);
        modelo.setValueAt(vaca.getPartos(), lastRow, 4);
        modelo.setValueAt(vaca.getProdCarne(), lastRow, 5);
    }

    // Tabela geral
    public void listarTabvaca() {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        modelo.setRowCount(0);
        for (Animal animal : bdAnimais.getBdAnimais()) {
            listarDadosComuns(animal);
            if (animal instanceof Vaca) {
                listarDadosVaca((Vaca) animal);
            }
        }
    }

    // Botoes 
    public void alterar() {
        try {
            int id = Integer.parseInt(ctId.getText());

            Animal animal = bdAnimais.consAnimalPorId(id);

            if (animal != null) {

                String novoIdStr = JOptionPane.showInputDialog("Informe o novo ID (ou deixe em branco para manter o atual):");
                int novoId = id;

                if (novoIdStr != null && !novoIdStr.trim().isEmpty()) {
                    novoId = Integer.parseInt(novoIdStr.trim());
                }
                animal.setId(novoId);
                // Atualize os outros atributos do animal aqui
                animal = bdAnimais.atualizaAnimalPorId(animal);

                if (animal != null) {
                    // Atualiza os campos da interface com os novos dados
                    ctId.setText(Integer.toString(animal.getId()));
                    ctPeso.setText(Float.toString(animal.getPeso()));
                    ctIdade.setText(Integer.toString(animal.getIdade()));

                    if (animal instanceof Vaca) {
                        Vaca vaca = (Vaca) animal;
                        ctLeite.setText(Integer.toString(vaca.getLeite()));
                        ctPartos.setText(Integer.toString(vaca.getPartos()));
                        ctProdCarne.setText(Float.toString(vaca.getProdCarne()));
                    }

                    JOptionPane.showMessageDialog(null, "Animal atualizado com sucesso!", "Atualização", JOptionPane.INFORMATION_MESSAGE);
                    limpar(); // Limpa os campos após a atualização

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar o animal.", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Não existe Animal com este ID", "ID inexistente", JOptionPane.ERROR_MESSAGE);
                limpar();
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "O ID deve ser um número inteiro!", "Erro de ID", JOptionPane.ERROR_MESSAGE);
            ctId.setText("");
            ctId.requestFocus();
        }
    }

    public void consultar() {
        try {
            int id = Integer.parseInt(ctId.getText());

            Animal animal = bdAnimais.consAnimalPorId(id);

            if (animal != null) {

                ctId.setText(Integer.toString(animal.getId()));
                ctPeso.setText(Float.toString(animal.getPeso()));
                ctIdade.setText(Integer.toString(animal.getIdade()));

                if (animal instanceof Vaca) {
                    Vaca vaca = (Vaca) animal;
                    ctLeite.setText(Integer.toString(vaca.getLeite()));
                    ctPartos.setText(Integer.toString(vaca.getPartos()));
                    ctProdCarne.setText(Float.toString(vaca.getProdCarne()));
                    JOptionPane.showMessageDialog(null, "Confirme os dados do Animal", "Confirmação de Dados", JOptionPane.INFORMATION_MESSAGE);
                    limpar();
                } // outros animais

            } else {
                JOptionPane.showMessageDialog(null, "Não existe Animal com este ID", "ID inexistente", JOptionPane.ERROR_MESSAGE);

            }
            limpar();
        } // fim try
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O ID deve ser um número inteiro!", "Erro de ID", JOptionPane.ERROR_MESSAGE);
            ctId.setText("");
            ctId.requestFocus();
        }
    }

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

    public void limpar() {
        ctId.setText("");
        ctPeso.setText("");
        ctIdade.setText("");
        ctLeite.setText("");
        ctPartos.setText("");
        ctProdCarne.setText("");
        ctId.requestFocus();
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
            java.util.logging.Logger.getLogger(FormCadastroVaca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroVaca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroVaca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroVaca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroVaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctId;
    private javax.swing.JTextField ctIdade;
    private javax.swing.JTextField ctLeite;
    private javax.swing.JTextField ctPartos;
    private javax.swing.JTextField ctPeso;
    private javax.swing.JTextField ctProdCarne;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLeite;
    private javax.swing.JLabel lblPartos;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JLabel lblProdCarne;
    private javax.swing.JMenu menuInformacoes;
    private javax.swing.JMenuItem menuItemProprietario;
    private javax.swing.JTable tblAnimal;
    // End of variables declaration//GEN-END:variables
}
