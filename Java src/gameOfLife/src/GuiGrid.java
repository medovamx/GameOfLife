import java.awt.GridLayout;
import javax.swing.JPanel;

import model.*;

public class GuiGrid extends JPanel {

	private Grid grid;

	public GuiGrid(Grid grid) {
		this.grid = grid;
		super.setLayout(new GridLayout(grid.getHeight(), grid.getWidth()));
		nourish();
	}

	public void nourish() {
		for (int y = 0; y < grid.getHeight(); y++) {
			for (int x = 0; x < grid.getWidth(); x++) {
				this.add(new CellButton(grid.getCell(x, y), x, y);				
			}
		}
	}

	public Grid getGrid() {
		return this.grid;
	}


}
