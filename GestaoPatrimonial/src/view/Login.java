package view;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.awt.Font;

public class Login implements ActionListener{
	
	JFrame jf;
	JLabel welcome, message, companyName, companyAddress, country, state, street, city, number;
	JTextField companyNameJTF, countryJTF, stateJTF, streetJTF, cityJTF, numberJTF;
	JButton ready;
	
	public Login()
	{
		jf = new JFrame();
		
		//The Layout null permitted us to choose the position of the elements  
		jf.setLayout(null);
		
		//Design the Size of the Frame
		jf.setSize(300, 200);
		
		//Method that stop the Frame when we close it 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set the color of Background 
		jf.getContentPane().setBackground(new Color(100,150,255));
		
		//To put in full Screen when we run the application 
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//create the fist Label
		welcome = new JLabel("SEJA BEM-VINDO !");
		welcome.setBounds(655,30,230,20);//Set the position
		welcome.setFont(new Font("Times New Roman",Font.BOLD,25));//set the Font
		welcome.setBackground(Color.green);//set the color
		welcome.setOpaque(true);//method that permited to show the color
		
		//Create the second label
		message = new JLabel("<html><u>Cadastre a sua compania</u></html>");//Tag in HTML to put the text in underline 
		message.setBounds(660, 140, 250, 40);//set the position
		message.setFont(new Font("Times New Roman",Font.BOLD,20));//set the Font
		
		//Create the third label
		companyName = new JLabel("Insira o nome da sua compania : ");
		companyName.setBounds(635, 250, 270, 40);//set the position
		companyName.setFont(new Font("Times New Roman",Font.BOLD,19));//set the Font
		
		//Create the TextField of "Insira o nome da sua compania"
		companyNameJTF = new JTextField();
		companyNameJTF.setBounds(643, 300, 250, 30);
		
		//Create the fourth label
		companyAddress = new JLabel("<html><u>Insira o endereço da sua compania</u></html>");
		companyAddress.setFont(new Font("Times New Roman",Font.BOLD,20));//set the Font
		companyAddress.setBounds(620, 400, 350, 30);//set the position
		
		//Create the fifth label
		country = new JLabel("País :");
		country.setBounds(550, 500,75, 30);//set the position
		country.setFont(new Font("Times New Roman",Font.BOLD,19));//set the Font
		
		//Create the TextField of "pais"
		countryJTF = new JTextField();
		countryJTF.setBounds(643,500,250,30);//set the position
		
		//Create the sixth label
		state = new JLabel("Estado : ");
		state.setBounds(550, 545, 75, 30);//set the position
		state.setFont(new Font("Times New Roman", Font.BOLD,19));//set the Font
		
		//Create the TextField of "Estado"
		stateJTF = new JTextField();
		stateJTF.setBounds(643, 545, 250, 30);//set the position
		
		//Create the seventh label
		city = new JLabel("Cidade :");
		city.setBounds(550, 590, 250, 30);//set the position
		city.setFont(new Font("Times New Roman", Font.BOLD,19));//set the Font
		
		//Create the TextField of "Cidade"
		cityJTF = new JTextField();
		cityJTF.setBounds(643, 590, 250, 30);//set the position
		
		//Create the eighth label
		street = new JLabel("Rua : ");
		street.setBounds( 550, 635, 250, 30);//set the position
		street.setFont(new Font("Times New Roman", Font.BOLD, 19));//set the Font
		
		///Create the TextField of "Rua"
		streetJTF = new JTextField();
		streetJTF.setBounds(643, 635, 250, 30);//set the position
		
		//Create the tenth label
		number = new JLabel("Número : ");
		number.setBounds(550, 680, 260, 30);//set the position
		number.setFont(new Font("Times New Roman",Font.BOLD, 19));//set the Font
		
		//Create the TextField of "Numero"
		numberJTF = new JTextField();
		numberJTF.setBounds(643, 680, 250, 30);//set the position
		
		//Create the button
		ready = new JButton("CADASTRAR");
		ready.setBounds(700, 750, 120, 30);//set the position
		ready.setBackground(Color.green);
		
		//methods that add events 
		companyNameJTF.addActionListener(this);
		countryJTF.addActionListener(this);
		stateJTF.addActionListener(this);
		cityJTF.addActionListener(this);
		streetJTF.addActionListener(this);
		numberJTF.addActionListener(this);
		
		//add all Labels to the Frame
		jf.add(welcome);
		jf.add(message);		
		jf.add(companyName);
		jf.add(companyAddress);
		jf.add(country);
		jf.add(state);
		jf.add(city);
		jf.add(street);
		jf.add(number);
		jf.add(ready);
		
		//add all TextField to the Frame
		jf.add(companyNameJTF);
		jf.add(countryJTF);
		jf.add(stateJTF);
		jf.add(cityJTF);
		jf.add(streetJTF);
		jf.add(numberJTF);
		
		//set the Frame visible
		jf.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
