package com.practice.linkedlist;

class LinkedList{
    Node head;//the very first node is the head
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
}

public class NodeCreation {

    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);
        // all the nodes are made but they are not linked
        // now lets link those
        // link the head to the second node
        lList.head.next = second;
        //link the second node to the third
        second.next = third;


    }
}
