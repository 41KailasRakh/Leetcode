package learn.data.structure.queue;

import java.util.NoSuchElementException;
import java.util.Scanner;

/* Class Array Queue*/
class ArrayQueue{
	protected int [] queue ;
	protected int front, rear,len,size ;	
	
	/*Constructor*/
	public ArrayQueue(int size) {
		this.size = size ;
		rear = -1 ;
		front = -1 ;
		len = 0 ;
		queue = new int[size];
	}
	
	/* Function to check if queue is empty */
	public boolean isEmpty () {
		return front == -1 ;
	}
	
	/* Function to check if queue is full */
	public boolean isFull() {
		return front == 0 && rear == size -1; 
	}
	
	/* Function to get the size of queue */
	public int getSize() {
		return len ;
	}
	
	/* Function to check the front element of queue */
	public int peek() {
		if(isEmpty()) {
			throw new NoSuchElementException("Underflow Excepetion: Queue is Empty !!");
		}
		return queue[front] ;
	}
	
	/* Function to insert an element to the queue */
	public void insert( int n) {
		
		if(rear == -1) {
			rear = 0 ;
			front = 0 ;
			queue[rear] = n ;
		}		
		else if(rear +1 >= size) {
			throw new NoSuchElementException("Overflow Excepetion: Queue is Full !!");
		}
		else if(rear +1 < size) {
			queue[++rear] = n ;
		}
		
		len ++ ;
	}
	
	/* Function to remove front element of queue */
	public int remove() {
		
		if(isEmpty()) {
			throw new NoSuchElementException("Underflow Excepetion: Queue is Empty !!");
		}
		else {
			int element = queue[front] ;
			if(front == rear) {
				rear = -1 ;
				front = -1 ;
			}else {
				front ++ ;
			}
			return element ;
		}			
	}
	
	/* Function to display the status of Queue */
	public void display() {
		
		if(len == 0) {
			System.out.println("Queue is empty !!!");
			return ;
		}
		
		for(int i =0 ; i < size ; i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
} 

public class QueueImplement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------Array Queue Test-------------");
		System.out.println("Enter size of integer array ");
		int n = scan.nextInt() ;
		 /* creating object of class arrayQueue */
        ArrayQueue q = new ArrayQueue(n);        
        /* Perform Queue Operations */
        char ch ;
        do {
        	System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. size");
            
            int choice = scan.nextInt() ;
            switch(choice) {
            
            case 1 :
            	System.out.println("Enter integer element to insert");
            	try {
					q.insert(scan.nextInt());
					
				} catch (Exception e) {
					System.out.println("Error: "+e.getLocalizedMessage());
				}
            	break ;
            case 2 : 
                try
                {
                    System.out.println("Removed Element = "+q.remove());
                }
                catch(Exception e)
                {
                    System.out.println("Error : " +e.getMessage());
                }
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+q.peek());
                }
                catch(Exception e)
                {
                    System.out.println("Error : "+e.getMessage());
                }
                break; 
            case 4 : 
                System.out.println("Empty status = "+q.isEmpty());
                break;                
            case 5 : 
                System.out.println("Full status = "+q.isFull());
                break;                          
            case 6 : 
                System.out.println("Size = "+ q.getSize());
                break;                         
            default : System.out.println("Wrong Entry \n ");
                break;
                
            }
        	/* display Queue */
            q.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        }while(ch == 'Y' || ch == 'y');

	}

}
