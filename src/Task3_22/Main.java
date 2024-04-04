package Task3_22;

import Task3_22.SimpleLinkedListQueue.Tools.SimpleLinkedListQueue;
import Task3_22.networkPrinter.NetworkPrinter;
import Task3_22.networkPrinter.Print;
import Task3_22.networkPrinter.PrintSimpleLinkedListQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        NetworkPrinter task = new NetworkPrinter(10, 4, 2, 2);
        NetworkPrinter task1 = new NetworkPrinter(1, 4, 5, 4);
        NetworkPrinter task2 = new NetworkPrinter(14, 2, 1, 4);


        PriorityQueue<NetworkPrinter> tasks = new PriorityQueue<NetworkPrinter>();

        //SimpleLinkedListQueue<NetworkPrinter> tasks2 = new SimpleLinkedListQueue<>();
        List<NetworkPrinter> tasks2 = new ArrayList<>();
        tasks2.add(task);
        tasks2.add(task1);
        tasks2.add(task2);

        tasks2.sort(new NetworkPrinter());


        tasks.add(task);
        tasks.add(task2);
        tasks.add(task1);
        PrintSimpleLinkedListQueue.print(tasks2);
    }
}
