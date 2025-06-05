/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author aless
 */
public class BotonBonito {
    public void personalizarBoton(JButton boton) {
        Color colorInicio = new Color(180, 0, 0); 
        Color colorFin = new Color(255, 70, 70);   
        Color colorFinHover = new Color(139, 0, 0);
        int radioBorde = 20;

        final float[] interpolador = {0f}; // efecto hover
        final float[] escala = {1f};       // efecto clic

    Timer hoverTimer = new Timer(30, e -> {
        Point mouse = MouseInfo.getPointerInfo().getLocation();
        SwingUtilities.convertPointFromScreen(mouse, boton); // Conversión aquí
        boolean encima = boton.contains(mouse); // Ahora compara en coordenadas relativas

        if (encima && interpolador[0] < 1f) {
            interpolador[0] += 0.05f;
            if (interpolador[0] > 1f) interpolador[0] = 1f;
            boton.repaint();
        } else if (!encima && interpolador[0] > 0f) {
            interpolador[0] -= 0.05f;
            if (interpolador[0] < 0f) interpolador[0] = 0f;
            boton.repaint();
        }
    });
        hoverTimer.start();

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Timer rebote = new Timer(15, null);
                final int[] etapa = {0};
                rebote.addActionListener(ev -> {
                    if (etapa[0] < 10) {
                        if (etapa[0] < 5) {
                            escala[0] = 1.0f - 0.1f * etapa[0];
                        } else {
                            escala[0] = 0.5f + 0.1f * (etapa[0] - 5);
                        }
                        etapa[0]++;
                        boton.repaint();
                    } else {
                        escala[0] = 1f;
                        rebote.stop();
                        boton.repaint();
                    }
                });
                rebote.start();
            }
        });

        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 16));

        boton.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
        @Override
        public void paint(Graphics g, JComponent c) {
            JButton b = (JButton) c;
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int w = b.getWidth();
            int h = b.getHeight();

            int r = (int) (colorFin.getRed() + interpolador[0] * (colorFinHover.getRed() - colorFin.getRed()));
            int gVal = (int) (colorFin.getGreen() + interpolador[0] * (colorFinHover.getGreen() - colorFin.getGreen()));
            int bVal = (int) (colorFin.getBlue() + interpolador[0] * (colorFinHover.getBlue() - colorFin.getBlue()));
            Color colorAnimado = new Color(r, gVal, bVal);

            GradientPaint grad = new GradientPaint(0, 0, colorInicio, w, h, colorAnimado);
            g2.setPaint(grad);

            int escW = (int) (w * escala[0]);
            int escH = (int) (h * escala[0]);
            int x = (w - escW) / 2;
            int y = (h - escH) / 2;

            g2.fillRoundRect(x, y, escW, escH, radioBorde, radioBorde);
            g2.dispose();

            Graphics2D gText = (Graphics2D) g.create();
            gText.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            gText.scale(escala[0], escala[0]);
            int tx = (int) ((float) w / (2 * escala[0]) - (float) w / 2);
            int ty = (int) ((float) h / (2 * escala[0]) - (float) h / 2);
            gText.translate(tx, ty);
            super.paint(gText, c);
            gText.dispose();
        }
    });
}
}
