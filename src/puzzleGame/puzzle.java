package puzzleGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class puzzle extends JFrame implements ActionListener {
	//declaration
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, next;
	
	
	//constructor
	puzzle(){
		super("puzzle game");
		
		//create buttons
		 b1=new JButton("1");
		 b2=new JButton(" ");
		 b3=new JButton("3");
		 b4=new JButton("4");
		 b5=new JButton("5");
		 b6=new JButton("6");
		 b7=new JButton("7");
		 b8=new JButton("8");
		 b9=new JButton("2");
		 next=new JButton("next");
		 
		 //set dimensions
		 b1.setBounds(10,30,50,40);
		 b2.setBounds(70,30,50,40);
		 b3.setBounds(130,30,50,40);
		 b4.setBounds(10,80,50,40);
		 b5.setBounds(70,80,50,40);
		 b6.setBounds(130,80,50,40);
		 b7.setBounds(10,130,50,40);
		 b8.setBounds(70,130,50,40);
		 b9.setBounds(130,130,50,40);
		 next.setBounds(70,200,100,40);
		 
		 //add buttons
		 add(b1);
		 add(b2);
		 add(b3);
		 add(b4);
		 add(b5);
		 add(b6);
		 add(b7);
		 add(b8);
		 add(b9);
		 add(next);
		 
		//add action listener
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
		 b5.addActionListener(this);
		 b6.addActionListener(this);
		 b7.addActionListener(this);
		 b8.addActionListener(this);
		 b9.addActionListener(this);
		 next.addActionListener(this);
		 
		 //set color
		 next.setBackground(Color.black);
		 next.setForeground(Color.green);
		 
		 //set size and layout
		 setSize(250,300);
		 setLayout(null);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	//actionlistner
	public void actionPerformed(ActionEvent e) {
		//initialize when "next" is pressed
		if(e.getSource()==next) {
			String s=b4.getLabel();
			b4.setLabel(b9.getLabel());
			b9.setLabel(s);
			
			s=b1.getLabel();
			b1.setLabel(b5.getLabel());
			b5.setLabel(s);
			
			s=b2.getLabel();
			b2.setLabel(b7.getLabel());
			b7.setLabel(s);
			
		}
		
		//if b1 is pressed
		if(e.getSource()==b1) {
			String s=b1.getLabel();
			
			if(b2.getLabel().equals(" ")) {
				b2.setLabel(s);
				b1.setLabel(" ");
			}
			
			else if(b4.getLabel().equals(" ")) {
				b4.setLabel(s);
				b1.setLabel(" ");
			}
		}
		
		//b2
		if(e.getSource()==b2) {
			String s=b2.getLabel();
			
			if(b1.getLabel().equals(" ")) {
				b1.setLabel(s);
				b2.setLabel(" ");
			}
			else if(b3.getLabel().equals(" ")) {
				b3.setLabel(s);
				b2.setLabel(" ");
			}
			else if(b5.getLabel().equals(" ")) {
				b5.setLabel(s);
				b2.setLabel(" ");
			}
		}
		
		//b3
		if(e.getSource()==b3){
			String s=b3.getLabel();
			
			if(b2.getLabel().equals(" ")){ 
				b2.setLabel(s); b3.setLabel(" ");
			}
			else if(b6.getLabel().equals(" ")){ 
				b6.setLabel(s); b3.setLabel(" ");
			}
		}
		
		//b4
		if(e.getSource()==b4){
			String s=b4.getLabel();
			
			if(b1.getLabel().equals(" ")){ 
				b1.setLabel(s); b4.setLabel(" ");
			}
			else if(b7.getLabel().equals(" ")){ 
				b7.setLabel(s); b4.setLabel(" ");
			}
			else if(b5.getLabel().equals(" ")){ 
				b5.setLabel(s); b4.setLabel(" ");
			}
		}
		
		//b5
		if(e.getSource()==b5){
			String s=b5.getLabel();
			
			if(b2.getLabel().equals(" ")){ 
				b2.setLabel(s); b5.setLabel(" ");
			}
			else if(b4.getLabel().equals(" ")){ 
				b4.setLabel(s); b5.setLabel(" ");
			}
			else if(b6.getLabel().equals(" ")){ 
				b6.setLabel(s); b5.setLabel(" ");
			}
			else if(b8.getLabel().equals(" ")){
				b8.setLabel(s); b5.setLabel(" ");
			}
		}
		
		//b6
		if(e.getSource()==b6){
			String s=b6.getLabel();
			
			if(b9.getLabel().equals(" ")){ 
				b9.setLabel(s); b6.setLabel(" ");
			}
			else if(b3.getLabel().equals(" ")){ 
				b3.setLabel(s); b6.setLabel(" ");
			}
			else if(b5.getLabel().equals(" ")){ 
				b5.setLabel(s); b6.setLabel(" ");
			}
		}
		
		//b7
		if(e.getSource()==b7){
			String s=b7.getLabel();
			if(b4.getLabel().equals(" ")){
				b4.setLabel(s); b7.setLabel(" ");
			}
			else if(b8.getLabel().equals(" ")){ 
				b8.setLabel(s); b7.setLabel(" ");
			}
		}
		
		//b8
		if(e.getSource()==b8){
			String s=b8.getLabel();
			
			if(b7.getLabel().equals(" ")){
				b7.setLabel(s); b8.setLabel(" ");
			}
			else if(b9.getLabel().equals(" ")){ 
				b9.setLabel(s); b8.setLabel(" ");
			}
			else if(b5.getLabel().equals(" ")){ 
				b5.setLabel(s); b8.setLabel(" ");
			}
		}
		
		//b9
		if(e.getSource()==b9) {
			String s=b9.getLabel();
			if(b6.getLabel().equals(" ")){ 
				b6.setLabel(s); b9.setLabel(" ");
			}

			else if(b8.getLabel().equals(" ")){ 
				b8.setLabel(s); b9.setLabel(" ");
			}
			
			if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel().equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel().equals("8")&&b9.getLabel().equals(" ")){
				JOptionPane.showMessageDialog(puzzle.this,"!!!you won!!!");
			}
		}
	}
	
	//deriver class
	public static void main(String[] args) {
		new puzzle();
	}

}
