
public class grid {

<<<<<<< HEAD
	private cell[][] grid;
	private byte maxX, maxY;
=======
	cell[][] grid;
	byte maxX, maxY;
>>>>>>> b9d72bd75edafd1ccdd7a21a5c66546c00960262
	
	public grid(byte maxX, byte maxY) {
		this.maxX = maxX;
		this.maxY = maxY;
		grid = new cell[maxX][maxY];
		for(byte y = 0; y < maxY; y++){
			for(byte x = 0; x < maxX; x++) {
				grid[y][x] = new cell(x, y);
			}
		}
		createNeighbors();
	    setCornerNeighbors();
	    setEdgeNeighbors();		
	}
<<<<<<< HEAD
	
		//create new grid based on the old grid's cells
	public grid(grid oldGrid) {
	    grid = new grid(oldGrid.getWidth(), oldGrid.getHeight());
	    byte aliveCount = 0;
		for(byte y = 0; y < maxY; y++){
			for(byte x = 0; x < maxX; x++) {
			   aliveCount = oldGrid[y][x].getAliveNeighbors();
			   if (!oldGrid[y][x].checkLife() && aliveCount == 3)
			       grid[y][x].setLife(true);
			   else if (oldGrid[y][x].checkLife()) {
			      if (aliveCount < 2 || aliveCount > 3)
				     grid[y][x].setLife(false); 
			      //else if (aliveCount == 2 || aliveCount == 3)
				  //stays alive
			   }
			}
		}	
	}
	
=======
>>>>>>> b9d72bd75edafd1ccdd7a21a5c66546c00960262
	//this function creates the corner cells' neighbors
	private void setCornerNeighbors() {
		//bottom left-most corner
   		grid[0][0].addNeighbor(grid[maxY-1][0]); //bottom neighbor
   		grid[0][0].addNeighbor(grid[0][maxX-1]); //left neighbor
   		grid[0][0].addNeighbor(grid[0][1]); //right neighbor
   		grid[0][0].addNeighbor(grid[1][0]); //top neighbor
   	    grid[0][0].addNeighbor(grid[1][1]); //top right diagonal
   	    grid[0][0].addNeighbor(grid[1][maxX-1]); //top left diagnonal
   	    grid[0][0].addNeighbor(grid[maxY-1][maxX-1]); //bottom left diagonal
   	    grid[0][0].addNeighbor(grid[maxY-1][1]); //bottom right diagonal
   	    
   		//bottom right-most corner
   		grid[0][maxX-1].addNeighbor(grid[maxY-1][maxX-1]); //bottom neighbor
   		grid[0][maxX-1].addNeighbor(grid[0][maxX-2]); //left neighbor
   		grid[0][maxX-1].addNeighbor(grid[0][0]); //right neighbor
   		grid[0][maxX-1].addNeighbor(grid[1][maxX-1]); //top neighbor
   		grid[0][maxX-1].addNeighbor(grid[0][1]); //top right diagonal
   		grid[0][maxX-1].addNeighbor(grid[1][0]); //top left diagnonal
   		grid[0][maxX-1].addNeighbor(grid[maxY-1][maxX-2]); //bottom left diagonal
   		grid[0][maxX-1].addNeighbor(grid[0][maxX-1]); //bottom right diagonal
   	    
   	    //top left-most corner
   		grid[maxY-1][0].addNeighbor(grid[maxY-2][0]); //bottom neighbor
   		grid[maxY-1][0].addNeighbor(grid[maxY-1][maxX-1]); //left neighbor
   		grid[maxY-1][0].addNeighbor(grid[maxY-1][1]); //right neighbor
   		grid[maxY-1][0].addNeighbor(grid[0][0]); //top neighbor
   	    grid[maxY-1][0].addNeighbor(grid[0][1]); //top right diagonal
   	    grid[maxY-1][0].addNeighbor(grid[0][maxX-1]); //top left diagnonal
   	    grid[maxY-1][0].addNeighbor(grid[maxY-2][maxX-1]); //bottom left diagonal
   	    grid[maxY-1][0].addNeighbor(grid[maxY-2][1]); //bottom right diagonal
   	    
   	    //top right-most corner
   		grid[maxY-1][maxX-1].addNeighbor(grid[maxY-2][maxX-1]); //bottom neighbor
   		grid[maxY-1][maxX-1].addNeighbor(grid[maxY-1][maxX-2]); //left neighbor
   		grid[maxY-1][maxX-1].addNeighbor(grid[maxY-1][0]); //right neighbor
   		grid[maxY-1][maxX-1].addNeighbor(grid[0][maxX-1]); //top neighbor
   		grid[maxY-1][maxX-1].addNeighbor(grid[0][0]); //top right diagonal
   		grid[maxY-1][maxX-1].addNeighbor(grid[0][maxX-2]); //top left diagnonal
   		grid[maxY-1][maxX-1].addNeighbor(grid[maxY-2][maxX-2]); //bottom left diagonal
   		grid[maxY-1][maxX-1].addNeighbor(grid[maxY-2][0]); //bottom right diagonal
	}
	
	//This function does not include corners
	private void setEdgeNeighbors() {
		for (byte y = 1; y < maxY-1; y++){
			//left edge
	   		grid[y][0].addNeighbor(grid[y-1][0]); //bottom neighbor
	   		grid[y][0].addNeighbor(grid[y][maxX-1]); //left neighbor
	   		grid[y][0].addNeighbor(grid[y][1]); //right neighbor
	   		grid[y][0].addNeighbor(grid[y+1][0]); //top neighbor
	   		grid[y][0].addNeighbor(grid[y+1][1]); //top right diagonal
	   		grid[y][0].addNeighbor(grid[y+1][maxX-1]); //top left diagnonal
	   		grid[y][0].addNeighbor(grid[y-1][maxX-1]); //bottom left diagonal
	   		grid[y][0].addNeighbor(grid[y-1][1]); //bottom right diagonal
	   		
	   		//right edge
	   		grid[y][maxX-1].addNeighbor(grid[y-1][maxX-1]); //bottom neighbor
	   		grid[y][maxX-1].addNeighbor(grid[y][maxX-2]); //left neighbor
	   		grid[y][maxX-1].addNeighbor(grid[y][0]); //right neighbor
	   		grid[y][maxX-1].addNeighbor(grid[y+1][maxX-1]); //top neighbor
	   		grid[y][maxX-1].addNeighbor(grid[y+1][1]); //top right diagonal
	   		grid[y][maxX-1].addNeighbor(grid[y+1][0]); //top left diagnonal
	   		grid[y][maxX-1].addNeighbor(grid[y-1][maxX-2]); //bottom left diagonal
	   		grid[y][maxX-1].addNeighbor(grid[y-1][maxX-1]); //bottom right diagonal
		}
		
		for (byte x = 1; x < maxX-1; x++){
			//bottom edge
	   		grid[0][x].addNeighbor(grid[maxY-1][x]); //bottom neighbor
	   		grid[0][x].addNeighbor(grid[0][x-1]); //left neighbor
	   		grid[0][x].addNeighbor(grid[0][x+1]); //right neighbor
	   		grid[0][x].addNeighbor(grid[1][x]); //top neighbor
	   		grid[0][x].addNeighbor(grid[1][x+1]); //top right diagonal
	   		grid[0][x].addNeighbor(grid[1][x-1]); //top left diagnonal
	   		grid[0][x].addNeighbor(grid[maxY-1][x-1]); //bottom left diagonal
	   		grid[0][x].addNeighbor(grid[maxY-1][x+1]); //bottom right diagonal
	   		
	   		//top edge
	   		grid[maxY-1][x].addNeighbor(grid[maxY-2][x]); //bottom neighbor
	   		grid[maxY-1][x].addNeighbor(grid[maxY-1][x-1]); //left neighbor
	   		grid[maxY-1][x].addNeighbor(grid[maxY-1][x+1]); //right neighbor
	   		grid[maxY-1][x].addNeighbor(grid[0][x]); //top neighbor
	   		grid[maxY-1][x].addNeighbor(grid[0][x+1]); //top right diagonal
	   		grid[maxY-1][x].addNeighbor(grid[0][x-1]); //top left diagnonal
	   		grid[maxY-1][x].addNeighbor(grid[maxY-2][x-1]); //bottom left diagonal
	   		grid[maxY-1][x].addNeighbor(grid[maxY-2][x+1]); //bottom right diagonal
		}
		
	}
	
	//This function creates the neighbors for all of the cells with standard neighbors
	private void createNeighbors() {
		for (byte y = 1; y < maxY-1; y++){
			for (byte x = 1; x < maxX-1; x++) {
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
	
	public cell getCell(byte x, byte y) {
		return grid[y][x];
	}
	
	
	public String toString() {
		String returnString = "";
		for (int i = 0; i < grid.length; i++)
		{
			returnString += "\n";
			for ( int ii = 0; ii < grid[i].length; ii++)
			{
				returnString += grid[i][ii].toString() + " ";
			}
		}
		
		return returnString;
	}
	
	
<<<<<<< HEAD
	public byte getHeight() {
	   return maxY;
	}
	
	public byte getWidth() {
	   return maxX;
	}
	
	public cell[][] getGrid() {
	   return this.grid;
	}
=======
	public grid(grid newGrid) {
		
	}
	
	
>>>>>>> b9d72bd75edafd1ccdd7a21a5c66546c00960262
	
	
}
