package com.blz.linecomparison;

public class LineComparison {

	public static void main(String[] args) {

		System.out.println("Welcome To Line Comparison Computation Programs");

//      point coordinates		
		long x1=0,x2=0,y1=0,y2=0;

        double len1;
	
        len1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	    
        System.out.println("Length of line is : "+len1);
	}

}
