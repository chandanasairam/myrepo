package com.tnsif.For;

public class Fordemo {
	//ForEach demo

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		for(int i:a)
			System.out.println(i);    //10 20 30 40 50
		
		
		char a1[]= {'s','b','a','d'};
		{
			for(char i1:a1)
				System.out.println(i1);         //s b a d
		}
		
		
		//For demo
		//for(int i=1;i<=1000;i++)       //1--------------------1000
		for(int i=1000;i>=1;i--)        //1000 -------------------1
			System.out.println("the value of i is:"+i);
	}

}
