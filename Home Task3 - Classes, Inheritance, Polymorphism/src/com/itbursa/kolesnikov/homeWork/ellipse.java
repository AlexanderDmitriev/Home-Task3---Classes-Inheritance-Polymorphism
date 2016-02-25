package com.itbursa.kolesnikov.homeWork;

public class ellipse extends Figure{
	int h,l;
	ellipse(int x1,int y1, int h1, int l1){ //Constructor with small half-axis and bigger half-axis
		 xCenter=x1;
		yCenter=y1;
		int h=h1;
		int l=l1;
		square=h*l*3.14;
	}
	ellipse(int xStart, int yStart, int xEnd, int yEnd, int xHigh, int yHigh, int xLow, int yLow){  //Constructor by 4 points
		xCenter=(xEnd-xStart)/2;
		yCenter=(yEnd-yStart)/2;
		h=xEnd-xStart;  // bigger half-axis
		l=yEnd-yStart;   //small half-axis
		square=h*l*3.14;}
	public String toString(){
		return "ellipse[ellipse(x= " + xCenter + ", y= " + yCenter + ") small half-axis = " + h + "bigger half-axis = " + l + "Square =  "+square + "]"; 
	}
}
