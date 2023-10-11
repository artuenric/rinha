package com.rinha.gui;

import com.rinha.gui.Botao2;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen extends JFrame {
    public Screen(){
        setTitle("rinha");
        setVisible(true);
        setSize(1080, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha 
        setResizable(false); // Tamanho fixo da tela
        setLocationRelativeTo(null); // Centralize
        
        
        setLayout(null); // Obriga p layout a ser criado do 0
        JButton botao = new JButton("MENU");
        botao.setBounds(10, 20, 250, 80);
        botao.setFont(new Font("Arial", Font.BOLD, 30));
        botao.setForeground(new Color(255, 0, 0));
        botao.setBackground(Color.black);
        add(botao);
        
        
    }   
    
}
