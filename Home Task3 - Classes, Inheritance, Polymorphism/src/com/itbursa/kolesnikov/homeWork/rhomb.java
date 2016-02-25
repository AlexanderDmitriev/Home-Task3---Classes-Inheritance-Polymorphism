package com.itbursa.kolesnikov.homeWork;

public class rhomb extends Figure{
	int a, alfa;
	rhomb (int x, int y, int a1, int alfa1){
		xCenter=x;
		yCenter=y;
		a=a1;
		alfa=alfa1;
		square=(a1*a1)*Math.sin(alfa);
	}
	rhomb(int x1,int y1, int x2,int y2, int x3,int y3, int x4,int y4){
		xCenter=(x1-x4)/2;           //         2
		yCenter=(y1-y2)/2;          //       1     3
		square=((x1-x3)*(y2-y4))/2; //          4
	}
	public String toString(){
		return "rhomb[rhomb(x= " + xCenter + ", y= " + yCenter + ") Side =  = " + a + "   Square =  "+square + "]"; 
	}
	public void scaling(int delta){
		a*=delta;
		square=a*a*Math.sin(alfa);
	}
}
