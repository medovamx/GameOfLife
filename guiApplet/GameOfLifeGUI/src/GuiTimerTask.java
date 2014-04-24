import java.util.TimerTask;

public class GuiTimerTask extends TimerTask {
    private Grid grid;
    

    public GuiTimerTask(Grid g) {
        grid = g;
    }
    
    public void setGrid(Grid g) {
        grid = g;
    }
    @Override
    public void run(){
        Applet.replaceGrid(new GuiGrid(new Grid(grid)));
        //Applet.replaceGrid(grid);
               
    }
}
