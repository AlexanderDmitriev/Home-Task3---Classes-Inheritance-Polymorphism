package com.itbursa.kolesnikov.homeWork;

public class triangle extends Figure{
	int sideA, sideB, sideC;
	triangle (int x, int y,int a, int b, int c){  
		xCenter=x;
		yCenter=y;
		double R=Math.sqrt((Math.pow(a, 2)*(Math.pow(b,2))*(Math.pow(c, 2)))/((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)));
		square=(a*b*c)/(4*R);
		sideA=a;
		sideB=b;
		sideC=c;
	}
	triangle (int x1,int y1, int x2,int y2, int x3,int y3){
		xCenter=(x1-x3)/2;                      //        2   
		yCenter=(y1-y2)/2;                     //     1      3     
		square=((x2-x1)*(y2-y1)-(x3-x1)*(y2-y1))/2; 
		sideA=(int)(Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2))));
		sideB=(int)(Math.sqrt((Math.pow(x3-x2, 2))+(Math.pow(y2-y3, 2))));
		sideC=x3-x1;}
	public String toString(){
		return "triangle[triangle(x= " + xCenter + ", y= " + yCenter + ") Side A = " + sideA + "Side A = " + sideB + "sideC = " + sideC + "Square =  "+square + "]"; 
	}
}
