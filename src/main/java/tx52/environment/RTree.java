package tx52.environment;

import java.util.Collection;

public class RTree {
	
	private TreeNode root;
	
	RTree(Collection<EnvironmentObject> objects){
		setRoot(new TreeNode(new MinimumBoundingRectangle())); //TODO need to define what is the default box
		for( EnvironmentObject o : objects){
			getRoot().add(o);
		}
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

}
