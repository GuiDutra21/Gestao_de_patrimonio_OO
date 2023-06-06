package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MeuFrame extends JFrame {
    
    public MeuFrame() {
        super("Quadrado em cima do JFrame");
        setSize(400, 400); // Defina o tamanho do JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Defina o comportamento de fechar
        setVisible(true); // Torne o JFrame visível
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED); // Defina a cor do quadrado
        g.fillRect(100, 100, 200, 200); // Desenhe o quadrado nas coordenadas (100, 100) com largura 200 e altura 200
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MeuFrame();
        });
    }
}
