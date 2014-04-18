
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GUI extends JFrame  {

	final int HEIGHT = 1000;
	final int WIDTH  = 850;

	public GUI() {
		super("The Game Of Life");
		setResizable(false);
		create();
	}

	public void create() {
		super.setVisible(true);
	
	}


}
