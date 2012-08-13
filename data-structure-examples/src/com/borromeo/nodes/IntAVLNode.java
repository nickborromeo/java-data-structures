/*
 * This class extends IntBSTNode to make specific methods for AVL Trees
 */

package com.borromeo.nodes;

public class IntAVLNode extends IntBSTNode{
	
	public int balanceFactor,key;
    public IntAVLNode left, right, parent;
    
    public IntAVLNode() {
        left = right = parent = null;
    }
    
    public IntAVLNode(int el, IntAVLNode par) {
        this(el,null,null,par);
    }
    
    public IntAVLNode(int el, IntAVLNode lt, IntAVLNode rt, IntAVLNode par) {
        key = el; 
       	left = lt; 
        right = rt; 
        parent = par;
    }
    
    public String toString() {
        return ("" + key);
    }
	
}//end - class

	
	
