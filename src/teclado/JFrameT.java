/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

/**
 *
 * @author Joshua C.H
 */
public class JFrameT extends JFrame {
    
    public JFrameT(){
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        
        
        JPanel panelN = new JPanel(new GridLayout(1, 1));
        Dimension dim = new Dimension (5, 5);
        
        JButtonT btn0 = new JButtonT("0", dim, java.awt.Color.GREEN);
        panelN.add(btn0);
        JButtonT btn1 = new JButtonT("1", dim, java.awt.Color.GREEN);
        panelN.add(btn1);
        JButtonT btn2 = new JButtonT("2", dim, java.awt.Color.GREEN);
        panelN.add(btn2);
        JButtonT btn3 = new JButtonT("3", dim, java.awt.Color.GREEN);
        panelN.add(btn3);
        JButtonT btn4 = new JButtonT("4", dim, java.awt.Color.GREEN);
        panelN.add(btn4);
        JButtonT btn5 = new JButtonT("5", dim, java.awt.Color.GREEN);
        panelN.add(btn5);
        JButtonT btn6 = new JButtonT("6", dim, java.awt.Color.GREEN);
        panelN.add(btn6);
        JButtonT btn7 = new JButtonT("7", dim, java.awt.Color.GREEN);
        panelN.add(btn7);
        JButtonT btn8 = new JButtonT("8", dim, java.awt.Color.GREEN);
        panelN.add(btn8);
        JButtonT btn9 = new JButtonT("9", dim, java.awt.Color.GREEN);
        panelN.add(btn9);
        
        JPanel panelL = new JPanel(new GridLayout(9, 3));
        
        JButtonT btna = new JButtonT("A", dim, java.awt.Color.lightGray);
        panelL.add(btna);
        JButtonT btnb = new JButtonT("B", dim, java.awt.Color.lightGray);
        panelL.add(btnb);
        JButtonT btnc = new JButtonT("C", dim, java.awt.Color.lightGray);
        panelL.add(btnc);
        JButtonT btnd = new JButtonT("D", dim, java.awt.Color.lightGray);
        panelL.add(btnd);
        JButtonT btne = new JButtonT("E", dim, java.awt.Color.lightGray);
        panelL.add(btne);
        JButtonT btnf = new JButtonT("F", dim, java.awt.Color.lightGray);
        panelL.add(btnf);
        JButtonT btng = new JButtonT("G", dim, java.awt.Color.lightGray);
        panelL.add(btng);
        JButtonT btnh = new JButtonT("H", dim, java.awt.Color.lightGray);
        panelL.add(btnh);
        JButtonT btni = new JButtonT("I", dim, java.awt.Color.lightGray);
        panelL.add(btni);
        JButtonT btnj = new JButtonT("J", dim, java.awt.Color.lightGray);
        panelL.add(btnj);
        JButtonT btnk = new JButtonT("K", dim, java.awt.Color.lightGray);
        panelL.add(btnk);
        JButtonT btnl = new JButtonT("L", dim, java.awt.Color.lightGray);
        panelL.add(btnl);
        JButtonT btnm = new JButtonT("M", dim, java.awt.Color.lightGray);
        panelL.add(btnm);
        JButtonT btnn = new JButtonT("N", dim, java.awt.Color.lightGray);
        panelL.add(btnn);
        JButtonT btnñ = new JButtonT("Ñ", dim, java.awt.Color.lightGray);
        panelL.add(btnñ);
        JButtonT btno = new JButtonT("O", dim, java.awt.Color.lightGray);
        panelL.add(btno);
        JButtonT btnp = new JButtonT("P", dim, java.awt.Color.lightGray);
        panelL.add(btnp);
        JButtonT btnq = new JButtonT("Q", dim, java.awt.Color.lightGray);
        panelL.add(btnq);
        JButtonT btnr = new JButtonT("R", dim, java.awt.Color.lightGray);
        panelL.add(btnr);
        JButtonT btns = new JButtonT("S", dim, java.awt.Color.lightGray);
        panelL.add(btns);
        JButtonT btnt = new JButtonT("T", dim, java.awt.Color.lightGray);
        panelL.add(btnt);
        JButtonT btnu = new JButtonT("U", dim, java.awt.Color.lightGray);
        panelL.add(btnu);
        JButtonT btnv = new JButtonT("V", dim, java.awt.Color.lightGray);
        panelL.add(btnv);
        JButtonT btnw = new JButtonT("W", dim, java.awt.Color.lightGray);
        panelL.add(btnw);
        JButtonT btnx = new JButtonT("X", dim, java.awt.Color.lightGray);
        panelL.add(btnx);
        JButtonT btny = new JButtonT("Y", dim, java.awt.Color.lightGray);
        panelL.add(btny);
        JButtonT btnz = new JButtonT("Z", dim, java.awt.Color.lightGray);
        panelL.add(btnz);
        JButtonT btnblnk = new JButtonT("", dim, java.awt.Color.lightGray);
        panelL.add(btnblnk);
     
        JPanel panelF = new JPanel(new GridLayout(9, 3));
        
        JButtonT btnAr = new JButtonT("UP", dim, java.awt.Color.RED);
        panelL.add(btnAr);
        JButtonT btnAb = new JButtonT("DOWN", dim, java.awt.Color.RED);
        panelL.add(btnAb);
        JButtonT btnIzq = new JButtonT("LEFT", dim, java.awt.Color.RED);
        panelL.add(btnIzq);
        JButtonT btnDer = new JButtonT("RIGHT", dim, java.awt.Color.RED);
        panelL.add(btnDer);
        
        setLayout(new BorderLayout());
        add(panelN, BorderLayout.NORTH);
        add(panelL, BorderLayout.CENTER);
        add(panelF, BorderLayout.SOUTH);
        
        setResizable(false);
        setSize(600, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
    }
}
