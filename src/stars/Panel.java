/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import javax.swing.JPanel;

/**
 *
 * @author Thejan Rajapakshe < coder [dot] clix [at] gmail [dot] com >
 */
public class Panel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        doDrawing(g);
    }

    public void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        UniformRandom ur = new UniformRandom();

        Dimension size = getSize();
        Insets insets = getInsets();

        int w = size.width - insets.left - insets.right;
        int h = size.height - insets.top - insets.bottom;

        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, w, h);
        g2d.setColor(Color.WHITE);
        g2d.setBackground(Color.BLACK);

        int i = 0;
        for (int j = 0; j < 100; j++) {

            double[] p = stars.Stars.ar.getRandomPoint();
            int x = (int) ((p[0] / stars.Stars.ar.xMax) * w);
            int y = (int) (h - ((p[1] / stars.Stars.ar.fMax) * h));
            int l = 5;
            if (ur.getRandomBool(10)) {
                l = l * 2;
            }
            
            Color starColor = ur.getRandomColor();
            g2d.setColor(starColor);
            
            g2d.drawLine(x, y, x + l, y);
            g2d.drawLine(x, y, x - l, y);
            g2d.drawLine(x, y, x, y + l);
            g2d.drawLine(x, y, x, y - l);
            g2d.drawLine(x, y, x + l, y + l);
            g2d.drawLine(x, y, x + l, y - l);
            g2d.drawLine(x, y, x - l, y + l);
            g2d.drawLine(x, y, x - l, y - l);
            
            int ol=(int) l/3;
            g2d.fillOval(x-ol, y-ol, 2*ol, 2*ol);
            g2d.setColor(Color.WHITE);
            g2d.drawLine(x, y, x, y);
        }
    }

}
