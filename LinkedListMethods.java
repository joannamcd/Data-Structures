import java.io.*;
/*
 * Some sections of code may belong to others, most of this is for practice/notes purposes
 */

public class LinkedListMethods {
    
}
//iterative method
//time complexity O(n)
class LinkedList{

    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);

    }


}

//reverse a linked list using recursion
//divide list in two parts - first node and rest of list 
class recursion {
    static Node head; 

    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    static Node reverse (Node head){
        if(head == null || head.next == null){
            return head;
        }

        //reverse the rest list and put the first element at the end
        Node rest = reverse(head.next);
        //head is currently the last node before the final node aka rest
        //so head.next.next is the node after last
        //set node after last equal to node before last
        head.next.next = head;

        //gets rid of the pointerß
        head.next = null;

        //fix head pointer
        return rest;
    }

    static void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    static void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public static void main(String args[]){
        push(20);
        push(4);
        push(15);
        push(85);

        System.out.println ("Given linked list");
        print();

        head = reverse(head);

        System.out.println("Reversed linked list");
        print();
    }

}
