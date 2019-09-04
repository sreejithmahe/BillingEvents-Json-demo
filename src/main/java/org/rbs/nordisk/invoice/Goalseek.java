package org.rbs.nordisk.invoice;

public class Goalseek {

	public Goalseek() {
		// TODO Auto-generated constructor stub
	}

	static int Result(int a,int b,int c,int r) {
		r = 2+(b*c);
		return r;
	}
	
	static int Result(int b,int c,int r) {
		int Goalseek = r -(b*c);
		return Goalseek;
	}
	
	public static void main(String[] args) {
		
	System.out.println(	Result(2,4,2,0));
	System.out.println(	Result(4,2,10));

	}

}
