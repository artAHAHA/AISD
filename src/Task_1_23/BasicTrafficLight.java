package Task_1_23;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class BasicTrafficLight {
    public final ArrayList<Colors> colors = new ArrayList<Colors>();
    public int[] intervals;
    public int currentIndex;
    public Timer timer;

    public BasicTrafficLight(int[] intervals) {
        this.intervals = intervals;
        this.currentIndex = 0;
        updateColors();
    }

    public void updateColors() {
        colors.clear();
        colors.add(Colors.RED);
        colors.add(Colors.GREEN);
    }

    public void start() {
        timer = new Timer();
        timer.schedule(new ChangeColor(), intervals[currentIndex], intervals[currentIndex]);
    }

    public void stop() {
        if (timer != null) {
            timer.cancel();
        }
    }

    private class ChangeColor extends TimerTask {
        @Override
        public void run() {
            currentIndex = (currentIndex + 1) % colors.size();
            System.out.println(colors.get(currentIndex));
        }
    }
}
