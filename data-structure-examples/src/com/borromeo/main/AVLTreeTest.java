/*
 * Class to test the features and methods of the AVL class definition
 */

package com.borromeo.main;

import java.io.*;
import java.util.*;

import com.borromeo.avl.IntAVL;

public class AVLTreeTest {
	
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader (new FileReader("balance.in")); 
		
		while(stdin.ready()){
			
			String [] tokens = stdin.readLine().split(" ");
			IntAVL tree = new IntAVL();
			initialize(tree,tokens);
			
			tree.inorder();
			System.out.println();
		
		}//end while
		
	}//end main
	
	public static void initialize(IntAVL tree,String [] input) {
		
		for (int i=0; i<input.length; i++) {
			int num = Integer.parseInt(input[i].trim());
			tree.insert(num);
		}//end for
	}
		
}  //end TestBST

