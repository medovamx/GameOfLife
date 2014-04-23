import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CellButton extends JButton implements ActionListener {

	private Cell cell;
	private byte x, y;

	public CellButton(Cell cell, byte x, byte y) {
		this.cell = cell;
                this.cell.setLife(cell.checkLife());
		this.x = x;
		this.y = y;
                
		if(cell.checkLife()) {
			super.setBackground(Color.yellow);
		}
		else {
			super.setBackground(Color.gray);
		}
	
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (cell.checkLife()) {
			cell.setLife(false);
			super.setBackground(Color.gray);
		}
		else {
			cell.setLife(true);
			super.setBackground(Color.yellow);
		}
	}

	public String toString() {
		return cell.toString();
	}




}
