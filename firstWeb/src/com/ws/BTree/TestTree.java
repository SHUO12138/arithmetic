package com.ws.BTree;

public class TestTree {
    public static void main(String[] args) {

    //创建一个二叉树
        Node node5=new Node(5,null,null);
        Node node4=new Node(4,null,node5);

        Node node3=new Node(3,null,null);
        Node node7=new Node(7,null,null);
        Node node6=new Node(6,null,node7);

        Node node2=new Node(2,node3,node6);
        Node node1=new Node(1,node4,node2);

        BinaryTree btree=new LinkedBinaryTree(node1);
        //判断二叉树是否为空
        System.out.println(btree.isEmpty());
        //先序遍历递归1  4  5  2  3  6  7
        System.out.print("先序遍历:");
        btree.preOrderTraverse();
        System.out.println();
        //中序遍历递归4  5  1  3  2  6  7
        btree.inOrderTraverse();
        //后序遍历递归
        btree.postOrderTraverse();
        //先序遍历递归5  4  3  7  6  2  1

        btree.preOrderByStack();
        //中序遍历非递归（借助栈）
        btree.inOrderByStack();
        //后序遍历非递归（借助栈）
        btree.postOrderByStack();

        //按照层次遍历（借助队列）
        btree.levelOrderByStack();
        //查找二叉树的值
        System.out.println(btree.findKey(6));
        //二叉树结点个数
        System.out.println(btree.size());
        //二叉树的高度
        System.out.println(btree.getHeight());

    }
}
