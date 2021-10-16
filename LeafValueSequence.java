package test;

import java.util.ArrayList;
import java.util.List;

public class LeafValueSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root1=new TreeNode(1);
		TreeNode root2=new TreeNode(2);
		boolean b=leafSimilar(root1, root2);
		System.out.println(b);

	}

	    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
	    	List<Integer> l1=new ArrayList<Integer>();
	    	List<Integer> l2=new ArrayList<Integer>();
	        List<Integer> list1=createLeafSeq(root1,l1);
	        List<Integer> list2=createLeafSeq(root2,l2);
	        System.out.println(list1);
	        System.out.println(list2);
	        if(list1.equals(list2))
	        	return true;
	        else 
	        	return false;
	        

	    }
	    
	    public static List<Integer> createLeafSeq(TreeNode root,List<Integer> list)
	    {
	        if(root==null)
	            return null;
	        if(root.left==null && root.right==null)
	            list.add(root.val);
	        if(root.left!=null)
	            createLeafSeq(root.left,list);
	        if(root.right!=null)
	            createLeafSeq(root.right,list);
	        
	        return list;
	    }
}
