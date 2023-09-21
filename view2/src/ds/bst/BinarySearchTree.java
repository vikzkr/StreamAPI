package ds.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	
	BinaryNode root;

	public BinarySearchTree() {
		this.root = null;
	}
	
	
	//Insert 
	
	private BinaryNode insert(BinaryNode currentNode, int value)
	{
		if(currentNode == null)
		{
			BinaryNode bn = new BinaryNode();
			bn.value = value;
			return bn;
		}
		else if(value <= currentNode.value)
		{
			currentNode.left = insert(currentNode.left,value);
			return currentNode;
		}
		else
		{
			currentNode.right = insert(currentNode.right,value);
			return currentNode;
		}
	}
	
	public void insert(int value)
	{
		root = insert(root,value);
	}
	
	
	//preorder
	
	public void preOrder(BinaryNode node)
	{
		if(node == null)
		{
			return;
		}
		System.out.println(node.value);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//level
	
	public void levelOrder()
	{
		Queue<BinaryNode> queue = new LinkedList();
		queue.add(root);
		while(!queue.isEmpty())
		{
			BinaryNode presentNode = queue.remove();
				System.out.println(presentNode.value);
			if(presentNode.left !=null)
			{
				queue.add(presentNode.left);
				
			}
			if(presentNode.right !=null)
			{
				queue.add(presentNode.right);
			}
		}
		
		
		}
	
	
	BinaryNode search(BinaryNode node, int value)
	{
		if(node.value==value)
		{
			return node;
		}
		else if(value> node.value)
		{
			return search(node.right,value);
		}
		else
		{
			return search(node.left,value);	
		}
	}
}
