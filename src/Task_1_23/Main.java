package Task_1_23;

public class Main {
    public static void main(String[] args) {
        int[] intervals = {1000, 2000, 2000, 4000, 3000};
        //Types: "Pedestrian crossing light", "Traffic guide light", "Traffic guide light with arrow";
        String trafficLightType = TrafficLight.TRAFFIC_GUIDE_LIGHT_WITH_ARROW;
        TrafficLight trafficLight = new TrafficLight(intervals,trafficLightType);
        trafficLight.start();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        trafficLight.stop();
    }
}
