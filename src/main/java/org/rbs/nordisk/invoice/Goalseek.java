package org.rbs.nordisk.invoice;

public class Goalseek {

	public Goalseek() {
		// TODO Auto-generated constructor stub
	}

	static int Result(int a,int b,int c,int r) {
		r = a+(b*c);
		return r;
	}
	
	static int Result(int b,int c,int r) {
		int Goalseek = r -(b*c);
		return Goalseek;
	}
	
	static double LandingPrice (double BasePrice,double TransportCharge) {
		double SalesTax =  BasePrice*(4.5/100);
		double Octroi =    BasePrice*(3.0/100);
		double Insurance=  (BasePrice+SalesTax)*0.07/100;
		System.out.println(BasePrice + "  -  " + SalesTax + "   -   " +Octroi + "   -  " +Insurance + "  -  " +TransportCharge + "   -  "  );
		return BasePrice+SalesTax+Octroi+Insurance+TransportCharge;
	}
	
	static double LandingPrice (double SalesTax,double Octroi,double Insurance, double TransportCharge,double LandingPrice) {
		
		return LandingPrice-(SalesTax+Octroi+Insurance+TransportCharge);
	}
	
	
	
	public static void main(String[] args) {
		
	System.out.println(	Result(2,4,2,0));
	System.out.println(	Result(4,2,10));
	System.out.println(	LandingPrice(1389.8,5.0));
	System.out.println(	LandingPrice(62.5,41.7,1.0,5.0,1500));

	}

}
