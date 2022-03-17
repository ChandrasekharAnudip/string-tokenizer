package com.strings.demo;

import java.util.StringTokenizer;

public class String001 {

	public static void main(String[] args) {
		//1. hasMoreTokens() and nextToken()
		/*
		StringTokenizer st = new StringTokenizer("My name is Chandru");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		*/
		
		//2. hasMoreElements() and hasElement()
		/*
		StringTokenizer st = new StringTokenizer("My name is Chandru");
		
		while(st.hasMoreElements())
			System.out.println(st.nextElement());
		*/
		
		//3. countTokens();
		/*
		StringTokenizer st = new StringTokenizer("My name is Chandru");
		System.out.println(st.countTokens());
		*/
		
		StringTokenizer st = new StringTokenizer("My name is Chandru","a");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
	}

}
