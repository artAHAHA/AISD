package Task_1_23.trafficlight;

import Task_1_23.BasicTrafficLight;
import Task_1_23.Colors;

public class TrafficSignalWithArrow extends BasicTrafficLight {
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
