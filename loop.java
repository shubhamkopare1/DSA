
// public class loop{
//     public static void main(String args[]){
//         int count = 0;
//         while(count < 100){
//      System.out.println("hellow");
//      count++;
//         }
//         System.out.println("hellow brother");
//     }
// }


//print number from 1 to 10 ;
// public class main{
//     public static void main(String args[]){
//         int num = 0;
//         while(num <10){
//             num++;
//             System.out.println(num);
//         }
//     }
// }

import java.util.*;
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int count = 0;
//         int count2 = 1;
       
//         while( count2 <= num){
           
            
//             count = count + count2;
//             count2++;
//         }
//         System.out.println(count);
//     }
// }



//print starr square pattern 

// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int line = 4;
//         for(int i=0; i<=line; i++){
//             System.out.println("****");
//         }
//     }
// }


//reverse number 
// public class main{
//      public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
        
//        while(num > 0){
//          int sum =  num % 10;
//          System.out.print(sum);
//         num =  num /10;
       
//        }
//      }
// }

// reverse number 
// public class main {
//   public static void main(String args[]){
//     int n = 2034;
//     int rev = 0;
//     while(n>0){
//       int lastValue = n %10;
//       rev = (rev *10) + lastValue;
//       n = n/10;
      
//     }
//     System.out.print(rev);

//   }
// }



// do while loop

// public class main {
//   public static void main(String[] args){
//     int count =1 ;
//     do{
      
//  System.out.println("hellow world");
//  count++;
//     }while(count <= 10);

    
//   }
// }
// exist the loop multiply 10 value 

// public class main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     while(true){
//       System.out.print("enter the number : ");
//       int value = sc.nextInt();
//       if(value % 10 == 0){
//         break;
//       }
     
//     }
//     System.out.print("break the value ");
//   }
// }

// print all number without mulple by 10 vLUE
// public class main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     while(true){
//       System.out.print("enter the number : ");
//       int value = sc.nextInt();
//       if(value % 10 == 0){
//         continue;
//       }
//      System.out.println(value);
//     }
    
//   }
// }
// print number prime or not 




// print factorial of number 

// public class main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int sum =1;
//     for(int i=1; i<=n ; i++){
//         sum = sum* (n-i);
//     }
//     System.out.println(n + " factorial is "+sum);
//   }
// }

// public class main{
//   public static void main(String[] args){
//     int i = 0;
//     for( i=0; i<5 ; i++){
//       System.out.println("hellow");
//     }
//     System.out.print(i);
//   }
// }


//print multilication table 
// public class main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//      int sum ;
//      for(int i = 1; i<=10; i++){
//       sum = n * i;
//       System.out.println(sum);
//      }
//   }
// }


//print stars  *
// **
// ***
// **** this type 
// public class main{
//   public static void main(String[] args){
//    for(int i = 1; i<=4; i++ ){
//     for(int j=1; j<=i; j++){

//        System.out.print("*");
//     }
//     System.out.print("\n");
//    }
//   }
// }

// print stars
// ****
// ***
// **
// *
// public class main{
//   public static void main(String[] args){
//     int line = 4;
//    for(int i = 0; i<4; i++ ){
//     for(int j=1; j<=line-i; j++){

//        System.out.print("*");
//     }
//     System.out.print("\n");
//    }
//   }
// }

// print this typee
// 1
// 12
// 123
// 1234
//  public class main{
//   public static void main(String[] args){
//     // int line = 4;
//    for(int i = 1; i<=4; i++ ){
//     for(int j=1; j<=i; j++){

//        System.out.print(j);
//     }
//     System.out.print("\n");
//    }
//   }
// }

// print this type
// A
// BC
// DEF
// GHIJ
//  public class main{
//   public static void main(String[] args){
//     char ch = 'A';
//    for(int i = 1; i<=4; i++ ){
//     for(int j=1; j<=i; j++){
      
//        System.out.print(ch);
//         ch++;
//     }
//     System.out.print("\n");
//    }
//   }
// }

//print 
// 12345
// 1234
// 123
// 12
// 1
//   public class main{
//   public static void main(String[] args){
   
//    for(int i = 5; i>=1; i-- ){
//     for(int j=1; j<=i; j++){

//        System.out.print(j);
       
//     }
//     System.out.print("\n");
//    }
//   }
// }

//print 1 
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
//   public class main{
//   public static void main(String[] args){
//    int line = 1;
//    for(int i = 1; i<=5; i++ ){
//     for(int j=1; j<=i; j++){

//        System.out.print(line+ " ");
//        line++;
       
//     }
//     System.out.print("\n");
//    }
//   }
// }

//print 
// 1
// 010
// 1010
// 10101


  public class main{
  public static void main(String[] args){
   int line = 1;
   for(int i = 1; i<=5; i++ ){
    for(int j=1; j<=i; j++){
  if(line % 2 == 0){
   System.out.print(0);
  }
  if(line % 2 != 0){
    System.out.print(1);
  }
  line++;
       
    }
    System.out.print("\n");
   }
  }
}
