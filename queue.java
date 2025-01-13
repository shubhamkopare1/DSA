import java.util.*;
// // public class QueueB{
  
// //     static class Node{
// //         int data;
// //         Node next;
// //        Node(int data){
// //         this.data  = data;
// //         this.next = null;
// //        }
// //     }
// //     static class Queue{
// //         // static int arr[];
      
// //      static Node Head = null;
// //      static Node tail = null;

     

// //         public static Boolean isEmpty(){
// //             return tail == null && Head == null ;
// //         }


// //     // add function 
// //     public static void add(int data){
// //             Node newNode = new Node(data);
// //             if(Head  == null && tail == null){
// //                 Head = tail = newNode;
// //                 return;
// //             }
// //             tail.next= newNode;
// //             tail = newNode;
// //     }


// // // remove
// //    public static int remove(){
// //     if(isEmpty()){
// //         System.out.println("empty queue");
// //         return -1;
// //     }
// //     int front = Head.data;
// //   if(Head == tail){
// //   Head = tail= null;
// //   }else{
// //     Head = Head.next;
// //   }
// //     return front;
// //    }
// //    // peek 
// //    public static int peek(){
// //      if(isEmpty()){
// //         System.out.println("empty queue");
// //         return -1;
// //     }
// //     return Head.data;
// //    }
// //     }

// //     public static void main(String args[]){
// //       Queue q = new Queue();
// //       q.add(1);
// //       q.add(2);
// //       q.add(3);
// //      while(!q.isEmpty()){
// //         System.out.println(q.peek());
// //         q.remove();
// //      }
// //     }
// // }


// public class queueB{
//     static class Queue{
//     //  static   Stack<Integer> s1 = new Stack<>();
//     //   static  Stack<Integer> s2 = new Stack<>();
//       static Queue<Integer> q1 = new LinkedList<>();
//       static Queue<Integer> q2 = new LinkedList<>();





// public static boolean isEmptys(){
//         //  return s1.isEmpty();
//         return q1.isEmpty();
// }
//        public static void add(int data){

       

//         // while(!s1.isEmpty()){
//         //     s2.push(s1.pop());
//         // }
//         while(!q1.isEmpty()){
//             q2.push(q1.pop());
//         }
//         //  s1.push(data);
//          q1.push(data);
//         // while(!s2.isEmpty()){
//         //   s1.push(s2.pop());
//         // }
//         while(!q2.isEmpty()){
//           q1.push(q2.pop());
//         }

//        }
//        public static int remove(){
//         // if(s1.isEmpty()){
//         //     return -1;
//         // }
//         //        return s1.pop();
//         if(q1.isEmpty()){
//             return -1;
//         }
//                return q1.pop();
//        }
//        public static int peek(){
//         //   return s1.peek();
//           return q1.peek();
//        }

//     }
//     public static void main(String args[]){
//                 Queue q = new Queue();
//                 q.add(1);
//                 q.add(2);
//                 q.add(3);
//                 while(!q.isEmptys()){
//                       System.out.print(q.peek());
//                       q.remove();
//                 }

//     }
// }

import java.util.LinkedList;
import java.util.Queue;
// interleaves of 2 halves of a queue 

public class QueueB{
  // public static void interLeaves(Queue<Integer> q){
  // Queue<Integer> q1 = new LinkedList<>();
  //     int size = q.size() /2;
  //     for(int i=0; i< size; i++){
  //              q1.add(q.remove());

  //     }
  //      while(!q1.isEmpty()){
  //        q.add(q1.remove());
  //           q.add(q.remove()); 
  //           }
  // }
  // public static void reverseQueue(Queue<Integer> q){
  //           Stack<Integer> s = new Stack<>();
  //           while(!q.isEmpty()){
  //             s.push(q.remove());
  //           }
  //           while(!s.isEmpty()){
  //             q.add(s.pop());
  //           } 
  // }

  public static void main(String args[]){
    Queue<Integer> q = new LinkedList<>();
    Deque<Integer> d = new LinkedList<>();
        d.addFirst(3);
        d.addFirst(2);
        d.addFirst(7);
        d.addLast(5);
        while(!d.isEmpty()){
          System.out.print(d.removeFirst());
        }

    // q.add(1);
    // q.add(4);
    // q.add(5);
    // q.add(6);
    // q.add(7);
    // q.add(8);
    // // interLeaves(q);
    // reverseQueue(q);
    //    while(!q.isEmpty()){
    //     System.out.print(q.remove());
    //    }
  }
}