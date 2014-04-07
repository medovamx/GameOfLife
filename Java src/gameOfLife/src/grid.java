
public class grid {

	cell[][] grid;
	byte maxX, maxY;
	
	public grid(byte maxX, byte maxY) {
		this.maxX = maxX;
		this.maxY = maxY;
		grid = new cell[maxX][maxY];
		for(byte y = 0; y < maxY; y++){
			for(byte x = 0; x < maxX; x++) {
				grid[y][x] = new cell(x, y);
			}
		}
	}
	
	private void createNeighbors() {
		for(byte y = 0; y < maxY; y++){
			for(byte x = 0; x < maxX; x++) {			
				grid[y][x].addNeighbor(grid[y+1][x-1]);
				grid[y][x].addNeighbor(grid[y+1][x]);
				grid[y][x].addNeighbor(grid[y+1][x+1]);
				grid[y][x].addNeighbor(grid[y][x-1]);
				grid[y][x].addNeighbor(grid[y][x+1]);
				grid[y][x].addNeighbor(grid[y-1][x-1]);
				grid[y][x].addNeighbor(grid[y-1][x]);
				grid[y][x].addNeighbor(grid[y-1][x+1]);	
			}
		}
	}
	
	
	public grid(grid newGrid) {
		
	}
	
	
	
	
}
