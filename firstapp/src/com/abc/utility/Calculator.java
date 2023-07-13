package com.abc.utility;

public class Calculator {
	public static final double PI=3.14;
	public static int sum(int x , int y) {
		return x+y;
	}
	public static int power(int x ,int n) {
		int res=1;
		for(;n>0;n--);
			res=res*x;
		return res;
	}
	
}
