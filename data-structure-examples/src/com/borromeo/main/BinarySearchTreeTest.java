/*
 * This class will test the basic features of a Binary Search Tree
 */

package com.borromeo.main;

import com.borromeo.tree.*;
import java.io.*;
import java.util.*;

import com.borromeo.tree.ExtIntBST;

public class BinarySearchTreeTest {
	
	//static final int SIZE = 10;
	
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader (new FileReader("bst.in"));
		
		while(stdin.ready()){
	
		String [] tokens = stdin.readLine().split(" "); 
		
		ExtIntBST tree = new ExtIntBST();
		
		initialize(tree,tokens);
			
		/*if (tree.isInTree(25))
			System.out.println("25 found!");
		else
			System.out.println("25 not found!");
		
		
		tree.insert(101);
		tree.insert(10);*/
					
		/*System.out.print("BREADTH FIRST - ");
		tree.breadthFirst();
		System.out.println();*/
		
		System.out.print("PREORDER - ");
		tree.preorder();
		System.out.println();

		System.out.print("INORDER - ");
		tree.inorder();
		System.out.println();

		System.out.print("POSTORDER - ");
		tree.postorder();
		System.out.println("\n");
		
		}
		
		/*System.out.println("no. of nodes = "+ tree.countNode());
		System.out.println("no. of leaves = "+ tree.countLeaves());
		System.out.println("no. of right children = "+ tree.countRightChildren());
		System.out.println("no. of left children = "+ tree.countLeftChildren());
		System.out.println("height of the tree = "+ tree.height());*/
		
	}
	
	
	public static void initialize(IntBST tree,String [] input) {
		
		System.out.print("Initial Values: ");
		
		for (int i=0; i<input.length; i++) {
			
			int num = Integer.parseInt(input[i].trim());
			tree.insert(num);
			System.out.print(num + " ");
		}
		System.out.println("\n");
	}
	
		
}  //end TestBST

