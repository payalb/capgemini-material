package com.ui;



import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFirstLabel2 {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		//program should terminate on closing frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//width, height
		// frame.setSize(200,300);
		//distance from left, from top
		// frame.setLocation(100, 100);
		// left top width height
		frame.setTitle("My JFrame");
		ImageIcon icon= new ImageIcon("images1.jpg");
		frame.setIconImage(icon.getImage());
		Container container= frame.getContentPane();
		container.setBackground(Color.magenta);
		frame.setBounds(100, 200, 600 , 500);
		frame.setResizable(false);
		frame.setLayout(null);
		JLabel label= new JLabel("Default text");
		label.setBounds(100, 50, 340, 30);
		label.setText("Name of the note: ");
		
		JButton button= new JButton("Click Here!");
		button.setBounds(100, 250, 160, 30);
		container.add(button);
		ImageIcon icon1= new ImageIcon("images1.jpg");
		JButton button1= new JButton(icon1);
		button1.setBounds(300, 250, 160, 30);
		container.add(button1);
		//type, bold/plain/italic , size
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		container.add(label);
		frame.setVisible(true);
	}

}
