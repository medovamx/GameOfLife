import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.*;


public class CellButton extends JButton implements ActionListener {

	private Cell cell;
	private byte x, y;

	public CellButton(Cell cell, byte x, byte y) {
		this.cell = cell;
		this.x = x;
		this.y = y;

		if(cell.checkLife()) {
			super.setBackground(Color.red);
		}
		else {
			super.setBackground(Color.grey);
		}
	
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (cell.checkAlive()) {
			cell.setLife(false);
			super.setBackground(Color.grey);
		}
		else {
			cell.setLife(true);
			super.setBackground(Color.red);
		}
	}

	public String toString() {
		return cell.toString();
	}




}
