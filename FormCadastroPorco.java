//Douglas Cunha 2209373
//ADS 2024

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadastroPorco extends javax.swing.JFrame {

    private Porco porco;

    private static BDAnimais bdAnimais = new BDAnimais();

    private static FormCadastroPorco cadastroPorcoUnico;

    private FormCadastroPorco() {
        initComponents();
    }
    // singleton

    public static FormCadastroPorco getCadastroPorco() {
        if (cadastroPorcoUnico == null) {
            cadastroPorcoUnico = new FormCadastroPorco();
        }
        return cadastroPorcoUnico;
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
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lblAlimentacao = new javax.swing.JLabel();
        ctAlimentacao = new javax.swing.JTextField();
        lblPesoAbate = new javax.swing.JLabel();
        ctPesoAbate = new javax.swing.JTextField();
        lblPrecoPorKg = new javax.swing.JLabel();
        ctPrecoPorkg = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimal = new javax.swing.JTable();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInformacoes = new javax.swing.JMenu();
        menuItemProprietario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lblAlimentacao.setText("Alimentacao (racao ou restos)");

        lblPesoAbate.setText("Peso do abate");

        ctPesoAbate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPesoAbateActionPerformed(evt);
            }
        });

        lblPrecoPorKg.setText("Preco por kg");

        ctPrecoPorkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPrecoPorkgActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar pelo Id");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        tblAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Peso", "Idade", "Alimentação", "Peso", "Preço por kg", "Lucro"
            }
        ));
        jScrollPane1.setViewportView(tblAnimal);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro para Porco");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPesoAbate, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctPesoAbate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPrecoPorKg, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(109, 109, 109))
                                        .addComponent(ctPrecoPorkg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPeso1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlimentacao)
                        .addGap(12, 12, 12)
                        .addComponent(ctAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPesoAbate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctPesoAbate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrecoPorKg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctPrecoPorkg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPesoActionPerformed

    private void ctIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctIdActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrarPorco();
        listarTabPorco();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
        listarTabPorco();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listarTabPorco();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void ctPrecoPorkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPrecoPorkgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPrecoPorkgActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void ctPesoAbateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPesoAbateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPesoAbateActionPerformed

    private void menuItemProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProprietarioActionPerformed
        FormCadastroProprietario.getCadastroProprietario().exibirInformacoesProprietario();
    }//GEN-LAST:event_menuItemProprietarioActionPerformed

    public void excluir() {
        try {
            int id = Integer.parseInt(ctId.getText().trim());

            // Consulta o animal no BDAnimais
            Animal animal = bdAnimais.consAnimalPorId(id);

            if (animal != null) {
                // Preenche os campos comuns
                ctId.setText(Integer.toString(animal.getId()));
                ctPeso.setText(Float.toString(animal.getPeso()));
                ctIdade.setText(Integer.toString(animal.getIdade()));

                if (animal instanceof Porco) {
                    Porco porco = (Porco) animal;
                    ctAlimentacao.setText(porco.getAlimentacao());
                    ctPesoAbate.setText(Float.toString(porco.getPesoAbate()));
                    ctPrecoPorkg.setText(Float.toString(porco.getPrecoPorKg()));
                }
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

    private boolean validarId(Porco porco) {
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
                ctId.setText("");
                JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira um número positivo.", "Erro de ID", JOptionPane.ERROR_MESSAGE);
                ctId.requestFocus();
                return false;
            }
            porco.setId(id);
            return true;
        }
    }

    private boolean validarDadosComuns(Porco porco) {
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
        porco.setPeso(peso);
        porco.setIdade(idade);
        return true;
    }

    // Valida o preço por kg do porco
    private boolean validarPrecoPorKg(Porco porco) {
        String precoPorKgStr = ctPrecoPorkg.getText().trim();
        if (precoPorKgStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor para o preço por kg.", "Erro de Preço por Kg", JOptionPane.ERROR_MESSAGE);
            ctPrecoPorkg.requestFocus();
            return false;
        }

        try {
            porco.setPrecoPorKg(Float.parseFloat(precoPorKgStr));
            return true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Preço por kg inválido. Por favor, insira um valor numérico válido.", "Erro de Preço por Kg", JOptionPane.ERROR_MESSAGE);
            ctPrecoPorkg.requestFocus();
            return false;
        }
    }

    public void cadastrarPorco() {
        Porco porco = new Porco();       
        if (!validarId(porco) || !validarDadosComuns(porco) || !validarPrecoPorKg(porco)) {
            return;
        }
        try {            
            porco.setAlimentacao(ctAlimentacao.getText().trim());
        } catch (AlimentacaoException ae) {
            ctPesoAbate.setText("");
            JOptionPane.showMessageDialog(null, ae.getMessage(), "Erro de Alimentação", JOptionPane.ERROR_MESSAGE);
            ctAlimentacao.requestFocus();
            return;
        }
        try {            
            porco.setPesoAbate(Float.parseFloat(ctPesoAbate.getText().trim()));
        } catch (PesoAbateException pae) {
            ctPesoAbate.setText("");
            JOptionPane.showMessageDialog(null, pae.getMessage(), "Erro de Peso de Abate", JOptionPane.ERROR_MESSAGE);
            ctPesoAbate.requestFocus();
            return;
        } catch (NumberFormatException nfe) {
            ctPesoAbate.setText("");
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido para o peso de abate.", "Erro de Peso", JOptionPane.ERROR_MESSAGE);
            ctPesoAbate.requestFocus();
            return;
        }
        // Salva o porco no BDAnimais
        Animal cadastrado = bdAnimais.cadAnimal(porco);
        if (cadastrado != null) {
            JOptionPane.showMessageDialog(null,
                    "Animal cadastrado com sucesso!",
                    "Cadastro OK",
                    JOptionPane.INFORMATION_MESSAGE);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Já existe um animal com esse ID.",
                    "Erro de Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            limpar();
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
                // Verifica o tipo de animal e preenche os campos específicos
                if (animal instanceof Porco) {
                    Porco porco = (Porco) animal;
                    ctAlimentacao.setText((porco.getAlimentacao()));
                    ctPesoAbate.setText(Float.toString(porco.getPesoAbate()));
                    ctPrecoPorkg.setText(Float.toString(porco.getPrecoPorKg()));

                    JOptionPane.showMessageDialog(null, "Confirme os dados do Animal", "Confirmação de Dados", JOptionPane.INFORMATION_MESSAGE);
                    limpar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não existe Animal com este ID", "ID inexistente", JOptionPane.ERROR_MESSAGE);
            }
            limpar();
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O ID deve ser um número inteiro!", "Erro de ID", JOptionPane.ERROR_MESSAGE);
            ctId.setText("");
            ctId.requestFocus();
        }
    }

    //Listar dados Comum
    public void listarDadosComuns(Animal animal) {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        modelo.addRow(new Object[]{
            animal.getId(),
            animal.getPeso(),
            animal.getIdade()
        });
    }

//Listar dados da Porco
    public void listarDadosPorco(Porco porco) {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        int lastRow = modelo.getRowCount() - 1;
        modelo.setValueAt(porco.getAlimentacao(), lastRow, 3);
        modelo.setValueAt(porco.getPesoAbate(), lastRow, 4);
        modelo.setValueAt(porco.getPrecoPorKg(), lastRow, 5);
        modelo.setValueAt(porco.calcularLucroAbate(), lastRow, 6); 
    }

// Tabela geral
    public void listarTabPorco() {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        modelo.setRowCount(0);
        for (Animal animal : bdAnimais.getBdAnimais()) {
            listarDadosComuns(animal);
            if (animal instanceof Porco) {
                listarDadosPorco((Porco) animal);
            }
        }
    }

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

                    if (animal instanceof Porco) {
                        Porco porco = (Porco) animal;
                        ctAlimentacao.setText(porco.getAlimentacao());
                        ctPesoAbate.setText(Float.toString(porco.getPesoAbate()));
                        ctPesoAbate.setText(Float.toString(porco.getPrecoPorKg()));
                    }

                    JOptionPane.showMessageDialog(null, "Animal atualizado com sucesso!", "Atualização", JOptionPane.INFORMATION_MESSAGE);
                    limpar();

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar o animal.", "Erro", JOptionPane.ERROR_MESSAGE);
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
        ctAlimentacao.setText("");
        ctPesoAbate.setText("");
        ctPrecoPorkg.setText("");
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
            java.util.logging.Logger.getLogger(FormCadastroPorco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroPorco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroPorco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroPorco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroPorco().setVisible(true);
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
    private javax.swing.JTextField ctAlimentacao;
    private javax.swing.JTextField ctId;
    private javax.swing.JTextField ctIdade;
    private javax.swing.JTextField ctPeso;
    private javax.swing.JTextField ctPesoAbate;
    private javax.swing.JTextField ctPrecoPorkg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlimentacao;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JLabel lblPesoAbate;
    private javax.swing.JLabel lblPrecoPorKg;
    private javax.swing.JMenu menuInformacoes;
    private javax.swing.JMenuItem menuItemProprietario;
    private javax.swing.JTable tblAnimal;
    // End of variables declaration//GEN-END:variables
}
