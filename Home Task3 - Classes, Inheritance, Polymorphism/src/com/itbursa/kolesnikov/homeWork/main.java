package com.itbursa.kolesnikov.homeWork;

public class main {

public static void main (String[] args){
	///////////Proverka circle
	circle objCir1=new circle(1,1,1);
	System.out.println(objCir1.toString());
	objCir1.moving(1,1);
	System.out.println(objCir1.toString());
	objCir1.scaling(3);
	System.out.println(objCir1.toString());
	//////////Proverka ellipse
	ellipse objEl1=new ellipse(3,3,3,1);
	System.out.println(objEl1.toString());
	objEl1.scaling(3);
	System.out.println(objEl1.toString());
	//////////Proverka eq triangle
	equilateralTriangle  objET=new equilateralTriangle(2,2,1);
	System.out.println(objET.toString());
	objET.scaling(2);
	System.out.println(objET.toString());
	/////////Proverka parallelogram
	parallelogram  objPar=new parallelogram(3,3,2,2,120);
	System.out.println(objPar.toString());
	objPar.scaling(3);
	System.out.println(objPar.toString());
	////// Proverka quadrate
	quadrate  objQ=new quadrate(4,4,1);
	System.out.println(objQ.toString());
	objQ.scaling(2);
	System.out.println(objQ.toString());
	/////// Proverka rectangle
	rectangle objRec=new rectangle(2,2,1,3);
	System.out.println(objRec.toString());
	objRec.scaling(2);
	System.out.println(objRec.toString());
	////////Proverka romb
	rhomb objRomb=new rhomb(2,2,1,120);
	System.out.println(objRomb.toString());
	objRomb.scaling(2);
	System.out.println(objRomb.toString());	
	//////Proverka  trapezii
	trapeze objTrap=new trapeze(2,2,5,7);
	System.out.println(objTrap.toString());
	objTrap.scaling(2);
	System.out.println(objTrap.toString());		
	//// Proverka  triangle
	triangle objTrian=new triangle(2,2,5,7,3);
	System.out.println(objTrian.toString());
	objTrian.scaling(2);
	System.out.println(objTrian.toString());	
}}
