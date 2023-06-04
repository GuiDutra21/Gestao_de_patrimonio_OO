package view;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class Login {
	
	JFrame jf;
	JLabel welcome, companyName,companyAddress,country, state,street, city, number;
	JButton jb;
	
	public Login()
	{
		jf = new JFrame();
		
		jf.setLayout(new FlowLayout());
		
		jf.setSize(300, 200);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		welcome = new JLabel("SEJA BEM-VINDO !");
		companyName = new JLabel("Insira o nome da sua compania :");
		companyAddress = new JLabel("Insira o endereco da sua compania:");
		
	}
	
}
