import java.util.*;

//CREATING A TREE
public class treeNode{
        public int val;
        public treeNode left;
        public treeNode right;
        
        public treeNode(int x){
            val=x;
            left = null;
            right=null;
        }
    
    }

class trees {
    public static void main(String[] args) {

        treeNode root = new treeNode(4);
        root.left = new treeNode(8);
        root.right = new treeNode(15);

        treeNode leftNode = root.left;
        treeNode rightNode = root.right;
        
        leftNode.left=new treeNode(16);

        rightNode.left=new treeNode(23);
        rightNode.right=new treeNode(42);
        
        //System.out.println(root.val);
        //System.out.println(root.right.left.val);   
        
        //inOrderTraversal(root);
        //postOrderTraversal(root);
        //preOrderTraversal(root);
        levelOrderTraversal(root);
    }

//IN ORDER TRAVERSAL OF TREE
//left->root->right
public static void inOrderTraversal(treeNode root) { 
    if (root == null) // Base case: if root is null, return
    return;
    
    inOrderTraversal(root.left);
    
    System.out.print(root.val + " -> "); 
    
    inOrderTraversal(root.right);
    
    }

//POST ORDER TRAVERSAL OF TREE
//LEFT->RIGHT->ROOT
public static void postOrderTraversal(treeNode root){
    if(root==null)
    return;
  
    postOrderTraversal(root.left);

    postOrderTraversal(root.right);

    System.out.print(root.val +  "->");
}

//PRE ORDER TRAVERSAL
//ROOT->LEFT->RIGHT
public static void preOrderTraversal(treeNode root){
    if(root==null){
        return;
    }
    System.out.print(root.val + "->");

    preOrderTraversal(root.left);

    preOrderTraversal(root.right);
}

//LEVEL ORDER TRAVERSAL
public static void levelOrderTraversal(treeNode root){
Queue < treeNode > treeNodeQueue = new LinkedList<>();
treeNodeQueue.add(root);

while(!treeNodeQueue.isEmpty()){
treeNode q = treeNodeQueue.poll();
System.out.print(q.val+"->");
if(q.left!=null){
    treeNodeQueue.add(q.left);
}
if(q.right!=null) {
    treeNodeQueue.add(q.right);
}
}
}
}