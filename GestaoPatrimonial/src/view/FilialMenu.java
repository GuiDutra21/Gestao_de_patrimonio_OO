package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainPackage.Patrimony;
import mainPackage.Vehicle;
import mainPackage.Buildings;

import java.util.List;
import java.util.ArrayList;

public class FilialMenu implements ActionListener {
	
	private double filialValue;
	private List<JLabel> labels;
	private List<JButton> buttons;
	private List<JPanel> panels;
	private JFrame jf;
	
	

	public FilialMenu(int patrimonyQtd,List<Patrimony> patrimonys){
		super();
		
		panels = new ArrayList<JPanel>();
		buttons = new ArrayList<JButton>();
		labels = new ArrayList<JLabel>();
		ArrayList<Buildings> buildings = new ArrayList<>();
		ArrayList<Vehicle> vehicle = new ArrayList<>();
		
		JFrame jf = new JFrame();
		jf.setSize(1500,1500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//To put in full Screen when we run the application 
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		panels.add(new JPanel() {
			
			
			
//			@Override
//			protected void paintComponent(Graphics g) {
//				super.paintComponent(g);
//				if(patrimonyQtd != 0) {	// Desenha o retângulo cinza
//					g.setColor(new  Color(200, 200, 200));
//					g.fillRect(125, 330, 1250, 50 + (patrimonyQtd * 300));
//				}
//				
//				//g.setColor(new Color(0, 180, 0));
////				// Desenha alguns retângulos grandes
////				for (int i = 0; i < patrimonyQtd; i++) {
////					g.fillRect(200, 440 + (i * 300), 1100, 200);
////				}
////				lastSquare = 500 + patrimonyQtd * 300;
//			}
//				
//			@Override
//			public Dimension getPreferredSize() {
//			//Define o tamanho preferido do painel
//				return new Dimension(200, lastSquare);
//
//			}
		});			
		
		panels.get(0).setLayout(null);
		panels.get(0).setBackground(new Color(100, 145, 255));
		
		int x = jf.getWidth()/2;
		
		//the name of the filial JLabel
		labels.add(new JLabel("Loja da Havan"));
		labels.get(0).setBounds(x - (labels.get(0).getText().length()*4), 23,labels.get(0).getText().length()*20,30);
		labels.get(0).setFont(new Font("Times New Roman", Font.BOLD, 20));
		panels.get(0).add(labels.get(0));
		
		//the JLabel 'Filial' 
		labels.add(new JLabel("Filial :"));
		labels.get(1).setBounds(x - (labels.get(0).getText().length()*4) - 150, 20, 150, 30);
		labels.get(1).setFont(new Font("Times New Roman", Font.BOLD, 30));
		panels.get(0).add(labels.get(1));
	
		int paneSize = 0;
		
		if(labels.get(0).getText().length() <= 5)
		{
			paneSize = labels.get(0).getText().length()*12 - 3;
		}
		else if (labels.get(0).getText().length() <= 10)
		{
			paneSize = labels.get(0).getText().length()*11;
		}
		else if (labels.get(0).getText().length() <= 15)
		{
			paneSize = labels.get(0).getText().length()*11 - 5;
		}
		else
		{
			paneSize = labels.get(0).getText().length()*11 - 10;
		}
		
		
		//The JPanel that has the name of the Filial
		panels.add(new JPanel());
		panels.get(1).setBounds(x - (labels.get(0).getText().length()*4), 23, paneSize, 30);
		panels.get(1).setBackground(new Color(220, 220, 220));
		panels.get(0).add(panels.get(1));
		
		buttons.add( new JButton("Editar"));
		buttons.get(0).setBounds(1200, 23, 150, 30);
		panels.get(0).add(buttons.get(0));
		
		buttons.get(0).addActionListener(this);
		
		//the JLabel of 'Endereço'
		labels.add(new JLabel("Estados Unidos, texas, caipira, rua marinho, 22"));
		labels.get(2).setBounds(x - (labels.get(2).getText().length()*4), 100,labels.get(2).getText().length() * 20,30);
		labels.get(2).setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		//the JLabel 'Endereço'
		labels.add(new JLabel("Endereço :"));
		labels.get(3).setBounds(x - (labels.get(2).getText().length()*4) - 190, 100, 200,30);
		labels.get(3).setFont(new Font("Times New Roman", Font.BOLD, 25));
		panels.get(0).add(labels.get(3));

		
		panels.get(0).add(labels.get(2));
		
		int paneSize2 = 0;
		
		if(labels.get(2).getText().length() <= 5 && labels.get(2).getText().length() > 1)
		{
			paneSize2 = labels.get(2).getText().length()*12 - 3;
		}
		else if (labels.get(2).getText().length() <= 10)
		{
			paneSize2 = labels.get(2).getText().length()*11;
		}
		else if (labels.get(2).getText().length() <= 15)
		{
			paneSize2 = labels.get(2).getText().length()*11 - 5;
		}
		else if (labels.get(2).getText().length() <= 30)
		{
			paneSize2 = labels.get(2).getText().length()*11 - 9;
		}
		else
		{
			paneSize2 = labels.get(2).getText().length()*10 - 25;
		}
		
		//The JPanel that has the endereço
		panels.add(new JPanel());
		panels.get(2).setBounds(x - (labels.get(2).getText().length()*4), 100, paneSize2, 30);
		panels.get(2).setBackground(new Color(220, 220, 220));
		panels.get(0).add(panels.get(2));
		
		buttons.add( new JButton("Editar"));
		buttons.get(1).setBounds(1200, 100, 150, 30);
		panels.get(0).add(buttons.get(1));
		
		buttons.get(0).addActionListener(this);
		
		filialValue = 15000.500;
		//the JLabel of 'Patrimônio líquido'
		labels.add(new JLabel("R$ " + Double.toString(filialValue)));
		labels.get(4).setBounds(x - (labels.get(4).getText().length()*4), 170, labels.get(4).getText().length() * 20, 50);
		labels.get(4).setFont(new Font("Times New Roman", Font.BOLD, 22));
		panels.get(0).add(labels.get(4));
		
		//the JLabel 'Patrimônio líquido da Filial' 
		labels.add(new JLabel("Patrimônio líquido da Filial :"));
		labels.get(5).setBounds(x - (labels.get(4).getText().length()*4) - 400, 170, 350, 50);
		labels.get(5).setFont(new Font("Times New Roman", Font.BOLD, 22));
		panels.get(0).add(labels.get(5));
		
		
		
		int paneSize3 = 0;
		
		if(labels.get(4).getText().length() <= 5 && labels.get(4).getText().length() > 1)
		{
			paneSize3 = labels.get(4).getText().length()*12 - 3;
		}
		else if (labels.get(4).getText().length() <= 10)
		{
			paneSize3 = labels.get(4).getText().length()*11;
		}
		else if (labels.get(4).getText().length() <= 15)
		{
			paneSize3 = labels.get(4).getText().length()*11;
		}
		else if (labels.get(4).getText().length() <= 30)
		{
			paneSize3 = labels.get(4).getText().length()*12 - 10;
		}
		else
		{
			paneSize3 = labels.get(4).getText().length()*11 - 20;
		}
		
		//The JPanel that has the patrimono liquido
		panels.add(new JPanel());
		panels.get(3).setBounds(x - (labels.get(4).getText().length()*4), 180,paneSize3,30);
		panels.get(3).setBackground(new Color(220, 220, 220));
		panels.get(0).add(panels.get(3));
				
		labels.add( new JLabel("<html><u>Patrimônios Cadastrtados :</u></html>"));
		labels.get(6).setBounds(640, 250, 350, 50);
		labels.get(6).setFont(new Font("Times New Roman", Font.BOLD, 25));
		panels.get(0).add(labels.get(6));
		
		if(patrimonyQtd != 0)
		{
			buttons.add(new JButton("Adicionar Veículo"));
			buttons.get(2).setBounds(450, 375, 200, 30);
			panels.get(0).add(buttons.get(2));
			
			buttons.add(new JButton("Adicionar Propriedade"));
			buttons.get(3).setBounds(850, 375, 200, 30);
			panels.get(0).add(buttons.get(3));
			
			int squareHeight = 700;
			
			//create the gray square
			panels.add(new JPanel());
			panels.get(4).setBackground(new  Color(200, 200, 200));
			panels.get(4).setBounds(125, 330, 1250, 50 + (patrimonyQtd * squareHeight));
			
			int lastSquare = 0;
			int buildingsQtd = -1;
			int vehicleQtd = - 1;
			
			for (int i = 0; i < patrimonyQtd; i++) {
				
				int labelsQtd = labels.size();
			
				panels.add(new JPanel());
				
				if(patrimonys.get(i) instanceof Buildings)
				{	
					buildings.add((Buildings) patrimonys.get(i));
					buildingsQtd ++;
					
					panels.get(panels.size() - 1).setBounds(200, 440 + (i * squareHeight), 1100, 580);
					panels.get(panels.size() - 1).setBackground((new  Color(0, 180, 0)));

					
					labels.add(new JLabel("<html><u>Nome :</u></html>"));
					labels.get(labelsQtd).setBounds(500, 480 + (i * squareHeight), 200, 30);	
					labels.get(labelsQtd).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd));
					
					labels.add(new JLabel(buildings.get(buildingsQtd).getName()));
					labels.get(labelsQtd + 1).setBounds(720, 482 + (i * squareHeight), 400, 30);
					labels.get(labelsQtd + 1).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 1));
					
					labels.add(new JLabel("<html><u>Valor :</u></html>"));
					labels.get(labelsQtd + 2).setBounds(300, 600 + (i * squareHeight), 200, 30);
					labels.get(labelsQtd + 2).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 2));
					
					labels.add(new JLabel(String.valueOf(buildings.get(buildingsQtd).getValue())));
					labels.get(labelsQtd + 3).setBounds(500, 602 + (i * squareHeight), 400, 30);
					labels.get(labelsQtd + 3).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 3));
					
					labels.add(new JLabel("<html><u>Unidades :</u></html>"));
					labels.get(labelsQtd + 4).setBounds(850, 600 + (i * squareHeight), 200, 30);	
					labels.get(labelsQtd + 4).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 4));
					
					labels.add(new JLabel(String.valueOf(buildings.get(buildingsQtd).getAmount())));
					labels.get(labelsQtd + 5).setBounds(1050, 602 + (i * squareHeight), 400, 30);	
					labels.get(labelsQtd + 5).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 5));
					
					labels.add(new JLabel("<html><u>Quantidade de andares :</u></html>"));
					labels.get(labelsQtd + 6).setBounds(850, 660 + (i * squareHeight), 200, 100);
					labels.get(labelsQtd + 6).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 6));
					
					labels.add(new JLabel(String.valueOf(buildings.get(buildingsQtd).getFloorsQtd())));
					//labels.add(new JLabel("Nao informado"));
					labels.get(labelsQtd + 7).setBounds(1050, 695 + (i * squareHeight), 400, 30);	
					labels.get(labelsQtd + 7).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 7));
					
					labels.add(new JLabel("<html><u>Metros Quadrados :</u></html>"));
					labels.get(labelsQtd + 8).setBounds(300, 660 + (i * squareHeight), 200, 100);
					labels.get(labelsQtd + 8).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 8));
					
					labels.add(new JLabel(String.valueOf(buildings.get(buildingsQtd).getFloorsQtd())));
					labels.get(labelsQtd + 9).setBounds(500, 695 + (i * squareHeight), 400, 30);	
					labels.get(labelsQtd + 9).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 9));
					
					labels.add(new JLabel("<html><u>Endereço :</u></html>"));
					labels.get(labelsQtd + 10).setBounds(350, 815 + (i * squareHeight), 400, 30);
					labels.get(labelsQtd + 10).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 10));
					
					labels.add(new JLabel(String.valueOf(buildings.get(buildingsQtd).getAddress())));
					labels.get(labelsQtd + 11).setBounds(550, 817 + (i * squareHeight), 400, 30);	
					labels.get(labelsQtd + 11).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 11));				
					
					if(i == 0)
					{
						buttons.add(new JButton("Editar"));
						buttons.get(4).setBounds(450,930,200,30);
						panels.get(0).add(buttons.get(4 ));
						
						buttons.add(new JButton("Remover"));
						buttons.get(5).setBounds(850,930 ,200,30);
						panels.get(0).add(buttons.get(5));// nao ta aparecendo
					}
					else
					{	
						
						buttons.add(new JButton("Editar"));
						buttons.get(buttons.size() - 1).setBounds(450,930 + (i * 700),200,30);
						panels.get(0).add(buttons.get(buttons.size() - 1));
						
						buttons.add(new JButton("Remover"));
						buttons.get(buttons.size() - 1).setBounds(850,930 + (i * 700),200,30);
						panels.get(0).add(buttons.get(buttons.size() - 1));
					}			
				}
				else
				{	
					vehicle.add((Vehicle) patrimonys.get(i));
					vehicleQtd ++;
					
					panels.get(panels.size() - 1).setBounds(200, 440 + (i * squareHeight), 1100, 580);
					panels.get(panels.size() - 1).setBackground((new  Color(0, 180, 0)));					
						
					
					labels.add(new JLabel("<html><u>Nome :</u></html>"));
					labels.get(labelsQtd).setBounds(500, 480 + (i * squareHeight), 200, 30);	
					labels.get(labelsQtd).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd));
					
					labels.add(new JLabel(vehicle.get(vehicleQtd).getName()));
					labels.get(labelsQtd + 1).setBounds(720, 482 + (i * squareHeight), 400, 30);
					labels.get(labelsQtd + 1).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 1));
					
					labels.add(new JLabel("<html><u>Valor :</u></html>"));
					labels.get(labelsQtd + 2).setBounds(300, 600 + (i * squareHeight), 200, 30);
					labels.get(labelsQtd + 2).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 2));
					
					labels.add(new JLabel(String.valueOf(vehicle.get(vehicleQtd).getValue())));
					labels.get(labelsQtd + 3).setBounds(500, 602 + (i * squareHeight), 400, 30);
					labels.get(labelsQtd + 3).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 3));
					
					labels.add(new JLabel("<html><u>Unidades :</u></html>"));
					labels.get(labelsQtd + 4).setBounds(850, 600 + (i * squareHeight), 200, 30);	
					labels.get(labelsQtd + 4).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 4));
					
					labels.add(new JLabel(String.valueOf(vehicle.get(vehicleQtd).getAmount())));
					labels.get(labelsQtd + 5).setBounds(1050, 602 + (i * squareHeight), 400, 30);	
					labels.get(labelsQtd + 5).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 5));
					
					labels.add(new JLabel("<html><u>Modelo :</u></html>"));
					labels.get(labelsQtd + 6).setBounds(480, 690 + (i * squareHeight), 200, 30);	
					labels.get(labelsQtd + 6).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 6));
					
					//labels.add(new JLabel(String.valueOf(vehicle.get(vehicleQtd).getBrand())));
					labels.add(new JLabel("aaaaaaaaaaaaaaaaa"));
					labels.get(labelsQtd + 7).setBounds(680, 692 + (i * squareHeight), 400, 30);	
					labels.get(labelsQtd + 7).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 7));
					
					labels.add(new JLabel("<html><u>Marca :</u></html>"));
					labels.get(labelsQtd + 8).setBounds(300, 780 + (i * squareHeight), 200, 30);	
					labels.get(labelsQtd + 8).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 8));
					
					labels.add(new JLabel(String.valueOf(vehicle.get(vehicleQtd).getModel())));
					labels.get(labelsQtd + 9).setBounds(500, 782 + (i * squareHeight), 400, 30);	
					labels.get(labelsQtd + 9).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 9));
					
					labels.add(new JLabel("<html><u>Ano de Produção :</u></html>"));
					labels.get(labelsQtd + 10).setBounds(850, 750 + (i * squareHeight), 200, 80);	
					labels.get(labelsQtd + 10).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 10));
					
					labels.add(new JLabel(String.valueOf(vehicle.get(vehicleQtd).getModel())));
					labels.get(labelsQtd + 11).setBounds(1050, 765 + (i * squareHeight), 400, 30);	
					labels.get(labelsQtd + 11).setFont(new Font("Times New Roman", Font.BOLD, 30));
					panels.get(0).add(labels.get(labelsQtd + 11));
					
					if(i == 0)
					{
						buttons.add(new JButton("Editar"));
						buttons.get(4).setBounds(450,930,200,30);
						panels.get(0).add(buttons.get(4 ));
						
						buttons.add(new JButton("Remover"));
						buttons.get(5).setBounds(850,930 ,200,30);
						panels.get(0).add(buttons.get(5));// nao ta aparecendo
					}
					else
					{	
						
						buttons.add(new JButton("Editar"));
						buttons.get(buttons.size() - 1).setBounds(450,930 + (i * 700),200,30);
						panels.get(0).add(buttons.get(buttons.size() - 1));
						
						buttons.add(new JButton("Remover"));
						buttons.get(buttons.size() - 1).setBounds(850,930 + (i * 700),200,30);
						panels.get(0).add(buttons.get(buttons.size() - 1));
					}
				}
				
				panels.get(0).add(panels.get(panels.size() - 1));
			}
			
			panels.get(0).add(panels.get(4));//add the panel gray
		}
		
		panels.get(0).setPreferredSize(new Dimension(200, 450 + (patrimonyQtd * 700)));//allow to create the scroll
		
		JScrollPane scrollPane = new JScrollPane(panels.get(0));
		jf.setContentPane(scrollPane);	
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jf.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


