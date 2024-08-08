import java.util.*;
class Binarytree {
     Node root;
           class Node{
            int data;
            Node left,right;
            Node(int val){
                data=val;
                left=right=null;
            }
           }
           Binarytree(int value){
               root=new Node(value);
           }
    public static void preorder(Node root) {
        if(root!=null){
             System.out.print(root.data+" ");
             preorder(root.left);
             preorder(root.right);
        }
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root!=null){
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data+" ");
        }
    }
   
    public void insertleft(Node r,int val){
        Node newNode=new Node(val);
        r.left=newNode;
    }
    public void insertright(Node r,int val){
        Node newNode=new Node(val);
        r.right=newNode;
    }
}

public class Demo {
    public static void main(String[] args) {
        Binarytree tree=new Binarytree(10);
        tree.insertright(tree.root,5);
        tree.insertright(tree.root.right,15);
        tree.insertleft(tree.root,3);
        tree.insertright(tree.root.right.right,8);
        tree.insertleft(tree.root.left,12);



        Binarytree.preorder(tree.root);
        System.out.println();
        Binarytree.inorder(tree.root);
        System.out.println();
        Binarytree.postorder(tree.root);
        System.out.println();
    }
}