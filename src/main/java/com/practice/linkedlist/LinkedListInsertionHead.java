package com.practice.linkedlist;

class LinkedList3{
    Node3 head;
    static  class Node3{
        int data;
        Node3 pointer;

        Node3(int data){
            this.data = data;
            this.pointer = null;
        }
    }
    // to display list
    public  void displayValues(){
        Node3 val = head;
        if (val == null){
            System.out.println("empty linked list");
        }else{
            while(val != null){
                System.out.println(" "+val.data);
                val = val.pointer;
            }
        }
    }
    public void pushToHead(int data){
        Node3 newHeadNode = new Node3(data);
        newHeadNode.pointer = head;
        head = newHeadNode;
    }

}
public class LinkedListInsertionHead {
    public static void main(String[] args) {
        LinkedList3 linkedList3 = new LinkedList3();
        linkedList3.head = new LinkedList3.Node3(10);
        LinkedList3.Node3 second = new LinkedList3.Node3(15);
        LinkedList3.Node3 third = new LinkedList3.Node3(20);

        //head pointer to point to second
        linkedList3.head.pointer = second;
        second.pointer = third;

        // display
        System.out.println("before insertion the values are ");
        linkedList3.displayValues();

        // insert to head
        System.out.println("after insertion the values are ");
        linkedList3.pushToHead(12);
        linkedList3.displayValues();

    }
}
