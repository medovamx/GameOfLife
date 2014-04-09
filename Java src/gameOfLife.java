import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.util.ArrayList;


public class gameOfLife {
	public static void main(String[] args) {
		// This is main entrance into Applet
		byte x = 6; 
		byte y = 9;
		ArrayList<cell> array = new ArrayList<cell>();
		grid grid = new grid((byte)10, (byte)10);
		
		array = grid.getCell(x, y).getNeighbors();
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
	}

}
