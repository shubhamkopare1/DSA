public class LinkedList{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node head2;
    public static Node tail;
    public static void addLast(int data){
        Node newNode = new Node(data);
             if(head == null){
                head=tail = newNode;
                return;
             }
         tail.next = newNode;
         newNode = tail;
    }
   
   public static void breakNodes( int data , int data2){
    int temp = head;
    int i= 0;
           while(  i != data){
              
              i++;
           }
   }

    public static void main(String args[]){
          LinkedList ll = new LinkedList();
          ll.addLast(3);
          ll.addLast(7);
          ll.addLast(4);
          ll.addLast(9);
          ll.addLast(5);
          ll.addLast(1);
          

    }

}