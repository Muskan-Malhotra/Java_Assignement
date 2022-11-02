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
	

	@Override
	public String toString() {
		return "AccHolderName=" + AccHN + " AccNo=" + AccNo + " AccBalance=" + AccBalance +"\n";
	}
	
	

}
