package com.xworkz.pattern.designPatterns;

public class RightAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
for(int i=0;i<=num;i++) {
			
			for(int j=0;j<=num;j++) {
				if(j==0 || i==num || i==j) 
			
				System.out.print("*");
				else 
					System.out.print(" ");
				}
				System.out.println();
				}
	}

}

