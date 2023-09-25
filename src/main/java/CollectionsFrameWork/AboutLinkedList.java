package CollectionsFrameWork;
//in Java Linked list class uses a doubly to store the elements
//it provides linked list data structure
//it inherits the abstractList class and implements List and DeQUE interfaces
//they are linear data structure and every element is an object, and not stored in a continuous memory
//every element has a separate data address or memory location as it is a separate object
//every element has a previous and a next ... could be null


//in java a linked list class can contain duplicate elements
//java Linkedlist class maintains insertion order
//it is not synchronized
//manipulation occurs fast as no shifting needs to occur
//it can be used as List stack or queue

//in the example below the 'Node' class represents a node in the linked list
//containing an integer value 'data' and a reference to the next node 'next'
//the linked list class manages the operations on the linked list such as insertion and display
//in main method we are creating and inserting elements to linkedList
//we can implement methods like delete and search as well
//consider linkedList as a chain which has a head and there are elements attached to it


public class AboutLinkedList {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.insert(10);
        linkedlist.insert(20);
        linkedlist.insert(30);
        linkedlist.display();

        java.util.LinkedList<String> ll = new java.util.LinkedList<String>();

        ll.add("brian");
        ll.add("kim");
        ll.add("patrick");
        ll.add(3,"Harsh");

        ll.removeFirst();

        ll.add("dave");
        ll.remove(3);

        System.out.println(ll);

    }

}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    public LinkedList(){
        this.head = null;

    }
    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display (){
        Node current = head;
        while (current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


