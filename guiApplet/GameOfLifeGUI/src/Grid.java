
public class Grid {

    private Cell[][] grid;
    private byte maxX, maxY;

    public Grid(byte maxX, byte maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        grid = new Cell[maxY][maxX];
        for (byte y = 0; y < maxY; y++) {
            for (byte x = 0; x < maxX; x++) {
                grid[y][x] = new Cell(x, y);
            }
        }
        createNeighbors();
        setCornerNeighbors();
        setEdgeNeighbors();
    }

    //create new grid based on the old grid's cells
    public Grid(Grid g) {
        byte aliveCount = 0;
        
        maxY = g.getHeight();
        maxX = g.getWidth();
        grid = new Grid(maxX, maxY).getGrid();
       
        for (byte y = 0; y < maxY; y++) {
            for (byte x = 0; x < maxX; x++) {
                aliveCount = g.getCell(x, y).getAliveNeighbors();
                
                if (!g.getCell(x, y).checkLife() && aliveCount == 3) {
                    grid[y][x].setLife(true);
                } 
                else if (g.getCell(x, y).checkLife()) {
                    if (aliveCount < 2 || aliveCount > 3) {
                        grid[y][x].setLife(false);
                    }
                    else {
                        grid[y][x].setLife(true);
                    }
                }               
            }
        }
    }

    //this function creates the corner cells' neighbors
    private void setCornerNeighbors() {
        //top left-most corner
        grid[0][0].addNeighbor(grid[maxY - 1][0]); //top
        grid[0][0].addNeighbor(grid[0][maxX - 1]); //left
        grid[0][0].addNeighbor(grid[0][1]); //right
        grid[0][0].addNeighbor(grid[1][0]); //bottom
        grid[0][0].addNeighbor(grid[1][1]); //bottom right
        grid[0][0].addNeighbor(grid[1][maxX - 1]); //bottom left
        grid[0][0].addNeighbor(grid[maxY - 1][maxX - 1]); //top left
        grid[0][0].addNeighbor(grid[maxY - 1][1]); //top right

        //top right-most corner
        grid[0][maxX - 1].addNeighbor(grid[maxY - 1][maxX - 1]); //top
        grid[0][maxX - 1].addNeighbor(grid[0][maxX - 2]); //left
        grid[0][maxX - 1].addNeighbor(grid[0][0]); //right
        grid[0][maxX - 1].addNeighbor(grid[1][maxX - 1]); //bottom
        grid[0][maxX - 1].addNeighbor(grid[1][0]); //bottom right
        grid[0][maxX - 1].addNeighbor(grid[maxY - 1][maxX - 2]); //top left
        grid[0][maxX - 1].addNeighbor(grid[1][maxX - 2]); //bottom left
        grid[0][maxX - 1].addNeighbor(grid[maxY - 1][0]); //top right

        //bottom left-most corner
        grid[maxY - 1][0].addNeighbor(grid[maxY - 2][0]); //top
        grid[maxY - 1][0].addNeighbor(grid[maxY - 1][maxX - 1]); //left
        grid[maxY - 1][0].addNeighbor(grid[maxY - 1][1]); //right
        grid[maxY - 1][0].addNeighbor(grid[0][0]); //bottom
        grid[maxY - 1][0].addNeighbor(grid[0][1]); //bottom right
        grid[maxY - 1][0].addNeighbor(grid[0][maxX - 1]); //bottom left
        grid[maxY - 1][0].addNeighbor(grid[maxY - 2][maxX - 1]); //top left
        grid[maxY - 1][0].addNeighbor(grid[maxY - 2][1]); //top right

        //bottom right-most corner
        grid[maxY - 1][maxX - 1].addNeighbor(grid[maxY - 2][maxX - 1]); //top
        grid[maxY - 1][maxX - 1].addNeighbor(grid[maxY - 1][maxX - 2]); //left
        grid[maxY - 1][maxX - 1].addNeighbor(grid[maxY - 1][0]); //right
        grid[maxY - 1][maxX - 1].addNeighbor(grid[0][maxX - 1]); //bottom
        grid[maxY - 1][maxX - 1].addNeighbor(grid[0][0]); //bottom right
        grid[maxY - 1][maxX - 1].addNeighbor(grid[0][maxX - 2]); //bottom left
        grid[maxY - 1][maxX - 1].addNeighbor(grid[maxY - 2][maxX - 2]); //top left
        grid[maxY - 1][maxX - 1].addNeighbor(grid[maxY - 2][0]); //top right
    }

    //This function does not include corners
    private void setEdgeNeighbors() {
        for (byte y = 1; y < maxY - 1; y++) {
            //left edge
            grid[y][0].addNeighbor(grid[y - 1][0]); //top
            grid[y][0].addNeighbor(grid[y][maxX - 1]); //left
            grid[y][0].addNeighbor(grid[y][1]); //right
            grid[y][0].addNeighbor(grid[y + 1][0]); //bottom
            grid[y][0].addNeighbor(grid[y + 1][1]); //bottom right
            grid[y][0].addNeighbor(grid[y + 1][maxX - 1]); //bottom left
            grid[y][0].addNeighbor(grid[y - 1][maxX - 1]); //top left
            grid[y][0].addNeighbor(grid[y - 1][1]); //top right

            //right edge
            grid[y][maxX - 1].addNeighbor(grid[y - 1][maxX - 1]); //top
            grid[y][maxX - 1].addNeighbor(grid[y][maxX - 2]); //left
            grid[y][maxX - 1].addNeighbor(grid[y][0]); //right
            grid[y][maxX - 1].addNeighbor(grid[y + 1][maxX - 1]); //bottom
            grid[y][maxX - 1].addNeighbor(grid[y + 1][0]); //bottom right
            grid[y][maxX - 1].addNeighbor(grid[y - 1][maxX - 2]); //top left
            grid[y][maxX - 1].addNeighbor(grid[y + 1][maxX - 2]); //bottom left
            grid[y][maxX - 1].addNeighbor(grid[y - 1][0]); //top right     
        }

        for (byte x = 1; x < maxX - 1; x++) {
            //top edge
            grid[0][x].addNeighbor(grid[maxY - 1][x]); //top
            grid[0][x].addNeighbor(grid[0][x - 1]); //left
            grid[0][x].addNeighbor(grid[0][x + 1]); //right
            grid[0][x].addNeighbor(grid[maxY - 1][x - 1]); //top left
            grid[0][x].addNeighbor(grid[maxY - 1][x + 1]); //top right
            grid[0][x].addNeighbor(grid[1][x - 1]); //bottom left
            grid[0][x].addNeighbor(grid[1][x]); //bottom
            grid[0][x].addNeighbor(grid[1][x + 1]); //bottom right
            

            //bottom edge
            grid[maxY - 1][x].addNeighbor(grid[maxY - 2][x]); //top
            grid[maxY - 1][x].addNeighbor(grid[maxY - 1][x - 1]); //left
            grid[maxY - 1][x].addNeighbor(grid[maxY - 1][x + 1]); //right
            grid[maxY - 1][x].addNeighbor(grid[0][x]); //bottom
            grid[maxY - 1][x].addNeighbor(grid[0][x + 1]); //bottom right
            grid[maxY - 1][x].addNeighbor(grid[0][x - 1]); //bottom left
            grid[maxY - 1][x].addNeighbor(grid[maxY - 2][x - 1]); //top left
            grid[maxY - 1][x].addNeighbor(grid[maxY - 2][x + 1]); //top right
        }

    }

    //This function creates the neighbors for all of the cells with standard neighbors
    private void createNeighbors() {
        for (byte y = 1; y < maxY - 1; y++) {
            for (byte x = 1; x < maxX - 1; x++) {
                grid[y][x].addNeighbor(grid[y + 1][x - 1]);
                grid[y][x].addNeighbor(grid[y + 1][x]);
                grid[y][x].addNeighbor(grid[y + 1][x + 1]);
                grid[y][x].addNeighbor(grid[y][x - 1]);
                grid[y][x].addNeighbor(grid[y][x + 1]);
                grid[y][x].addNeighbor(grid[y - 1][x - 1]);
                grid[y][x].addNeighbor(grid[y - 1][x]);
                grid[y][x].addNeighbor(grid[y - 1][x + 1]);
            }
        }
    }

    public Cell getCell(byte x, byte y) {
        return grid[y][x];
    }

    public String toString() {
        String returnString = "";
        for (int i = 0; i < grid.length; i++) {
            returnString += "\n";
            for (int ii = 0; ii < grid[i].length; ii++) {
                returnString += grid[i][ii].toString() + " " + grid[i][ii].checkLife() + "\n";
            }
            
        }

        return returnString;
    }

    public byte getHeight() {
        return maxY;
    }

    public byte getWidth() {
        return maxX;
    }

    public Cell[][] getGrid() {
        return grid;
    }

}
