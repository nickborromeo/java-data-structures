package com.borromeo.slist;
//************************  LinkedListExercise.java  **************************
//an interface (exercise) for a singly-linked list
import java.io.*;

import com.borromeo.snode.IntSLLNode;

interface SingleLinkedList {
    public boolean isEmpty();
    public void addToHead(int el);
    public void addToTail(int el);
    public int deleteFromHead(); // delete the head and return its info;    
    public int deleteFromTail(); // delete the tail and return its info;
    public void printAll();
    public boolean isInList(int el);
    public void delete(int el);  // delete the node with an element el;
    
    
    // EXERCISE STARTS HERE 
    
    // 1). Delete an ith node on a linked list.  Be sure that such node exists.
	public void deleteIthNode(int i) throws IOException;

	// 2). if p -> 2 in list 1 2 3, then after inserting 4, the list is 1 4 2 3;
	public void insertBefore(IntSLLNode p, int n);

	// 3). if p -> 2 in list 1 2 3, then after inserting 4, the list is 1 2 4 3;
	public void insertAfter(IntSLLNode p, int n);

	// 4). reverse a singly linked-list using only one pass through the list;
	public void reverseList();
	

}

