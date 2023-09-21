package ds.bst;

public class Main {
	
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		//bst.preOrder(bst.root);
		bst.levelOrder();
		bst.search(bst.root, 80);
	}

}
