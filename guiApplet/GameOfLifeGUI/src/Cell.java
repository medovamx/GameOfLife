import java.util.ArrayList;


public class Cell {
	
	private byte x, y;
	private boolean life;
	private ArrayList<Cell> neighbors;
	
	public Cell(byte x, byte y){
	    this.x = x;
	    this.y = y;
	    neighbors = new ArrayList<Cell>();
            life = false;
	}
	
	//calculated this cell's live neighbors
	public byte getAliveNeighbors() {
	    byte count = 0;
	    for (byte i = 0; i < neighbors.size(); i++) {
                //System.out.println("Cell: " + this.toString() + " neighbor: " + neighbors.get(i).toString() + " alive: " 
                    //    + neighbors.get(i).checkLife());

	        if (neighbors.get(i).checkLife())
                {
                    //System.out.println("Cell: " + this.toString() + "Alive neighbor: " + neighbors.get(i).toString());
                    count++;
                    
                }
            }
	    return count;
	} 
	
	
	public byte getX() {
            return x;
	}
	
	public byte getY() {
            return y;
	}
	
	public ArrayList<Cell> getNeighbors() {
            return neighbors;
	}
	
	public void addNeighbor(Cell addedCell) {
            neighbors.add(addedCell);
	}
	
	public boolean checkLife() {
            return life;
	}
	
	public void setLife(boolean life) {
            this.life = life;
	}
	
	public String toString(){
            return x + " " + y;
	}
	

}
