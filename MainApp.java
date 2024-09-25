import java.util.Scanner;

class MainApp {

	public static void main(String[] args) {//parakato orizo antikeimena ipiresion,2 gia kaue tipo ipiresias
		Scanner sc = new Scanner(System.in);
		paroxos p = new paroxos();
		internet a = new internet("Internet1",0,500,1);
		internet b = new internet("Internet2",0,1000,2);
		sumbolaio c = new sumbolaio("Sumbolaio1",0,1500,500,2,1);
		sumbolaio d = new sumbolaio("Sumbolaio2",0,500,800,2,1);
		kartosumbolaio e = new kartosumbolaio("Kartosumbolaio1",0,500,500,2,1,1000);
		kartosumbolaio f = new kartosumbolaio("Kartosumbolaio2",0,1200,1200,2,2,2500);
				
		ipiresies [] l = {a,b,c,d,e,f};
		
		for (ipiresies i : l) 
			p.ipiresia.add(i);
		//p.printIpi();
		//parakato orizo 8 arxika antikeimena sumbolaion me tuxaia onomata
		energasumbolaia a1 = new energasumbolaia("Internet1","giorgos-6971665713","17/12/11","metrhta",0);
		energasumbolaia a2 = new energasumbolaia("Internet1","giannis-6971634873","14/10/20","metrhta",0);
		energasumbolaia a3 = new energasumbolaia("Internet2","nikos-6971634873","17/12/19","karta",0);
		energasumbolaia a4 = new energasumbolaia("Internet2","nikh-6957834873","30/12/17","metrhta",0);
		energasumbolaia a5 = new energasumbolaia("Sumbolaio1","nikh-6957834873","30/12/17","karta",0);
		energasumbolaia a6 = new energasumbolaia("Sumbolaio1","nikh-6957834873","30/12/17","metrhta",0);
		energasumbolaia a7 = new energasumbolaia("Sumbolaio2","giorgos-6971634713","17/12/11","karta",0);
		energasumbolaia a8 = new energasumbolaia("Sumbolaio2","giannis-6971634873","14/10/20","metrhta",0);
		energasumbolaia a9 = new energasumbolaia("Kartosumbolaio1","nikos-6971634873","17/12/19","karta",0);
		energasumbolaia a10 = new energasumbolaia("Kartosumbolaio1","nikh-6957834873","30/12/17","metrhta",0);
		energasumbolaia a11= new energasumbolaia("Kartosumbolaio2","nikh-6957834873","30/12/17","karta",0);
		energasumbolaia a12= new energasumbolaia("Kartosumbolaio2","nikh-6957834983","30/12/17","karta",0);
		
		
		energasumbolaia [] k = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12};
		
		for(energasumbolaia i: k)
			p.sumbolaia.add(i);
			
		
		//ekxorisi ariumou sumbolaiou sta arxika energa sumbolaia
		for(int i =0;i< p.sumbolaia.size();i++)
			p.sumbolaia.get(i).sumbNumber = i;
		//p.printSumb();
		
		boolean stop= true;
		while(stop) {//olo to programma einai mesa se mia entolh while h opoia stamataei otan o xrhsths epilejei thn entolh ejodou
			System.out.println("(1)Emfanisi ton diauesimon ipiresion, (2)dhmiourgia neou sumbolaiou, ");
			System.out.println("(3) Emfanisi ton energon sumbolaion gia sugkekrimeno tupo ipiresias,(4) Enhmerosh statistikon xrhshs enos sumbolaiou");
			System.out.println("(5) upologismos tou sunolikou ninhaioy kostous,(6) upologismos upoloipou , (7) exodo");
			
			int n = sc.nextInt();
			if(n==1)//emfanisi ipiresion
				p.printIpi();
			else if(n==2) {//dimiourgia sumbolaiou
				System.out.println("Eisagete tipo ipiresias");
				String s = "";
				int k100;
				while(true) {//mia while gia apotroph lauon kata thn epilogh paketou
					System.out.println("(1) gia Internet1, (2) gia Internet2,(3) gia Sumbolaio1,(4) gia Sumbolaio2,(5) gia Kartosumbolaio1,(6) gia Kartosumbolaio2");
					k100 = sc.nextInt();
					if(k100==3 | k100 ==2 | k100==1 |k100==4 | k100 ==5 | k100==6)
						break;}
						
				
				
				
				if(k100 == 1)
					s = "Internet1";
				else if(k100 ==2)
					s = "Internet2";
				else if(k100 ==3)
					s = "Sumbolaio1";
				else if(k100 ==4)
					s = "Sumbolaio2";
				else if(k100 ==5)
					s = "Kartosumbolaio1";
				else if(k100 ==6)
					s = "Kartosumbolaio2";
				System.out.println("Isagete onoma kai thlefono");//to onoma kai to tilefono prepei na xorizontai me -
				String s1 =sc.next();
				System.out.println("eisagete shmerinh hmeromhnia");
				String s2 =sc.next();
				String s3 ="";
				while(true) {
					System.out.println("Eisagete tropo plhromhs: (1) metrhta,(2) karta");
					k100 = sc.nextInt();
					if(k100==1 | k100 ==2 )
						break;
						
					}
				
				if(k100 ==1 )
					s3 = "metrhta";
				else
					s3 = "karta";
				
				
				energasumbolaia z = new energasumbolaia(s,s1,s2,s3,0);
				p.sumbolaia.add(z);
				//p.printSumb();
				p.sumbolaia.get(p.sumbolaia.size()-1).sumbNumber = p.sumbolaia.size()-1;
				//ekxorisi ariumou sumbolaiou sto neo sumbolaio
				
				
			}
			else if(n==3) {//emfanisi sumbolaion
				
				while(true) {//while gia apotroph lauon
				System.out.println("Eisagete tupo ipiresias: (1) gia sumbolaio,(2) gia kartosumbolaio,(3) gia internet");
				n = sc.nextInt();
				if(n==3 | n ==2 | n==1)
					break;
					
				}
				if(n==3) {
					for(energasumbolaia i : p.sumbolaia) {
						if(i.getName().equals("Internet1") |i.getName().equals("Internet2") )
							System.out.println(" number " + i.sumbNumber   + ", "+ i.Person + ", " + i.getName() +", "+ i.date+", " + i.pay);
					}
			}
				else if(n==1){
					
					for(int i =0;i< p.sumbolaia.size();i++) {
						if(p.sumbolaia.get(i).getName().equals("Sumbolaio1") |p.sumbolaia.get(i).getName().equals("Sumbolaio2") )
							System.out.println(" number " + p.sumbolaia.get(i).sumbNumber   + ", "+p.sumbolaia.get(i).Person + ", " + p.sumbolaia.get(i).getName() +", "+ p.sumbolaia.get(i).date+", " + p.sumbolaia.get(i).pay);
					}
					
				}
				else{
					for(energasumbolaia i : p.sumbolaia) {
						if(i.getName().equals("Kartosumbolaio1") |i.getName().equals("Kartosumbolaio2") )
							
							System.out.println(" number " + i.sumbNumber   + ", "+ i.Person + ", " + i.getName() +", "+ i.date+", " + i.pay);
					
				}
				}
			}
			else if (n==4) {//kataxorisi dedomenon stous logariasmous
				p.printSumb();
				while(true) {
					System.out.println("Eisagete ton ariumo tou sumbolaiou sas");
				n = sc.nextInt();
				if (n>=0 && n< p.sumbolaia.size())
					break;
				}
				if( p.sumbolaia.get(n).getName().equals("Sumbolaio1") ||p.sumbolaia.get(n).getName().equals("Sumbolaio2") || p.sumbolaia.get(n).getName().equals("Kartosumbolaio1") ||p.sumbolaia.get(n).getName().equals("Kartosumbolaio2")  ) {
					System.out.println("Eisagete ton xrono klhseon sas pros kinhta");
					int k1 = sc.nextInt();
					p.sumbolaia.get(n).kinhtaLepta = k1;
					System.out.println("Eisagete ton xrono kliseon sas pros stauera");
					int k2 = sc.nextInt();
					p.sumbolaia.get(n).staueraLepta = k2;
					System.out.println("Eisagete to plhuos sms ");
					int k3 = sc.nextInt();
					p.sumbolaia.get(n).sms = k3;
					p.sumbolaia.get(n).mb = 0;}
				else {
					System.out.println("Eisagete ton ogko ton dedomenon sas ");
					int k4 = sc.nextInt();
					p.sumbolaia.get(n).mb = k4;}
					
					
				}
			else if(n==5) {
				while(true) {
					System.out.println("Epilejte to eidos tou paketou sas : 1 gia sumbolaio,2 gia kartosumbolaio,3 gia internet");
					n = sc.nextInt();
					if(n==3 | n ==2 | n==1)
						break;
						
					}
				if(n==3) {
					p.printSumb();
					while(true) {
						System.out.println("Eisagete tpn ariumo tou sumbolaiou sas");
					 n = sc.nextInt();
					 if(!(0 <= n  && n <= p.sumbolaia.size()))
						 continue;
					 else if(p.sumbolaia.get(n).getName().equals("Internet1")|| p.sumbolaia.get(n).getName().equals("Internet2"))
					 break;
					}
					 
					 if(p.sumbolaia.get(n).getName().equals("Internet1")) {
						 p.sumbolaia.get(n).freeMb= p.ipiresia.get(0).freeMb;
						 p.sumbolaia.get(n).mbCost= p.ipiresia.get(0).mbCost;
					 }
					 else if(p.sumbolaia.get(n).getName().equals("Internet2")){
						 p.sumbolaia.get(n).freeMb= p.ipiresia.get(1).freeMb;
						 p.sumbolaia.get(n).mbCost= p.ipiresia.get(1).mbCost;
						 
					 }
					 if(p.sumbolaia.get(n).freeMb >=p.sumbolaia.get(n).mb)
						 p.sumbolaia.get(n).monthCost = 0;
					 
					 else
						 p.sumbolaia.get(n).monthCost = -(p.sumbolaia.get(n).freeMb - p.sumbolaia.get(n).mb)*  p.sumbolaia.get(n).mbCost*(1-internet.ekptosi);
						 
					
					
					System.out.println("To kostos sas einai : " + p.sumbolaia.get(n).monthCost);
					
				}//edo teleionei to costos gia programmata internet
				
				if(n==1) {
					p.printSumb();
					while(true) {
						System.out.println("Eisagete tpn ariumo tou sumbolaiou sas");
					 n = sc.nextInt();
					 if(!(0 <= n  && n <= p.sumbolaia.size()))
						 continue;
					 else if(p.sumbolaia.get(n).getName().equals("Sumbolaio1")|| p.sumbolaia.get(n).getName().equals("Sumbolaio2"))
					 break;
					}
					if(p.sumbolaia.get(n).getName().equals("Sumbolaio1")) {
						 p.sumbolaia.get(n).freeCall= p.ipiresia.get(2).freeCall;
						 p.sumbolaia.get(n).freeSms= p.ipiresia.get(2).freeSms;
						 p.sumbolaia.get(n).callCost = p.ipiresia.get(2).callCost;
						 p.sumbolaia.get(n).smsCost= p.ipiresia.get(2).smsCost;
					 }
					else if(p.sumbolaia.get(n).getName().equals("Sumbolaio2")) {
						 p.sumbolaia.get(n).freeCall= p.ipiresia.get(3).freeCall;
						 p.sumbolaia.get(n).freeSms= p.ipiresia.get(3).freeSms;
						 p.sumbolaia.get(n).callCost = p.ipiresia.get(3).callCost;
						 p.sumbolaia.get(n).smsCost= p.ipiresia.get(3).smsCost;
						 }
					
					
				
					if( p.sumbolaia.get(n).freeCall > p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta  &&  p.sumbolaia.get(n).freeSms > p.sumbolaia.get(n).sms  ) 
						p.sumbolaia.get(n).monthCost = 0;
					
					else if( p.sumbolaia.get(n).freeCall > p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta  &&  p.sumbolaia.get(n).freeSms < p.sumbolaia.get(n).sms  )
						p.sumbolaia.get(n).monthCost =   (p.sumbolaia.get(n).sms -p.sumbolaia.get(n).freeSms)*p.sumbolaia.get(n).smsCost*(1-sumbolaio.ekptosi);
					
					else if(p.sumbolaia.get(n).freeCall < p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta && p.sumbolaia.get(n).freeSms > p.sumbolaia.get(n).sms)
						p.sumbolaia.get(n).monthCost = ((p.sumbolaia.get(n).kinhtaLepta+p.sumbolaia.get(n).staueraLepta)-p.sumbolaia.get(n).freeCall)*p.sumbolaia.get(n).callCost*(1-sumbolaio.ekptosi);
					else
						p.sumbolaia.get(n).monthCost = ((((p.sumbolaia.get(n).kinhtaLepta+p.sumbolaia.get(n).staueraLepta)-p.sumbolaia.get(n).freeCall)*p.sumbolaia.get(n).callCost)+((p.sumbolaia.get(n).sms -p.sumbolaia.get(n).freeSms)*p.sumbolaia.get(n).smsCost))*(1-sumbolaio.ekptosi);
					System.out.println( "To xreos sas einai: " +p.sumbolaia.get(n).monthCost);
					}//edo teleionei to kostos gia programmata sumbolaiou
				
				if(n==2) {
					p.printSumb();
					while(true) {
						System.out.println("Eisagete tpn ariumo tou sumbolaiou sas");
					 n = sc.nextInt();
					 if(!(0 <= n  && n <= p.sumbolaia.size()))
						 continue;
					 else if(p.sumbolaia.get(n).getName().equals("Kartosumbolaio1")|| p.sumbolaia.get(n).getName().equals("Kartosumbolaio2"))
					 break;
					}
					if(p.sumbolaia.get(n).getName().equals("Kartosumbolaio1")) {
						 p.sumbolaia.get(n).freeCall= p.ipiresia.get(4).freeCall;
						 p.sumbolaia.get(n).freeSms= p.ipiresia.get(4).freeSms;
						 p.sumbolaia.get(n).callCost = p.ipiresia.get(4).callCost;
						 p.sumbolaia.get(n).smsCost= p.ipiresia.get(4).smsCost;
						 p.sumbolaia.get(n).Balance=  p.ipiresia.get(4).Balance;
					 }
					else if(p.sumbolaia.get(n).getName().equals("Kartosumbolaio2")) {
						 p.sumbolaia.get(n).freeCall= p.ipiresia.get(5).freeCall;
						 p.sumbolaia.get(n).freeSms= p.ipiresia.get(5).freeSms;
						 p.sumbolaia.get(n).callCost = p.ipiresia.get(5).callCost;
						 p.sumbolaia.get(n).smsCost= p.ipiresia.get(5).smsCost;
						 p.sumbolaia.get(n).Balance=  p.ipiresia.get(5).Balance;
						 }
					if( p.sumbolaia.get(n).freeCall > p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta  &&  p.sumbolaia.get(n).freeSms > p.sumbolaia.get(n).sms  ) 
						p.sumbolaia.get(n).monthCost = 0;
					
					else if( p.sumbolaia.get(n).freeCall > p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta  &&  p.sumbolaia.get(n).freeSms < p.sumbolaia.get(n).sms  )
						p.sumbolaia.get(n).monthCost =   (p.sumbolaia.get(n).sms -p.sumbolaia.get(n).freeSms)*p.sumbolaia.get(n).smsCost*(1-sumbolaio.ekptosi);
					
					else if(p.sumbolaia.get(n).freeCall < p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta && p.sumbolaia.get(n).freeSms > p.sumbolaia.get(n).sms)
						p.sumbolaia.get(n).monthCost = ((p.sumbolaia.get(n).kinhtaLepta+p.sumbolaia.get(n).staueraLepta)-p.sumbolaia.get(n).freeCall)*p.sumbolaia.get(n).callCost*(1-sumbolaio.ekptosi);
					else
						p.sumbolaia.get(n).monthCost = ((((p.sumbolaia.get(n).kinhtaLepta+p.sumbolaia.get(n).staueraLepta)-p.sumbolaia.get(n).freeCall)*p.sumbolaia.get(n).callCost)+((p.sumbolaia.get(n).sms -p.sumbolaia.get(n).freeSms)*p.sumbolaia.get(n).smsCost))*(1-kartosumbolaio.ekptosi);
					
					
					if(p.sumbolaia.get(n).monthCost > p.sumbolaia.get(n).Balance)
						System.out.println("To kostos uperbainei to diauesimo ypoloipo,isagete nea stoixeia");
						
					else
						System.out.println( "To kostos sas einai: " +p.sumbolaia.get(n).monthCost);
						}//edo teleionei to kostos gia programmata kartosumbolaiou
			}//telos upologismon kostous
			
			else if(n==6){//ypologismos ipolipon
				while(true) {
					System.out.println("Eisagete tupo ipiresias: (1) gia sumbolaia ,(2) gia kartosumbolaia,(3) gia internet");
					n = sc.nextInt();
					if(n==3 | n ==2 | n==1)
						break;
						
					}
				double r;
				if(n==3) {
					p.printSumb();
					while(true) {
						System.out.println("eisagete ton ariumo tou sumbolaiou sas");
					 n = sc.nextInt();
					 if(!(0 <= n  && n <= p.sumbolaia.size()))
						 continue;
					 else if(p.sumbolaia.get(n).getName().equals("Internet1")|| p.sumbolaia.get(n).getName().equals("Internet2") )
						 break;
					}
					if(p.sumbolaia.get(n).getName().equals("Internet1")) {
						 p.sumbolaia.get(n).freeMb= p.ipiresia.get(0).freeMb;
						 p.sumbolaia.get(n).mbCost= p.ipiresia.get(0).mbCost;
					 }
					 else if(p.sumbolaia.get(n).getName().equals("Internet2")){
						 p.sumbolaia.get(n).freeMb= p.ipiresia.get(1).freeMb;
						 p.sumbolaia.get(n).mbCost= p.ipiresia.get(1).mbCost;
						 
					 }
					if(p.sumbolaia.get(n).freeMb < p.sumbolaia.get(n).mb) {
						p.sumbolaia.get(n).freeMb=0;
					//System.out.println("Exete " + p.sumbolaia.get(n).freeMb + " dorean dedomena ");
					}
					else{
						r = p.sumbolaia.get(n).freeMb - p.sumbolaia.get(n).mb;
						p.sumbolaia.get(n).freeMb= r;
					}
					System.out.println("Exete " + p.sumbolaia.get(n).freeMb + " dorean dedomena ");
					}//ipolipa gia internet
				if(n==2) {
					p.printSumb();
					while(true) {
						System.out.println("eisagete ton ariumo tou sumbolaiou sas");
					 n = sc.nextInt();
					 if(!(0 <= n  && n <= p.sumbolaia.size()))
						 continue;
					 if(p.sumbolaia.get(n).getName().equals("Kartosumbolaio1")|| p.sumbolaia.get(n).getName().equals("Kartosumbolaio2"))
					 break;
					 
					}
					if(p.sumbolaia.get(n).getName().equals("Kartosumbolaio1")) {
						 p.sumbolaia.get(n).freeCall= p.ipiresia.get(4).freeCall;
						 p.sumbolaia.get(n).freeSms= p.ipiresia.get(4).freeSms;
						 p.sumbolaia.get(n).callCost = p.ipiresia.get(4).callCost;
						 p.sumbolaia.get(n).smsCost= p.ipiresia.get(4).smsCost;
						 p.sumbolaia.get(n).Balance=  p.ipiresia.get(4).Balance;
					 }
					else if(p.sumbolaia.get(n).getName().equals("Kartosumbolaio2")) {
						 p.sumbolaia.get(n).freeCall= p.ipiresia.get(5).freeCall;
						 p.sumbolaia.get(n).freeSms= p.ipiresia.get(5).freeSms;
						 p.sumbolaia.get(n).callCost = p.ipiresia.get(5).callCost;
						 p.sumbolaia.get(n).smsCost= p.ipiresia.get(5).smsCost;
						 p.sumbolaia.get(n).Balance=  p.ipiresia.get(5).Balance;
						 }
					if( p.sumbolaia.get(n).freeCall > p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta  &&  p.sumbolaia.get(n).freeSms > p.sumbolaia.get(n).sms  ) { 
						p.sumbolaia.get(n).monthCost = 0;
						p.sumbolaia.get(n).freeCall -= p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta;
						p.sumbolaia.get(n).freeSms -= p.sumbolaia.get(n).sms;
						}
					
					else if( p.sumbolaia.get(n).freeCall > p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta  &&  p.sumbolaia.get(n).freeSms < p.sumbolaia.get(n).sms  ) {
						p.sumbolaia.get(n).monthCost =   (p.sumbolaia.get(n).sms -p.sumbolaia.get(n).freeSms)*p.sumbolaia.get(n).smsCost*(1-sumbolaio.ekptosi);
								p.sumbolaia.get(n).freeCall -= p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta;
						p.sumbolaia.get(n).freeSms = 0;
						}
						
					
					else if(p.sumbolaia.get(n).freeCall < p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta && p.sumbolaia.get(n).freeSms > p.sumbolaia.get(n).sms) {
						p.sumbolaia.get(n).monthCost = ((p.sumbolaia.get(n).kinhtaLepta+p.sumbolaia.get(n).staueraLepta)-p.sumbolaia.get(n).freeCall)*p.sumbolaia.get(n).callCost*(1-sumbolaio.ekptosi);
						p.sumbolaia.get(n).freeCall = 0;
						p.sumbolaia.get(n).freeSms -= p.sumbolaia.get(n).sms;
					}	
					else {
						p.sumbolaia.get(n).monthCost = ((((p.sumbolaia.get(n).kinhtaLepta+p.sumbolaia.get(n).staueraLepta)-p.sumbolaia.get(n).freeCall)*p.sumbolaia.get(n).callCost)+((p.sumbolaia.get(n).sms -p.sumbolaia.get(n).freeSms)*p.sumbolaia.get(n).smsCost))*(1-kartosumbolaio.ekptosi);
						p.sumbolaia.get(n).freeCall =0;
						p.sumbolaia.get(n).freeSms =0;
					
					}
					if(p.sumbolaia.get(n).Balance - p.sumbolaia.get(n).monthCost > 0)
					p.sumbolaia.get(n).Balance = p.sumbolaia.get(n).Balance - p.sumbolaia.get(n).monthCost;
					else
						p.sumbolaia.get(n).Balance = 0;
						
					System.out.println("To miniaio  ypoloipo sas einai : " + p.sumbolaia.get(n).Balance + "\nTa dorean lepta sas einai: "+ p.sumbolaia.get(n).freeCall);
					System.out.println("Ta dorean sms sas einai: "+ p.sumbolaia.get(n).freeSms);
					}//ipolipa gia kartosumbolaia
				if(n==1) {
					p.printSumb();
					while(true) {
						System.out.println("eisagete ton ariumo tou sumbolaiou sas");
					 n = sc.nextInt();
					 if(!(0 <= n  && n <= p.sumbolaia.size()))
						 continue;
					 else if(p.sumbolaia.get(n).getName().equals("Sumbolaio1")|| p.sumbolaia.get(n).getName().equals("Sumbolaio2"))
					 break;
					 
					}
				
				if(p.sumbolaia.get(n).getName().equals("Sumbolaio1")) {
					 p.sumbolaia.get(n).freeCall= p.ipiresia.get(2).freeCall;
					 p.sumbolaia.get(n).freeSms= p.ipiresia.get(2).freeSms;
					 p.sumbolaia.get(n).callCost = p.ipiresia.get(2).callCost;
					 p.sumbolaia.get(n).smsCost= p.ipiresia.get(2).smsCost;
				 }
				else if(p.sumbolaia.get(n).getName().equals("Sumbolaio2")) {
					 p.sumbolaia.get(n).freeCall= p.ipiresia.get(3).freeCall;
					 p.sumbolaia.get(n).freeSms= p.ipiresia.get(3).freeSms;
					 p.sumbolaia.get(n).callCost = p.ipiresia.get(3).callCost;
					 p.sumbolaia.get(n).smsCost= p.ipiresia.get(3).smsCost;
					 }
				if( p.sumbolaia.get(n).freeCall > p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta  &&  p.sumbolaia.get(n).freeSms > p.sumbolaia.get(n).sms  ) {
					p.sumbolaia.get(n).monthCost = 0;
					p.sumbolaia.get(n).freeCall -= p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta;
					p.sumbolaia.get(n).freeSms -= p.sumbolaia.get(n).sms;;
					}
				
				else if( p.sumbolaia.get(n).freeCall > p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta  &&  p.sumbolaia.get(n).freeSms < p.sumbolaia.get(n).sms  ) {
					p.sumbolaia.get(n).monthCost =   (p.sumbolaia.get(n).sms -p.sumbolaia.get(n).freeSms)*p.sumbolaia.get(n).smsCost*(1-sumbolaio.ekptosi);
					p.sumbolaia.get(n).freeCall -= p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta;
					p.sumbolaia.get(n).freeSms =0;
				}
				
				else if(p.sumbolaia.get(n).freeCall < p.sumbolaia.get(n).kinhtaLepta +p.sumbolaia.get(n).staueraLepta && p.sumbolaia.get(n).freeSms > p.sumbolaia.get(n).sms) {
					p.sumbolaia.get(n).monthCost = ((p.sumbolaia.get(n).kinhtaLepta+p.sumbolaia.get(n).staueraLepta)-p.sumbolaia.get(n).freeCall)*p.sumbolaia.get(n).callCost*(1-sumbolaio.ekptosi);
					p.sumbolaia.get(n).freeCall =0;
					p.sumbolaia.get(n).freeSms -= p.sumbolaia.get(n).sms;
				}
				else {
					p.sumbolaia.get(n).monthCost = ((((p.sumbolaia.get(n).kinhtaLepta+p.sumbolaia.get(n).staueraLepta)-p.sumbolaia.get(n).freeCall)*p.sumbolaia.get(n).callCost)+((p.sumbolaia.get(n).sms -p.sumbolaia.get(n).freeSms)*p.sumbolaia.get(n).smsCost))*(1-sumbolaio.ekptosi);
					p.sumbolaia.get(n).freeCall =0;
					p.sumbolaia.get(n).freeSms =0;
						
					}
					System.out.println("To xreos sas einai : " + p.sumbolaia.get(n).monthCost + "\nTa dorean lepta sas einai: "+ p.sumbolaia.get(n).freeCall);
					System.out.println("Ta dorean sms sas einai: "+ p.sumbolaia.get(n).freeSms);
				
				}//ipolipa gia sumbolaia
				
			}//edo teleionei o upologismos ton upoloipon
			else if(n==7)//entolh ejodou apo to programma
				stop = false;
			
		}

	}
}