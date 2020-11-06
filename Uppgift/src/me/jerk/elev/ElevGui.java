package me.jerk.elev;

import javax.swing.JFrame;
import javax.swing.JPanel;

import me.jerk.utils.GlobalVars;
public class ElevGui {
	JPanel elevPanel = new JPanel();
	JFrame frame = GlobalVars.mainFrame;
	public ElevGui() {
		frame.add(elevPanel);
	}
}
