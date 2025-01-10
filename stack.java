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
         public static String reverseString(String str){

          Stack <Character> s = new Stack<>();
                   int idx = 0;
                   while(idx != str.length()){
                       s.push(str.charAt(idx));
                       idx++;
                   }
                    StringBuilder result = new StringBuilder(" ");
                   while(!s.isEmpty() ){
                     
                       result.append(s.pop());
                       
                   }
                   return result.toString();
               
         }

         public static void reveseStack(Stack <Integer> s){
                 if(s.isEmpty()){
                    return;
                 }
                int top = s.pop();
               reveseStack(s);
               printAtBottom(s, top);
         }
         public static void printStack(Stack<Integer> s){

              while(!s.isEmpty()){
                  System.out.print(s.pop());
              }
         }


         public static Boolean isValid(String str){
           Stack<Character> s = new Stack<>();

            for(int i=0; i< str.length(); i++){
                char ch = str.charAt(i);
                   if(ch == '(' || ch == '{' || ch == '['){
                    s.push(ch);
                   }
                   else{
                    if(s.isEmpty()){
                        return false;
                    }else{
                        if(ch == '}' && s.peek() ==  '{'|| ch == ']' && s.peek() == '['|| ch == ')' && s.peek() == '('){
                            s.pop();
                        }else{
                            return false;
                        }
                    }
                   }
            }
            if(s.isEmpty()){
                return true;
            }else{
                return false;
            }
          
         }

         public static Boolean isDuplicate(String str){
            Stack <Character> s = new Stack<>();
            
             for(int i=0; i<str.length(); i++){
                    char ch = str.charAt(i);
                   if(ch == ')'){
                    int count = 0;
                    while(s.peek() != '('){
                        s.pop();
                        count++;
                    }
                    if(count <1){
                        return true;
                    }else{
                          s.pop(); 
                    }
                   }else{
                    s.push(ch);
                   }
             }
             return false;

         }
    public static void main(String args[]){
        // Stack<Integer> s = new Stack<>();
    String str = "((a+b) + (b+d))";
//    System.out.print(isValid(str));
   System.out.print(isDuplicate(str));
        // s.push(4);
        // s.push(2);
        // s.push(9);
        // s.push(3);
        // reveseStack(s);
        // printStack(s);
     //   printAtBottom(s,7);
     //     int idx =0;
     //     while(!s.isEmpty()){
     //          System.out.print(s.pop());
     //     }
    //  System.out.print(reverseString("abc"));
    }
}