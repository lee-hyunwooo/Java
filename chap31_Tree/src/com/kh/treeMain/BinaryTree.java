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
	//insert �޼���� insertRac �޼���� ���� Ʈ���� ���ο� ��带 �����ϴµ� ���
	
	//insert : �ܺο� ����Ǵ� �޼���
	public void insert(int data) {
		root = insertRec(root, data);
	}
	//insertRec : ���� ���� �۾� �޼���
	//����� : �ڱ� �ڽ��� �����ϰ� �ٽ� �ڱ� �ڽ��� ����ؼ� ���� ����
	//��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��带 ����
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
	/*
	 inOrderT : ������ȸ
	 inOrderTR : ���� ��ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴµ� ���
	 ���� ����Ʈ�� ������ ������ ����Ʈ�� ������ ��� ���
	 */
	public void onOrderT() {//inOrder Traversal ���� ��ȸ
		inOrderTR(root);
	}
	
	private void inOrderTR(TreeNode root) {
		if (root != null) {
			inOrderTR(root.left);
			System.out.println(root.data + " ");
			inOrderTR(root.right);
		}
	}
	public static void main(String[] args) {
		

	}

}
