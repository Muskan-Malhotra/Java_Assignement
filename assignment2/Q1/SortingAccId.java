package Q1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortingAccId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<Acc2> st = new TreeSet<Acc2>();
		Acc2 ac = new Acc2("A",101,1000.0);
		Acc2 ac1 = new Acc2("E",103,4000.0);
		Acc2 ac2 = new Acc2("D",105,2000.0);
		Acc2 ac3 = new Acc2("B",102,9000.0);
		Acc2 ac4 = new Acc2("C",104,1200.0);
		
		st.add(ac);
		st.add(ac4);
		st.add(ac1);
		st.add(ac3);
		st.add(ac2);
		System.out.println(".........Sorting on the basis of balance........");
		
		System.out.println(st);
		
		//sorting with comparator on the basis of names::
		Comparator<Acc2> com = new ComparatorImpl3();
		SortedSet<Acc2> acc = new TreeSet<Acc2>(com);
		
//		Comparator<Acc2> ac = new ComparatorImpl3();
		
		acc.add(new Acc2("A",101,1000.0));
		acc.add(new Acc2("E",103,4000.0));
		acc.add(new Acc2("D",105,2000.0));
		acc.add(new Acc2("B",102,9000.0));
		acc.add(new Acc2("C",104,1200.0));
		
		System.out.println("..........Sorting on the basis of Account Holder Name...........");
		
		System.out.println(acc);
		
		

	}

}
