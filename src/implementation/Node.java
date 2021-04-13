package implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {
    //complete node class
	private E data;
	private Node<E> left;
	private Node<E> right;
	
	public Node(E element) {
		this.data = element;
		this.left = null;
		this.right = null;
	}
	
	public void setData(E element) {
		data = element;
	}
	
	public void setLeft(Node<E> node) {
		left = node;
	}
	
	public void setRight(Node<E> node) {
		right = node;
	}
	
	public E getData() {
		return data;
	}
	
	public Node<E> getLeft(){
		return left;
	}
	
	public Node<E> getRight(){
		return right;
	}
}
