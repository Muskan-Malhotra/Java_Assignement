package Q1;

import java.util.Comparator;

public class ComparatorImpl3 implements Comparator<Acc2>{
	
	public int compare(Acc2 a, Acc2 b) {
		
		return a.getAccHN().compareTo(b.getAccHN());
	}

}
