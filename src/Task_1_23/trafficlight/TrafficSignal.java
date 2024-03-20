package Task_1_23.trafficlight;

import Task_1_23.BasicTrafficLight;
import Task_1_23.Colors;

public class TrafficSignal extends BasicTrafficLight {
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