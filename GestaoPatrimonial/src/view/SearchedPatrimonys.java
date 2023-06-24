package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import mainPackage.Patrimony;
import mainPackage.Buildings;
import mainPackage.Vehicle;


public class SearchedPatrimonys implements ActionListener {
	
	private JFrame jf;
	private List<JPanel> panels;
	private List<JLabel> labels;
	private JScrollPane scroll;

	
	//constructor 
	SearchedPatrimonys(List<Patrimony> patrimonys, List<String> filialsName, String searchedName){
		
		//Create the Frame
		jf = new JFrame();
		
		//The Layout null permitted us to choose the position of the elements  
		jf.setLayout(null);
		
		//Design the Size of the Frame
		jf.setSize(300, 200);
		
		//Method that stop the Frame when we close it 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//To put in full Screen when we run the application 
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//Create the panels
		panels = new ArrayList<>();
		
		//Add the main Panel
		panels.add(new JPanel());
		panels.get(0).setLayout(null);
		panels.get(0).setBackground(new Color(100, 145, 255));
		
		
		labels = new ArrayList<>();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
		
        //String h = String.format("%d",screenWidth);=>1536
        Font font = new Font("Time News Roman",Font.BOLD, 30);
        
		labels.add(new JLabel("Patrimônio(s) encontrado(s) dado o seguinte nome :"));
		labels.get(0).setBounds(screenWidth/2 - labels.get(0).getText().length()*7,10,1200, 50);
		labels.get(0).setFont(new Font("Time News Roman",Font.BOLD, 30));
		panels.get(0).add(labels.get(0));
		
	
		labels.add(new JLabel(searchedName));
		labels.get(1).setFont(new Font("Time News Roman",Font.BOLD, 30));
		FontMetrics font1 = labels.get(1).getFontMetrics(font);
		int characterWidth = font1.stringWidth(searchedName);
		//System.out.print(characterWidth);
		labels.get(1).setBounds(screenWidth/2 - characterWidth /2,80, 800, 50);
		//labels.get(1).setOpaque(true);
		//labels.get(1).backgroundColor()
		panels.get(0).add(labels.get(1));
		
		
		panels.add(new JPanel());
		panels.get(1).setBounds(screenWidth/2, 90,1,100);
		panels.get(0).add(panels.get(1));
		
		
		
		//Create the Scroll
		scroll = new JScrollPane(panels.get(0));
		jf.setContentPane(scroll);//add the ScrollPanel into the JFrame
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//set the position of the  ScrollPanels
		
		
		
		
		
		
		jf.setVisible(true);
	}
	
	
	public static void main(String[] a ) {
		List<Patrimony> b = new ArrayList<>();
		for(int i = 0; i < 10; i++)
		{	
			if(i%2 == 0)
			{
			String v = String.format("casa %d",i);
			b.add(new Buildings(v,15,4000.5,3, 1500.00));
			}else {
			String s = String.format("Carro %d",i);
			b.add(new Vehicle(s,15, 20000,"Ferrari 480 Pista","Ferrari",2022));
			}
		}
		List<String> filialsName = new ArrayList<>();
		for(int i = 0; i < 10; i++)
		{	
			String v = String.format("patrimonio: %d",i);
			filialsName.add(v);
		}
		
		SearchedPatrimonys g = new SearchedPatrimonys(b,filialsName,"12 12");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}
