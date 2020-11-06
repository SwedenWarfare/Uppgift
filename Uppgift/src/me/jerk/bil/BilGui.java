package me.jerk.bil;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import me.jerk.uppgift.MainMenu;
import me.jerk.utils.GlobalVars;

public class BilGui implements ActionListener {
	List<BilInfo> bilInfoList = new ArrayList<>();
	JPanel bilPanel = new JPanel();
	static int index = 0;
	JFrame frame = GlobalVars.mainFrame;
	JButton backButton = new JButton("Main Menu");
	JButton prevButton = new JButton("Prev index");
	JButton nextButton = new JButton("Next index");
	JButton saveButton = new JButton("Submit");
	JButton printOutButton;
	JTextArea inputArea;
	JTextArea outPutArea;
	JScrollPane outscrollPane;
	JScrollPane inscrollPane;
	JPanel mainPanel = new JPanel();
	JLabel inputLabel = new JLabel("Input");
	JLabel outPutLabel = new JLabel("Output");
	public BilGui() {
		index = bilInfoList.size();
		printOutButton = new JButton("Print "+index);
		inputArea = new JTextArea(10,10);
		inscrollPane = new JScrollPane(inputArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		backButton.addActionListener(this);
		prevButton.addActionListener(this);
		nextButton.addActionListener(this);
		saveButton.addActionListener(this);
		outPutArea = new JTextArea(10,10);
	
		outscrollPane = new JScrollPane(outPutArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		GridBagLayout frameLayout = new GridBagLayout();
		GridBagConstraints frameGbc = new GridBagConstraints();
			
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		bilPanel.setLayout(layout);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		gbc.gridx = 1;
		gbc.gridy = 0;
		bilPanel.add(prevButton,gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		bilPanel.add(backButton,gbc);
		gbc.gridx = 3;
		gbc.gridy = 0;
		bilPanel.add(saveButton,gbc);
		gbc.gridx = 4;
		gbc.gridy = 0;
		bilPanel.add(nextButton,gbc);
		
		frame.setLayout(frameLayout);
		frameGbc.fill = GridBagConstraints.HORIZONTAL;
		frameGbc.ipady = 10;
		frameGbc.gridx = 0;
		frameGbc.gridy = 0;
		frame.add(inputLabel,frameGbc);
		
		frameGbc.fill = GridBagConstraints.HORIZONTAL;
		frameGbc.ipady = 20;
		frameGbc.gridx = 0;
		frameGbc.gridy = 1;
		frame.add(inscrollPane,frameGbc);
		
		frameGbc.fill = GridBagConstraints.HORIZONTAL;
		frameGbc.ipady = 20;
		frameGbc.gridx = 0;
		frameGbc.gridy = 2;
		frame.add(bilPanel,frameGbc);
		frameGbc.fill = GridBagConstraints.HORIZONTAL;
		frameGbc.ipady = 10;
		frameGbc.gridx = 0;
		frameGbc.gridy = 3;
		frame.add(outPutLabel,frameGbc);
		
		frameGbc.fill = GridBagConstraints.HORIZONTAL;
		frameGbc.ipady = 20;
		frameGbc.gridx = 0;
		frameGbc.gridy = 4;
		frame.add(outscrollPane,frameGbc);
		frame.setSize(350, 250);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton)
		{
			frame.remove(bilPanel);
			frame.remove(outPutLabel);
			frame.remove(inputLabel);
			frame.remove(inscrollPane);
			frame.remove(outscrollPane);
			new MainMenu();
		}
		else if(e.getSource() == prevButton) {
			
		}
		else if(e.getSource() == nextButton) {
			
		}
		else if(e.getSource() == saveButton) {
			
		}
	}
}
