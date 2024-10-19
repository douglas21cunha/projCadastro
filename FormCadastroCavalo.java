//Douglas Cunha 2209373
//ADS 2024

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadastroCavalo extends javax.swing.JFrame {

    private Cavalo cavalo;
    private static BDAnimais bdAnimais = new BDAnimais();

    private static FormCadastroCavalo cadastroCavaloUnico;

    private FormCadastroCavalo() {
        initComponents();
    }

    // Singleton
    public static FormCadastroCavalo getCadastroCavalo() {
        if (cadastroCavaloUnico == null) {
            cadastroCavaloUnico = new FormCadastroCavalo();
        }
        return cadastroCavaloUnico;
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
        lblCorPelagem = new javax.swing.JLabel();
        ctCorPelagem = new javax.swing.JTextField();
        lblTipoAndamento = new javax.swing.JLabel();
        ctTipoAndamento = new javax.swing.JTextField();
        lblLinhagem = new javax.swing.JLabel();
        ctLinhagem = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimal = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lblCadastroDeCavalo = new javax.swing.JLabel();
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

        lblCorPelagem.setText("Cor da pelagem");

        lblTipoAndamento.setText("Tipo de andamento");

        lblLinhagem.setText("Linhagem(puro sangue ou lusitano)");

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
                "ID", "PESO", "IDADE", "COR PELAGEM", "TIPO ANDAMENTO", "LINHAGEM"
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

        lblCadastroDeCavalo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCadastroDeCavalo.setText("Cadastro de Cavalo");

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
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(lblCadastroDeCavalo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ctCorPelagem, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ctTipoAndamento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ctLinhagem, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblLinhagem, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblTipoAndamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCorPelagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ctId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ctPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(33, 33, 33)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblCadastroDeCavalo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPeso1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblCorPelagem))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctCorPelagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTipoAndamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctTipoAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblLinhagem)
                        .addGap(13, 13, 13)
                        .addComponent(ctLinhagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(127, 127, 127))
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
        cadastrarCavalo();
        listarTabCavalo();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
        listarTabCavalo();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listarTabCavalo();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void menuItemProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProprietarioActionPerformed
        FormCadastroProprietario.getCadastroProprietario().exibirInformacoesProprietario();
    }//GEN-LAST:event_menuItemProprietarioActionPerformed

    public void excluir() {
        try {
            int id = Integer.parseInt(ctId.getText());

            // Consulta o animal no BDAnimais
            Animal animal = bdAnimais.consAnimalPorId(id);

            if (animal != null) {
                // Preenche os campos comuns
                ctId.setText(Integer.toString(animal.getId()));
                ctPeso.setText(Float.toString(animal.getPeso()));
                ctIdade.setText(Integer.toString(animal.getIdade()));

                // Verifica o tipo de animal e preenche os campos específicos
                if (animal instanceof Cavalo) {
                    Cavalo cavalo = (Cavalo) animal;
                    ctCorPelagem.setText(cavalo.getCorPelagem());
                    ctTipoAndamento.setText(cavalo.getTipoAndamento());
                    ctLinhagem.setText(cavalo.getLinhagem());
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

    private boolean validarId(Cavalo cavalo) {
        while (true) {
            String idText = ctId.getText().trim();
            if (idText.isEmpty() || !idText.matches("\\d+")) {
                ctId.setText("");
                JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira apenas números.", "Erro de ID", JOptionPane.ERROR_MESSAGE);
                ctId.requestFocus();
                return false;  // Retorna falso para indicar que a validação falhou
            }
            int id = Integer.parseInt(idText);
            if (id <= 0) {
                ctId.setText("");
                JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira um número positivo.", "Erro de ID", JOptionPane.ERROR_MESSAGE);
                ctId.requestFocus();
                return false;
            }

            cavalo.setId(id);
            return true;  // Retorna verdadeiro se a validação passar
        }
    }

    private boolean validarDadosComuns(Cavalo cavalo) {
        // Validação de Peso
        String pesoText = ctPeso.getText().trim();
        if (pesoText.isEmpty() || !pesoText.matches("\\d+(\\.\\d+)?")) {
            ctPeso.setText("");
            JOptionPane.showMessageDialog(null, "Peso inválido. Por favor, insira apenas números.", "Erro de Peso", JOptionPane.ERROR_MESSAGE);
            ctPeso.requestFocus();
            return false;
        }
        float peso = Float.parseFloat(pesoText);

        // Validação de Idade
        String idadeText = ctIdade.getText().trim();
        if (idadeText.isEmpty() || !idadeText.matches("\\d+")) {
            ctIdade.setText("");
            JOptionPane.showMessageDialog(null, "Idade inválida. Por favor, insira apenas números.", "Erro de Idade", JOptionPane.ERROR_MESSAGE);
            ctIdade.requestFocus();
            return false;
        }
        int idade = Integer.parseInt(idadeText);

        cavalo.setPeso(peso);
        cavalo.setIdade(idade);
        return true;
    }

    // Validação da CorPelagem
    private boolean validarCorPelagem(Cavalo cavalo) {
        String corPelagem = ctCorPelagem.getText().trim();
        if (corPelagem.isEmpty() || !corPelagem.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "Cor da pelagem inválida. Por favor, insira apenas letras.", "Erro de Cor da Pelagem", JOptionPane.ERROR_MESSAGE);
            ctCorPelagem.requestFocus();
            return false;
        }
        cavalo.setCorPelagem(corPelagem);
        return true;
    }

    //Validação do TipoAndamento
    private boolean validarTipoAndamento(Cavalo cavalo) {
        String tipoAndamento = ctTipoAndamento.getText().trim();
        if (tipoAndamento.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tipo de andamento inválido. Por favor, insira um valor.", "Erro de Tipo de Andamento", JOptionPane.ERROR_MESSAGE);
            ctTipoAndamento.requestFocus();
            return false;
        }
        cavalo.setTipoAndamento(tipoAndamento);
        return true;
    }

    //Validação da Linhagem
    private boolean validarLinhagem(Cavalo cavalo) {
        try {
            String linhagemText = ctLinhagem.getText().trim();
            if (linhagemText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Linhagem inválida. Por favor, insira um valor.", "Erro de Linhagem", JOptionPane.ERROR_MESSAGE);
                ctLinhagem.requestFocus();
                return false;
            }
            cavalo.setLinhagem(linhagemText);
            return true;
        } catch (LinhagemException le) {
            JOptionPane.showMessageDialog(null, "Linhagem inválida. Deve ser 'puro sangue' ou 'lusitano'.", "Erro de Linhagem", JOptionPane.ERROR_MESSAGE);
            ctLinhagem.requestFocus();
            return false;  //
        }
    }

    //Cadastrar Cavalo
    public void cadastrarCavalo() {
        Cavalo cavalo = new Cavalo();

        // Verifica e valida cada campo, chamando a função de validação correspondente
        if (!validarId(cavalo) || !validarDadosComuns(cavalo) || !validarCorPelagem(cavalo)
                || !validarTipoAndamento(cavalo) || !validarLinhagem(cavalo)) {
            // Se qualquer validação falhar, a função retorna sem cadastrar o animal
            return;
        }

        // Salva o cavalo no BDAnimais
        Animal cadastrado = bdAnimais.cadAnimal(cavalo);
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

    // Listar dados comuns
    public void listarDadosComuns(Animal animal) {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        modelo.addRow(new Object[]{
            animal.getId(),
            animal.getPeso(),
            animal.getIdade(),
            "",
            "",
            ""
        });
    }

    // Listar dados do Cavalo
    public void listarDadosCavalo(Cavalo cavalo) {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        int lastRow = modelo.getRowCount() - 1;

        modelo.setValueAt(cavalo.getCorPelagem(), lastRow, 3);
        modelo.setValueAt(cavalo.getTipoAndamento(), lastRow, 4);
        modelo.setValueAt(cavalo.getLinhagem(), lastRow, 5);
    }

    // Tabela cavalo
    public void listarTabCavalo() {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        modelo.setRowCount(0);

        for (Animal animal : bdAnimais.getBdAnimais()) {
            listarDadosComuns(animal);

            if (animal instanceof Cavalo) {
                listarDadosCavalo((Cavalo) animal);
            }
        }
    }

    // Consultar
    public void consultar() {
        try {
            int id = Integer.parseInt(ctId.getText());

            Animal animal = bdAnimais.consAnimalPorId(id);

            if (animal != null) {

                ctId.setText(Integer.toString(animal.getId()));
                ctPeso.setText(Float.toString(animal.getPeso()));
                ctIdade.setText(Integer.toString(animal.getIdade()));

                if (animal instanceof Cavalo) {
                    Cavalo cavalo = (Cavalo) animal;
                    ctCorPelagem.setText(cavalo.getCorPelagem());
                    ctTipoAndamento.setText(cavalo.getTipoAndamento());
                    ctLinhagem.setText(cavalo.getLinhagem());
                    JOptionPane.showMessageDialog(null, "Confirme os dados do Cavalo", "Confirmação de Dados", JOptionPane.INFORMATION_MESSAGE);

                    limpar();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Não existe Animal com este ID", "ID inexistente", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O ID deve ser um número inteiro!", "Erro de ID", JOptionPane.ERROR_MESSAGE);
            ctId.setText("");
            ctId.requestFocus();
        }
    }

    //Alterar
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

                animal = bdAnimais.atualizaAnimalPorId(animal);

                if (animal != null) {
                    // Atualiza os campos da interface com os novos dados
                    ctId.setText(Integer.toString(animal.getId()));
                    ctPeso.setText(Float.toString(animal.getPeso()));
                    ctIdade.setText(Integer.toString(animal.getIdade()));

                    if (animal instanceof Cavalo) {
                        Cavalo cavalo = (Cavalo) animal;
                        ctCorPelagem.setText(cavalo.getCorPelagem());
                        ctTipoAndamento.setText(cavalo.getTipoAndamento());
                        ctLinhagem.setText(cavalo.getLinhagem());
                    }

                    JOptionPane.showMessageDialog(null, "Cavalo atualizado com sucesso!", "Atualização", JOptionPane.INFORMATION_MESSAGE);
                    limpar(); 

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar o cavalo.", "Erro", JOptionPane.ERROR_MESSAGE);
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
        ctCorPelagem.setText("");
        ctTipoAndamento.setText("");
        ctLinhagem.setText("");
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
            java.util.logging.Logger.getLogger(FormCadastroCavalo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCavalo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCavalo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCavalo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroCavalo().setVisible(true);
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
    private javax.swing.JTextField ctCorPelagem;
    private javax.swing.JTextField ctId;
    private javax.swing.JTextField ctIdade;
    private javax.swing.JTextField ctLinhagem;
    private javax.swing.JTextField ctPeso;
    private javax.swing.JTextField ctTipoAndamento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastroDeCavalo;
    private javax.swing.JLabel lblCorPelagem;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLinhagem;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JLabel lblTipoAndamento;
    private javax.swing.JMenu menuInformacoes;
    private javax.swing.JMenuItem menuItemProprietario;
    private javax.swing.JTable tblAnimal;
    // End of variables declaration//GEN-END:variables
}
