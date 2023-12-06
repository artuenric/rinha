package com.rinha.gui;

import com.rinha.galos.Galinheiro;
import com.rinha.galos.Galo;
import com.rinha.perfil.Perfil;
import java.util.ArrayList;

public class PainelBemVindo extends PainelFilho {
    // Informações dos Galos
    Galinheiro galinheiro = new Galinheiro();
    ArrayList<Galo> galosIniciais = galinheiro.gerarGalosIniciais();
    int galoEscolhido = 10;
    
    public PainelBemVindo(mainFrame mainFrame, Perfil player){
        this.mainFrame = mainFrame;
        this.painelPrincipal = mainFrame.getPainelPrincipal();
        this.player = player;
        
        initComponents();
    }

    public void updateInfoTelaBemVindo(){
        this.labelNomeGalo.setText(this.galosIniciais.get(galoEscolhido).getNome());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoInicial2 = new javax.swing.JButton();
        botaoInicial0 = new javax.swing.JButton();
        botaoInicial1 = new javax.swing.JButton();
        textFieldNomePlayer = new javax.swing.JTextField();
        labelBemVindo1 = new javax.swing.JLabel();
        botaoProsseguir = new javax.swing.JButton();
        labelNomeGalo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoInicial2.setIcon(galosIniciais.get(2).getFotoBatalha());
        botaoInicial2.setMaximumSize(new java.awt.Dimension(150, 150));
        botaoInicial2.setMinimumSize(new java.awt.Dimension(150, 150));
        botaoInicial2.setPreferredSize(new java.awt.Dimension(150, 150));
        botaoInicial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInicial2ActionPerformed(evt);
            }
        });
        add(botaoInicial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        botaoInicial0.setIcon(galosIniciais.get(0).getFotoBatalha());
        botaoInicial0.setMaximumSize(new java.awt.Dimension(150, 150));
        botaoInicial0.setMinimumSize(new java.awt.Dimension(150, 150));
        botaoInicial0.setPreferredSize(new java.awt.Dimension(150, 150));
        botaoInicial0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInicial0ActionPerformed(evt);
            }
        });
        add(botaoInicial0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        botaoInicial1.setIcon(galosIniciais.get(1).getFotoBatalha());
        botaoInicial1.setMaximumSize(new java.awt.Dimension(150, 150));
        botaoInicial1.setMinimumSize(new java.awt.Dimension(150, 150));
        botaoInicial1.setPreferredSize(new java.awt.Dimension(150, 150));
        botaoInicial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInicial1ActionPerformed(evt);
            }
        });
        add(botaoInicial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        textFieldNomePlayer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldNomePlayer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldNomePlayer.setText("Desafiante");
        add(textFieldNomePlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 230, 40));

        labelBemVindo1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        labelBemVindo1.setText("<html> <p align=\"center\">Bem-vindo, desafiante!<br> Digite seu nome e escolha com sabedoria<br>um dos Galos abaixo para ser seu inicial. </p> </html>");
        add(labelBemVindo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 350, 90));

        botaoProsseguir.setText("Prosseguir");
        botaoProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProsseguirActionPerformed(evt);
            }
        });
        add(botaoProsseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 230, 40));

        labelNomeGalo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNomeGalo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeGalo.setText("Escolha o galo!");
        add(labelNomeGalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInicial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicial2ActionPerformed
        // Escolhe o galo 3
        this.galoEscolhido = 2;
        this.updateInfoTelaBemVindo();
    }//GEN-LAST:event_botaoInicial2ActionPerformed

    private void botaoInicial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicial1ActionPerformed
        // TODO add your handling code here:
        this.galoEscolhido = 1;
        this.updateInfoTelaBemVindo();
    }//GEN-LAST:event_botaoInicial1ActionPerformed

    private void botaoInicial0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicial0ActionPerformed
        // TODO add your handling code here:
        this.galoEscolhido = 0;
        this.updateInfoTelaBemVindo();
    }//GEN-LAST:event_botaoInicial0ActionPerformed

    private void botaoProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProsseguirActionPerformed
        if (this.galoEscolhido != 10){
            // Definindo informações iniciais
            player.getGaloDex().addGalo(this.galosIniciais.get(galoEscolhido));
            player.getGaloDex().setAtacante(this.galosIniciais.get(galoEscolhido));
            player.setNome(this.textFieldNomePlayer.getText());
            // Trcando de tela e atualizando
            trocarTela("dashboard");
            this.mainFrame.painelDashboard.updateTelaDashboard();
        }
    }//GEN-LAST:event_botaoProsseguirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInicial0;
    private javax.swing.JButton botaoInicial1;
    private javax.swing.JButton botaoInicial2;
    private javax.swing.JButton botaoProsseguir;
    private javax.swing.JLabel labelBemVindo1;
    private javax.swing.JLabel labelNomeGalo;
    private javax.swing.JTextField textFieldNomePlayer;
    // End of variables declaration//GEN-END:variables
}
