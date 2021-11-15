# LinkedList
## What is a Linkedlist
linked list is a collection of nodes where each node has the **data** 
and a pointer to the next node .

> The very first node in a linked list is called as the **head**
> 
> The vary last node of the linkedlist is called as the **tail**
> 
<P>In an array all the elements are contiguous(side by side) where as in 
Linked list the elements are scattered but the pointers help to keep the order in place .</P>

> Linkedlist is created in the heap


## how to define a node?

To define a node, we need two things .
1. data
2. pointer to the next node

the data type of the pointer is **"NODE"**

## Structure of a node

```java
class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next= null;
    }
}

```
## How to create a node ?

To create a node we first need a pointer .

1. Write a program to create a Linkedlist with 3 nodes

```java
//Node creation
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

```

now that the nodes are created and linked as well, now we need to traverse through 
those nodes and display them on the screen .

```java
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

// output
// 1 2 3

```
