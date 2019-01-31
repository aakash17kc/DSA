public class CirlcularLinkedList {



    //function to insert, delete, show

    Node head;

    void insert(int data){


        Node node = new Node();

        node.data = data;

        if(head==null){
            head = node;
            head.next = head;
        }
        else {
            Node n = head;
            do {
                n = n.next;
            }
            while (n.next!=head);
            n.next = node;
            node.next = head;

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
            while (n.next!=head && n.data!=after){
                n = n.next;
            }

            if(n==head){
                System.out.println("Item to insert after not present");
            }
            else {
                node.next = n.next;
                n.next = node;
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

           do{

                System.out.println("Data -> " + n.data);
                n = n.next;
            }while (n!=head);
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
                while (n.next!=head){
                    n = n.next;

                }

                n.next = head.next;
                head = head.next;
                //temp = null;
                System.out.println("SUCCESS head");
            }
            else {
                while (n.next!=head && n.data!=data){

                    prev = n;
                    n = n.next;

                }
                if(n==head){
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



