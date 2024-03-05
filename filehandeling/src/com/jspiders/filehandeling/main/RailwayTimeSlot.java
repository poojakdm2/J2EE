package com.jspiders.filehandeling.main;



public class RailwayTimeSlot {
	public static void main(String[] args) {
		int a[][]= {{12,72,48},{84,24,60},{8,96,36}};
		int b[][]= {{4,20,16},{8,12,24},{32,28,38}};
		int  c[] []=new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
