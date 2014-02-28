package com.receme.bfs_allpossiblepath;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Main {

	public static Map<Character, Vector<Node> > graph = null;
	public Vector<Node> nodes = null;
	public static HashMap v;
	static Vector<Integer> as;
	

	public static void main(String[] args){
		
		/*graph = {'A': ['B', 'C','E'],
	             'B': ['A','C', 'D'],
	             'C': ['D'],
	             'D': ['C'],
	             'E': ['F','D'],
	             'F': ['C']}
		*/
		InputGraph in = new InputGraph();
		graph = new HashMap<Character, Vector<Node>>();
		graph = in.getInput();
		
		BFS bfsAlgo = new BFS(graph, new Node('A'), new Node('D'));
		
		bfsAlgo.getAvailablePath();
		
	}


	

}
