package ds.bst;

public class App {

	public static void main(String[] args) {
		BinaryTree bt = create();
	    bt.preOrder();
	    bt.inOrder();
	    bt.postOrder();
	}
	
	public static BinaryTree create() {
	    BinaryTree tree = new BinaryTree();
	    BinaryTree.TreeNode root = new BinaryTree.TreeNode("4");
	    tree.root = root;
	    tree.root.left = new BinaryTree.TreeNode("2");
	    tree.root.left.left = new BinaryTree.TreeNode("1");

	    tree.root.left.right = new BinaryTree.TreeNode("3");
	    tree.root.right = new BinaryTree.TreeNode("5");
	    tree.root.right.right = new BinaryTree.TreeNode("6");

	    return tree;
	}
}
