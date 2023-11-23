package Trees;
import java.io.*;
import java.util.*;

public class Trees {
    
    //print parent of each node
    public static void printParents(int node, Vector<Vector<Integer>> adj, int parent){
        //check if current node is root - then it has no parent
        if(parent ==0)
            System.out.println(node + "-> Root");
        else
            System.out.println(node + "->" + parent);
        
        //using depth first search
        for(int i=0; i<adj.get(node).size(); i++){
            if(adj.get(node).get(i) != parent)
                printParents(adj.get(node).get(i), adj, node);
        }
    }

    //Function to print the children of each node
    public static void printChildren(int Root, Vector<Vector<Integer>> adj){

        //Queue for the Breadth First Search
        Queue<Integer> q = new LinkedList<>();

        //push root 
        q.add(Root);

        //visit array and keep track of nodes that have been visited
        int visited[] = new int[adj.size()];

        Arrays.fill(visited, 0);

        //Breadth first search
        while(q.size() != 0){
            int node = q.peek();
            q.remove();
            visited[node] = 1;
            System.out.print(node + "->");

            for(int i=0; i < adj.get(node).size(); i++){
                if(visited[adj.get(node).get(i)] == 0){
                    System.out.print(adj.get(node).get(i)+ " ");
                    q.add(adj.get(node).get(i));
                }
            }
            System.out.println();
        }
    }

    //fn to print the leaf nodes
    public static void printLeafNodes(int Root, Vector<Vector<Integer>> adj){
        //leaf nodes have only one edge and are not the root
        for(int i=1; i<adj.size(); i++){
            if(adj.get(i).size() == 1 && i != Root)
                System.out.print(i + " ");

        }
        System.out.println();
    }
        
    //fn to print the degrees of each node
    public static void printDegrees(int Root, Vector<Vector<Integer>> adj){
        for(int i=1; i<adj.size(); i++){
            //root has no parent, so its degree = edges it is connected to
            if(i==Root)
                System.out.println(adj.get(i).size());
            else
                System.out.println(adj.get(i).size() - 1);
        }
    }

    public static void main(String[] args){
        //num of nodes
        int N = 7, Root = 1;

        //adjacency list to store tree
        Vector<Vector<Integer>> adj = new Vector<Vector<Integer>>();
        for(int i=0; i< N+1; i++){
            adj.add(new Vector<Integer>());
        }

        //creating the tree
        adj.get(1).add(2);
        adj.get(2).add(1);
 
        adj.get(1).add(3);
        adj.get(3).add(1);
 
        adj.get(1).add(4);
        adj.get(4).add(1);
 
        adj.get(2).add(5);
        adj.get(5).add(2);
 
        adj.get(2).add(6);
        adj.get(6).add(2);
 
        adj.get(4).add(7);
        adj.get(7).add(4);
   
        System.out.println("The parents of each node are: ");
        printParents(Root, adj, 0);

        System.out.println("The children of each node are:");
        printChildren(Root, adj);

        System.out.println("The leaf nodes of the tree are");
        printLeafNodes(Root, adj);

        System.out.println("The degrees of each node are:");
        printDegrees(Root, adj);
   
   
   
    }
    

}


