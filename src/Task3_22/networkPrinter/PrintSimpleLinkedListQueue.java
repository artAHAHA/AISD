package Task3_22.networkPrinter;

import Task3_22.SimpleLinkedListQueue.Tools.SimpleLinkedListQueue;

public class PrintSimpleLinkedListQueue {
    public static void print(SimpleLinkedListQueue<NetworkPrinter> tasks) throws Exception {

        int currentTime = 0;

        while (!tasks.isEmpty()) {
            NetworkPrinter currentTask = tasks.getFirst();
            if (currentTask.time >= currentTime) {
                System.out.println(currentTask.time + " - " + (currentTask.time + currentTask.pages));
                currentTime = currentTask.time + currentTask.pages;
            }
            tasks.removeFirst();
        }
    }
}
