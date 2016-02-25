package com.itbursa.kolesnikov.homeWork;

public class quadrate extends Figure {
	int a;
	quadrate(int x, int y, int a1){
		 xCenter=x;                            
		  yCenter=y;
		  square=a*a;}
	quadrate (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		xCenter=(x3-x1)/2;                //    2     3
		yCenter=(y3-y1)/2;                //    1     4
		square=(x3-x1)*(x3-x1);
	}
	public String toString(){
		return "quadrate[quadrate(x= " + xCenter + ", y= " + yCenter + ") Side = " + a + "Square =  "+square + "]"; 
	}
}
