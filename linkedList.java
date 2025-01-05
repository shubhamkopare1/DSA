public class Linklist{
    public static class Node{
       int data;
       Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    }

    public static Node Head;
    public static Node Tell;
    public static int size;

    public void addFirst(int data){
        
        Node newNode = new Node(data);
        if(Head == null){
            Head = Tell = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
        size++;
    }

    public void addLast(int data){
        
        Node newNode = new Node(data);
        size++;
        if(Head == null){
            Head = Tell= newNode;
            return;
        }
        Tell.next = newNode;
         Tell = newNode;
    }
    public void print(){
        Node temp = Head;
        
        while(temp != null){
          
         System.out.print(temp.data + "-> ");
         temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = Head;
        int i=0;
         if (temp == null) { 
            System.out.println("Index out of bounds");
            return;
        }
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
size++;
    }
       
       public static void main(String args[]){
        Linklist ll = new Linklist();
        // ll. Head = new Node(4);
        // ll.Head.next = new Node(7);
        ll.addFirst(4);
        ll.print();
        ll.addFirst(6);
            ll.print();
        ll.addLast(3);
            ll.print();
        ll.addLast(9);
        ll.print();
        ll.add(2,20);
        ll.print();
        System.out.print(ll.size);
       }
}