// import java.util.*;
// public class QueueB{
  
//     static class Node{
//         int data;
//         Node next;
//        Node(int data){
//         this.data  = data;
//         this.next = null;
//        }
//     }
//     static class Queue{
//         // static int arr[];
      
//      static Node Head = null;
//      static Node tail = null;

     

//         public static Boolean isEmpty(){
//             return tail == null && Head == null ;
//         }


//     // add function 
//     public static void add(int data){
//             Node newNode = new Node(data);
//             if(Head  == null && tail == null){
//                 Head = tail = newNode;
//                 return;
//             }
//             tail.next= newNode;
//             tail = newNode;
//     }


// // remove
//    public static int remove(){
//     if(isEmpty()){
//         System.out.println("empty queue");
//         return -1;
//     }
//     int front = Head.data;
//   if(Head == tail){
//   Head = tail= null;
//   }else{
//     Head = Head.next;
//   }
//     return front;
//    }
//    // peek 
//    public static int peek(){
//      if(isEmpty()){
//         System.out.println("empty queue");
//         return -1;
//     }
//     return Head.data;
//    }
//     }

//     public static void main(String args[]){
//       Queue q = new Queue();
//       q.add(1);
//       q.add(2);
//       q.add(3);
//      while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//      }
//     }
// }