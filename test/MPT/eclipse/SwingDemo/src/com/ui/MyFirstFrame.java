package com.ui;



import java.awt.Color;
import java.awt.Container;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFirstFrame {

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
		frame.setVisible(true);
	}

}
