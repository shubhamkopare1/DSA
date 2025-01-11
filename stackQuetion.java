import java.util.*;
public class stackB{
    public class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
     public static Node Head;
     public static Node Tell;
    
  
    public void add(int data){ 
          Node newNode = new Node(data);
          Node Temp = Head;
        if(Head == null){
            Head=Tell= newNode;
            return;
        }
          Tell.next = newNode;
          Tell = newNode;
    }

    public Boolean isPalindrome(){
        Stack<Integer> s = new Stack<>();
        Node temp =Head;
        while(temp != null){
            s.push(temp.data);
             temp = temp.next;
        }

temp = Head;
        while(temp != null){
            int i = s.pop();
            if(temp.data != i){
                return false;
              
            }
             temp = temp.next;
        } 
        return true;
    }

    public static void main(String args[]){

        stackB s = new stackB();
        s.add(1);
        s.add(2);
        s.add(2);
        s.add(2);
        System.out.print(s.isPalindrome());
    }
}