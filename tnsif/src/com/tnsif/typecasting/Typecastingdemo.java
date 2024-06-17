package com.tnsif.typecasting;

public class Typecastingdemo {
	//widening compiler implicit

	public static void main(String[] args) {
	byte b=10;
	int i=b;
	System.out.println(i);      //10
	
	float f=22.3f;
	double d=f;
	System.out.println(d);     //22.299999237060547
	
	//narrowing programmer explicit
	float f2=34.56f;
	int r=(int)f2;
	System.out.println(r);    //34

	}

}
