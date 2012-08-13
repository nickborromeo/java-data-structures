/*
 * Implemenation of a Stack
 */

package com.borromeo.stack;

import java.io.*;
import java.util.*;

public class Stack{
	private ArrayList pool = new ArrayList();
	
	public Stack(){
		
	}
	
	public Stack(int n){
		pool.ensureCapacity(n);	
	}
	
	public void clear(){
		pool.clear();
	}
	
	public boolean isEmpty(){
		return pool.isEmpty();
	}
	
	public Object pop(){
		if(isEmpty())
			System.out.println("The Stack is EMPTY");
			//throw new EmptyStackException();
		return pool.remove(pool.size()-1);
	}
	
	public void push(Object el){
		pool.add(el);
	}
	
	public String toString(){
		return pool.toString();
	}
	
	/*public Object topEl(){
	if(isEmpty())
		throw new EmptyStackException();
	return pool.lastElement();
}//*/

		
	
}//end - class

	
	
