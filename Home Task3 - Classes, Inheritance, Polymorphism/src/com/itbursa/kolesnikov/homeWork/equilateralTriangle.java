package com.itbursa.kolesnikov.homeWork;

public class equilateralTriangle extends Figure {
	int a;
	equilateralTriangle(int x, int y, int a1){ // Конструктор по центру и стороне
		xCenter=x;
		yCenter=y;
		a=a1;
		square=(Math.sqrt(3)*a*a)/4;
	}
	equilateralTriangle(int xOne, int yOne, int xTwo, int yTwo, int xThree, int yThree){ // Конструктор по трем  точкам
		xCenter=(xOne-xThree)/2;                              //           2
		yCenter=(yOne-yThree)/2;                              //         1   3
		a=xOne-xThree;
		square=(Math.sqrt(3)*a*a)/4;
	}
	public String toString(){
		return "equilateralTriangle[equilateralTriangle(x= " + xCenter + ", y= " + yCenter + ") Side = " + a + "Square =  "+square + "]"; 
	}
}
