package Task3_22;

import Task3_22.networkPrinter.NetworkPrinter;
import Task3_22.networkPrinter.Print;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        NetworkPrinter task = new NetworkPrinter(10, 4, 2, 2);
        NetworkPrinter task1 = new NetworkPrinter(1, 4, 1, 4);
        NetworkPrinter task2 = new NetworkPrinter(14, 2, 1, 4);


        PriorityQueue<NetworkPrinter> tasks = new PriorityQueue<NetworkPrinter>();

        tasks.add(task);
        tasks.add(task1);
        tasks.add(task2);
        Print.print(tasks);
    }
}
