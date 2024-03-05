package com.jspiders.filehandeling.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AvailableSlot {
	 public static void main(String[] args) {
	    	int[] a = {0, 5, 9, 15, 18, 22};
	        int[] b = {3, 9, 12, 18, 20, 24};
	        ArrayList< Integer> c=new ArrayList<Integer>();
	        ArrayList<Integer> d=new ArrayList<Integer>();
	        for(int i=0;i<a.length-1;i++)
	        {
	        	for(int j=0;j<b.length;j++)
	        	{
	        		if(b[j]!=a[i+1])
	        		{
	        			c.add(b[j]);
	        			d.add(a[i]+1);
	        		}
	        	}
	        }
	      for (Integer integer : d) {
			System.out.print(integer+" ");
		}
	      System.out.println();
	      for (Integer integer : c) {
				System.out.print(integer+" ");
			}
	        

	        

	       
	    
	    }
	}


	

	
	    



