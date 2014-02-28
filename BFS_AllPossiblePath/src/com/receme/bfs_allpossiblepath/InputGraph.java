package com.receme.bfs_allpossiblepath;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


public class InputGraph {
	
	public Map<Character, Vector<Node> > graph;
	public Vector<Node> nodes = null;
	
	public InputGraph(){
		
		graph = new HashMap<Character, Vector<Node>>();
		
		//for node A
		nodes = new Vector<Node>();
		nodes.add(new Node('B'));
		nodes.add(new Node('C'));
		nodes.add(new Node('E'));
		graph.put('A', nodes);
		
		
		
		
		// for node B
		nodes = new Vector<Node>();
		nodes.add(new Node('A'));
		nodes.add(new Node('C'));
		nodes.add(new Node('D'));
		graph.put('B', nodes);
		
		// for node C
		nodes = new Vector<Node>();
		nodes.add(new Node('D'));
		graph.put('C', nodes);
	

		// for node D
		nodes = new Vector<Node>();
		nodes.add(new Node('C'));
		graph.put('D', nodes);
		

		// for node E
		nodes = new Vector<Node>();
		nodes.add(new Node('F'));
		nodes.add(new Node('D'));
		graph.put('E', nodes);


		// for node F
		nodes = new Vector<Node>();
		nodes.add(new Node('C'));
		graph.put('F', nodes);
		
				
		
	}
	public Map<Character, Vector<Node> > getInput(){
		
		return graph;
	}

}
