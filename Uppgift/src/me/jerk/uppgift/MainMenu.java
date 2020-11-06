package me.jerk.uppgift;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import me.jerk.bil.BilGui;
import me.jerk.utils.GlobalVars;

public class MainMenu implements ActionListener {
	JPanel mainPanel = new JPanel();
	JFrame frame = GlobalVars.mainFrame;
	JLabel textLabel = new JLabel("Main Menu");
	JButton bilButton = new JButton("Bil");
	JButton elevButton = new JButton("Elev");
	JButton smartButton = new JButton("Smart");
	
	public MainMenu() {
		mainPanel.setLayout(new GridLayout(4,0));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		mainPanel.add(textLabel,BorderLayout.CENTER);
		mainPanel.add(bilButton);
		mainPanel.add(elevButton);
		mainPanel.add(smartButton);
		bilButton.addActionListener(this);
		elevButton.addActionListener(this);
		smartButton.addActionListener(this);
		frame.add(mainPanel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == bilButton) {
			frame.remove(mainPanel);
			new BilGui();
		}else if(event.getSource() == elevButton) {
			System.out.println("Elev");
		}else if(event.getSource() == smartButton) {
			System.out.println("Smart");
		}
		
	}
}
