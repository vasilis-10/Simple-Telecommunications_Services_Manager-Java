import java.util.ArrayList;

public class paroxos {
	


ArrayList<energasumbolaia> sumbolaia  = new ArrayList<energasumbolaia>();
ArrayList<ipiresies> ipiresia = new ArrayList<ipiresies>();

public void printSumb() {
	for(int i= 0;i< sumbolaia.size();i++) {
		
		System.out.println(i + " number " + sumbolaia.get(i).sumbNumber   + ", "+sumbolaia.get(i).Person + ", " + sumbolaia.get(i).getName() +", "+ sumbolaia.get(i).date+", " + sumbolaia.get(i).pay);
		
	}
	
}
public void printIpi() {
	for(int i=0;i<ipiresia.size();i++) {
		System.out.println(ipiresia.get(i).getName());
		System.out.println("");
	}
		
}
}