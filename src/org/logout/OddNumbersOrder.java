package org.logout;

import org.login.EvenNumbersOrder;

public class OddNumbersOrder {
	public void printoddnumber() {

		//Reversal order in Odd number...print
		//for(int a=99; a>=0; a=a-2) {
//System.out.println(a);	
	//	}
			
		//Incremental order in Odd number...print
		//for(int b=0; b<=100; b=b+3) {
		//	System.out.println(b);	
		//			}
		
		//Prient Statement...(not numbers)
		//for(int c=5; c>0; c--) {
		//	for(int j=1; j<=c; j++) {
		//	System.out.print("*  "+"\t");
	 //}
		//	System.out.println();
		//}
		
		for(int c=0; c<6; c++) {
			for(int j=1; j<=c; j++) {              //(int j=0; j<=c; j++)
				//for(int e=5; e>=c; e++) {
				System.out.print(j+"\t");
				for(int k=0; k<=5; k++) {
					System.out.println(j+"\t");
				}
			}
			
			System.out.println();
		}
		}
//}

public static void main(String[] args) {
	OddNumbersOrder a =new OddNumbersOrder();
	a.printoddnumber();
	
	
	//OddNumbersOrder b =new OddNumbersOrder();
	//b.printoddnumber();
	
	//OddNumbersOrder c =new OddNumbersOrder();
	//c.printoddnumber();
	
}
	}


