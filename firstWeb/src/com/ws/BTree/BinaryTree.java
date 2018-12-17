package com.ws.BTree;

/**
 * 二叉树接口
 * 可以有不同实现类  可以有不同的存储结构 入顺序 链式
 */

 public interface BinaryTree {
     /**
     * 是否为空树
     */
     public  boolean isEmpty();

    /**
     * 树节点数量
     */
    public int size();

    /**
     * 获取二叉树高度
     */
    public int getHeight();

    /**
     * 查询指定值得结点
     */
    public Node findKey(int value);

    /**
     * 前序递归遍历
     */
    public void preOrderTraverse();

    /**
     * 中序递归遍历
     */
    public void inOrderTraverse();

    /**
     * 后序递归遍历
     */
    public void postOrderTraverse();

    /**
     * 后序递归遍历
     * Node 根节点
     */
    public void postOrderTraverse(Node node);

    /**
     * 前序非递归遍历
     * 1）对于任意节点current,若该节点不为空则访问该节点后将该节点压栈，并将左子树节点设为current,重复此操作知道current为空
     * 2）若左子树为空，栈顶元素出栈，将结点的右子树为current
     * 3)重复1,2操作，知道current为空且栈内节点为空
     */
    public void preOrderByStack();

    /**
     * 中序非递归遍历
     *  1）对于任意节点current,则将该节点压栈，并将左子树节点设为current,重复此操作知道current为空
     *  2）若左子树为空，栈顶元素出栈，将结点的右子树为current
     *  3)重复1,2操作，知道current为空且栈内节点为空
     */
    public void inOrderByStack();

    /**
     * 后序非递归遍历
     * 1）对于任意节点current,若该节点不为空则访问该节点后将该节点压栈，并将左子树节点设为current,重复此操作知道current为空
     * 2）若左子树为空，取栈顶元素的右子树，如果右子树为空或刚访问过，则访问该节点，将preNode置为该节点
     * 3)重复1,2操作，知道current为空且栈内节点为空
     */
    public void postOrderByStack();

    /**
     * 按照层次遍历二叉树
     */
    public void levelOrderByStack();
}
