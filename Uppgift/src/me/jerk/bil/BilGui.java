package me.jerk.bil;

import javax.swing.JFrame;
import javax.swing.JPanel;

import me.jerk.utils.GlobalVars;

public class BilGui {
	JPanel bilPanel = new JPanel();
	JFrame frame = GlobalVars.mainFrame;
	public BilGui() {
		frame.add(bilPanel);
	}
}
