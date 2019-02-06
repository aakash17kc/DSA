public class BinarySearchTree {

    Node root;
    int COUNT = 10;

    void insert(int data){


        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;

        if (root==null){
            root = node;
        }
        else {

            Node n = root;
            Node prev = null;
            while (n!=null){
                if(n.data<data){
                    prev = n;
                    n = n.right;
                }
                else {
                    prev = n;
                    n = n.left;
                }
            }

            if(prev.data==data){
                System.out.println("Element already present");
            }
            else if(prev.data<data){
                prev.right = node;
            }
            else {
                prev.left = node;
            }
        }
    }

    void insertAtMiddle(int data,int after,int postition){
        //Extra funcationality to insert an elemtn in a BST
        //This will disturb the natural property of a BST.
        //Will need to reset the tree to restore the BST Property by calling the restore method

        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;


        Node n = root;
        Node prev = null;
        while (n!=null && n.data!=after){
            if(n.data<after){
                n = n.right;
            }
            else {
                n = n.left;
            }
        }

        if(n==null){
            System.out.println("Item not present");
        }
        else {
           if(postition==0){
               node.left = n.left;
               n.left = node;
           }
           else {
               node.right = n.right;
               n.right = node;
           }
        }

    }

    void showTree(Node n,int space){

        if (n==null){ return; }
        else {
            space = space+COUNT;

            showTree(n.right,space);
            System.out.println("\n");

            for (int i=COUNT;i<space;i++){
                System.out.print(" ");
            }
            System.out.println(n.data);
            showTree(n.left,space);


        }

    }

    void show(){

        if (root==null){
            System.out.println("Empty tree");
        }
        else
            showTree(root,0);

    }

    void delete(int data){

        Node n = root;
        Node prev = null;
        while (n!=null && n.data!=data){
            prev = n;
            if(n.data<data){
                n = n.right;
            }
            else {
                n = n.left;
            }
        }

        if(n==null){
            System.out.println("Item not present");
        }
        else {
            prev.left = n.left;



        }

    }

}
