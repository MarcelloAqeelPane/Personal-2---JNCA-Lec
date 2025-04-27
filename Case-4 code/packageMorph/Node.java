package packageMorph;

//IMPORTANT!!
// T is the Generic Type variable used to state something can use any variable.
// If we leave it as <T>, we can use <Student> in the main code to convert it all
public class Node<T> {
	
	public T data;
	public Node<T> next;
	
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
}
