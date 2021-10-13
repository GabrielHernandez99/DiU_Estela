/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diu_estela;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author gabri
 */
public class Lienzo extends JPanel{
//pintar contenido
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(10, 10, 60, 60);
        g.drawOval(100, 100, 50, 30);
        g.fillOval(50, 50, 50, 30);
        
    }
}
