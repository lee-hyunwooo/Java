package com.kh.treeMain;
/*
 ��带 �����ϰ� ���ư��� ����ϴ� ����Ʈ��
 ���� ��ȸ : root(�Ѹ�)�� ���� ���� �湮
 ���� ��ȸ : ���� ���� Ʈ���� �湮 �Ѵ��� root(�Ѹ�)�� �湮
 ���� ��ȸ : ���� Ʈ�� ��� �湮 �� root(�Ѹ�) �湮
 ���� ��ȸ : ���� node�� ���� �Ʒ� �������� ���ʴ�� �湮
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
