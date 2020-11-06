package me.jerk.smart;

import javax.swing.JFrame;
import javax.swing.JPanel;

import me.jerk.utils.GlobalVars;

public class SmartGui {
	JPanel smartPanel = new JPanel();
	JFrame frame = GlobalVars.mainFrame;
	public SmartGui() {
		frame.add(smartPanel);
	}
}
