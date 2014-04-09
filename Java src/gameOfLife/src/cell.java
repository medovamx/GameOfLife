import java.util.ArrayList;


public class cell {
	
	private byte x, y;
	private boolean life;
	private ArrayList<cell> neighbors;
	
	public cell(byte x, byte y){
	    this.x = x;
	    this.y = y;
	    neighbors = new ArrayList<cell>();
		aliveNeighbors = 0;
		life = false;
	}
	
	//calculated this cell's live neighbors
	public byte getAliveNeighbors() {
	   byte count = 0;
	   for (byte i = 0; i < neighbors.size(); i++) {
	        if (neighbors.get(i).checkLife()) 
			    count++;
		}
	   return count;
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
