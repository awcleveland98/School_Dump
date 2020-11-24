package edu.century.pa5;


public class BalancedBST{

	public static TreeNode generateBST(int array[], int start, int end) {
		 
		if(start > end) return null;
		
		int mid = (start + end) / 2;
		
		TreeNode root = new TreeNode(array[mid]);
		
		root.left(generateBST(array, start, mid-1));
		root.right(generateBST(array, mid+1, end));
		
		return root;
		 
	}
	
}

