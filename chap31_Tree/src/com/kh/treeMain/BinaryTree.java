package com.kh.treeMain;
/*
 노드를 삽입하고 돌아가며 출력하는 이진트리
 전위 순회 : root(뿌리)를 가장 먼저 방문
 중위 순회 : 왼쪽 하위 트리를 방문 한다음 root(뿌리)를 방문
 후위 순회 : 하위 트리 모두 방문 후 root(뿌리) 방문
 층별 순회 : 위쪽 node들 부터 아래 방향으로 차례대로 방문
 */
public class BinaryTree {
	TreeNode root;
	public BinaryTree() {
		this.root = null;
	}
	
	public void insert(int data) {
		root = insertRec(root, data);
	}
	
	private TreeNode insertRec(TreeNode root, int data) {
		if(root == null) {
			root = new TreeNode(data);
			return root;
		}
		if(data> root.data) {
			root.left = insertRec(root.left,data);
		}else if (data<root.data) {
			root.right = insertRec(root.right,data);
		}
			return root;
	}
	public static void main(String[] args) {
		

	}

}
