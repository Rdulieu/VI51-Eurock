package tx52.environment;

import java.util.ArrayList;
import java.util.Stack;

public class TreeNode {

	private MinimumBoundingRectangle box;
	private ArrayList<EnvironmentObject> objects;
	private TreeNode[] children = null;
	

	TreeNode(MinimumBoundingRectangle box) {
		this.setBox(box);
	}

	public void add(EnvironmentObject o) {
		if(objects.size()<15 && getChildren()==null){  //TODO define 15 as a parameter
			objects.add(o);
		}else{
			if(getChildren()==null){
				setChildren(new TreeNode[4]); //TODO define 4 as a parameter
				for(int i=0;i<4;i++){
					getChildren()[i]=new TreeNode(createChildBox(getBox(),i));
				}
			}
			
			ArrayList<EnvironmentObject> P = objects;
			objects = new ArrayList<EnvironmentObject>();
			 
			for(EnvironmentObject e : P){
				addInChild(e);
			}
		}
		addInChild(o);
		
	}

	private void addInChild(EnvironmentObject e) {
		int index=0;
		int n=0;
		
		for(int i=0;i<4;i++){  //TODO define 4 as a parameter
			if(getChildren()[i].getBox().intersects(e.getBox())){
				n++;
				index=i;
				//break ? 
			}
		}
		if(n==1){
			getChildren()[index].add(e);;
		}else{
			objects.add(e);
		}
		//TODO need a way to determine where is an object when it's in 2 part of the tree
		/*for(EnvironmentObject o : objects){
			root.add(o);
		}*/
		
	}

	private MinimumBoundingRectangle createChildBox(MinimumBoundingRectangle box2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public MinimumBoundingRectangle getBox() {
		return box;
	}

	public void setBox(MinimumBoundingRectangle box) {
		this.box = box;
	}

	public TreeNode[] getChildren() {
		return children;
	}

	public void setChildren(TreeNode[] children) {
		this.children = children;
	}

	/**
	 * fonction temporaire -> remplaçable par l'iterateur
	 * @param t
	 */
	public void/*?*/ depthFirst(RTree t){

		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		/*assert(t.getRoot()!=null)*/ //TODO use assert keyword
		if(t.getRoot()!=null){
			stack.push(t.getRoot());
			while(!stack.isEmpty()){ //WARNING non stoppable
				TreeNode top = stack.pop();
				for(TreeNode child : top.getChildren()){
					stack.push(child);
				} // do something with top
			}
		}
	}
	
	

}
