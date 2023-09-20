package com.kh.practice;

import com.kh.practice.BFSGraph;

public class BFSGraphMain {

	public static void main(String[] args) {

		BFSGraph g = new BFSGraph(9);
		
		g.addEdge(0, 3);
		g.addEdge(0, 6);
		g.addEdge(6, 5);
		g.addEdge(3, 4);
		g.addEdge(4, 2);
		g.addEdge(4, 8);
		g.addEdge(2, 1);
		g.addEdge(2, 7);
		
		
		g.BFS(0);
	}

}
