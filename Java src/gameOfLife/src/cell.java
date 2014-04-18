import java.util.ArrayList;


public class cell {
	
	private byte x, y;
	private boolean life = false;
	private ArrayList<cell> neighbors;
	
	public cell(byte x, byte y){
	    this.x = x;
	    this.y = y;
	    neighbors = new ArrayList<cell>();
	}
	
	
	public byte getX() {
		return x;
	}
	
	public byte getY() {
		return y;
	}
	
	public ArrayList<cell> getNeighbors() {
		return neighbors;
	}
	
	public void addNeighbor(cell addedCell) {
		neighbors.add(addedCell);
	}
	
	public boolean checkLife() {
		return life;
	}
	
	public void setLife(boolean life) {
		this.life = life;
	}
	
	public String toString(){
		return x + " " + y + "\n";
	}
	

}
