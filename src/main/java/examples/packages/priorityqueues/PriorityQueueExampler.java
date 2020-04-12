package examples.packages.priorityqueues;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class PriorityQueueExampler {
    public static void main(String[] args) {
        Queue<String> users = new LinkedBlockingQueue<>();
        users.add("Петя");
        users.add("Дима");
        users.add("Катя");
        System.out.println(users);
        String headQueue = users.poll();
        String currentQueue = users.peek();
        System.out.println(users);
        System.out.println(headQueue);
        System.out.println(currentQueue);
    }
}
