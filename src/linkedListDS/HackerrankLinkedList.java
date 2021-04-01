package linkedListDS;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class HackerrankLinkedList {

	    static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }

	    static class SinglyLinkedList {
	        public SinglyLinkedListNode head;

	        public SinglyLinkedList() {
	            this.head = null;
	        }

	      
	    }

	    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
	        while (node != null) {
	            bufferedWriter.write(String.valueOf(node.data));

	            node = node.next;

	            if (node != null) {
	                bufferedWriter.write(sep);
	            }
	        }
	    }

	    // Complete the insertNodeAtTail function below.

	    /*
	     * For your reference:
	     *
	     * SinglyLinkedListNode {
	     *     int data;
	     *     SinglyLinkedListNode next;
	     * }
	     *
	     */
	    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
	            
	        // create a new node to add to the ll
	        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
	        
	        if (head == null){
	            head = newNode;
	            return head;
	        }
	        
	        SinglyLinkedListNode curr = head;
	        
	        while(curr.next != null){
	            // iterate
	            curr = curr.next;
	        }
	        
	        curr.next = newNode;
	        
	        return head;
	    }
	    
	    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
	        
	        // Create a new node 
	        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

	        newNode.next = llist;

	        return newNode;
	    }


	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

//	        SinglyLinkedList llist = new SinglyLinkedList();
//	        
//	        System.out.println(llist);
//	        
//	        SinglyLinkedListNode curr = llist.head;
//	        
//	        while(curr.next != null) {
//	        	System.out.println(curr.data);
//	        	curr = curr.next;
//	        }

	       
	    }
	}


