package Task3_22.networkPrinter;

import java.util.PriorityQueue;


public class Print {
    public static void createTasks() {

        NetworkPrinter task = new NetworkPrinter(10, 4, 2, 2);
        NetworkPrinter task1 = new NetworkPrinter(1, 4, 1, 4);
        NetworkPrinter task2 = new NetworkPrinter(1, 2, 1, 4);


        PriorityQueue<NetworkPrinter> tasks = new PriorityQueue<NetworkPrinter>();

        tasks.add(task);
        tasks.add(task1);
        tasks.add(task2);

    }

    public static void print(PriorityQueue<NetworkPrinter> tasks) {

        int currentTime = 0;

        while (!tasks.isEmpty()) {
            NetworkPrinter currentTask = tasks.poll();
            if (currentTask.time >= currentTime) {
                System.out.println(currentTask.time + " - " + (currentTask.time + currentTask.pages));
            }
            currentTime = currentTask.time + currentTask.pages;
        }
    }

}
