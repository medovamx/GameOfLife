import java.util.Timer;

public class GuiTimer {
    Timer timer;
    Grid grid;
    
    public GuiTimer (Grid g) {
        grid = g;
        
        timer = new Timer();
        timer.scheduleAtFixedRate(new GuiTimerTask(grid), 0, (long) 500);
    }
    
    public void stopTimer() {
        timer.cancel();
    }
}
