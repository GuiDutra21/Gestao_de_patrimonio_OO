package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class InsertAddress implements ActionListener {
	
	public List<JLabel> labels;
	public List<JTextField> textFields;
	private JPanel panel;
	private JButton button;
	private JFrame jf;	
	private Font font;
	
	public InsertAddress()
	{
		jf = new JFrame();
		
		//Create the Frame
		jf = new JFrame();
		
		//The Layout null permitted us to choose the position of the elements  
		jf.setLayout(null);
		
		jf.getContentPane().setBackground(new Color(100, 145, 255));
		
		//Method that stop the Frame when we close it 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//To put in full Screen when we run the application 
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Font font = new Font("Time News Roman", Font.BOLD, 30);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		labels = new ArrayList<JLabel>();
		labels.add(new JLabel("Insira o novo Endereço"));		
		labels.get(0).setFont(new Font("Time News Roman", Font.BOLD, 30));
        FontMetrics font1 = labels.get(0).getFontMetrics(font);
        int labelWidth = font1.stringWidth("Insira o novo Endereço");
        labels.get(0).setOpaque(true);
        labels.get(0).setBackground(new Color(220, 220, 220));
        labels.get(0).setBounds(screenWidth/2 - labelWidth/2, 35, labelWidth + 10,40 );
        jf.add(labels.get(0));
		
        panel = new JPanel();
        panel.setBackground(new Color(220, 220, 220));
        panel.setBounds(screenWidth/2 - 250 , 200, 500, 400);
        
        textFields = new ArrayList<JTextField>();
        
        //Create the fifth label
  		labels.add( new JLabel("País :"));
  		labels.get(1).setBounds(550, 230,75, 30);//set the position
  		labels.get(1).setFont(new Font("Times New Roman",Font.BOLD,19));//set the Font
  		jf.add(labels.get(1));
  		
  		
  		//Create the TextField of "pais"
  		textFields.add(new JTextField());
  		textFields.get(0).setBounds(655,232,250,30);//set the position
  		jf.add(textFields.get(0));
  		
  		//Create the sixth label
  		labels.add(new JLabel("Estado : "));
  		labels.get(2).setBounds(550, 290, 75, 30);//set the position
  		labels.get(2).setFont(new Font("Times New Roman", Font.BOLD,19));//set the Font
  		jf.add(labels.get(2));
  		
  		//Create the TextField of "Estado"
  		textFields.add(new JTextField());
  		textFields.get(1).setBounds(655, 292, 250, 30);//set the position
  		jf.add(textFields.get(1));
  		
  		//Create the seventh label
  		labels.add( new JLabel("Cidade :"));
  		labels.get(3).setBounds(550, 350, 250, 30);//set the position
  		labels.get(3).setFont(new Font("Times New Roman", Font.BOLD,19));//set the Font
  		jf.add(labels.get(3));
  		
  		//Create the TextField of "Cidade"
  		textFields.add( new JTextField());
  		textFields.get(2).setBounds(655, 352, 250, 30);//set the position
  		jf.add(textFields.get(2));
  		
  		//Create the eighth label
  		labels.add( new JLabel("Rua : "));
  		labels.get(4).setBounds( 550, 410, 250, 30);//set the position
  		labels.get(4).setFont(new Font("Times New Roman", Font.BOLD, 19));//set the Font
  		jf.add(labels.get(4));
  		
  		///Create the TextField of "Rua"
  		textFields.add( new JTextField());
  		textFields.get(3).setBounds(655, 412, 250, 30);//set the position
  		jf.add(textFields.get(3));
  		
  		//Create the tenth label
  		labels.add( new JLabel("Número : "));
  		labels.get(5).setBounds(550, 470, 270, 30);//set the position
  		labels.get(5).setFont(new Font("Times New Roman",Font.BOLD, 19));//set the Font
  		jf.add(labels.get(5));
  		
  		//Create the TextField of "Numero"
  		textFields.add( new JTextField());
  		textFields.get(4).setBounds(655, 472, 250, 30);//set the position
  		jf.add(textFields.get(4));
  		
  		//Create the button
  		button = new JButton("CADASTRAR");
  		button.setFont(new Font("Time News Roman", Font.BOLD,16));
  		button.setBounds(700, 530, 150, 37);//set the position
  		button.setBackground(Color.green);
  		jf.add(button);
  		
  		jf.add(panel);
		jf.setVisible(true);
	}
	
	public static void main(String[] a)
	{
		InsertAddress c = new InsertAddress();
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

