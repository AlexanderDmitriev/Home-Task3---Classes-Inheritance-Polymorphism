package com.itbursa.kolesnikov.homeWork;

public class parallelogram extends Figure {
  int a,b, alfa;
  parallelogram(int x,int y, int a1, int b1, int alf){  // Конструктор центр + стороны
	  a=a1;
	  b=b1;
	  alfa=alf;
	  xCenter=x;                            
	  yCenter=y;
	  square=a*b*Math.sin(alfa);
  }
  parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
	  xCenter=(x4-x1)/2;                //    2        4
	  yCenter=(y4-y1)/2;              //   1        3
	  square=(y2-y1)*(x2-x1);}
  public String toString(){
		return "parallelogram[parallelogram(x= " + xCenter + ", y= " + yCenter + ") Side A = " + a + "  Side B = " + b + "  Square =  "+square + "]"; 
	}
  public void scaling(int delta){
		a*=delta;
		b*=delta;
		square=a*b*Math.sin(alfa);
	}
}
