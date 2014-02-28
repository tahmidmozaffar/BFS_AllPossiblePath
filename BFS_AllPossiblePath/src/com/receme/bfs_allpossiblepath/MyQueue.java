package com.receme.bfs_allpossiblepath;


import java.util.Vector;

public class MyQueue {
	
	private Vector< Vector<Node> >paths;
	
	public MyQueue(){
		paths = new Vector< Vector<Node> >();
	}
	
	public void enQueue(Vector<Node> _path){
		paths.add(_path);
	}
	
	public boolean isEmpty(){
		
		if(paths.size()==0)
			return true;
		else
			return false;
	}
	
	public Vector<Node> deQueue(){
		Vector<Node> v = new Vector<Node>();
		
		v = paths.elementAt(0);
		paths.remove(0);
		
		return v;
	}
	
	public Node getLastNode(Vector<Node> tmp_path){
		Node n = tmp_path.elementAt(tmp_path.size()-1);
		return n;
		
	}
	

}
