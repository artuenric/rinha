package com.rinha.gui;

import com.rinha.perfil.Perfil;
import java.awt.CardLayout;
import javax.swing.JPanel;

// Painel com as propriedades e funções necessárias para os painéis que pertencerão ao cardlayout do painel principal do MainFrame
public abstract class PainelFilho extends javax.swing.JPanel{
    protected mainFrame mainFrame;
    protected JPanel painelPrincipal;
    protected Perfil player;
    
    public void trocarTela(String cardName){
        CardLayout cl = (CardLayout) this.painelPrincipal.getLayout();
        cl.show(this.painelPrincipal, cardName);
    }
}
