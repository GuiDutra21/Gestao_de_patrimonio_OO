package view;

import java.util.List;
import java.util.ArrayList;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class FilialMenu2 extends JFrame {
	
	private List<JLabel> labels;
	private List<JTextField>textFields;
	
	
	private int squartsQtd;
	
	public FilialMenu2(int squartsQtd)
	{
		super("teste");
		setSize(500,500);
		//setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(100,150,255));
		
		//To put in full Screen when we run the application 
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		labels = new ArrayList<JLabel>();
		textFields = new ArrayList<JTextField>();
		
		labels.add(new JLabel("Filial :"));
		labels.get(0).setBounds(300, 10, 350, 30);
		labels.get(0).setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		
		//jf.add(labels.get(0));
		this.squartsQtd = squartsQtd;
		
		// Crie um painel para conter os componentes
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(labels.get(0));
        //painel.setBackground(new Color(100,150,255));
        
     // Adicione muitos componentes ao painel
        for (int i = 1; i <= 200; i++) {
            JLabel label = new JLabel("Componente " + i);
            painel.add(label);
        }
		
		// Crie um JScrollPane e adicione o painel a ele
        JScrollPane scrollPane = new JScrollPane(painel);
        
     // Defina as configurações da barra de rolagem
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
     // Adicione o JScrollPane ao JFrame
        add(scrollPane);
		
		setVisible(true);
	}

		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.RED);
			
			int tamanho = 50;
			int espacamento = 10;
			
			int startx = 100;
			int starty = 100;
			
			for(int i = 0; i < squartsQtd; i++)
			{
				int y = starty + (i * (tamanho + espacamento));
				int x = startx;
				g.fillRect(x, y, tamanho, tamanho);
			}
	}
}
