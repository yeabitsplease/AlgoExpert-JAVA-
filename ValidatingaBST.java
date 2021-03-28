/*

Validating a Binary Search Tree.

*/

import java.util.*;

class ValidatingaBST {
  public static boolean validateBst(BST tree) {
    return validateBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
	
	public static boolean validateBST(BST tree, int minVal, int maxVal){
		if(tree.value<minVal || tree.value>=maxVal){
			return false;
		}
		if(tree.left!=null && !validateBST(tree.left, minVal, tree.value)){
			return false;
		}
		if(tree.right!=null && !validateBST(tree.right, tree.value, maxVal)){
			return false;
		}
		return true;
		
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
