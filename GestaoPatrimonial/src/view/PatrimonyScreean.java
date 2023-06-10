package view;

import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PatrimonyScreean implements ActionListener{
	private JFrame frame;
	private List<JButton> buttons;
	private List<JLabel> labels;
	private List<JTextField> textFields;
	public static enum Tipo{VEHICLE, BUILDINGS};
	
	
	public PatrimonyScreean(Tipo tipo) {
		/////////////////////////////////////////////////////////
		
		textFields = new ArrayList<JTextField>();
		labels = new ArrayList<JLabel>();
		buttons = new ArrayList<JButton>();
		
		frame = new JFrame();
		frame.setLayout(null);
		
		labels.add( new JLabel("Cadastre os dados do Patrimônio:"));
		labels.get(0).setFont(new Font("Times New Roman", Font.BOLD,25));
		labels.get(0).setBounds(620,30,380,20);
		
		//////////////////////////////////////////////////////
		
		labels.add(new JLabel("Nome do patrimonio:"));
		labels.get(1).setFont(new Font("Times New Roman", Font.BOLD,19));
		labels.get(1).setBounds(350,120,380,30);
		
		textFields.add(new JTextField());
		textFields.get(0).setBounds(615,120,350,30);
		
		/////////////////////////////////////////////////////////
		
		labels.add(new JLabel("Valor unitario:"));
		labels.get(2).setFont(new Font("Times New Roman", Font.BOLD, 19));
		labels.get(2).setBounds(350, 180, 380, 30);
		
		textFields.add(new JTextField());
		textFields.get(1).setBounds(615,180,350,30);
		
		///////////////////////////////////////////////////
		
		labels.add(new JLabel("Quantidade:"));
		labels.get(3).setFont(new Font("Times New Roman", Font.BOLD, 19));
		labels.get(3).setBounds(350, 240, 380, 30);
		
		textFields.add(new JTextField());
		textFields.get(2).setBounds(615,240,350,30);
		
		////////////////////////////////////////////////////
		
		if(tipo == Tipo.VEHICLE) {
			labels.add(new JLabel("Marca do Carro:"));
			labels.get(4).setFont(new Font("Times New Roman", Font.BOLD, 19));
			labels.get(4).setBounds(350, 300, 300, 30);
			
			textFields.add(new JTextField());
			textFields.get(3).setBounds(615,300,350,30);
			
			
			labels.add(new JLabel("Modelo do Carro:"));
			labels.get(5).setFont(new Font("Times New Roman", Font.BOLD, 19));
			labels.get(5).setBounds(350, 360, 300, 30);
			
			textFields.add(new JTextField());
			textFields.get(4).setBounds(615,360,350,30);
			
			labels.add(new JLabel("Ano de produção:"));
			labels.get(6).setFont(new Font("Times New Roman", Font.BOLD, 19));
			labels.get(6).setBounds(350, 420, 300, 30);
			
			textFields.add(new JTextField());
			textFields.get(5).setBounds(615,420,350,30);
			
			buttons.add(new JButton("Cadastrar"));
			buttons.get(0).setBounds(740, 500, 100, 30);
			buttons.get(0).setBackground(Color.green);
			
			
			frame.add(labels.get(4));
			frame.add(labels.get(5));
			frame.add(labels.get(6));
			
			
			frame.add(textFields.get(3));
			frame.add(textFields.get(4));			
			frame.add(textFields.get(5));
			
			frame.add(buttons.get(0));
			
			textFields.get(3).addActionListener(this);
			textFields.get(4).addActionListener(this);
			textFields.get(5).addActionListener(this);
			
			buttons.get(0).addActionListener(this);
			
		}else if(tipo == Tipo.BUILDINGS) {
			labels.add(new JLabel("Quantidade de andares:"));
			labels.get(4).setFont(new Font("Times New Roman", Font.BOLD, 19));
			labels.get(4).setBounds(350, 300, 300, 30);
			
			textFields.add(new JTextField());
			textFields.get(3).setBounds(615,300,350,30);
			
			
			labels.add(new JLabel("Area:"));
			labels.get(5).setFont(new Font("Times New Roman", Font.BOLD, 19));
			labels.get(5).setBounds(350, 360, 100, 30);
			
			textFields.add(new JTextField());
			textFields.get(4).setBounds(615, 360, 350, 30);
			
			labels.add(new JLabel("Cadastre o endereço dessa propriedade :"));
			labels.get(6).setBounds(620, 450, 350, 30);
			labels.get(6).setFont(new Font("Times New Roman",Font.BOLD,20));
			
			labels.add(new JLabel("País :"));
			labels.get(7).setBounds(450, 520, 100, 30);
			labels.get(7).setFont(new Font("Times New Roman",Font.BOLD, 19));
			
			textFields.add(new JTextField());
			textFields.get(5).setBounds(615, 520, 350, 30);
			
			labels.add(new JLabel("Estado :"));
			labels.get(8).setBounds(450, 565, 100, 30);//set the position
			labels.get(8).setFont(new Font("Times New Roman", Font.BOLD,19));//set the Font
			
			//Create the TextField of "Estado"
			textFields.add(new JTextField());
			textFields.get(6).setBounds(615, 565, 350, 30);//set the position
			
			//Create a label
			labels.add( new JLabel("Cidade :"));
			labels.get(9).setBounds(450, 610, 250, 30);//set the position
			labels.get(9).setFont(new Font("Times New Roman", Font.BOLD,19));//set the Font
			
			//Create the TextField of "Cidade"
			textFields.add(new JTextField());
			textFields.get(7).setBounds(615, 610, 350, 30);//set the position
			
			//Create a label
			labels.add(new JLabel("Rua :"));
			labels.get(10).setBounds(450, 655, 250, 30);//set the position
			labels.get(10).setFont(new Font("Times New Roman", Font.BOLD, 19));//set the Font
			
			///Create the TextField of "Rua"
			textFields.add(new JTextField());
			textFields.get(8).setBounds(615, 655, 350, 30);//set the position
			
			//Create the tenth label
			labels.add( new JLabel("Número :"));
			labels.get(11).setBounds(450, 705, 260, 30);//set the position
			labels.get(11).setFont(new Font("Times New Roman",Font.BOLD, 19));//set the Font
			
			//Create the TextField of "Numero"
			textFields.add(new JTextField());
			textFields.get(9).setBounds(615, 705, 350, 30);//set the position
			
			buttons.add(new JButton("CADASTRAR"));
			buttons.get(0).setBounds(680, 770, 200, 30);
			buttons.get(0).setBackground(Color.green);
			
			frame.add(labels.get(4));
			frame.add(labels.get(5));
			frame.add(labels.get(6));
			frame.add(labels.get(7));
			frame.add(labels.get(8));
			frame.add(labels.get(9));
			frame.add(labels.get(10));
			frame.add(labels.get(11));
			
			frame.add(textFields.get(3));
			frame.add(textFields.get(4));
			frame.add(textFields.get(5));
			frame.add(textFields.get(6));
			frame.add(textFields.get(7));
			frame.add(textFields.get(8));
			frame.add(textFields.get(9));
			
			frame.add(buttons.get(0));
			
			textFields.get(3).addActionListener(this);
			textFields.get(4).addActionListener(this);
			textFields.get(5).addActionListener(this);
			textFields.get(6).addActionListener(this);
			textFields.get(7).addActionListener(this);
			textFields.get(8).addActionListener(this);
			textFields.get(9).addActionListener(this);
			
			buttons.get(0).addActionListener(this);
			
		}
		
		///////////ADD components in Frame
		
		frame.add(labels.get(0));
		frame.add(labels.get(1));
		frame.add(labels.get(2));
		frame.add(labels.get(3));

		
		frame.add(textFields.get(0));
		frame.add(textFields.get(1));
		frame.add(textFields.get(2));
		
		
		textFields.get(0).addActionListener(this);
		textFields.get(1).addActionListener(this);
		textFields.get(2).addActionListener(this);
		
		
		
		
		
		//////////////////////////////////////////////////////////////////
		frame.getContentPane().setBackground(new Color(100,150,255));
		frame.setSize(500,500 );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		frame.setVisible(true);
		//////////////////////////////////////////////////////////////////
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
