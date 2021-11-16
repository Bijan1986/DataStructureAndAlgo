package com.practice.linkedlist;

class LinkedList4{
    Node4 head ;
    static class Node4{
        int data;
        Node4 pointer;
        
        Node4(int data){
            this.data = data;
            this.pointer = null;
        }
    }
    // display node
    public void traverseAndDisplay(){
        Node4 newNode = head;
        if(newNode == null){
            System.out.println("the linked list is empty");
        }else{
            while (newNode != null){
                System.out.println(newNode.data +" ");
                newNode = newNode.pointer;
            }
        }
    }
    
    //insert the first element
    public void push(int val){
        Node4 newNode = new Node4(val);
        newNode.pointer = head;
        head = newNode;
    }
    public void insertAfterANode(Node4 prev_node,int val){
        Node4 newNode = new Node4(val);
        if(prev_node!= null){
            newNode.pointer = prev_node.pointer;
            prev_node.pointer = newNode;
        }
    }
}

public class LinkedListInsertionMiddle {
    public static void main(String[] args) {
        LinkedList4 linkedList4 = new LinkedList4();
        linkedList4.head = new LinkedList4.Node4(10);
        LinkedList4.Node4 second = new LinkedList4.Node4(15);
        LinkedList4.Node4 third = new LinkedList4.Node4(20);

        //head pointer to point to second
        linkedList4.head.pointer = second;
        second.pointer = third;

        // display
        System.out.println("before insertion the values are ");
        linkedList4.traverseAndDisplay();

        // insert to head
        System.out.println("after insertion the values are ");
        linkedList4.push(12);
        linkedList4.traverseAndDisplay();

        // insert to head
        System.out.println("after insertion in the middle the values are :");
        linkedList4.insertAfterANode(second,32);
        linkedList4.traverseAndDisplay();

    }

}
