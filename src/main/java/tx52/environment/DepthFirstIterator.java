package tx52.environment;

import java.util.Stack;

public class DepthFirstIterator {
	
	Stack<TreeNode> stack = new Stack<TreeNode>();
	
	DepthFirstIterator(RTree t) {
		if(t.getRoot()!=null){
			stack.push(t.getRoot());
		}
	}
	
	public boolean hasNext(){
		return !stack.isEmpty();
	}
	
	public TreeNode next(){ //TODO Comprendre celui la
		TreeNode top = stack.pop();
		for(TreeNode child : top.getChildren()){
			stack.push(child);
		}
		return top;
	}	

}
