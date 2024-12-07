// // public class main{
// //     public static void main(String args[]){
// //         System.out.println(5 & 6);
// //         System.out.println(5 | 6);
// //         System.out.println(5 ^ 6);
// //         System.out.println(~0);
// //         System.out.println(5<<2);
// //     }
// // }


// // check if number is odd or even 
// // import java.util.*;
// // public class main{
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         int num1 = sc.nextInt();
// //         int bitMask =1 ;
// //         if((num1 & bitMask) == 0){
// //             System.out.print(" even number");
// //         }else{
// //             System.out.print("odd number");
// //         }
// //     }
// // }

// // get ith bit 
// // find 2nd position in  binary  of 5

// // public class BitwiseOperator{
// //     public static int getIthBit(int n,int i){
// //         int bitMask = 1<<i;
// //         if((n & bitMask )== 0){
// //             return 0;
// //         }else{
// //             return 1;
// //         }
// //     }
// // set third element in 0 to 1 ;
// //     public static int setIthBit(int n , int i){
// //         int bitMask =  1<<i;
// //         return n | bitMask ;
// //     }

// // set third element in 1 to 0 
// //     public static int clearItBit(int n , int i){
// //             return n & (~(1<<i));
// //     }

// //     public static int updateIthBit(int n ,int i,int num){
// //         if(num == 1){
// //             return  setIthBit(n, i);
// //         }else{
// //             return clearItBit(n , i);
// //         }

// //         int bit = clearItBit(n , i);
// //         int bitMask = num<< i;
// //         return bit | bitMask;

// //     }
// //     public static void main(String args[]){
// //         int n = 5;
// //         int i = 1;
// //         int num= 1;
// //      int position = getIthBit(n , i);
// //      System.out.println("the " + i + " position of " + n + " is " + position);
// // System.out.print(updateIthBit(n, i, num));
// //      System.out.println(setIthBit(10,0));
// //      System.out.print(clearItBit(5,0));

// //     }
// // }



// // clear ange of bit  
// public class bitMamipulate{
//     public static int clearRange(int n, int i){
//         return n & (~0)<< i;
//     }
//     public static void main(String args[]){
//         int n = 101;
//         int i =1;
//        System.out.print(clearRange(n ,i));
//     }
// }


// clear of range bit 
// public class BitManipulate{
//     public static int clearRangeBit(int i , int j , int n){
//         int a = (~0) << j;
//         int b = (1<<i) -1;
//         int bitMask = a | b;
//         return n & bitMask ;
//     }
//     public static void main(String args[]){
//          System.out.print(clearRangeBit(2,4,10));
//     }
// }

// public class main{
//     public static void main(String args[]){
//         int n = 4; 
//        boolean  find =  n & (n-1) == 0;
//        System.out.print(find);
//     }
// }