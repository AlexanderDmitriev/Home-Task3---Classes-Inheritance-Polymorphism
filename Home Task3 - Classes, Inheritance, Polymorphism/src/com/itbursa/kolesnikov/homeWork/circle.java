package com.itbursa.kolesnikov.homeWork;

public class circle extends Figure {
	int radius;
circle(int x1, int y1, int radius1){
	xCenter=x1;
	yCenter=y1;
	radius=radius1;
	square=3.14*radius*radius;}
//////////
public String toString(){
	return "Circle[center(x= " + xCenter + ", y= " + yCenter + ") R = " + radius + "Square =  "+square + "]"; 
}
}
