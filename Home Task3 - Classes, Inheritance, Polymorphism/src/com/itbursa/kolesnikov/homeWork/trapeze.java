package com.itbursa.kolesnikov.homeWork;

public class trapeze extends Figure { 
	int middleLine;
	trapeze (int x, int y,int middleLine1, int high){  // ����������� �� ������� ����� � ������
		xCenter=x;
		yCenter=y;
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
		return "trapeze[trapeze(x= " + xCenter + ", y= " + yCenter + ")" + "middleLine = " +  middleLine + "Square =  "+square + "]"; 
	}
}
