import java.util.TimerTask;

public class GuiTimerTask extends TimerTask {
    Grid grid;

    public GuiTimerTask(Grid g) {
        grid = g;
    }
    
    @Override
    public void run(){
        //Applet.replaceGrid(new GuiGrid(new Grid(grid)));
        Applet.replaceGrid(grid);
               
    }
}
