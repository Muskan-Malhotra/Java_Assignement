package Q2;

import java.util.PriorityQueue;
import java.util.Queue;

import Q1.Acc2;

public class PriorityQueueAcc {
	
	public static void main(String[] args) {
		
		Queue<Acc2>  aq= new PriorityQueue<Acc2>();
		
		aq.offer(new Acc2("aa",1,1000.0));
		aq.offer(new Acc2("dd",5,1200.0));
		aq.offer(new Acc2("bb",6,1060.0));
		aq.offer(new Acc2("ee",10,1220.0));
		aq.offer(new Acc2("ff",2,5000.0));
		
		System.out.println("size of priority queue: "+aq.size());
        System.out.println("the peek object is: "+aq.peek());
        System.out.println(aq.size());

        System.out.println("the poll value is: "+aq.poll());
        System.out.println("size of priority queue: "+aq.size());

        System.out.println("the poll value is: "+aq.poll());
        System.out.println("size of priority queue: "+aq.size());
		
		
	}

}
