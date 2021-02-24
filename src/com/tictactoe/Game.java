package com.tictactoe;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Game extends WindowAdapter implements ActionListener{
    
    JFrame ob;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    
    public Game(){
        
        ob = new JFrame("TicTacToe");
        
        btn1 = new JButton("");
        btn2 = new JButton("");
        btn3 = new JButton("");
        btn4 = new JButton("");
        btn5 = new JButton("");
        btn6 = new JButton("");
        btn7 = new JButton("");
        btn8 = new JButton("");
        btn9 = new JButton("");
        
        ob.add(btn1);
        ob.add(btn2);
        ob.add(btn3);
        ob.add(btn4);
        ob.add(btn5);
        ob.add(btn6);
        ob.add(btn7);
        ob.add(btn8);
        ob.add(btn9);
       
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        
        btn1.setFont(new Font("Arial", Font.PLAIN, 50));
        btn2.setFont(new Font("Arial", Font.PLAIN, 50));
        btn3.setFont(new Font("Arial", Font.PLAIN, 50));
        btn4.setFont(new Font("Arial", Font.PLAIN, 50));
        btn5.setFont(new Font("Arial", Font.PLAIN, 50));
        btn6.setFont(new Font("Arial", Font.PLAIN, 50));
        btn7.setFont(new Font("Arial", Font.PLAIN, 50));
        btn8.setFont(new Font("Arial", Font.PLAIN, 50));
        btn9.setFont(new Font("Arial", Font.PLAIN, 50));
        
        ob.addWindowListener(this);
        ob.setLayout(new GridLayout(3,3));
        ob.setSize(400,400);
        ob.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ob.setVisible(true);
                
        
    }
int clicks = 0, flag = 1;

    @Override
    public void actionPerformed(ActionEvent e) {
        
       clicks++;
       
       if(clicks % 2 == 0)
       {
           ((JButton) e.getSource()).setText("X");
           ((JButton) e.getSource()).removeActionListener(this);
           //ob.revalidate();
           //ob.repaint();
           
       }
       else
       {
           ((JButton) e.getSource()).setText("O");
           ((JButton) e.getSource()).removeActionListener(this);
           //ob.revalidate();
           //ob.repaint();
       }
       
       //VALIDATING THE WINNER
       
       if(btn1.getText().equals(btn2.getText())  && btn2.getText().equals(btn3.getText())
               || btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText())
               || btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()))
       {
           if(btn1.getText().compareTo("")!=0)
           {
               int n = JOptionPane.showConfirmDialog(ob, "You have WON !!!", "WINNER", JOptionPane.DEFAULT_OPTION);
               flag = 1;
            if(n == 0)
                {
                    ob.dispose();
					/* Menu ob = */new Menu();
                }
           }
       }
       else if(btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()))
       {
           if(btn4.getText().compareTo("")!=0)
           {
               int n = JOptionPane.showConfirmDialog(ob, "You have WON !!!", "WINNER", JOptionPane.DEFAULT_OPTION);
               flag = 1;
            if(n == 0)
                {
                    ob.dispose();
					/* Menu ob = */new Menu();
                }
           }
       }
       else if(btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText())
               || btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText()))
       {
           if(btn8.getText().compareTo("")!=0)
           {
               int n = JOptionPane.showConfirmDialog(ob, "You have WON !!!", "WINNER", JOptionPane.DEFAULT_OPTION);
               flag = 1;
            if(n == 0)
                {
                    ob.dispose();
					/* Menu ob = */new Menu();
                }
           }
       }
       else if(btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText())
               || btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText()))
       {
           if(btn3.getText().compareTo("")!=0)
           {
               int n = JOptionPane.showConfirmDialog(ob, "You have WON !!!", "WINNER", JOptionPane.DEFAULT_OPTION);
               flag = 1;
            if(n == 0)
                {
                    ob.dispose();
					/* Menu ob = */new Menu();
                }
           }
       }
       //VALIDATING THE DRAW
       else if(btn1.getText().compareTo("")!=0 && btn2.getText().compareTo("")!=0 && btn3.getText().compareTo("")!=0
               && btn4.getText().compareTo("")!=0 && btn5.getText().compareTo("")!=0 && btn6.getText().compareTo("")!=0
               && btn7.getText().compareTo("")!=0 && btn8.getText().compareTo("")!=0 && btn9.getText().compareTo("")!=0)
       {
           flag = 0;
       }
       
       if (flag == 0)
       {
           int n = JOptionPane.showConfirmDialog(ob, "The Game is DRAWN", "Game Draw", JOptionPane.DEFAULT_OPTION);
            if(n == 0)
                {
                    ob.dispose();
					/* Menu ob = */new Menu();
                }
       }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
        int res = JOptionPane.showConfirmDialog(ob, "Do you want to Exit Game?");
                if(res == 0){
                    ob.dispose();
					/* Menu ob = */new Menu();
                }
    }
    
}