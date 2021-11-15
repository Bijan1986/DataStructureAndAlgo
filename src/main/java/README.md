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