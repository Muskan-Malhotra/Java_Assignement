package Assignment2;

public class Acc {
	
	private String AccHN;
	private int AccNo;
	private double AccBalance;
	
	
	
	
	public Acc(String accHN, int accNo, double accBalance) {
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
	
//	@Override
//	public boolean equals(Object o) {
//		//needs to typecast coz AccNo is not in Object Obvio!
//		return this.AccNo == ((Acc)o).AccNo;
//	}
	
	

}
