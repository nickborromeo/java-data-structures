//************************  CircularLinkedList.java  **************************
//an interface for a circular linked list

package com.borromeo.clist;

import com.borromeo.snode.IntSLLNode;



interface CircularLinkedList {
    public boolean isEmpty();
    public void addToHead(int el);
    public void addToTail(int el);
    public int deleteFromHead(); // delete the head and return its info;    
    public int deleteFromTail(); // delete the tail and return its info;
    public void printAll();
    public boolean isInList(int el);
    public void delete(int el);  // delete the node with an element el;
    void deleteIthNode(int i);
	void insertBefore(IntSLLNode p, int n);
	void insertAfter(IntSLLNode p, int n);
	void reverseList();
	int search(int el); //returns the position of the element; otherwise, -1
}

