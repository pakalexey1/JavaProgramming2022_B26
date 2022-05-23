package day61_maps;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue<String> queueOne = new PriorityQueue<>();
        queueOne.offer("hello");
        queueOne.offer("world");
        queueOne.offer("java");
        queueOne.offer("selenium");
        queueOne.offer("apple");
        queueOne.offer("zebra");
        System.out.println(queueOne);

        queueOne.poll();
        System.out.println(queueOne);
        System.out.println(queueOne.poll());

        queueOne.offer("apple");
        System.out.println(queueOne);

        System.out.println("======================");

        ArrayDeque<String> queueTwo = new ArrayDeque<>();
        queueTwo.offer("hello");
        queueTwo.offer("world");
        queueTwo.offer("java");
        queueTwo.offer("selenium");
        queueTwo.offer("apple");
        queueTwo.offer("zebra");
        System.out.println(queueTwo);
        System.out.println(queueTwo.poll());
        System.out.println(queueTwo);

        System.out.println(queueTwo.peek());
        System.out.println(queueTwo.peekLast());

        queueTwo.offerFirst("new word");
        System.out.println(queueTwo);


    }
}
