package oddEVEN;

  class Node{
    int data;
    Node next;
     Node(int data){
        this.data = data;
        this.next = null;
  
    }
}


public class LinkedList {

    Node head;

    LinkedList(){
        head = null;
    }
    
    void insertAtBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }
}
