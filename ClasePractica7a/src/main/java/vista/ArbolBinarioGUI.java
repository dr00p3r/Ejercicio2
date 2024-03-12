package vista;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import modelo.ArbolBinario;
import modelo.Nodo;

/**
 *
 * @author
 */
public class ArbolBinarioGUI<V extends Comparable<V>> {
    private JFrame frame;
    private JPanel panel;

    public ArbolBinarioGUI(ArbolBinario<V> arbol) {
        frame = new JFrame("Árbol Binario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                dibujarArbol(g, arbol.getRaiz(), getWidth() / 2, 30, getWidth() / 4);
            }
        };

        frame.add(panel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    private void dibujarArbol(Graphics g, Nodo<V> nodo, int x, int y, int espacio) {
        if (nodo != null) {
            g.setColor(Color.WHITE);
            g.fillOval(x, y, 30, 30);
            g.setColor(Color.BLACK);
            g.drawString(String.valueOf(nodo.getValor()), x + 10, y + 20);

            if (nodo.getHijoIzq() != null) {
                g.drawLine(x + 15, y + 30, x - espacio + 15, y + 100);
                dibujarArbol(g, nodo.getHijoIzq(), x - espacio, y + 100, espacio / 2);
            }

            if (nodo.getHijoDer() != null) {
                g.drawLine(x + 15, y + 30, x + espacio + 15, y + 100);
                dibujarArbol(g, nodo.getHijoDer(), x + espacio, y + 100, espacio / 2);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
