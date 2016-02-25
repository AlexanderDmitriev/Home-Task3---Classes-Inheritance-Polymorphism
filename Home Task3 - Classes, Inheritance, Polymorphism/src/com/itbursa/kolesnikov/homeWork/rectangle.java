package com.itbursa.kolesnikov.homeWork;

public class rectangle extends Figure {
	int a,b;
	rectangle(int x,int y, int a1,int b1){
		 xCenter=x;                            
		  yCenter=y;
		  square=a1*b1;}
	
	rectangle(int x1,int y1, int x2,int y2, int x3,int y3, int x4,int y4){
		xCenter=(x1-x4)/2;  //  2       3
		yCenter=(y1-y2)/2;  //  1       4 
		square=(x1-x4)*(y1-y2);}
	public String toString(){
		return "rectangle[rectangle(x= " + xCenter + ", y= " + yCenter + ") Side A = " + a + "Side B = " + b + "Square =  "+square + "]"; 
	}
}
