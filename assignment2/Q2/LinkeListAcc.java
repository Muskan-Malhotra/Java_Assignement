package Q2;
import Q1.Acc2;
import java.util.*;

public class LinkeListAcc {
	
	public static void main(String[] args) {
		
//		List<Integer> lk = new LinkedList<Integer>();
//		
//		lk.add(12);
//		lk.add(14);
//		lk.add(20);
//		
//		System.out.println(lk);
		
		Queue<Acc2> lk = new LinkedList<Acc2>();
		
		lk.offer(new Acc2("aa",1,1000.0));
		lk.offer(new Acc2("dd",5,1200.0));
		lk.offer(new Acc2("bb",6,1060.0));
		lk.offer(new Acc2("ee",10,1220.0));
		lk.add(new Acc2("ff",2,5000.0));
		
		System.out.println(lk);
		
		System.out.println("size of linkedlist: "+lk.size());
        System.out.println("the peek object is: "+lk.peek());
        System.out.println(lk.size());

        System.out.println("the poll value is: "+lk.poll());
        System.out.println("size of linkedlist: "+lk.size());

        System.out.println("the poll value is: "+lk.poll());
        System.out.println("size of  linkedlist: "+lk.size());
		
		
		
		
	}

}
