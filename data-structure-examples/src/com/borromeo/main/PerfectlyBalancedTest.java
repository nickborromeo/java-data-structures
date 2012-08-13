package com.borromeo.main;
/*
 * This test check if the given Binary Tree is perfectly balanced
 */

import java.io.*;
import java.util.*;

import com.borromeo.tree.ExtIntBST;
import com.borromeo.tree.IntBST;

public class PerfectlyBalancedTest {
	
	//static final int SIZE = 10;
	
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader (new FileReader("perfect-balance.in")); 
		
		while(stdin.ready()){
			
			String [] tokens = stdin.readLine().split(" ");
			ExtIntBST tree = new ExtIntBST();
			initialize(tree,tokens);
				
			
			boolean perfect = tree.checkPerfection();
			if(perfect)
				System.out.println("The tree is perfectly balanced.");
			else
				System.out.println("The tree is not perfectly balanced.");
			
		}//end while
		
	}
	
	
	public static void initialize(IntBST tree,String [] input) {
		
		//System.out.print("Initial Values: ");
		for (int i=0; i<input.length; i++) {
			int num = Integer.parseInt(input[i].trim());
			tree.insert(num);
			//System.out.print(num + " ");
		}//end for
		//System.out.println("\n");
	}
		
}  //end TestBST

