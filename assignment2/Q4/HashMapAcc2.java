package Q4;

import java.util.HashMap;

import Q1.Acc2;


public class HashMapAcc2 {
	
	public static void main(String[] args) {
		
		HashMap<Acc2,String> hm = new HashMap<Acc2,String>();
		
		Acc2 ac = new Acc2("A",101,1000.0);
		Acc2 ac1 = new Acc2("E",103,4000.0);
		Acc2 ac2 = new Acc2("D",105,2000.0);
		
		hm.put(ac,ac.getAccHN());
		hm.put(ac1,ac1.getAccHN());
		hm.put(ac2,ac2.getAccHN());
		
		System.out.println("contains key,  Employee D with id=105:"+hm.containsKey(new Acc2("D",105,2000.0)));
        System.out.println("contains value, name value of D:"+hm.containsValue("D"));
        
        //printing hashmap
        for(Acc2 ackey: hm.keySet()) {
        	System.out.println(hm.get(ackey));
        	
        }
		
	}

}
