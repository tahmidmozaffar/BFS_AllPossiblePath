package com.receme.bfs_allpossiblepath;



//This will be used as the Queue elemen in the Holder.java

public class Node {
	
  public char val;
  public int pos;
  public boolean visited;
  
  public Node(){
	  
  }
  
  public Node(char _val){
	  
	  this.val = _val;
	  this.pos = _val-64;
	  this.visited = false;
	  
  }
  
  public boolean isVisited(){
	  
	  return visited;
  }
  
  public int getNodeVal(){
	  return val;
  }

}
