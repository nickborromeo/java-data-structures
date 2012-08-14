//************************  CircularLinkedListImpl.java  **************************
// A class the implements the CircularLinkedList interface

package com.borromeo.clist;

import java.io.*;

import com.borromeo.snode.IntSLLNode;

public class CircularLinkedListImpl implements CircularLinkedList {
	
	protected IntSLLNode head, tail;
	
	public CircularLinkedListImpl() {
        //head = tail = null;
    }
    
    public boolean isEmpty() {
        return tail == null;
    }//end isEmpty
    
    public void addToHead(int el) {								//adds a node in the head
    	
    	if(!isEmpty()){
    		IntSLLNode temp = new IntSLLNode(el,tail);			//if the list is not empty
    		IntSLLNode after = tail.next;
    		tail.next = temp;
    		temp.next = after;
    	}//end if
    	else{
    		tail = new IntSLLNode(el);							//if the list is empty - tail points to itself
       		tail.next = tail; 
    	}//end else
        
    }//end addToHead
    public void addToTail(int el) {								//adds a node to the tail
       if(!isEmpty()){											//if the list is not empty
       		tail.next = new IntSLLNode(el,tail.next);
       		tail = tail.next;
       }//end if
       else{													//if the list is empty
       		tail = new IntSLLNode(el);
       		tail.next = tail;
       }//end else
    }//end addToTail
    
    public int deleteFromHead() { 								// delete the head and return its info; 
        IntSLLNode temp = tail.next;
        int el = temp.info;										//this is what the function returns
        if(tail == temp)										//if there is only one element in the list
        	tail = null;
        else	
        	tail.next = temp.next;								//if there is more than one element in the list
        	
        return el;
    }//end deleteFromHead
    
    public int deleteFromTail() { 								// delete the tail and return its info;
        IntSLLNode temp,after;
        int el = tail.info;										//this is what the functions returns
        if(tail == tail.next)									//one element in the list
        	tail = null;
        else{													//more than one element
        	after = tail.next;										
        	for(temp = tail.next; temp.next != tail; temp = temp.next);		//loop to the element before the tail
        	tail = temp;
        	tail.next = after;
        }
        return el;
    }//end deleteFromTail
    
    public void printAll() {									//prints all the elements in the list
    	for (IntSLLNode tmp = tail.next; tmp != tail; tmp = tmp.next)
            System.out.print(tmp.info + " ");
        System.out.println(tail.info);                
    }//end printAll
    
    public boolean isInList(int el) {							//function that checks if the node is in the list
        IntSLLNode tmp;
        for (tmp = tail.next; tmp != tail && tmp.info != el; tmp = tmp.next);
        return tmp != null;
    
    }//end isInList
    
    public void delete(int el) {  								// delete the node with an element el;
    	IntSLLNode temp = tail.next;
    	if(tail.info == el)										//if the element passed is equal to the tail
    		deleteFromTail();
    	else if(temp.info == el)								//if the element passed is the element after the tail
    		deleteFromHead();
    	else{													//if the element is anywhere between the tail and
    		IntSLLNode marker,prev;								//tail.next		
    		for(marker = tail.next; marker != tail; marker = marker.next){
    			prev = marker.next;
    			if(prev.info == el)
    				marker.next = prev.next; 
    		}//end for
    	}//end else
        
    }//end delete
    
    public void deleteIthNode(int i){							//function that deletes the Ith node passed
    	int count = 1;
    	IntSLLNode marker;
    	for(marker = tail.next; marker != tail; marker = marker.next,count++){  //loop until the element before the
    		if(count == i)														//tail
    			delete(marker.info);	    			
    	}//end for
    	if(count == i)											//checks if the count is equal to the tail
    		deleteFromTail();
    }//end deleteIthNode
    
    public void insertBefore(IntSLLNode p, int n){				//inserts the node before the node passed
	 	if (!isEmpty()){
    		IntSLLNode check;
    		for(check = tail.next; check != tail; check = check.next){ // gives p a value of a node in the list
    	 			if(p.info == check.info)
    	 				p = check;
    	 			else if(p.info == tail.info) 				// loop does not reach tail
    	 				p = tail;								// value of tail is placed in p
    	 	}//end for
    		if(p == tail.next)									//if the node passed is the node after tail
    	 		addToHead(n);
    	 	else{												//node is anywhere except the "head"
    	 		IntSLLNode temp = new IntSLLNode(n);
    	 		IntSLLNode prev;
    	 		for(prev = tail.next; prev.next != p ; prev = prev.next); // loop that tranverses until the node before p
    	 		prev.next = temp;
    	 		temp.next = p;
    	 	}
    	}//end if
    	else
    		System.out.println("EMPTY!");
    }//end insertBefore
    
     public void insertAfter(IntSLLNode p, int n){				//function that inserts the node after p
    	if (!isEmpty()){
    		IntSLLNode check;
    		for(check = tail.next; check != tail; check = check.next)	//loop to place the value in the passed node p
    	 			if(p.info == check.info)					
    	 				p = check;
    	 	if(p.next == null)										//checks if p is the tail
    	 		addToTail(n);
    	 	else{
    	 		IntSLLNode temp = new IntSLLNode(n);
    	 		IntSLLNode after = p.next;						// saves the node after p before new node is inserted
    	 		p.next = temp;				
    	 		temp.next = after;
    	 	}
    	}//end if
    	else
    		System.out.println("EMPTY!");
    }//end insertAfter
    
    public void reverseList(){									//function that reverses the order of the list
    	IntSLLNode temp,end = tail;
    	int marker = 1;
    	for(temp = tail.next; temp != tail; temp = temp.next,marker++){
    		deleteIthNode(marker);								//as node is being added, it is also deleted because
    		addToHead(temp.info);								//what is added is a copy of the nodes in the list but
    	}														//reversed order
    	addToHead(tail.info);
    	delete(end.info);
  	}//end reverseList
  
  	public int search(int i){									//function that searches the list
  		IntSLLNode temp,temp2;
  		int pos = 1;
  		if(tail.info == i){										//if the node searched is the tail	
  			for(temp = tail.next; temp != tail; pos++,temp = temp.next);
  			return pos;
  		}//end if
  		else{													//if the node is not the tail
  			for(temp2 = tail.next; temp2 != tail; pos++,temp2 = temp2.next){
  				if(temp2.info == i)
  					return pos;
  			}//end for
  		}//end else
  	
  		return -1;												//returns this number if node searched is not in the list
  	}//end search															
	
}//end - class

	
	
