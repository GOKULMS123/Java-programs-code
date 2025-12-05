
import java.util.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedListDSA {
    Node head;
    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(head == null) head = newNode;
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = newNode;
        }
    }
}
class Main{
    public static void main(String[] args) {
        Linkedlist list = new LinkedListDSA();
        list.insert(10);
    }
}