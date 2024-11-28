/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Pesquisar.JDlgClientesPesquisar;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

public class JDlgClientes_mgar extends javax.swing.JDialog {

    private MaskFormatter mascaraCpf, mascaraRg, mascaraNumCel, mascaraNumRes, mascaraDataNasc, mascaraCep, mascaraDataCad;

    /**
     * Creates new form JDlgClientes
     */
    public JDlgClientes_mgar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Clientes");

        Util.habilitar(false, jBtnAlterar, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnPesquisar,
                jBtnExcluir, jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEstado_mgar);

        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnPesquisar,
                jBtnExcluir);
        Util.limpar(jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEndereco_mgar);

        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraRg = new MaskFormatter("#.###.###");
            mascaraNumCel = new MaskFormatter("(##)#####-####");
            mascaraNumRes = new MaskFormatter("####-####");
            mascaraDataNasc = new MaskFormatter("##/##/####");
            mascaraCep = new MaskFormatter("#####-###");
            mascaraDataCad = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgClientes_mgar.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf_mgar.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtRg_mgar.setFormatterFactory(new DefaultFormatterFactory(mascaraRg));
        jFmtNumeroCelular_mgar.setFormatterFactory(new DefaultFormatterFactory(mascaraNumCel));
        jFmtTelefoneResidencial_mgar.setFormatterFactory(new DefaultFormatterFactory(mascaraNumRes));
        jFmtDataNascimento_mgar.setFormatterFactory(new DefaultFormatterFactory(mascaraDataNasc));
        jFmtCep_mgar.setFormatterFactory(new DefaultFormatterFactory(mascaraCep));
        jFmtDataCadastro_mgar.setFormatterFactory(new DefaultFormatterFactory(mascaraDataCad));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTxtCodigo_mgar = new javax.swing.JTextField();
        jTxtNome_mgar = new javax.swing.JTextField();
        jTxtApelido_mgar = new javax.swing.JTextField();
        jTxtEmail_mgar = new javax.swing.JTextField();
        jFmtRg_mgar = new javax.swing.JFormattedTextField();
        jFmtCpf_mgar = new javax.swing.JFormattedTextField();
        jFmtNumeroCelular_mgar = new javax.swing.JFormattedTextField();
        jFmtTelefoneResidencial_mgar = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jFmtDataNascimento_mgar = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtEndereco_mgar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTxtEstado_mgar = new javax.swing.JTextField();
        jTxtCidade_mgar = new javax.swing.JTextField();
        jTxtBairro_mgar = new javax.swing.JTextField();
        jFmtCep_mgar = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jFmtDataCadastro_mgar = new javax.swing.JFormattedTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Número de Celular:");

        jLabel3.setText("RG:");

        jLabel4.setText("Apelido:");

        jLabel5.setText("Nome:");

        jLabel6.setText("CPF:");

        jLabel7.setText("Email:");

        jLabel8.setText("Telefone Residencial");

        jLabel9.setText("Data de Nascimento");

        jLabel10.setText("Endereço:");

        jLabel11.setText("Estado:");

        jLabel12.setText("Cidade:");

        jLabel13.setText("Bairro:");

        jLabel14.setText("Cep:");

        jFmtCep_mgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCep_mgarActionPerformed(evt);
            }
        });

        jLabel15.setText("Data de Cadastro:");

        jFmtDataCadastro_mgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDataCadastro_mgarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxtEmail_mgar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtCodigo_mgar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtNome_mgar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtApelido_mgar, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(489, 489, 489)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14)
                                    .addComponent(jFmtCep_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFmtDataNascimento_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFmtCpf_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtRg_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtNumeroCelular_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtTelefoneResidencial_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jTxtEndereco_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jTxtEstado_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel12))
                                            .addComponent(jTxtCidade_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnConfirmar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBtnCancelar)
                                        .addGap(14, 14, 14)
                                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jTxtBairro_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel15)
                            .addComponent(jFmtDataCadastro_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodigo_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNome_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtApelido_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtEmail_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFmtCpf_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFmtNumeroCelular_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFmtTelefoneResidencial_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFmtRg_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jFmtDataNascimento_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEndereco_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEstado_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCidade_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtBairro_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCep_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFmtDataCadastro_mgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed

        Util.habilitar(true, jBtnAlterar, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnPesquisar,
                jBtnIncluir, jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEstado_mgar);

        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnPesquisar,
                jBtnIncluir);
        Util.limpar(jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEndereco_mgar);

    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed

       Util.habilitar(true, jBtnAlterar, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnPesquisar,
                jBtnIncluir, jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEstado_mgar);

        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnPesquisar,
                jBtnIncluir);
        Util.limpar(jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEndereco_mgar);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed

        Util.habilitar(true, jBtnAlterar, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnPesquisar,
                jBtnIncluir, jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEstado_mgar);

        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnPesquisar,
                jBtnIncluir);
        Util.limpar(jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEndereco_mgar);
        // TODO add your handling code here:

    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed

        Util.habilitar(false, jBtnAlterar, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnPesquisar,
                jBtnIncluir, jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEstado_mgar);

        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnPesquisar,
                jBtnIncluir);
        Util.limpar(jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEndereco_mgar);

    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed

        Util.habilitar(false, jBtnAlterar, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnPesquisar,
                jBtnIncluir, jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEstado_mgar);

        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnPesquisar,
                jBtnIncluir);
        Util.limpar(jFmtCep_mgar, jFmtCpf_mgar, jFmtDataCadastro_mgar,
                jFmtDataNascimento_mgar, jFmtNumeroCelular_mgar, jFmtRg_mgar,
                jFmtTelefoneResidencial_mgar, jTxtApelido_mgar, jTxtBairro_mgar, jTxtCidade_mgar,
                jTxtCodigo_mgar, jTxtEmail_mgar, jTxtEndereco_mgar, jTxtNome_mgar, jTxtEndereco_mgar);
        // TODO add your handling code here:]

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        JDlgClientesPesquisar jDlgClientesPesquisar = new JDlgClientesPesquisar(null, true);
        jDlgClientesPesquisar.setVisible(true);
        // TODO add your handling code here:                                           
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jFmtCep_mgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCep_mgarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCep_mgarActionPerformed

    private void jFmtDataCadastro_mgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDataCadastro_mgarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDataCadastro_mgarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgClientes_mgar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes_mgar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes_mgar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes_mgar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgClientes_mgar dialog = new JDlgClientes_mgar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JFormattedTextField jFmtCep_mgar;
    private javax.swing.JFormattedTextField jFmtCpf_mgar;
    private javax.swing.JFormattedTextField jFmtDataCadastro_mgar;
    private javax.swing.JFormattedTextField jFmtDataNascimento_mgar;
    private javax.swing.JFormattedTextField jFmtNumeroCelular_mgar;
    private javax.swing.JFormattedTextField jFmtRg_mgar;
    private javax.swing.JFormattedTextField jFmtTelefoneResidencial_mgar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtApelido_mgar;
    private javax.swing.JTextField jTxtBairro_mgar;
    private javax.swing.JTextField jTxtCidade_mgar;
    private javax.swing.JTextField jTxtCodigo_mgar;
    private javax.swing.JTextField jTxtEmail_mgar;
    private javax.swing.JTextField jTxtEndereco_mgar;
    private javax.swing.JTextField jTxtEstado_mgar;
    private javax.swing.JTextField jTxtNome_mgar;
    // End of variables declaration//GEN-END:variables
}
