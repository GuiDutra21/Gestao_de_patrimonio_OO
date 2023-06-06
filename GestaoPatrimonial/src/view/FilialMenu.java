package view;

import javax.swing.*;
import java.awt.*;

public class FilialMenu extends JFrame{
	
	private int squartsQtd;
	
	public FilialMenu(int squartsQtd){
		super();
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(100,150,255));
		
		//To put in full Screen when we run the application 
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.squartsQtd = squartsQtd;
		setVisible(true);
		
		JPanel painel = new JPanel();
		painel.setLayout(null);
		
		int tamanho = 100;
		
		 for (int i = 0; i < squartsQtd; i++) {
	            JPanel quadrado = new JPanel();
	            quadrado.setBounds(50 + (i * 110), 50, tamanho, tamanho); // Define a posição e tamanho do quadrado manualmente
	            quadrado.setBackground(Color.green);
	            painel.add(quadrado);
	        }
		JLabel j = new JLabel("olaaaaaa");
		j.setBounds(50, 30, 50, 50);
		painel.add(j);
		add(painel);
	}
	
	
	
	
}
