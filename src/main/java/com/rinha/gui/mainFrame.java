package com.rinha.gui;

import java.awt.CardLayout;

public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
    }
    
    /*
    * Minhas funções para auxiliar na interface
    */
    
    public void trocarTela(String nomeDoCard){
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, nomeDoCard);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        telaInicial = new javax.swing.JPanel();
        botaoSettings = new javax.swing.JButton();
        botaoHelp = new javax.swing.JButton();
        botaoPlay = new javax.swing.JButton();
        labelBackgroundTelaInicial = new javax.swing.JLabel();
        telaDashBoard = new javax.swing.JPanel();
        botaoTorneios = new javax.swing.JButton();
        menuInicial = new javax.swing.JButton();
        botaoLoja = new javax.swing.JButton();
        botaoPerfil = new javax.swing.JButton();
        botaoPartidaRapida = new javax.swing.JButton();
        botaoGaloDex = new javax.swing.JButton();
        labelBackgroundDashBoard = new javax.swing.JLabel();
        telaLoja = new javax.swing.JPanel();
        telaBatalha = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        labelPP = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("rinha");
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setName("mainFrame"); // NOI18N
        setResizable(false);
        setSize(getPreferredSize());

        painelPrincipal.setAlignmentX(0.0F);
        painelPrincipal.setAlignmentY(0.0F);
        painelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelPrincipal.setMaximumSize(getPreferredSize());
        painelPrincipal.setMinimumSize(getPreferredSize());
        painelPrincipal.setName(""); // NOI18N
        painelPrincipal.setPreferredSize(getPreferredSize());
        painelPrincipal.setLayout(new java.awt.CardLayout());

        telaInicial.setAlignmentX(0.0F);
        telaInicial.setAlignmentY(0.0F);
        telaInicial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        telaInicial.setMaximumSize(getPreferredSize());
        telaInicial.setMinimumSize(getPreferredSize());
        telaInicial.setName(""); // NOI18N
        telaInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botaoSettings.png"))); // NOI18N
        botaoSettings.setContentAreaFilled(false);
        telaInicial.add(botaoSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, 40));

        botaoHelp.setBackground(new java.awt.Color(228, 56, 82));
        botaoHelp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoHelp.setForeground(new java.awt.Color(238, 240, 242));
        botaoHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botaoHelp.png"))); // NOI18N
        botaoHelp.setContentAreaFilled(false);
        botaoHelp.setFocusPainted(false);
        botaoHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHelpActionPerformed(evt);
            }
        });
        telaInicial.add(botaoHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 30, 40));

        botaoPlay.setBackground(new java.awt.Color(246, 110, 21));
        botaoPlay.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        botaoPlay.setForeground(new java.awt.Color(238, 240, 242));
        botaoPlay.setText("play");
        botaoPlay.setBorder(null);
        botaoPlay.setFocusPainted(false);
        botaoPlay.setRolloverEnabled(false);
        botaoPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPlayActionPerformed(evt);
            }
        });
        telaInicial.add(botaoPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 240, 60));

        labelBackgroundTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/telainicial.png"))); // NOI18N
        telaInicial.add(labelBackgroundTelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        painelPrincipal.add(telaInicial, "telaInicial");

        telaDashBoard.setAlignmentX(0.0F);
        telaDashBoard.setAlignmentY(0.0F);
        telaDashBoard.setMaximumSize(getPreferredSize());
        telaDashBoard.setMinimumSize(getPreferredSize());
        telaDashBoard.setPreferredSize(getPreferredSize());
        telaDashBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoTorneios.setBackground(new java.awt.Color(255, 135, 30));
        botaoTorneios.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        botaoTorneios.setForeground(new java.awt.Color(255, 255, 255));
        botaoTorneios.setText("Torneios");
        botaoTorneios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTorneiosActionPerformed(evt);
            }
        });
        telaDashBoard.add(botaoTorneios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 386, 182, 54));

        menuInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/menuIcon.png"))); // NOI18N
        menuInicial.setAlignmentY(0.0F);
        menuInicial.setContentAreaFilled(false);
        telaDashBoard.add(menuInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 48, 48));

        botaoLoja.setBackground(new java.awt.Color(75, 150, 187));
        botaoLoja.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        botaoLoja.setForeground(new java.awt.Color(255, 255, 255));
        botaoLoja.setText("Loja");
        telaDashBoard.add(botaoLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 386, 182, 54));

        botaoPerfil.setBackground(new java.awt.Color(228, 56, 82));
        botaoPerfil.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        botaoPerfil.setForeground(new java.awt.Color(255, 255, 255));
        botaoPerfil.setText("Perfil");
        botaoPerfil.setAlignmentY(0.0F);
        telaDashBoard.add(botaoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 100, 31));

        botaoPartidaRapida.setBackground(new java.awt.Color(255, 135, 30));
        botaoPartidaRapida.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        botaoPartidaRapida.setForeground(new java.awt.Color(255, 255, 255));
        botaoPartidaRapida.setText("Partida Rápida");
        botaoPartidaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPartidaRapidaActionPerformed(evt);
            }
        });
        telaDashBoard.add(botaoPartidaRapida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 182, 54));

        botaoGaloDex.setBackground(new java.awt.Color(228, 56, 82));
        botaoGaloDex.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        botaoGaloDex.setForeground(new java.awt.Color(255, 255, 255));
        botaoGaloDex.setText("GaloDex");
        botaoGaloDex.setAlignmentY(0.0F);
        telaDashBoard.add(botaoGaloDex, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 83, 100, 31));

        labelBackgroundDashBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dash.png"))); // NOI18N
        labelBackgroundDashBoard.setText("jLabel1");
        labelBackgroundDashBoard.setToolTipText("");
        telaDashBoard.add(labelBackgroundDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        painelPrincipal.add(telaDashBoard, "telaDashBoard");

        telaLoja.setAlignmentX(0.0F);
        telaLoja.setAlignmentY(0.0F);
        telaLoja.setMaximumSize(getPreferredSize());
        telaLoja.setMinimumSize(getPreferredSize());

        javax.swing.GroupLayout telaLojaLayout = new javax.swing.GroupLayout(telaLoja);
        telaLoja.setLayout(telaLojaLayout);
        telaLojaLayout.setHorizontalGroup(
            telaLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        telaLojaLayout.setVerticalGroup(
            telaLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        painelPrincipal.add(telaLoja, "telaLoja");

        telaBatalha.setAlignmentX(0.0F);
        telaBatalha.setAlignmentY(0.0F);
        telaBatalha.setMaximumSize(getPreferredSize());
        telaBatalha.setMinimumSize(getPreferredSize());
        telaBatalha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(jLabel2.getPreferredSize());
        jLabel2.setMinimumSize(jLabel2.getPreferredSize());
        telaBatalha.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, 150));

        jPanel1.setBackground(new java.awt.Color(238, 240, 242));

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        labelPP.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        labelPP.setText("PP:");
        labelPP.setAlignmentY(0.0F);

        jButton6.setText("jButton5");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Ataque");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPP)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        telaBatalha.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 720, 160));

        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(140, 140));
        jLabel3.setMinimumSize(new java.awt.Dimension(140, 140));
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 140));
        telaBatalha.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 140, 140));
        telaBatalha.add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 200, 20));
        telaBatalha.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 200, 20));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");
        telaBatalha.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("jLabel4");
        telaBatalha.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        painelPrincipal.add(telaBatalha, "telaBatalha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        painelPrincipal.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoHelpActionPerformed

    private void botaoPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPlayActionPerformed
        // botaoPlay encaminha a tela para o dashboard
        trocarTela("telaDashBoard");
    }//GEN-LAST:event_botaoPlayActionPerformed

    private void botaoPartidaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPartidaRapidaActionPerformed
        // botaoPartidaRapida gera e encaminha para uma partida aleatória
        trocarTela("telaBatalha");
    }//GEN-LAST:event_botaoPartidaRapidaActionPerformed

    private void botaoTorneiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTorneiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoTorneiosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoGaloDex;
    private javax.swing.JButton botaoHelp;
    private javax.swing.JButton botaoLoja;
    private javax.swing.JButton botaoPartidaRapida;
    private javax.swing.JButton botaoPerfil;
    private javax.swing.JButton botaoPlay;
    private javax.swing.JButton botaoSettings;
    private javax.swing.JButton botaoTorneios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JLabel labelBackgroundDashBoard;
    private javax.swing.JLabel labelBackgroundTelaInicial;
    private javax.swing.JLabel labelPP;
    private javax.swing.JButton menuInicial;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel telaBatalha;
    private javax.swing.JPanel telaDashBoard;
    private javax.swing.JPanel telaInicial;
    private javax.swing.JPanel telaLoja;
    // End of variables declaration//GEN-END:variables
}
