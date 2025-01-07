import java.util.LinkedList;
public class Classroom{
    
     
     
    public static void main(String args[]){
         LinkedList<Integer> ll = new LinkedList<>();
         ll.addFirst(1);
         ll.addLast(2);
         ll.addLast(3);
         ll.addFirst(3);
         ll.removeFirst();
         ll.removeLast();
        //  ll.reverseNode;
         System.out.print(ll);

    }
}