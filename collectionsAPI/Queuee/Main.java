package Queuee;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
       // Queue<Integer> gtBankQueue = new PriorityQueue<>();
//        Queue<Integer> accessBankQueue = new LinkedList<>();
//        Queue<Integer> unionBankQueue = new ArrayBlockingQueue<>(20);
        Queue<Integer> gtBankQueue = new ArrayBlockingQueue<>(3);
        gtBankQueue.offer(10);
        gtBankQueue.offer(10);
        gtBankQueue.offer(10);
        gtBankQueue.offer(10);

        gtBankQueue.remove();
        gtBankQueue.remove();
        gtBankQueue.remove();
        gtBankQueue.remove();
        gtBankQueue.remove();

        gtBankQueue.poll();
        gtBankQueue.poll();
        gtBankQueue.poll();
        gtBankQueue.poll();
        gtBankQueue.poll();


        System.out.println(gtBankQueue);

    }
}
