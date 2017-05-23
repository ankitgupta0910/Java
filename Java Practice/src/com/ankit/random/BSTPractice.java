package com.ankit.random;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

/**
 * Created by ankitgupta on 5/19/17.
 */
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int d)
    {
        this.data = d;
        this.left = null;
        this.right = null;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    int getData()
    {
        return this.data;
    }

    public void setLeft(TreeNode left)
    {
        this.left = left;
    }

    public TreeNode getLeft()
    {
        return this.left;
    }

    public void setRight(TreeNode right)
    {
        this.right = right;
    }

    public TreeNode getRight()
    {
        return this.right;
    }

}

public class BSTPractice {

    TreeNode root, curr, prev;
    List<Integer> arr = new ArrayList<Integer>();

    BSTPractice()
    {
        root = null;
    }

    void insert(int data)
    {
        TreeNode n = new TreeNode(data);
        if (root == null)
        {
            root = n;
        }
        else
        {
            prev = root;
            curr = root;
            while(curr != null)
            {
                if (n.getData() < curr.getData())
                {
                    prev = curr;
                    curr = curr.getLeft();
                }
                else
                {
                    prev = curr;
                    curr = curr.getRight();
                }
            }

            if (n.getData() < prev.getData())
                prev.setLeft(n);
            else
                prev.setRight(n);
        }
    }

    void preOrderTraversal(TreeNode n) {
        if (n == null)
            return;

        System.out.print(n.getData() + " ");
        preOrderTraversal(n.getLeft());
        preOrderTraversal(n.getRight());
    }

    void inOrderTraversal(TreeNode n) {
        if (n == null)
            return;

        inOrderTraversal(n.getLeft());
        System.out.print(n.getData() + " ");
        arr.add(n.getData());
        inOrderTraversal(n.getRight());
    }

    void postOrderTraversal(TreeNode n) {
        if (n == null)
            return;

        postOrderTraversal(n.getLeft());
        postOrderTraversal(n.getRight());
        System.out.print(n.getData() + " ");
    }

    TreeNode closest(TreeNode n, int k) {
        TreeNode p = null;
        if (n == null)
            return null;

        if (n.getData() == k)
            return n;
        else{
            if (k < n.getData())
            {
                if (n.getLeft() != null)
                {
                    p = closest(n.getLeft(), k);
                    return (abs(p.getData()-k) > abs(n.getData()-k) ? n : p);
                }
                else
                    return n;
            }
            else
            {
                if (n.getRight() != null)
                {
                    p = closest(n.getLeft(), k);
                    return (abs(p.getData()-k) > abs(n.getData()-k) ? n : p);
                }
                else
                    return n;
            }
        }
//        inOrderTraversal(n.getLeft());
//        System.out.print(n.getData() + " ");
//        arr.add(n.getData());
//        inOrderTraversal(n.getRight())
    }

    public static void main(String[] args)
    {
        BSTPractice s = new BSTPractice();
        s.insert(40);
        s.insert(20);
        s.insert(30);
        s.insert(15);
        s.insert(60);
        s.insert(50);
        s.insert(70);
        s.preOrderTraversal(s.root);
        System.out.println(" ");
        s.inOrderTraversal(s.root);
        System.out.println(" ");
        s.postOrderTraversal(s.root);
        System.out.println(" ");
        System.out.println (s.closest(s.root, 52).getData());


    }

}
