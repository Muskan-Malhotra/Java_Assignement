package Q1;

//import Assignment2.Acc;
//implements Comparable<Acc2>
public class Acc2 implements Comparable<Acc2>{
	
	private String AccHN;
	private int AccNo;
	private double AccBalance;
	
	
	
	
	public Acc2(String accHN, int accNo, double accBalance) {
		super();
		AccHN = accHN;
		AccNo = accNo;
		AccBalance = accBalance;
	}
	
	public String getAccHN() {
		return AccHN;
	}
	public void setAccHN(String accHN) {
		AccHN = accHN;
	}
	public int getAccNo() {
		return AccNo;
	}
	public double getAccBalance() {
		return AccBalance;
	}
	
	public void setBalance(double balance) {
        this.AccBalance = balance;
    }
	
	//this is important coz objects needs to be in string type to be in readable form
	@Override
	public String toString() {
		return "AccHolderName=" + AccHN + " AccNo=" + AccNo + " AccBalance=" + AccBalance +"\n";
	}
	
	@Override
	public boolean equals(Object o) {
		//needs to typecast coz AccNo is not in Object Obvio!
		return this.AccNo == ((Acc2)o).AccNo;
	}
	
	@Override
    public int compareTo(Acc2 e) {
//    	System.out.println("Compareto of this employee with Account Balance:"+this.AccBlance+" is :"+e.AccBalance);
		
		return (int)(this.AccBalance-e.AccBalance);
    }
	
	@Override
	public int hashCode() {
		System.out.println("HashCode of this employee with Account Number:"+this.AccNo);
		return this.AccNo;
		
	}
	
	

}
