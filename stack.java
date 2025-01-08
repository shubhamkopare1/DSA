// import java.util.ArrayList;
import java.util.*;
// // // using arraylist 
// // public class StackB{
// //     public static class Stack{
// //          ArrayList<Integer> list = new ArrayList<>();
// // public  boolean isEmpty(){
// //     return list.size() == 0;
// // }
// // public  void push(int data){
// //     list.add(data);

// // }
// // public  int pop(){
// //     if(isEmpty()){
// //        return -1; 
// //     }
// //     int top =list.get(list.size()-1); 
// //     list.remove(list.size()-1);
// //     return top;
// // }
// // public  int peek(){
// //     return list.get(list.size()-1);
// // }
// //     }
// // public static void main(String args[]){
// //     Stack s = new Stack();
// //     s.push(2);
// //     s.push(4);
// //     s.push(7);
// //     s.push(8);
// //     while(!s.isEmpty()){
// //         System.out.print(s.peek());
// //         s.pop();
// //     }

// // }
// // }


// // stack using linkedList 

// public class StackB{
//     static class Node{
//         int data;
//         Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
//     }
//     static class Stack{
//         static Node head = null;

//         public static Boolean isEmpty(){
//             return head == null;
//         }

//         // push operation 

//         public static void push(int data){
//             Node newNode  = new Node(data);
//             if(head == null){
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         // pop operation 

//         public static int pop(){
// if(isEmpty()){
//     System.out.print("stack is empty");
//     return -1;
// }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }
        
//         // peek operation 
//         public static int peek(){
//             if(isEmpty()){
//     System.out.print("stack is empty");
//     return -1;
// }
//             // System.out.print(head);
//             return head.data;
//         }

//     }
//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(2);
//         s.push(6);
//         s.push(7);
//         s.push(9);
//         while(!s.isEmpty()){
//            System.out.print( s.peek());
//             s.pop();
//         }
//     }
// }


public class StackB{
         public static void printAtBottom(Stack<Integer> s, int data){
            if(s.isEmpty()){
            s.push(data);
            return;
            }
            int top = s.pop();
               printAtBottom(s, data);
            
              s.push(top);
         }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(2);
        s.push(9);
        s.push(3);
       printAtBottom(s,7);
         int idx =0;
         while(!s.isEmpty()){
              System.out.print(s.pop());
         }
    }
}