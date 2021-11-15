package com.practice.linkedlist;

class AnotherLinkedList{
    Node2 head;
    static class Node2{
        int data;
        Node2 pointer;

        Node2(int data){
            this.data = data;
            this.pointer = null;
        }
    }

    public  void traverseAndDisplay(){
        Node2 headNode = head;
        if(headNode == null){
            System.out.println("list is empty");
        }
        while (headNode != null){
            System.out.print(" "+headNode.data);
            headNode = headNode.pointer;
        }
    }
}

public class NodeTraversal {
    public static void main(String[] args) {
        AnotherLinkedList lList = new AnotherLinkedList();
        lList.head = new AnotherLinkedList.Node2(1);
        AnotherLinkedList.Node2 two = new AnotherLinkedList.Node2(2);
        AnotherLinkedList.Node2 three = new AnotherLinkedList.Node2(3);
        lList.head.pointer = two;
        two.pointer = three;
        lList.traverseAndDisplay();

    }
}
