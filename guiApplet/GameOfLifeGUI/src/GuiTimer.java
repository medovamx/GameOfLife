import java.util.Timer;

public class GuiTimer {
    private Timer timer;
    private Grid grid;
    private GuiTimerTask task;
    
    public GuiTimer (Grid g) {
        grid = g;
        
        timer = new Timer();
        task = new GuiTimerTask(grid);
        timer.scheduleAtFixedRate(task, 0, (long) 500);
    }
    
    public void setGrid(Grid g) {
        grid = g;
        task.setGrid(g);
    }
    
    public void stopTimer() {
        timer.cancel();
    }
}
