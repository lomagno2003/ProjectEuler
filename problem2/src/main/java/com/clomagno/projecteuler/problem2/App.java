package com.clomagno.projecteuler.problem2;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final int LIMIT = 4000000;

	private static class Node {
		public int number;
		
		private Node next;
		
		private Node previous;
	}
	
    public static void main( String[] args )
    {
    	/* Initialization of fobonacci */
    	Node nodeA = new Node();
    	Node nodeB = new Node();
    	Node nodeC = new Node();
    	
    	/* Connect the nodes */
    	nodeA.next = nodeB;
    	nodeA.previous = nodeC;
    	nodeB.next = nodeC;
    	nodeB.previous = nodeA;
    	nodeC.next = nodeA;
    	nodeC.previous = nodeB;
    	
    	/* Assign values */
    	nodeA.number = 1;
    	nodeB.number = 2;
    	nodeC.number = 3;
    	
    	Node actualNode = nodeA;
    	
    	int sum = 2;
    	
        while(actualNode.previous.number < LIMIT) {
        	actualNode.number = 
        		actualNode.previous.number + 
        		actualNode.previous.previous.number;
        	
        	if(actualNode.number % 2 == 0) {
        		sum += actualNode.number;
        	}
        	
        	actualNode = actualNode.next;
        }
        
        System.out.println(sum);
    }
}
