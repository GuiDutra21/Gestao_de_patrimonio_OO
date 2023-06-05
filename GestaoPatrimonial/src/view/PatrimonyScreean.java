package view;

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
	private JButton button1;
	private JTextField textField1;
	public static enum Tipo{VEHICLE, BUILDINGS};
	
		
	public PatrimonyScreean(Tipo tipo) {
		/////////////////////////////////////////////////////////
		
		frame = new JFrame();
		frame.setLayout(null);
		JLabel label1 = new JLabel("Cadastre os dados do Patrimonio:");
		label1.setFont(new Font("Times New Roman", Font.BOLD,25));
		label1.setBounds(620,30,380,20);
		
		//////////////////////////////////////////////////////
		
		JLabel label2 = new JLabel("Nome do patrimonio:");
		label2.setFont(new Font("Times New Roman", Font.BOLD,19));
		label2.setBounds(350,120,380,20);
		
		textField1 = new JTextField();
		textField1.setBounds(615,120,350,20);
		
		/////////////////////////////////////////////////////////
		
		JLabel label3 = new JLabel("Valor unitario:");
		label3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		label3.setBounds(350, 180, 380, 20);
		
		JTextField textField2 = new JTextField();
		textField2.setBounds(615,180,350,20);
		
		///////////////////////////////////////////////////
		
		JLabel label4 = new JLabel("Quantidade:");
		label4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		label4.setBounds(350, 240, 380, 20);
		
		JTextField textField3 = new JTextField();
		textField3.setBounds(615,240,350,20);
		
		////////////////////////////////////////////////////
		
		if(tipo == Tipo.VEHICLE) {
			JLabel label5 = new JLabel("Marca do Carro:");
			label5.setFont(new Font("Times New Roman", Font.BOLD, 19));
			label5.setBounds(350, 300, 380, 20);
			
			JTextField textField4 = new JTextField();
			textField4.setBounds(615,300,350,20);
			
			frame.add(label5);
			frame.add(textField4);
			
			JLabel label6 = new JLabel("Modelo do Carro:");
			label6.setFont(new Font("Times New Roman", Font.BOLD, 19));
			label6.setBounds(350, 360, 380, 20);
			
			JTextField textField5 = new JTextField();
			textField5.setBounds(615,360,350,20);
			
			frame.add(label6);
			frame.add(textField5);
			
			JLabel label7 = new JLabel("Ano de produção:");
			label7.setFont(new Font("Times New Roman", Font.BOLD, 19));
			label7.setBounds(350, 420, 380, 20);
			
			JTextField textField6 = new JTextField();
			textField6.setBounds(615,420,350,20);
			
			frame.add(label7);
			frame.add(textField6);
			
		}else if(tipo == Tipo.BUILDINGS) {
			JLabel label5 = new JLabel("Quantidade de andares:");
			label5.setFont(new Font("Times New Roman", Font.BOLD, 19));
			label5.setBounds(350, 300, 380, 20);
			
			JTextField textField4 = new JTextField();
			textField4.setBounds(615,300,350,20);
			
			frame.add(label5);
			frame.add(textField4);
			
			JLabel label6 = new JLabel("Area:");
			label6.setFont(new Font("Times New Roman", Font.BOLD, 19));
			label6.setBounds(350, 360, 380, 20);
			
			JTextField textField5 = new JTextField();
			textField5.setBounds(615,360,350,20);
			
			frame.add(label6);
			frame.add(textField5);
		}
		
		///////////////////////////////////////////////////
		textField1.addActionListener(this);
		
		
		///////////ADD components in Frame
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);

		frame.add(textField1);
		frame.add(textField2);
		frame.add(textField3);
		
		
		
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
