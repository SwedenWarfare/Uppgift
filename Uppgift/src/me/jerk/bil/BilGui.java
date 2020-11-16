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
import javax.swing.JTextField;

import me.jerk.uppgift.MainMenu;
import me.jerk.utils.GlobalVars;

public class BilGui implements ActionListener {
	List<BilInfo> bilInfoList = new ArrayList<>();
	JPanel bilPanel = new JPanel();
	JPanel inPanel = new JPanel();
	static int index = 0;
	JFrame frame = GlobalVars.mainFrame;
	JButton backButton = new JButton("Main Menu");
	JButton prevButton = new JButton("Prev index");
	JButton nextButton = new JButton("Next index");
	JButton saveButton = new JButton("Submit");
	JButton printOutButton = new JButton("Print "+index);
	JTextArea outPutArea;
	JScrollPane outscrollPane;
	
	JTextField nameField = new JTextField();
	JLabel nameLabel = new JLabel("Ägare");
	JTextField regNrField = new JTextField();
	JLabel regLabel = new JLabel("Reg nr");
	JTextField fabrikatField = new JTextField();
	JLabel fabrikatLabel = new JLabel("Fabrikat");

	JTextField årsModelField = new JTextField();
	JLabel årsModelLabel = new JLabel("Årsmodel");

	JTextField viktField = new JTextField();
	JLabel viktLabel = new JLabel("Vikt");

	JTextField effektField = new JTextField();
	JLabel effektLabel = new JLabel("Effekt");

	JPanel mainPanel = new JPanel();
	JLabel inputLabel = new JLabel("Input");
	JLabel outPutLabel = new JLabel("Output");
	public BilGui() {
		index = bilInfoList.size();
		
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
		

		GridBagLayout inlayout = new GridBagLayout();
		GridBagConstraints ingbc = new GridBagConstraints();
		inPanel.setLayout(inlayout);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		gbc.gridx = 0;
		gbc.gridy = 0;
		inPanel.add(nameLabel,ingbc);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		inPanel.add(regNrField,ingbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		inPanel.add(fabrikatField,ingbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		gbc.gridx = 0;
		gbc.gridy = 3;
		inPanel.add(årsModelField,ingbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		inPanel.add(viktField,ingbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		inPanel.add(effektField,ingbc);
		bilPanel.setLayout(layout);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		gbc.gridx = 1;
		gbc.gridy = 0;
		bilPanel.add(prevButton,gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		bilPanel.add(saveButton,gbc);
		gbc.gridx = 3;
		gbc.gridy = 0;
		bilPanel.add(backButton,gbc);
		gbc.gridx = 4;
		gbc.gridy = 0;
		bilPanel.add(printOutButton,gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 0;
		bilPanel.add(nextButton,gbc);
		
		frame.setLayout(frameLayout);
		
		frameGbc.fill = GridBagConstraints.HORIZONTAL;
		frameGbc.ipady = 20;
		frameGbc.gridx = 0;
		frameGbc.gridy = 0;
		frame.add(nameField,frameGbc);
		frameGbc.fill = GridBagConstraints.HORIZONTAL;
		frameGbc.ipady = 20;
		
		frameGbc.gridx = 0;
		frameGbc.gridy = 2;
		frame.add(regNrField,frameGbc);
		
		frameGbc.fill = GridBagConstraints.HORIZONTAL;
		frameGbc.ipady = 10;
		frameGbc.gridx = 0;
		frameGbc.gridy = 3;
		frame.add(bilPanel,frameGbc);
		frameGbc.fill = GridBagConstraints.HORIZONTAL;
		frameGbc.ipady = 10;
		frameGbc.gridx = 0;
		frameGbc.gridy = 4;
		frame.add(outPutLabel,frameGbc);
		
		frameGbc.fill = GridBagConstraints.HORIZONTAL;
		frameGbc.ipady = 20;
		frameGbc.gridx = 0;
		frameGbc.gridy = 5;
		frame.add(outscrollPane,frameGbc);
		frame.setSize(450, 250);
	//	frame.setResizable(false);
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
			frame.remove(inPanel);
			frame.remove(outscrollPane);
			new MainMenu();
		}
		else if(e.getSource() == prevButton) {
			if(index-1 > 0) {
				
				
			}else {
				System.out.println("Is less then 0");
			}
		}
		else if(e.getSource() == nextButton) {
			
			if(index+1 < bilInfoList.size()) {
				System.out.println("Is is less");
			}else {
				System.out.println("Is greater");
			}
		}
		else if(e.getSource() == saveButton) {
			for(int x = 0; x < 6; x++) {
				
			}
		}else if(e.getSource() == printOutButton) {
			
		}
	}
}
