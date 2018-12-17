package com.ws.BTree;

/**
 * 二叉树的结点
 */
public class Node {
    private Node leftChild;//左子树

    private Object value;//节点值

    private Node rightChild;//右子树

    public Node() {

    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer("[ value:");
        sb.append(value);
        sb.append(", leftChild:"+leftChild);
        sb.append(", rightChild:"+rightChild);
        sb.append(" ] ");
        return sb.toString();
    }

    public Node(Object value, Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.value = value;
        this.rightChild = rightChild;
    }

    public Node(Object value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
