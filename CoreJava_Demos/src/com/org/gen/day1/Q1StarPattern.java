package com.org.gen.day1;

public class Q1StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print("*");
			System.out.print("\n");
		}

	}

}
