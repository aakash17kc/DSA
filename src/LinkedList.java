public class LinkedList {

    //function to insert, delete, show

    Node head;

    void insert(int data){


        Node node = new Node();

        node.data = data;
        node.next = null;
        if(head==null){
            head = node;
        }
        else {
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
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

    public void delete(int data){
        Node n = head;
        Node prev = null;

        if(n==null){
            System.out.println("Empty");
        }

        else{

            if (n.data==data)// head data
            {

                    Node temp = head;
                    head = head.next;
                    //temp = null;
                    System.out.println("SUCCESS head");
            }
            else {
                while (n.next!=null && n.data!=data){

                    prev = n;
                    n = n.next;

                }
                if(n==null){
                    System.out.println("not present");
                }
                else {
                    prev.next = n.next;
                   // n = null;
                    System.out.println("SUCCESS");
                }
            }

        }

    }
}
