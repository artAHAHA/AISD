package Task3_22.networkPrinter;

import java.util.PriorityQueue;


public class Print {
    public static void createTasks() {

        NetworkPrinter task = new NetworkPrinter(10, 4, 2, 2);
        NetworkPrinter task1 = new NetworkPrinter(1, 4, 1, 4);

        PriorityQueue<NetworkPrinter> tasks = new PriorityQueue<NetworkPrinter>();

        tasks.add(task);
        tasks.add(task1);

        System.out.println(tasks.poll().time + " - " + (task.time + task.pages));
        System.out.println(tasks.poll().time);
    }

/*    public void print(){

    }

    private PriorityQueue<NetworkPrinter> modeling(){

    }*/
}
