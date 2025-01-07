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
           if (idx < 0 || idx > size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (idx == 0) {
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
       
public void  removeFirst(){
    int val =   Head.data;
    if(Head == null){
        System.out.print("empty linklist");
        return;
    }else if(Head == Tell){
        Head = Tell = null;
        size--;
        return;
    }
    Head = Head.next;
    size--;
    return;
}
 public void removeLast(){
    
    if(Head == null){
        System.out.print("Empty linkedList");
        return;
    }
   else if(Head == Tell){
        Head = Tell = null;
        return;
    }
    Node prev = Head;
     while(prev.next != Tell){
        prev = prev.next;
     }
     prev.next = null;
       Tell = prev;
       size --;
     return;
 }

 public int itrSearch(int key){
    Node temp = Head;
    int i=0;
    while(temp != null){
        if(temp.data == key){
            return i;
        }else{
            temp = temp.next;
            i++;
        }
    }
    return -1;
 }
 public int helper(Node Head, int key){
    if(Head == null){
        return -1;
    }
    if(Head.data == key){
        return 0;
    }
    int idx = helper(Head.next, key);
    if(idx == -1){
        return -1;
    }
    return idx+1;
 }
 public int recursiveSearch(int key){
    return helper(Head, key);
 }
    public void reverseNode(){
        Node curr = Head;
        Node prev = null;
        Node next ;
        Tell = Head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Head = prev;
       

    }
        public void removenthNodeFromEnd(int n){
            int i=0;
            Node val = Head;
            Node temp =Head;
          while(temp != null){
            temp = temp.next;
            i++;
          }
        // System.out.print(i);
          int idx = i-n;
          if(i == n){
            Head = Head.next;
            return;
          }
            int num = 1;
       while(num <idx){
        val = val.next;
        num++;
       }
          val.next= val.next.next;
        }

        public Node findMid(){
        Node slow = Head;
         Node fast = Head;
            while(fast != null && fast.next != null ){
                slow = slow.next;
                fast = fast.next.next;
            }
             return slow;
        }
        public Boolean checkPalindrome(){
            Node midNode = findMid();
            Node curr = midNode;
            Node prev =null;
            Node next;
              while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr= next;
              }

           Node first = Head;
           Node last = prev;
      if(Head == null || Head.next == null){
        return true;
      }

           while(last != null){
            if(first.data != last.data){
              return false;
            }
              first = first.next;
                last = last.next;
           }
            return true;
        }

        public static Boolean isCycle(){   // cycle floys algorithms
            Node slow = Head;
            Node fast = Head;
            while(fast != null && fast.next != null){
                 slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true ;
                }
               
            }
            return false;
        }

        public static void removeCycle(){
            Node slow = Head;
            Node fast= Head;
            Boolean cycle = false;
               while(fast != null && fast.next != null){
                      slow = slow.next;
                      fast = fast.next.next;
                      if(slow == fast){
                        cycle = true;
                        break;
                      }
               }
               if(cycle){
                slow = Head;
               }
               Node temp = null;

               while(slow != fast){
                     temp = fast;
                    slow = slow.next;
                    fast = fast.next;
               }
               temp.next = null;
                    }
               public Node getMid(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

  
    public Node merge(Node left, Node right) {
        Node dummy = new Node(-1); 
        Node temp = dummy;

        while (left != null && right != null) {
            if (left.data < right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

   
        if (left != null) {
            temp.next = left;
        }
        if (right != null) {
            temp.next = right;
        }

        return dummy.next; 
    }


    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head; 
        }

        Node mid = getMid(head);
        Node rightHead = mid.next; 
        mid.next = null; 

       
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

    
        return merge(left, right);
    }
   
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigZag(){
        Node slow = Head;
        Node fast =Head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node curr = mid.next;
        Node prev = null;
        Node next = null;
       mid.next = null;


        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
             curr = next;

        }
        
        Node left = Head;
        Node right = prev;
        Node nextLh, nextRh;
        while(left != null && right != null){
            nextLh = left.next;
            left.next = right;
          nextRh= right.next;
            right.next = nextLh;
           left = nextLh;
           right = nextRh;
        }


    }
       public static void main(String args[]){
        
        Linklist ll = new Linklist();
        ll.addFirst(1);
        ll.addLast(7);
        ll.addLast(4);
        ll.addLast(4);
        ll.addLast(4);
          ll.print();
        ll.zigZag();
        ll.print();
        // ll.Head = ll.mergeSort(ll.Head);
        //  Head = new Node(1);
        //     Head.next = new Node(2);
        //     Head.next.next = new Node(9);
        //     Head.next.next.next = new Node(5);
            // Head.next.next = Head.next;
            //  System.out.print(isCycle());
            // removeCycle();
//  ll.printList(Head);

        // // ll. Head = new Node(4);
        // // ll.Head.next = new Node(7);
  
        // ll.addFirst(1);
           
        ll.print();
        // ll.addFirst(2);
        // ll.addFirst(2);
        //     ll.print();
        // // ll.addLast(1);
        // System.out.print(ll.checkPalindrome());
        //     // ll.print();

        // ll.addLast(9);
        // ll.print();
        // ll.add(2,20);
        // ll.print();
    //  ll.removeFirst();
    //  ll.removeLast();
    //   System.out.print(ll.itrSearch(9));
    //   System.out.print(ll.recursiveSearch(20));
    // ll.removenthNodeFromEnd(3);
    // //   ll.reverseNode();
    //     ll.print();
        //    ll.print();
        
        // System.out.print(ll.size);
       }
}