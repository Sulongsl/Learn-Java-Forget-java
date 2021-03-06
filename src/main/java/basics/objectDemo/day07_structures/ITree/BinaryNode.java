package basics.objectDemo.day07_structures.ITree;

import java.io.Serializable;

/**
 * 二叉树结点
 * Created by sulong on 2019/7/24.
 */
public class BinaryNode<T extends Comparable> implements Serializable {
    private static final long serialVersionUID = -6477238039299912313L;

    public T data;

    /**
     * 左结点
     */
    public BinaryNode<T> left;

    /**
     * 右结点
     */
    public BinaryNode<T> right;

    public BinaryNode(T data,BinaryNode left,BinaryNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BinaryNode (T data){
        this(data,null,null);
    }

    /**
     * 判断是否为叶子节点
     * @return
     */
    public boolean isLeaf(){
        return this.left==null &&this.right==null;
    }
}
