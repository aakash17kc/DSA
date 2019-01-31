import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunnerCirlularList {



    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = 1,after;
        int data;

        //  LinkedList list = new LinkedList();
        CirlcularLinkedList list  = new CirlcularLinkedList();

        while(1==1) {
            System.out.println("1 -> insert");
            System.out.println("2 -> show");
            System.out.println("3 -> Delete");
            System.out.println("4 -> Insert in Middle");

            System.out.println("0 -> exit");
            input = Integer.parseInt(br.readLine());

            switch (input){
                case 1:
                    System.out.println("Enter data");
                    data = Integer.parseInt(br.readLine());
                    list.insert(data);
                    break;

                case 2:
                    list.show();
                    break;
                case 3:
                    System.out.println("Enter data");
                    data = Integer.parseInt(br.readLine());
                    list.delete(data);
                    break;

                case 4:
                    System.out.println("Enter data");
                    data = Integer.parseInt(br.readLine());
                    System.out.println("Enter data to insert after");
                    after = Integer.parseInt(br.readLine());
                    list.inserMiddle(data,after);
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong input");
            }

        }
    }
}


