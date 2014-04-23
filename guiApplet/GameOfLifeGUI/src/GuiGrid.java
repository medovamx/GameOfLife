import java.awt.GridLayout;
import javax.swing.JPanel;



public class GuiGrid extends JPanel {

	private Grid grid;

	public GuiGrid(Grid g) {
		this.grid = g;
                //System.out.println(grid.getWidth() + " " + grid.getHeight());
		super.setLayout(new GridLayout(this.grid.getHeight(), this.grid.getWidth()));
                //super.setLayout(new GridLayout(5, 5));
		fillGrid();
	}
       
	public void fillGrid() {
            for (byte y = 0; y < grid.getHeight(); y++) {
                for (byte x = 0; x < grid.getWidth(); x++) {               
                    this.add(new CellButton(grid.getCell(x, y), x, y));				
                }
            }
	}

	public Grid getGrid() {
		return this.grid;
	}
        


}
