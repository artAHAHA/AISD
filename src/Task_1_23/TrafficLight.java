package Task_1_23;
import java.util.*;

public class TrafficLight {
    private List<String> colors;
    private int[] intervals;
    private int currentIndex;
    private Timer timer;

    public static final String PEDESTRIAN_CROSSING_LIGHT = "Pedestrian crossing light";
    public static final String TRAFFIC_GUIDE_LIGHT = "Traffic guide light";
    public static final String TRAFFIC_GUIDE_LIGHT_WITH_ARROW = "Traffic guide light with arrow";
    private String trafficLightType;

    public TrafficLight(int[] intervals, String trafficLightType) {
        this.intervals = intervals;
        this.currentIndex = 0;
        this.trafficLightType = trafficLightType;
        initializeColors();
        initializeColors();
        updateColors();
    }

    private void initializeColors() {
        colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Green arrow");
        colors.add("Red arrow");
    }

    private void updateColors() {
        colors.clear();
        colors.add("Red");
        if (!PEDESTRIAN_CROSSING_LIGHT.equals(trafficLightType)) {
            colors.add("Yellow");
        }
        colors.add("Green");
        if (TRAFFIC_GUIDE_LIGHT_WITH_ARROW.equals(trafficLightType)) {
            colors.add("Green arrow");
            colors.add("Red arrow");
        }
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

