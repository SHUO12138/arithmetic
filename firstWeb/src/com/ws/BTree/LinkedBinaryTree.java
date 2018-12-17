package com.ws.BTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedBinaryTree implements BinaryTree {
    private Node root;

    public LinkedBinaryTree() {
    }

    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public int size() {
        System.out.print("二叉树结点个数");
        return this.size(root);
    }
    private int size(Node node) {
        if (node!=null){
            //左子树个数
            int sl =this.size(node.getLeftChild());
            //右子树个数
            int sr =this.size(node.getRightChild());
            //返回个数
            return sl+sr+1;
        }else{
            return 0;
        }
    }

    @Override
    public int getHeight() {
        System.out.print("二叉树的高度是:");
        return this.getHeight(root);
    }
    private int getHeight(Node node ){
        if (node!=null){
            //获取左子树高度
            int nl =this.getHeight(node.getLeftChild());
            //获取右子树高度
            int nr =this.getHeight(node.getRightChild());
            //返回左子树高度、右子树高度较大的家1
            return nl > nr ? nl+1 : nr+1;
        }
        return 0;

    }

    @Override
    public Node findKey(int value) {
        System.out.print("您要查找的结点:");
        return this.findKey(value,root);
    }

    private Node findKey(Object value,Node node){
        if (node==null){
            return null;
        }else if (node !=null && node.getValue() == value ){
            //查找根节点是否包含val
                return node;
        }else{
            //查找左子树
            Node l=this.findKey(value,node.getLeftChild());
            if (l!=null &&  l.getValue()== value){
                return l;
            }
            //查找右子树
            Node r=this.findKey(value,node.getRightChild());
            if (r!=null &&  r.getValue() == value){
                return r;
            }
            return null;
//            if (l!=null &&  l.getValue() == value){
//                return l;
//            }else if (r!=null &&  r.getValue() == value){
//                return r;
//            }else{
//                return null
        }
    }

    @Override
    public void preOrderTraverse() {
        //输出根节点的值
        if(root!=null){
            System.out.print(root.getValue() + "  ");
            //左子树先序遍历
            //构建一个左子树为为跟的二叉树
            BinaryTree leftTree=new LinkedBinaryTree(root.getLeftChild());
            leftTree.preOrderTraverse();
            //右子树先序遍历
            //构建一个右子树为为跟的二叉树
            BinaryTree rightTree=new LinkedBinaryTree(root.getRightChild());
            rightTree.preOrderTraverse();
        }



    }

    @Override
    public void inOrderTraverse() {
        System.out.print("中序遍历:");
        this.inOrderTraverse(root);
        System.out.println();
    }

    private  void inOrderTraverse(Node node){
        if (node!=null){
            //左子树遍历
            this.inOrderTraverse(node.getLeftChild());
            //输出根节点
            System.out.print(node.getValue()+"  ");
            //右子树遍历
            this.inOrderTraverse(node.getRightChild());
        }
    }
    @Override
    public void postOrderTraverse() {
        System.out.print("后序遍历:");
        this.postOrderTraverse(root);
        System.out.println();
    }



    @Override
    public void postOrderTraverse(Node node) {
        if (node!=null){
            //左子树遍历
            this.postOrderTraverse(node.getLeftChild());
            //右子树遍历
            this.postOrderTraverse(node.getRightChild());
            //输出根节点
            System.out.print(node.getValue()+"  ");
        }
    }

    @Override
    public void preOrderByStack() {
        System.out.print("借助栈实现前序遍历：");
        //创建一个栈
        Deque<Node> stack=new LinkedList<Node>();
        Node current=root;
        if (current!=null){
            stack.push(current);
        }
        while (!stack.isEmpty()){
            //将左子树的左叉入栈  、、第二次就是左叉上的右节点的左叉
            if (!stack.isEmpty()){
                current=stack.pop();
                System.out.print(current.getValue()+"  ");
                //开始出栈
                if (current.getRightChild()!=null){ stack.push(current.getRightChild()); };
                //当前出栈后将左叉的 右边结点设置为当前current
                if (current.getLeftChild()!=null){stack.push(current.getLeftChild());};
            }
        }
        System.out.println();
    }

    @Override
    public void inOrderByStack() {
        System.out.print("借助栈实现中序遍历：");
        //创建一个栈
        Deque<Node> stack=new LinkedList<Node>();
        Node current=root;
        while (current!=null||!stack.isEmpty()){
            //将左子树的左叉入栈  、、第二次就是左叉上的右节点的左叉
            while(current!=null){
                stack.push(current);
                current=current.getLeftChild();
            }
            if (!stack.isEmpty()){
                //开始出栈
                current=stack.pop();
                System.out.print(current.getValue()+"  ");
                //当前出栈后将左叉的 右边结点设置为当前current
                current=current.getRightChild();
            }
        }
        System.out.println();
    }

    @Override
    public void postOrderByStack() {
        System.out.print("借助栈实现后序遍历：");

        System.out.println();
    }

    @Override
    public void levelOrderByStack() {
        System.out.print("按照层次遍历二叉树:");
        this.levelOrderByStack(root);
        System.out.println();
    }
    private void levelOrderByStack(Node node){
        if (node==null) {return;}
        Queue<Node> queue=new LinkedList<Node>();
        //将根节点加入队列
        queue.add(node);
        //判断队列是否为空
        int row =1;
        while (!queue.isEmpty()){
            System.out.print("第"+(row++)+"层元素：");
        //判断队列的长度     并循坏将该层元素出队，下一次元素入队
        int len=queue.size();
            for (int i = 0; i < len; i++) {
                Node n=queue.poll();
                System.out.print(n.getValue() +"  " );
                if (n.getLeftChild()!=null) {
                    queue.add(n.getLeftChild());
                }
                if (n.getRightChild()!=null) {
                    queue.add(n.getRightChild());
                }
            }
        }
    }
}
