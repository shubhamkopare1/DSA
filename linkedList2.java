import java.util.LinkedList;
public class DoubbleLL{
    
     public static class Node{
           int data;
           Node next;
           Node prev;
           public Node(int data){
                this.data= data;
                this.next = null;
                this.prev =null;
           }
             }
           public static Node head;
           public static Node tail;
           public static Node size;

           public void addFirst(int data){
            Node newNode = new Node(data);
                // head = newNode;
            if(head == null ){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

           }
           public void removeLast(){
            if(head == null){
                head = tail =null;
                return;
            }
            tail.prev = tail;
            tail.next =null;
            
           }

           public void removeFirst(){
            if(head == null){
                head =tail = null;
                return;
            }
            head = head.next;
            head.prev = null;
           }
           public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            // Node temp = head;
            //       while(temp.next != null){
            //             temp = temp.next;
            //       }
                  tail.next = newNode;
                  newNode.prev= tail;
                  
                  
           }
           public void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data);
                 temp = temp.next;

                System.out.print("<->");
              
            }
            System.out.println("null");
           }


           
   
     
    public static void main(String args[]){
       DoubbleLL dll = new DoubbleLL();

        //    dll.addFirst(4);
        //    dll.addFirst(4);
        //    dll.addFirst(5);
        //    dll.addFirst(10);
        //    dll.addFirst(2);
        //    dll.print();
        //    dll.removeFirst();
        //    dll.print();
           dll.addLast(5);
           dll.addLast(4);
           dll.addLast(3);
           dll.addLast(2);
           dll.addLast(7);
           dll.addLast(9);
           dll.addLast(8);
           dll.addLast(5);
           dll.print();
           dll.removeLast();
           dll.print();
        //  LinkedList<Integer> ll = new LinkedList<>();
        //  ll.addFirst(1);
        //  ll.addLast(2);
        //  ll.addLast(3);
        //  ll.addFirst(3);
        //  ll.removeFirst();
        //  ll.removeLast();
        // //  ll.reverseNode;
        //  System.out.print(ll);

    }
}