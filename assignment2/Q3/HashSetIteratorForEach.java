package Q3;

import java.util.HashSet;
import java.util.Iterator;

import Q1.Acc2;

public class HashSetIteratorForEach {
	
	public static void main(String[] args) {
		
		HashSet<Acc2> hs = new HashSet<Acc2>();
		
		Acc2 ac = new Acc2("A",101,1000.0);
		Acc2 ac1 = new Acc2("E",103,4000.0);
		Acc2 ac2 = new Acc2("D",105,2000.0);
		Acc2 ac3 = new Acc2("B",102,9000.0);
		Acc2 ac4 = new Acc2("C",104,1200.0);
		
		hs.add(ac);
		hs.add(ac4);
		hs.add(ac1);
		hs.add(ac3);
		hs.add(ac2);
		
//		Iterator<Acc2> it  = hs.iterator();
//		
//		while(it.hasNext()) {
//			Acc2 at = it.next();
//			System.out.println(at);
//		}
		
		//coz this is set so order is not kept
		
		//now checking for duplictae
		
		hs.add(new Acc2("C",104,1200.0));  
		/**
		as of now the hashcode is not overriden .
		so the object element C is added again in the bucket coz hashcodes are different even for duplicates
		+++++++++++++++++++++++++++++++++++++++++
		Output
		+++++++++++++++++++++++++++++++++++++++++
		AccHolderName=E AccNo=103 AccBalance=4000.0

		AccHolderName=C AccNo=104 AccBalance=1200.0
		
		AccHolderName=D AccNo=105 AccBalance=2000.0
		
		AccHolderName=B AccNo=102 AccBalance=9000.0
		
		AccHolderName=C AccNo=104 AccBalance=1200.0
		
		AccHolderName=A AccNo=101 AccBalance=1000.0
		 * 
		 */
		
		Iterator<Acc2> it1  = hs.iterator();
		
		while(it1.hasNext()) {
			Acc2 at = it1.next();
			System.out.println(at);
		}
		
		//now after overriding hashcode in Acc2
		
		//problem solved
		/**
		 * +++++++++++++++++++++++++++++++++++++++++
			Output
			+++++++++++++++++++++++++++++++++++++++++
		 * AccHolderName=A AccNo=101 AccBalance=1000.0

			AccHolderName=B AccNo=102 AccBalance=9000.0
			
			AccHolderName=E AccNo=103 AccBalance=4000.0
			
			AccHolderName=C AccNo=104 AccBalance=1200.0
			
			AccHolderName=D AccNo=105 AccBalance=2000.0
		 */
		
		
		//Using ForEach Loop
		System.out.println();
		System.out.println("Using For each loop method!!");
		hs.forEach(at-> System.out.println(at));
	}

}
