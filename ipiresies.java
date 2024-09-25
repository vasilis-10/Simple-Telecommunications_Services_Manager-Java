import java.util.ArrayList;

public class ipiresies {
	
	private String name;
	public double monthCost;
	public  int sumbNumber=0;
	public double kinhtaLepta;
	public double staueraLepta;
	public double sms;
	public double mb;
	public double freeCall,freeSms,smsCost,callCost;
	public double freeMb,mbCost,Balance;
	ipiresies(String name,double monthCost){
		this.name=name;
		this.monthCost = monthCost;
	}
	public double getCost() {
		return monthCost ;
	}
	public String getName() {
		return this.name;
	}
	
	
	
	
	

}