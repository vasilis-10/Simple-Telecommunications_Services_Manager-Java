public class tilefonia extends ipiresies {
	
	
	public tilefonia(String name,double monthCost,double freeCall,double freeSms,double smsCost,double callCost){
		super(name,monthCost);
		this.freeCall = freeCall;
		this.freeSms= freeSms;
		this.smsCost= smsCost;
		this.callCost = callCost;
	}

}