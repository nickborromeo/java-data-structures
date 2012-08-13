// Nicholas Borromeo
// Doubly Linked List 

package com.borromeo.dnode;

//***********************  IntDLLNode.java  *********************

public class IntDLLNode {
    public int info;
    public IntDLLNode next = null;
	public IntDLLNode prev = null;
    
	IntDLLNode() {
    }
    public IntDLLNode(int el) {
        info =  el;
    }
    public IntDLLNode(int el, IntDLLNode n, IntDLLNode p) {
        info = el; next = n; prev = p; 
    }
} 

