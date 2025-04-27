package packageMorph;

public class SingleList<T> {
	Node<T> head;
	public int size;
	final int Max = 5;
	
	public SingleList() {
		head = null;
		size = 0;
	}
	
	//add data
		public void push(T data) {
			
			 if (size >= Max) {
		            System.out.println("Database is full! Maximum " + Max + " students allowed.");
		            return;
		        }        
		        Node<T> newNode = new Node<T>(data);
		        newNode.next = head;
		        head = newNode;
		        size++;
		    }
		
		
	    //Is the list empty (true or false {boolean})
	    public boolean isEmpty() {
	        return head == null;
	    }
		
		// Remove all data
	    public void popAll() {
	    	 if (isEmpty()) { //Checks boolean
	    	        System.out.println("The list is already empty!");
	    	        return;
	    	    }
	    	    head = null;
	    	    size = 0;
	    	    System.out.println("All student data has been successfully removed!");
	    }
		    
		    //Method to display student data
		  public void displayAllStudents() {
		      if (isEmpty()) {
		          System.out.println("Database is empty!");
		          return; }
		 
		      
		      System.out.println("\nStudent Database: " + size);
		      System.out.println("--------------------------------------------------");
		      System.out.printf("%-10s %-30s %-50s\n", "ID", "Name", "Degree"); //format printer, {-} means the string will be moved to the left
		        
		      Node<T> current = head;
		      while (current != null) {
		    	  Student student = (Student) current.data; //cast to Student
		          System.out.printf("%-10d %-30s %-50s\n", student.getNIM(), student.getname(), student.getdegree());
		          current = current.next;
		      }
		      System.out.println("--------------------------------------------------");
         }
}

