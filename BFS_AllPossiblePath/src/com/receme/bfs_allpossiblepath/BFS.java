package com.receme.bfs_allpossiblepath;


import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class BFS {
	
	//private Queue<Integer> path_queue = new LinkedList<Integer>();
	private MyQueue q;
	private Vector<Node> temp_path, tmp_path;
	private Map<Character, Vector<Node>> graph;
	public Vector<Node> all_linkNodes;
	private Node startNode;
	private Node endNode;
	
	public BFS(Map<Character, Vector<Node>> graph2, Node _startNode,
			Node _endNode){
		
		q = new MyQueue();
		temp_path = new Vector<Node>();
		tmp_path = new Vector<Node>();
		graph = new HashMap<Character, Vector<Node>>();
		all_linkNodes = new Vector<Node>();
		
		this.graph = graph2;
		this.startNode = _startNode;
		this.endNode = _endNode;
		
			
	}
	
	public void getAvailablePath(){
		bfs_Implementation();
	}
	
	private void bfs_Implementation(){
		
		temp_path.add(startNode);
		//print startNode;
		q.enQueue(temp_path);
		
		
		while(!q.isEmpty()) {
			tmp_path = q.deQueue();
			//System.out.println(tmp_path.size());
			
			Node last_node = new Node();
			last_node = q.getLastNode(tmp_path);
						
			if(last_node.val == endNode.val){
				System.out.print("Valid path: "); 
				printPath(tmp_path);
				
			}
		
			Vector<Node> all_linkNodes = graph.get(last_node.val);
						
			for(int i=0; i< all_linkNodes.size(); i++){
				
				Node linknode = all_linkNodes.get(i);
				
				if(!isIn_tmp_path(linknode)){
					Vector<Node> newPath = new Vector<Node>();
					newPath.addAll(tmp_path);
					newPath.add(linknode);
		
					q.enQueue(newPath);
					
				}
			}		
			
		}		
	}
	
	
	private void printPath(Vector<Node> path){
		
		for(int i = 0;i<path.size(); i++){
			System.out.print(path.elementAt(i).val+" ");
			
		}
		System.out.print("\n");
	}
	
	
	private boolean isIn_tmp_path(Node linkNode){
		
		for(int j = 0; j<tmp_path.size(); j++){
			Node n = tmp_path.get(j);
			
			if(linkNode.val == n.val )
				return true;
		}
		
		return false;
		
	}
	
	

}
