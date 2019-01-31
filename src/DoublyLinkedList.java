import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoublyLinkedList {

    Node head;

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    void insert(int data){


        Node node = new Node();

        node.data = data;
        node.next = null;
        if(head==null){
            node.prev = null;
            head = node;

        }
        else {
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }
    }

    void inserMiddle(int data, int after){

        Node node = new Node();

        node.data = data;
        node.next = null;


        if(head==null){
            node.prev = null;
            head = node;

        }
        else {
            Node n = head;
            while (n!=null && n.data!=after){
                n = n.next;
            }

            if(n==null){
                System.out.println("Item to insert after not present");
            }
            else {
                node.next = n.next;
                node.prev = n;
                n.next = node;
                if(node.next!=null){
                    node.next.prev = node;
                }

                System.out.println("SUCCESS insertion middle");
            }

        }

    }

    public void show() {

        Node n = head;

        if (head == null) {
            System.out.println("Empty");
        }
        else {

            while (n!= null) {

                System.out.println("Data -> " + n.data);
                n = n.next;
            }
        }
    }

    public  void reverseShow(){
        Node n = head;
        if (head == null) {
            System.out.println("Empty");
        }
        else {

            while (n.next!= null) {
                n = n.next;
            }
            while (n!= null) {

                System.out.println("Data -> " + n.data);
                n = n.prev;
            }

        }
    }

    public void delete(int data){
        Node n = head;

        if(n==null){
            System.out.println("Empty");
        }

        else{

            if (n.data==data)// head data
            {

                Node temp = head;
                head = head.next;
                //temp = null;
                head.prev = null;
                System.out.println("SUCCESS head");
            }
            else {
                while (n!=null && n.data!=data){
                    n = n.next;

                }
                if(n==null){
                    System.out.println("not present");
                }
                else {
                   n.prev.next = n.next;
                   n.next.prev = n.prev;
                    // n = null;
                    System.out.println("SUCCESS");
                }
            }

        }

    }
}
