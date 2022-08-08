package com.mycompany.estudodecaso;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Aplicativo extends javax.swing.JFrame {

    public Aplicativo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emitir = new javax.swing.JButton();
        txtDataEmissao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDataInicioExperimento = new javax.swing.JTextField();
        txtDataFimExperimento = new javax.swing.JTextField();
        txtJustificativaAnimais = new javax.swing.JTextField();
        txtResumoPortugues = new javax.swing.JTextField();
        txtResumoIngles = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enviarParaParecer = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        emitirParecer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtStatusParecer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtStatusProtocolo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtStatusDeliberacao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDeliberar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtDescricaoParecer = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDataEmissaoParecer = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDataDeliberacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emitir.setText("Emitir");
        emitir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emitirMouseClicked(evt);
            }
        });
        emitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emitirActionPerformed(evt);
            }
        });

        txtDataEmissao.setName(""); // NOI18N

        jLabel1.setText("Data Emissao");

        txtDataInicioExperimento.setName(""); // NOI18N

        txtDataFimExperimento.setName(""); // NOI18N

        txtJustificativaAnimais.setName(""); // NOI18N

        txtResumoPortugues.setName(""); // NOI18N

        txtResumoIngles.setName(""); // NOI18N

        jLabel2.setText("Data Inicio Experimento");

        jLabel3.setText("Data Fim Experimento");

        jLabel4.setText("Justificativa Animais");

        jLabel5.setText("Resumo Portugues");

        jLabel6.setText("Resumo Inglês");

        enviarParaParecer.setText("Enviar para Parecer");
        enviarParaParecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarParaParecerMouseClicked(evt);
            }
        });

        jLabel8.setText("ID");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        emitirParecer.setText("Emitir Parecer");
        emitirParecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emitirParecerMouseClicked(evt);
            }
        });

        jLabel7.setText("STATUS");

        jButton1.setText("Selecionar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel9.setText("Parecer");

        jLabel10.setText("Protocolo");

        jLabel11.setText("Deliberação");

        txtDeliberar.setText("Deliberar");
        txtDeliberar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDeliberarMouseClicked(evt);
            }
        });

        jLabel12.setText("Descrição do Parecer");

        jLabel13.setText("Data Emissão Parecer (Não precisa preencher)");

        jLabel14.setText("Data Deliberação (Não precisa Preencher)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataFimExperimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataInicioExperimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJustificativaAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResumoPortugues, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 148, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel12)
                                    .addComponent(txtDescricaoParecer, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtDataEmissaoParecer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtStatusProtocolo)
                                            .addComponent(txtStatusParecer)
                                            .addComponent(txtStatusDeliberacao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel7)))
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(95, 95, 95))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtResumoIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDataDeliberacao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(emitir)
                .addGap(85, 85, 85)
                .addComponent(enviarParaParecer)
                .addGap(112, 112, 112)
                .addComponent(emitirParecer)
                .addGap(141, 141, 141)
                .addComponent(jButton1)
                .addGap(82, 82, 82)
                .addComponent(txtDeliberar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addComponent(txtDataInicioExperimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDataFimExperimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))
                            .addComponent(txtJustificativaAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5))
                            .addComponent(txtResumoPortugues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6))
                            .addComponent(txtResumoIngles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatusParecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStatusProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStatusDeliberacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescricaoParecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataEmissaoParecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataDeliberacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emitir)
                    .addComponent(enviarParaParecer)
                    .addComponent(emitirParecer)
                    .addComponent(jButton1)
                    .addComponent(txtDeliberar))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emitirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emitirActionPerformed

    private void emitirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emitirMouseClicked
        EstudoDAO estudoDAO = new EstudoDAO();
        Estudo estudo = new Estudo();
        
        estudo.setDataEmissaoProtocolo(txtDataEmissao.getText());
        estudo.setDataInicioExperimento(txtDataInicioExperimento.getText());
        estudo.setDataFimExperimento(txtDataFimExperimento.getText());
        estudo.setJustificativaUsoAnimais(txtJustificativaAnimais.getText());
        estudo.setResumoPortugues(txtResumoPortugues.getText());
        estudo.setResumoIngles(txtResumoIngles.getText());
        
        try {
            estudoDAO.emitir(estudo);
        } catch (Exception ex) {
            Logger.getLogger(Aplicativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_emitirMouseClicked

    private void enviarParaParecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarParaParecerMouseClicked
        EstudoDAO estudoDAO = new EstudoDAO();
        Estudo estudo = new Estudo();
        
        estudo.setId(Integer.parseInt(txtId.getText()));
        
        try {
            estudoDAO.enviarParaParecer(estudo);
        } catch (Exception ex) {
            Logger.getLogger(Aplicativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enviarParaParecerMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void emitirParecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emitirParecerMouseClicked
        EstudoDAO estudoDAO = new EstudoDAO();
        Estudo estudo = new Estudo();
        
        estudo.setId(Integer.parseInt(txtId.getText()));
        estudo.setDescricaoParecer(txtDescricaoParecer.getText());
        estudo.setStatusParecer(txtStatusParecer.getText());
        
        try {
            estudoDAO.emitirParecer(estudo);
        } catch (Exception ex) {
            Logger.getLogger(Aplicativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_emitirParecerMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        EstudoDAO estudoDAO = new EstudoDAO();
        
        try {
            txtId.setText(String.valueOf(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getId()));
            txtDataEmissao.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getDataEmissaoProtocolo());
            txtDataInicioExperimento.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getDataInicioExperimento());
            txtDataFimExperimento.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getDataFimExperimento());
            txtJustificativaAnimais.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getJustificativaUsoAnimais());
            txtResumoIngles.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getResumoIngles());
            txtResumoPortugues.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getResumoPortugues());
            txtStatusProtocolo.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getStatusProtocolo());
            txtStatusDeliberacao.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getStatusDeliberacao());
            txtStatusParecer.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getStatusParecer());
            txtDescricaoParecer.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getDescricaoParecer());
            txtDataDeliberacao.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getDataDeliberacaoProtocolo());
            txtDataEmissaoParecer.setText(estudoDAO.selecionar(Integer.parseInt(txtId.getText())).getDataEmissaoParecer());
            
        }
        catch(Exception ex) {
            Logger.getLogger(Aplicativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtDeliberarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeliberarMouseClicked
        EstudoDAO estudoDAO = new EstudoDAO();
        Estudo estudo = new Estudo();
        
        estudo.setId(Integer.parseInt(txtId.getText()));
        estudo.setStatusDeliberacao(txtStatusDeliberacao.getText());
        
        try {
            estudoDAO.deliberarProtocolo(estudo);
        } catch (Exception ex) {
            Logger.getLogger(Aplicativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtDeliberarMouseClicked

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
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton emitir;
    private javax.swing.JButton emitirParecer;
    private javax.swing.JButton enviarParaParecer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDataDeliberacao;
    private javax.swing.JTextField txtDataEmissao;
    private javax.swing.JTextField txtDataEmissaoParecer;
    private javax.swing.JTextField txtDataFimExperimento;
    private javax.swing.JTextField txtDataInicioExperimento;
    private javax.swing.JButton txtDeliberar;
    private javax.swing.JTextField txtDescricaoParecer;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJustificativaAnimais;
    private javax.swing.JTextField txtResumoIngles;
    private javax.swing.JTextField txtResumoPortugues;
    private javax.swing.JTextField txtStatusDeliberacao;
    private javax.swing.JTextField txtStatusParecer;
    private javax.swing.JTextField txtStatusProtocolo;
    // End of variables declaration//GEN-END:variables
}
