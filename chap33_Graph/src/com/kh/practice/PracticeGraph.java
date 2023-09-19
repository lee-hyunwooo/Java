package com.kh.practice;

import com.kh.GraphMain.Graph;

public class PracticeGraph {

	public static void main(String[] args) {
		int ver = 7;
		Graph graph = new Graph(ver);
		
		graph.addEdge(6, 1);
		graph.addEdge(1, 3);
		graph.addEdge(3, 2);
		graph.addEdge(6, 3);
		graph.addEdge(5, 6);
		graph.addEdge(5, 4);
		graph.addEdge(3, 1);
		System.out.println("DFS Å½»ö °á°ú : " + graph);
		graph.DFS(5);
		
	}

}
