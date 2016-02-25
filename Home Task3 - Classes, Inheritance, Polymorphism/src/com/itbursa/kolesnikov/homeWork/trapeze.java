package com.itbursa.kolesnikov.homeWork;

public class trapeze extends Figure { 
	int middleLine, high;
	trapeze (int x, int y,int middleLine1, int high1){  // Конструктор по средней линии и высоте
		xCenter=x;
		yCenter=y;
		high=high1;
		square=middleLine1*high;
		middleLine=middleLine1;
	}
	trapeze (int x1,int y1, int x2,int y2, int x3,int y3, int x4,int y4){
		xCenter=(x1-x4)/2;                      //       2    3
		yCenter=(y1-y2)/2;                     //     1          4 
		square=(((x2-x3)+(x1-x4))*(y1-y2))/2; 
		middleLine =((x2-x3)+(x1-x4))/2;
	}
	public String toString(){
		return "trapeze[trapeze(x= " + xCenter + ", y= " + yCenter + ")" + "middleLine = " +  middleLine + "  Square =  "+square + "]"; 
	}
	public void scaling(int delta){
		middleLine*=delta;
		high*=delta;
		square=middleLine*high;
	}
}
