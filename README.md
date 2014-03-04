BFS_AllPossiblePath
===================

This is an implementation of BFS to find all possible path between two nodes in a graph. It is just a Java implementation of ( http://code.activestate.com/recipes/576675/ ) . So all credit goes to  mojave kid. I found this when I was searching for my Android project. So I have to convert this into Java. Thanks to mojave kid.


To view the result... run Main.java

The input graph is:

             'A': ['B', 'C','E'],
             'B': ['A','C', 'D'],
             'C': ['D'],
             'D': ['C'],
             'E': ['F','D'],
             'F': ['C']
             

Result will be:


['A', 'B', 'D']

['A', 'C', 'D']

['A', 'E', 'D']

['A', 'B', 'C', 'D']

['A', 'E', 'F', 'C', 'D']

To see the result, view the console window of your IDE 
