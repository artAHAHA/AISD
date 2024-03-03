package Task_1_23;

public class Main {
    public static void main(String[] args) {
        int[] intervals = {1000, 2000, 2000, 4000, 3000};

        //TrafficLight.BasicTrafficLight basicTrafficLight = new TrafficLight.BasicTrafficLight(intervals);
        //TrafficLight.TrafficSignal trafficSignal = new TrafficLight.TrafficSignal(intervals);
        TrafficLight.TrafficSignalWithArrow trafficSignalWithArrow = new TrafficLight.TrafficSignalWithArrow(intervals);

        //basicTrafficLight.start();
        //trafficSignal.start();
        trafficSignalWithArrow.start();

        try {

            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //basicTrafficLight.stop();
        //trafficSignal.stop();
        trafficSignalWithArrow.stop();
    }
}
