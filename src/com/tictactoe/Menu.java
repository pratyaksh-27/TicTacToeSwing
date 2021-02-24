package com.tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu extends WindowAdapter implements ActionListener{
    JFrame obj;
    JButton btn1, btn2;
    
    public Menu(){
        
        obj = new JFrame("TicTacToe");
        obj.getContentPane().setBackground(Color.WHITE);
        btn1 = new JButton("Play Game");
        btn2 = new JButton("Exit");
       
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
        btn1.setFont(new Font("Arial", Font.PLAIN, 30));
        btn2.setFont(new Font("Arial", Font.PLAIN, 30));
        
        obj.setLayout(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();
        
        gb.gridx = 0;
        gb.gridy = 0;
        gb.weighty = 1;
        obj.add(btn1,gb);
        
        gb.gridx = 0;
        gb.gridy = 1;
        gb.fill = GridBagConstraints.HORIZONTAL;
        obj.add(btn2,gb);
       
        obj.addWindowListener(this);
        obj.setSize(300,300);
        obj.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        obj.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == btn1)
        {
			/* Game ob = */new Game();
            obj.dispose();
        }
        if(e.getSource() == btn2)
            obj.dispose();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int res = JOptionPane.showConfirmDialog(obj, "Do you want to Exit?");
                if(res == 0){
                    obj.dispose();
                }
    }
}
