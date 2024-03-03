package Task_1_23;

import java.util.*;

public class TrafficLight {
    private enum Colors {
        RED,
        YELLOW,
        GREEN,
        GREEN_ARROW,
        RED_ARROW,
    }

    static class BasicTrafficLight {
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

    static class TrafficSignal extends BasicTrafficLight {
        public TrafficSignal(int[] intervals) {
            super(intervals);
        }

        @Override
        public void updateColors() {
            super.updateColors();
            colors.add(1, Colors.YELLOW);
            colors.add(3, Colors.YELLOW);
        }
    }

    static class TrafficSignalWithArrow extends BasicTrafficLight {
        public TrafficSignalWithArrow(int[] intervals) {
            super(intervals);
        }

        @Override
        public void updateColors() {
            super.updateColors();
            colors.add(1, Colors.YELLOW);
            colors.add(Colors.GREEN_ARROW);
            colors.add(Colors.RED_ARROW);
            colors.add(5, Colors.YELLOW);
        }
    }
}

