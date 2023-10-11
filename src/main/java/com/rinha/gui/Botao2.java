package com.rinha.gui;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
public class Botao2 extends JButton {
    
    public Botao2(){
    setText("AAA");
    setLayout(null); // Obriga p layout a ser criado do 0
    setBounds(100, 200, 200, 80);
    setFont(new Font("Arial", Font.BOLD, 30));
    setForeground(new Color(255, 0, 0));
    setBackground(Color.black);
    }
}
