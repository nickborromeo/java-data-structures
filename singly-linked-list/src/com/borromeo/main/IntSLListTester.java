package com.borromeo.main;

import java.io.*;
import com.borromeo.slist.SingleLinkedListImpl;
import com.borromeo.snode.IntSLLNode;

public class IntSLListTester{
	
	public static void main(String[] args) throws IOException{
		
		SingleLinkedListImpl myList = new SingleLinkedListImpl();
		
		while (true) {
	
		   int menu = mainMenu();	
		   process(menu, myList);
		
		}//end while
	}

	public static int mainMenu() throws IOException{
		
		System.out.println("\n\n<--- MAIN MENU --->");
		System.out.println("<1> Add to Head ");
		System.out.println("<2> Add to Tail ");
		System.out.println("<3> Delete from Head ");
		System.out.println("<4> Delete from Tail ");
		System.out.println("<5> Check if Number is in List ");
		System.out.println("<6> Delete A Number ");
		System.out.println("<7> Print List ");
		System.out.println("<8> Delete Ith Node ");
		System.out.println("<9> Insert Before ");
		System.out.println("<10> Insert After ");
		System.out.println("<11> Reverse ");
		System.out.println("<0> Exit ");
		
		System.out.print("Your choice?  ");
		int choice = inputNumber();
		 
		return choice;
		
	}
	
	public static int inputNumber() throws IOException {
	   	
	   	BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		String input = stdin.readLine();
		int num = Integer.parseInt(input);
		
		return num;

    }
    
	public static void process(int choice, SingleLinkedListImpl list) throws IOException {
		
		switch(choice) {
			case 1:  addHead(list); break;
			case 2:  addTail(list); break;
            case 3:  if (!checkEmpty(list)) list.deleteFromHead(); break;
            case 4:  if (!checkEmpty(list)) list.deleteFromTail(); break;
            case 5:  checkNumber(list); break;
            case 6:  deleteNumber(list); break;
            case 7:  print(list); break;
            case 8:  deleteIth(list); break;
            case 9:  insBefore(list); break;
            case 10:  insAfter(list); break;
            case 11:  list.reverseList(); break;
			case 0:  System.exit(0); break;
			default : System.out.println("\n\nWrong choice! Try again.");
		}
	}
	
	public static void addHead(SingleLinkedListImpl list) throws IOException {
		
		System.out.print("Input an integer: ");
		int number = inputNumber();
		list.addToHead(number);
	}

	public static void addTail(SingleLinkedListImpl list) throws IOException {
		
		System.out.print("Input an integer: ");
		int number = inputNumber();
		list.addToTail(number);
	}
	
	
	public static void print(SingleLinkedListImpl list) {
		if (!checkEmpty(list)) {		
			System.out.print("\n\nThe list contains : ");
			list.printAll();
		}
	}
	
	public static boolean checkEmpty(SingleLinkedListImpl list) {
		if (list.isEmpty()) {
			System.out.println("\n\nThe list is empty!");
			return true;
		}
		else
			return false;
	}
	
	public static void checkNumber(SingleLinkedListImpl list) throws IOException {
		
		System.out.print("Input an integer: ");
		int number = inputNumber();
		if (list.isInList(number))
			System.out.println("\n\nThe number is in the list.");
		else
			System.out.println("\n\nThe number is not in the list.");
		
	}

	public static void deleteNumber(SingleLinkedListImpl list) throws IOException {
		if (!checkEmpty(list)) {
			System.out.print("Input an integer: ");
			int number = inputNumber();
			if (list.isInList(number))
				list.delete(number);
			else
				System.out.println("\n\nThe number is not in the list.");
			
		}
	}
	
	public static void deleteIth(SingleLinkedListImpl list) throws IOException {
		if (!checkEmpty(list)) {
			System.out.print("Input an integer: ");
			int number = inputNumber();
			list.deleteIthNode(number);		
		}//end if
	}//end deleteIth
	
	public static void insBefore(SingleLinkedListImpl list) throws IOException{
		if (!checkEmpty(list)) {
			System.out.print("Input a Node: ");
			int number = inputNumber();
			if (list.isInList(number)){
				IntSLLNode p = new IntSLLNode(number);
				System.out.print("Input a Number: ");
				int num = inputNumber();
				list.insertBefore(p, num);
			}//end if
			else
				System.out.println("\n\nThe node is not in the list.");	
		}//end if
	}//end insBefore
	
	public static void insAfter(SingleLinkedListImpl list) throws IOException{
		if (!checkEmpty(list)) {
			System.out.print("Input a Node: ");
			int number = inputNumber();
			if (list.isInList(number)){
				IntSLLNode p = new IntSLLNode(number);
				System.out.print("Input a Number: ");
				int num = inputNumber();
				list.insertAfter(p, num);
			}//end if
			else
				System.out.println("\n\nThe node is not in the list.");	
		}//end if
	}//end insAfter
	
 
}