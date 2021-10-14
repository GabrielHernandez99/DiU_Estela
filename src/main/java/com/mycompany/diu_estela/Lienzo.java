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
 * @author gabri & Jorge
 */
public class Lienzo extends JPanel{
//pintar contenido
   // Atributos para manejar la paleta de colores
    private final Color[] coloresFondo = {Color.WHITE, Color.BLACK, Color.BLUE, Color.GREEN};
    private final Color[] coloresEstela = {Color.BLACK, Color.BLUE, Color.GREEN, Color.RED};
    private int colorEstela = 0;
    private int colorFondo = 0;
    
    // Atributos para controlar donde se pintan los círculos
    private Integer x[] = {null, null, null, null, null};
    private Integer y[] = {null, null, null, null, null};
    private int index = 0;
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(coloresFondo[colorFondo]);
        this.setForeground(coloresEstela[colorEstela]);
        
        for(int i = 0; i < 5; i++) {
            if(x[i] != null && y[i] != null) {
                g.fillOval(x[i], y[i], 10, 10);
            }            
        }
        
    }
    
    public void setCoordinates(int x, int y) {
        this.x[this.index] = x;
        this.y[this.index] = y;
        index++;
        if(index > 4) index = 0;
        repaint();
    }
    
    public void paintFondo(int index) {
        colorFondo = index;
        repaint();
    }
    
    public void paintEstela(int index) {
        colorEstela = index;
        repaint();
    }
}
