package com.tnsif.Switch;

public class Switchdemo {

	public static void main(String[] args) {
		char x='%';
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x+"is a letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+"is a digit");
			break;
		case 'w':
		case 'W':
		System.out.println(x+"is a white space");
		break;
		case 's':
		case 'S':
			System.out.println(x+"is a Special symbol");
			default: 
				System.out.println(x+"is other than letter,digit,space, or Special symbol");
		}


	}

}
