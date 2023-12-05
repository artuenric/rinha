package com.rinha.gui;

import com.rinha.batalha.BatalhaRapida;
import com.rinha.perfil.Perfil;
import javax.swing.table.DefaultTableModel;

public class PainelDashboard extends PainelFilho {

    public PainelDashboard(mainFrame mainFrame, Perfil player) {
        this.player = player;
        this.mainFrame = mainFrame;
        this.painelPrincipal = mainFrame.getPainelPrincipal();
        initComponents();
    }
 
    public void updateTableGaloDex(){
        DefaultTableModel table = (DefaultTableModel) this.mainFrame.getTableGaloDex().getModel();
        table.setRowCount(0);
        int tamanho = player.getGaloDex().getTamanho();
        for (int index = 0; index < tamanho; index++){
            Object[] dados = player.getGaloDex().getInfoGalo(index);
            table.addRow(dados);
        }
    }
    
    public void updateInfoGaloDex(){
        this.mainFrame.getLabelApelidoAtacanteGaloDex().setText(player.getGaloDex().getAtacante().getApelido());
        this.mainFrame.getLabelFotoAtacanteGaloDex().setIcon(player.getGaloDex().getAtacante().getFotoBatalha());
        this.mainFrame.getLabelNomeAtacanteGaloDex().setText(player.getGaloDex().getAtacante().getNome());
        this.mainFrame.getLabelAgilidadeAtacanteGaloDex().setText("Agilidade: " + player.getGaloDex().getAtacante().getAgilidade());
        this.mainFrame.getLabelForcaAtacanteGaloDex().setText("Força: " + player.getGaloDex().getAtacante().getForca());
        this.mainFrame.getLabelDefesaAtacanteGaloDex().setText("Defesa: " + player.getGaloDex().getAtacante().getDefesa());
        this.updateTableGaloDex();
        
    }
    
    public void abrirGaloDex(){
        this.mainFrame.getDialogGaloDex().setVisible(true);
        this.updateTableGaloDex();
    }

    // PainelBatalha
    public void criarBatalhaRapida(){
        mainFrame.batalhaAtual = new BatalhaRapida(player);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botaoTorneios = new javax.swing.JButton();
        botaoLoja = new javax.swing.JButton();
        botaoPerfil = new javax.swing.JButton();
        botaoPartidaRapida = new javax.swing.JButton();
        botaoGaloDex = new javax.swing.JButton();
        labelBackgroundDashBoard = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome do Desafiante 3");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 280, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Milhos:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Poções de Cura:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        botaoTorneios.setBackground(new java.awt.Color(255, 135, 30));
        botaoTorneios.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        botaoTorneios.setForeground(new java.awt.Color(255, 255, 255));
        botaoTorneios.setText("Torneios");
        botaoTorneios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTorneiosActionPerformed(evt);
            }
        });
        add(botaoTorneios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 386, 182, 54));

        botaoLoja.setBackground(new java.awt.Color(75, 150, 187));
        botaoLoja.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        botaoLoja.setForeground(new java.awt.Color(255, 255, 255));
        botaoLoja.setText("Loja");
        botaoLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLojaActionPerformed(evt);
            }
        });
        add(botaoLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 386, 182, 54));

        botaoPerfil.setBackground(new java.awt.Color(228, 56, 82));
        botaoPerfil.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        botaoPerfil.setForeground(new java.awt.Color(255, 255, 255));
        botaoPerfil.setText("Perfil");
        botaoPerfil.setAlignmentY(0.0F);
        botaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPerfilActionPerformed(evt);
            }
        });
        add(botaoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 100, 31));

        botaoPartidaRapida.setBackground(new java.awt.Color(255, 135, 30));
        botaoPartidaRapida.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        botaoPartidaRapida.setForeground(new java.awt.Color(255, 255, 255));
        botaoPartidaRapida.setText("Partida Rápida");
        botaoPartidaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPartidaRapidaActionPerformed(evt);
            }
        });
        add(botaoPartidaRapida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 182, 54));

        botaoGaloDex.setBackground(new java.awt.Color(228, 56, 82));
        botaoGaloDex.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        botaoGaloDex.setForeground(new java.awt.Color(255, 255, 255));
        botaoGaloDex.setText("GaloDex");
        botaoGaloDex.setAlignmentY(0.0F);
        botaoGaloDex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGaloDexActionPerformed(evt);
            }
        });
        add(botaoGaloDex, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 83, 100, 31));

        labelBackgroundDashBoard.setForeground(new java.awt.Color(255, 255, 255));
        labelBackgroundDashBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/telaDashboard.png"))); // NOI18N
        labelBackgroundDashBoard.setToolTipText("");
        add(labelBackgroundDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTorneiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTorneiosActionPerformed

    }//GEN-LAST:event_botaoTorneiosActionPerformed

    private void botaoLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLojaActionPerformed
        // Vai para tela da loja
        trocarTela("loja");
        this.mainFrame.painelLoja.updateInfoTelaLoja();
    }//GEN-LAST:event_botaoLojaActionPerformed

    private void botaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPerfilActionPerformed
        // Abre o perfil
    }//GEN-LAST:event_botaoPerfilActionPerformed

    private void botaoPartidaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPartidaRapidaActionPerformed
        // botaoPartidaRapida gera e encaminha para uma partida aleatória
        if (player.getGaloDex().getAtacante() == null){
            this.abrirGaloDex();
        }
        else {
            trocarTela("batalha");
            criarBatalhaRapida();
            mainFrame.getPainelBatalha().updateInfoTelaBatalha();
            // Informações adicionais para a batalha rápida
            this.mainFrame.getPainelBatalha().getBarraVidaMaquina().setValue(100);
            this.mainFrame.getPainelBatalha().getBarraVidaPlayer().setValue(100);
        }
    }//GEN-LAST:event_botaoPartidaRapidaActionPerformed

    private void botaoGaloDexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGaloDexActionPerformed
        // Abre diretamente a GaloDex
        this.abrirGaloDex();
    }//GEN-LAST:event_botaoGaloDexActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoGaloDex;
    private javax.swing.JButton botaoLoja;
    private javax.swing.JButton botaoPartidaRapida;
    private javax.swing.JButton botaoPerfil;
    private javax.swing.JButton botaoTorneios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelBackgroundDashBoard;
    // End of variables declaration//GEN-END:variables
}
