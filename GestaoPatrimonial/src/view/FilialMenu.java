package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class FilialMenu extends JFrame implements ActionListener {
	
	private int filialsQtd;
	private double filialValue;
	private List<JLabel> labels;
	private List<JButton> buttons;
	private List<JPanel> panels;
	
	
	public FilialMenu(int filialsQtd){
		super();
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(100,150,255));
		
		//To put in full Screen when we run the application 
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		
		buttons = new ArrayList<JButton>();
		labels = new ArrayList<JLabel>();
		panels = new ArrayList<JPanel>();
		
		panels.add( new JPanel());
		//painel.setLayout(new GridLayout(filialsQtd,1));
		panels.get(0).setLayout(null);
		panels.get(0).setBackground(new Color(100, 150, 255));
		
		this.filialsQtd = filialsQtd;
		
		JScrollPane scrollPane = new JScrollPane(panels.get(0));
		
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(scrollPane);

		int tamanho = 100;
		//the JLabel 'Filial' 
		labels.add(new JLabel("Filial :"));
		labels.get(0).setBounds(550, 20, 150, 30);
		labels.get(0).setFont(new Font("Times New Roman", Font.BOLD, 30));
		panels.get(0).add(labels.get(0));
		
		
		//the name of the filial JLabel
		labels.add(new JLabel("Nome da Filial"));
		labels.get(1).setBounds(680, 23,labels.get(1).getText().length()*11,30);
		labels.get(1).setFont(new Font("Times New Roman", Font.BOLD, 20));
		panels.get(0).add(labels.get(1));
		
		//The JPanel that has the name of the Filial
		panels.add(new JPanel());
		panels.get(1).setBounds(680, 23, labels.get(1).getText().length()*12, 30);
		panels.get(0).add(panels.get(1));
		
		buttons.add( new JButton("Editar"));
		buttons.get(0).setBounds(680 + labels.get(1).getText().length()*12 + 100, 23, 150, 30);
		panels.get(0).add(buttons.get(0));
		
		buttons.get(0).addActionListener(this);
		
		//the JLabel 'Endereço'
		labels.add(new JLabel("Endereço :"));
		labels.get(2).setBounds(250, 100, 200,30);
		labels.get(2).setFont(new Font("Times New Roman", Font.BOLD, 25));
		panels.get(0).add(labels.get(2));
		
		//the JLabel 'Endereço'
		labels.add(new JLabel("o toString do endereço aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
		labels.get(3).setBounds(410, 100, labels.get(3).getText().length()*15,30);
		labels.get(3).setFont(new Font("Times New Roman", Font.BOLD, 22));
		panels.get(0).add(labels.get(3));
		
		//The JPanel that has the endereço
		panels.add(new JPanel());
		panels.get(2).setBounds(410, 100, labels.get(3).getText().length()*11, 30);
		panels.get(0).add(panels.get(2));
		
		buttons.add( new JButton("Editar"));
		buttons.get(1).setBounds(410 + labels.get(3).getText().length()*12 + 50, 100, 150, 30);
		panels.get(0).add(buttons.get(1));
		
		buttons.get(0).addActionListener(this);
		
				
		labels.add( new JLabel("<html><u>Patrimôios Cadastrtados :</u></html>"));
		labels.get(4).setBounds(640, 200, 350, 50);
		labels.get(4).setFont(new Font("Times New Roman", Font.BOLD, 22));
		panels.get(0).add(labels.get(4));
		
		int VerticalSize = 500;
		
		for (int i = 0; i < filialsQtd; i++) {
			JPanel quadrado = new JPanel();
			quadrado.setBounds(350 , 300 + (i * 110), 800, 110); // Define a posição e tamanho do quadrado manualmente
			quadrado.setBackground(new Color(10, 255, 100));
			panels.get(0).add(quadrado);
		}
		
		panels.add(new JPanel());
		panels.get(3).setBounds(250, 250, 1000,VerticalSize);
		panels.get(3).setBackground(new Color(211, 211, 211));
		panels.get(0).add(panels.get(3));
		
		
		add(panels.get(0));
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

