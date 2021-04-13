package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
	Node<E> root;
	

    @Override
    public void insert(E data) {
    	if( root == null ) {
    		root = new implementation.Node(data);
    	}
    	else {
    		implementation.Node<E> parent = null;
    		implementation.Node<E> temp =  (implementation.Node<E>) root;
    		while( temp != null ) {
    			if( data.compareTo( temp.getData() ) <= 0 ) {
    				parent = temp;
    				temp = temp.getLeft();
    			}
    			else {
    				parent = temp;
    				temp = temp.getRight();
    			}
    		}
    		if( data.compareTo( parent.getData() ) <= 0 ) {
    			parent.setLeft(new implementation.Node(data) );
    		}
    		else {
    			parent.setRight(new implementation.Node(data) );
    		}
    	}
    }

    @Override
    public boolean search(E searchElement) {
    	implementation.Node<E> temp = (implementation.Node<E>)root; 
    	while( temp != null ) {
    		if( searchElement.compareTo( temp.getData() ) == 0 ) {
    			return true;
    		}
    		else if( searchElement.compareTo( temp.getData() ) < 0  ) {
    			temp = temp.getLeft();
    		}
    		else {
    			temp = temp.getRight();
    		}
    	}
        return false;
    }

    @Override
    public void inOrder(Node<E> node) {
    	if( node != null ) {
    		inOrder( ((implementation.Node<E>)node).getLeft());
    	    System.out.print( ((implementation.Node<E>)node).getData()+" , ");
    	    inOrder( ((implementation.Node<E>)node).getRight() );
    	}
    }

    @Override
    public void preOrder(Node<E> node) {
    	if( node != null ) {
    	    System.out.print( ((implementation.Node<E>)node).getData()+" , ");
    		preOrder( ((implementation.Node<E>)node).getLeft());
    	    preOrder( ((implementation.Node<E>)node).getRight() );
    	}
    }

    @Override
    public void postOrder(Node<E> node) {
		postOrder( ((implementation.Node<E>)node).getLeft());
	    postOrder( ((implementation.Node<E>)node).getRight() );
    	System.out.print( ((implementation.Node<E>)node).getData()+" , " );
    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
    
}
