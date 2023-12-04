package com.rinha.gui;

import com.rinha.ataque.Ataque;
import com.rinha.batalha.BatalhaRapida;
import com.rinha.galos.*;
import com.rinha.loja.Loja;
import com.rinha.perfil.Perfil;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class mainFrame extends javax.swing.JFrame {
    
    // Interface
    public PainelPlay painelPlay;
    public PainelBemVindo painelBemVindo;
    public PainelDashboard painelDashboard;
    public PainelLoja painelLoja;
    public PainelBatalha painelBatalha;
    
    
    // Informações do PLayer
    Perfil player = new Perfil("Desafiante");
        
    // Informações dos Galos
    Galinheiro galinheiro = new Galinheiro();
    ArrayList<Galo> galosIniciais = galinheiro.gerarGalosIniciais();
    
    // Informações da Loja
    Loja loja = player.getLoja();
    
    // Informações da PainelBatalha
    BatalhaRapida batalhaAtual;
    int usuarioAtq = 0;
    
    // Construtor
    public mainFrame() {
        initComponents();
        // Instanciando as telas
        this.painelPlay = new PainelPlay(this, this.player);
        this.painelBemVindo = new PainelBemVindo(this, this.player);
        this.painelDashboard = new PainelDashboard(this, this.player);
        this.painelLoja = new PainelLoja(this, this.player, this.loja);
        this.painelBatalha = new PainelBatalha(this, this.player);
        // Adicionando ao painel principal com o nome do card
        this.painelPrincipal.add(painelPlay, "play");
        this.painelPrincipal.add(painelBemVindo, "bemvindo");
        this.painelPrincipal.add(painelDashboard, "dashboard");
        this.painelPrincipal.add(painelLoja, "loja");
        this.painelPrincipal.add(painelBatalha, "batalha");
    }
    
    // Para a batalha rápida

    public BatalhaRapida getBatalhaAtual() {
        return batalhaAtual;
    }

    public void setBatalhaAtual(BatalhaRapida batalhaAtual) {
        this.batalhaAtual = batalhaAtual;
    }
    
    // Para a interface
    public PainelPlay getPainelPlay() {
        return painelPlay;
    }
    public PainelBemVindo getPainelBemVindo() {
        return painelBemVindo;
    }

    public PainelDashboard getPainelDashboard() {
        return painelDashboard;
    }

    public PainelLoja getPainelLoja() {
        return painelLoja;
    }

    public PainelBatalha getPainelBatalha() {
        return painelBatalha;
    }
  
    public JPanel getPainelPrincipal() {
        return painelPrincipal;
    }

    public JDialog getDialogGaloDex() {
        return dialogGaloDex;
    }

    public JTable getTableGaloDex() {
        return tableGaloDex;
    }
    
    public JLabel getLabelAgilidadeAtacanteGaloDex() {
        return labelAgilidadeAtacanteGaloDex;
    }

    public JLabel getLabelApelidoAtacanteGaloDex() {
        return labelApelidoAtacanteGaloDex;
    }

    public JLabel getLabelDefesaAtacanteGaloDex() {
        return labelDefesaAtacanteGaloDex;
    }

    public JLabel getLabelForcaAtacanteGaloDex() {
        return labelForcaAtacanteGaloDex;
    }

    public JLabel getLabelFotoAtacanteGaloDex() {
        return labelFotoAtacanteGaloDex;
    }

    public JLabel getLabelNomeAtacanteGaloDex() {
        return labelNomeAtacanteGaloDex;
    }
    
    // Interface
            public void updateTableGaloDex(){
        DefaultTableModel table = (DefaultTableModel) this.tableGaloDex.getModel();
        table.setRowCount(0);
        int tamanho = player.getGaloDex().getTamanho();
        for (int index = 0; index < tamanho; index++){
            Object[] dados = player.getGaloDex().getInfoGalo(index);
            table.addRow(dados);
        }
    }
    
    public void updateInfoGaloDex(){
        this.labelApelidoAtacanteGaloDex.setText(player.getGaloDex().getAtacante().getApelido());
        this.labelFotoAtacanteGaloDex.setIcon(player.getGaloDex().getAtacante().getFotoBatalha());
        this.labelNomeAtacanteGaloDex.setText(player.getGaloDex().getAtacante().getNome());
        this.labelAgilidadeAtacanteGaloDex.setText("Agilidade: " + player.getGaloDex().getAtacante().getAgilidade());
        this.labelForcaAtacanteGaloDex.setText("Força: " + player.getGaloDex().getAtacante().getForca());
        this.labelDefesaAtacanteGaloDex.setText("Defesa: " + player.getGaloDex().getAtacante().getDefesa());
        this.updateTableGaloDex();
        
    }
    
    public void abrirGaloDex(){
        this.dialogGaloDex.setVisible(true);
        this.updateTableGaloDex();
    }

    
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogGaloDex = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGaloDex = new javax.swing.JTable();
        botaoSelecionarAtacante = new javax.swing.JButton();
        labelSelecione = new javax.swing.JLabel();
        labelFotoAtacanteGaloDex = new javax.swing.JLabel();
        labelApelidoAtacanteGaloDex = new javax.swing.JLabel();
        labelForcaAtacanteGaloDex = new javax.swing.JLabel();
        labelAgilidadeAtacanteGaloDex = new javax.swing.JLabel();
        labelDefesaAtacanteGaloDex = new javax.swing.JLabel();
        labelNomeAtacanteGaloDex = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();

        dialogGaloDex.setMinimumSize(dialogGaloDex.getPreferredSize());
        dialogGaloDex.setResizable(false);
        dialogGaloDex.setSize(new java.awt.Dimension(600, 400));
        dialogGaloDex.setLocationRelativeTo(null);
        dialogGaloDex.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableGaloDex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Galo", "Tipo", "Raridade", "Nivel", "Vida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableGaloDex);
        if (tableGaloDex.getColumnModel().getColumnCount() > 0) {
            tableGaloDex.getColumnModel().getColumn(0).setResizable(false);
            tableGaloDex.getColumnModel().getColumn(1).setResizable(false);
            tableGaloDex.getColumnModel().getColumn(2).setResizable(false);
            tableGaloDex.getColumnModel().getColumn(3).setResizable(false);
            tableGaloDex.getColumnModel().getColumn(4).setResizable(false);
        }

        dialogGaloDex.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 480, 160));

        botaoSelecionarAtacante.setText("Selecionar");
        botaoSelecionarAtacante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarAtacanteActionPerformed(evt);
            }
        });
        dialogGaloDex.getContentPane().add(botaoSelecionarAtacante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 130, 40));

        labelSelecione.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        labelSelecione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSelecione.setText("<html> <p align=\"justify\"> Escolha um galo da sua GaloDex e clique em Selecionar pra defini-lo como seu galo Atacante.</p> </html>");
        labelSelecione.setToolTipText("");
        dialogGaloDex.getContentPane().add(labelSelecione, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 130, 90));
        dialogGaloDex.getContentPane().add(labelFotoAtacanteGaloDex, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 150));

        labelApelidoAtacanteGaloDex.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        labelApelidoAtacanteGaloDex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelApelidoAtacanteGaloDex.setText("...");
        dialogGaloDex.getContentPane().add(labelApelidoAtacanteGaloDex, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 167, 45));

        labelForcaAtacanteGaloDex.setText("Força:");
        dialogGaloDex.getContentPane().add(labelForcaAtacanteGaloDex, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        labelAgilidadeAtacanteGaloDex.setText("Agilidade:");
        dialogGaloDex.getContentPane().add(labelAgilidadeAtacanteGaloDex, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        labelDefesaAtacanteGaloDex.setText("Defesa:");
        dialogGaloDex.getContentPane().add(labelDefesaAtacanteGaloDex, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        labelNomeAtacanteGaloDex.setText("Galo Alguma Coisa");
        dialogGaloDex.getContentPane().add(labelNomeAtacanteGaloDex, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("rinha");
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

    private void botaoSelecionarAtacanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarAtacanteActionPerformed
        // Seleciona o atacante do player
        int index = tableGaloDex.getSelectedRow();
        if (index >= 0){
            // SelectedRow retorna o índice da linha selecionada, caso não haja linha selecionda, retorna -1
            player.getGaloDex().setAtacante(player.getGaloDex().getGalo(index));
            this.updateInfoGaloDex();
            // Log no terminal
            System.out.println("O galo atacante atual é:" + player.getGaloDex().getAtacante().getApelido());
        }
    }//GEN-LAST:event_botaoSelecionarAtacanteActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSelecionarAtacante;
    private javax.swing.JDialog dialogGaloDex;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgilidadeAtacanteGaloDex;
    private javax.swing.JLabel labelApelidoAtacanteGaloDex;
    private javax.swing.JLabel labelDefesaAtacanteGaloDex;
    private javax.swing.JLabel labelForcaAtacanteGaloDex;
    private javax.swing.JLabel labelFotoAtacanteGaloDex;
    private javax.swing.JLabel labelNomeAtacanteGaloDex;
    private javax.swing.JLabel labelSelecione;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tableGaloDex;
    // End of variables declaration//GEN-END:variables
}