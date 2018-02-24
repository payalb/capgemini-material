package com.ui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SimpleFrame{
	
	SimpleFrame(){
		
		
	}

	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.setBounds(100, 200, 600, 500);
		frame.setBackground(Color.cyan);
		JTextField field= new JTextField();
		field.setBackground(Color.yellow);
		Color color= new Color(120,120,35);
		field.setForeground(color);
		field.setBounds(100, 50, 340, 30);
		Container c=frame.getContentPane();
		c.setLayout(null);
		c.add(field);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
