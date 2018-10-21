package ds.bst;

public class BinaryTree {
	static class TreeNode {
		String data;
		TreeNode left, right;
		
		TreeNode(String value) {
			this.data = value;
			left = right = null;
		}
		
		boolean isLeaf() {
			return left == null ? right == null : false;
		}
	}
	
	TreeNode root;
	
	public void preOrder() {
		preOrder(root);
	}
	
	private void preOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.data);
		inOrder(node.right);
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	private void postOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data);
	}
}
