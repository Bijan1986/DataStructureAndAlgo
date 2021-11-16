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
## Linked List insertion

we can insert node in a linked list in 3 positions
1. at the front (make it head)
2. at the end (make it tail)
3. after a certain node

### At the front of the linked list

```java
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

//output:

/*
before insertion the values are 
 10
 15
 20
after insertion the values are 
 12
 10
 15
 20     
        
 */
```

## inserting element at the end of the linkedlist

```java
//inside the linkedlist class
class Linkedlist {
    public void insertAfterANode(Node4 prev_node, int val) {
        Node4 newNode = new Node4(val);
        if (prev_node != null) {
            newNode.pointer = prev_node.pointer;
            prev_node.pointer = newNode;
        }
    }
}
// output
/*
  before insertion the values are 
10 
15 
20 
after insertion the values are 
12 
10 
15 
20 
after insertion in the middle the values are :
12 
10 
15 
32 
20       
 */
    
```



