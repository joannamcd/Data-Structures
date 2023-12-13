package BFS_DFS;
import java.util.LinkedList;
import java.util.Queue;

//Queue based BFS
//SIMPLIFIED CODE IN .TXT

class Node{
    int data;
    Node left, right;

    public Node(int item){
        data = item;
        left = null;
        right = null;
    }
}

class BinaryTree{
    Node root;

    void printLevelOrder(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

            // poll() removes the present head.  
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            // Enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            // Enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String args[]){
        BinaryTree treeLvl = new BinaryTree();
        treeLvl.root = new Node(1);
        treeLvl.root.left = new Node(2);
        treeLvl.root.right = new Node(3);
        treeLvl.root.left.left = new Node(4);
        treeLvl.root.left.right = new Node(5);
        System.out.println("Level order traversal of binary tree is - ");
        treeLvl.printLevelOrder();
    }
}

//Output:
//Level order traversal of binary tree is - 
//1 2 3 4 5
