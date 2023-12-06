package com.rinha.gui;

import com.rinha.perfil.Perfil;

public class PainelProximaBatalha extends PainelFilho {
    public PainelProximaBatalha(mainFrame mainFrame, Perfil player){
        this.mainFrame = mainFrame;
        this.painelPrincipal = mainFrame.getPainelPrincipal();
        this.player = player;
        
        initComponents();
    }

    public void updateInfoTelaProximaBatalha(){
        this.labelFotoMaquina.setIcon(this.mainFrame.batalhaAtual.getMaquina().getFotoBatalha());
        this.labelFotoPlayer.setIcon(this.mainFrame.batalhaAtual.getPlayer().getFotoBatalha());
        this.labelNomePlayer.setText(this.mainFrame.batalhaAtual.getPlayer().getApelido());
        this.labelNomeMaquina.setText(this.mainFrame.batalhaAtual.getMaquina().getNome());
    }
    
    public void irBatalhaTorneio(){
        // Se o torneio está aberto
        this.mainFrame.getTorneioAtual().nextRodada();
        this.mainFrame.setBatalhaAtual(this.mainFrame.torneioAtual.getBatalhaAtual());
        this.updateInfoTelaProximaBatalha();
        trocarTela("batalha");
    }
    
    public void irBatalhaRpida(){
        // Vai para batalha rápida
        this.updateInfoTelaProximaBatalha();
        trocarTela("batalha");
    }
    
    
    public void abrirProximaBatalha(){
        this.updateInfoTelaProximaBatalha();
        trocarTela("proxima");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFotoMaquina = new javax.swing.JLabel();
        labelFotoPlayer = new javax.swing.JLabel();
        labelNomePlayer = new javax.swing.JLabel();
        labelNomeMaquina = new javax.swing.JLabel();
        botaoBatalhar = new javax.swing.JButton();
        labelBackground = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFotoMaquina.setAlignmentY(0.0F);
        labelFotoMaquina.setPreferredSize(new java.awt.Dimension(150, 150));
        add(labelFotoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        labelFotoPlayer.setAlignmentY(0.0F);
        labelFotoPlayer.setPreferredSize(new java.awt.Dimension(150, 150));
        add(labelFotoPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        labelNomePlayer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomePlayer.setForeground(new java.awt.Color(255, 255, 255));
        labelNomePlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomePlayer.setText("Nome Player");
        add(labelNomePlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 150, -1));

        labelNomeMaquina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomeMaquina.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeMaquina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeMaquina.setText("NomeMaquina");
        labelNomeMaquina.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        add(labelNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 150, -1));

        botaoBatalhar.setBackground(new java.awt.Color(255, 135, 30));
        botaoBatalhar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoBatalhar.setForeground(new java.awt.Color(255, 255, 255));
        botaoBatalhar.setText("Batalhar");
        botaoBatalhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBatalharActionPerformed(evt);
            }
        });
        add(botaoBatalhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 130, 40));

        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/versus.png"))); // NOI18N
        labelBackground.setText("jLabel1");
        add(labelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBatalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBatalharActionPerformed
        // Troca a tela para a batalha
        if (this.mainFrame.getBatalhaAtual().getTipoBatalha().equals("Torneio")){
            this.irBatalhaTorneio();
        } 
        else {
            this.irBatalhaRpida();
        }
    }//GEN-LAST:event_botaoBatalharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBatalhar;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelFotoMaquina;
    private javax.swing.JLabel labelFotoPlayer;
    private javax.swing.JLabel labelNomeMaquina;
    private javax.swing.JLabel labelNomePlayer;
    // End of variables declaration//GEN-END:variables
}
