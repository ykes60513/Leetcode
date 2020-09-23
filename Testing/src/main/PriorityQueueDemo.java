package main;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		// Creating empty priority queue
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);

		// Adding items to the pQueue using add()
		queue.offer(10);
		queue.offer(20);
		queue.offer(15);

		for(Integer i : queue) {
			System.out.println(i);
		}
		
		
		// Printing the top element of PriorityQueue
		System.out.println("/////////////\n" + queue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(queue.poll());

		// Printing the top element again
		System.out.println(queue.peek());
		
		while(!queue.isEmpty())
			System.out.println(queue.poll());
	}

}
