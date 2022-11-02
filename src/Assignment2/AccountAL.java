package Assignment2;

import java.util.*;

public class AccountAL {
	
	public static void main(String[] args) {
		
		List<Acc> ac = new ArrayList<Acc>();
		Acc a1 = new Acc("Nick Stefan",101,20000);
		ac.add(a1);
		Acc a2 = new Acc("Steve Hawkens",102,25000);
		Acc a3 = new Acc("Noel Shaw",103,10000);
		Acc a4 = new Acc("Sam Martin",104,16000);
		ac.add(a2);
		ac.add(a3);
		ac.add(a4);
		
		System.out.println(ac);
		
		ac.remove(0);
		
		System.out.println("Removed Element at index 0");
		System.out.println(ac);
		
		boolean isPresent = ac.contains(a4);
		System.out.println(isPresent);
		boolean present = ac.contains(new Acc("Steve Hawkens",102,25000)); //when equals is not overriden
		System.out.println("Steve is present or not? "+present);
		
	}
}
