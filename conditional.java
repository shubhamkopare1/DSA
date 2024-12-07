// public class main{
//     public static void main (String args[]){
//         int a = 30;
//         if(a>30){
//             System.out.println(a + "> 2");
//         }else if(a<30){
//             System.out.println(a+ "< 2");
//         }else{
//             System.out.println("a is equal to value ");
//         }
//     }
// }


/// print the largrst number 
// public class main{
//     public static void main(String args[]){
//         int a = 2 ;
//         int b = 4;
//         if(a > b){
//             System.out.println(a + "is greater value");
//         }else{
//             System.out.println(b + "is greater value");
//         }
//     }
// }

///print the odd or even number

// public class main{
//     public static void main(String args[]){
//         int a = 1;
//         int b = 2;
//         int c = 3;
//         int d = 4;
//         if(a % 2 == 0){
//             System.out.println( a + "is even number");
//         }else{
//             System.out.println(a + "is prime number");
//         }
//         if(b % 2 == 0){
//             System.out.println( b + "is even number");
//         }else{
//             System.out.println(b + "is prime number");
//         }
//         if(c % 2 == 0){
//             System.out.println( c + "is even number");
//         }else{
//             System.out.println(c + "is prime number");
//         }
//         if(d % 2 == 0){
//             System.out.println( d + "is even number");
//         }else{
//             System.out.println(d + "is prime number");

//         }
//     }
// }


/// find the even or odd number 

// public class main{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
//      if(a%2 ==0){
//         System.out.println(a + " is even number");
//      }else if(!(a%2 == 0)){
//         System.out.println(a + " is odd number ");
//      }else{
//         System.out.println("else condition");
//      }
//     }
// }

// find the income tax 
import java.util.*;
// public class java{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int tax = sc.nextInt();
//         double totalTax = 0;
//         if( tax <= 5000000){
//          System.out.print("tax 0%");
//         }else if(tax >= 500000 && tax <= 1000000){
//              totalTax = 0.2 * tax ;
//             System.out.print("tax" + totalTax);
//         }else {
//               totalTax = 0.3 * tax ;
//             System.out.print("tax " + totalTax);
//         }

        
//     }
// }


/// print the largest of 3 numbers 
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a =sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         if(a >= b && a >= c){
//         System.out.println(a);
//         }else if(b>c){
//             System.out.println(b);
//         }else{
//             System.out.print(c);
//         }

//     }
// }


/// ternery operator 
// public class main{
//    public static void main(String args[]){
//     String name = (4> 5) ? "shubham" : "vebv";
//     System.out.print(name);
//    }
// }

// check the student fail or not 
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int mark = sc.nextInt();
//         String result = (mark >= 33)? "pass" : "fail";
//         System.out.print(result);
//     }
// }


//  calculator using switch statement
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the first number");
//         int a = sc.nextInt();
//         System.out.println("enter expresion foe ex : + - * /");
//         char c =sc.next().charAt(0);
//         System.out.println("enter the second number");
//         int b = sc.nextInt();
//         switch(c){
//             case '+' : System.out.print(a + b);
//              break;
//             case '-' : System.out.print(a - b);
//             break;
//             case '/' : System.out.print(a / b);
//             break;
//             case '*' : System.out.print(a *b);
//             default : System.out.print("not found any othr operatin");
//         }
//             }
// }

//Write a Java program to get a number from the user and print whether it is positive or negative
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         String number =  (num < 0)  ? "negative" : "positive";
//         System.out.print(number);
//     }
// }


//Finish the following codes o that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever

// public class main{
//     public static void main(String args[]){;
//    Scanner sc = new Scanner(System.in);
//    int temp = sc.nextInt();
//    if(temp >= 100){
//     System.out.println("you have a fever");
//    }else{
//     System.out.println("you  dont have fever");
//    }
//     }
// }



public class main{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1 : System.out.print("sundaay");
            break;
            case 2 : System.out.print("monday");
            break;
            case 3 : System.out.print("tuesday");
            break;
            case 4 : System.out.print("wednesday");
            break;
            case 5 : System.out.print("thrusday");
            break;
            case 6 : System.out.print("friday");
            break;
            case 7 : System.out.print("saturday");
            break;
            default : System.out.print("not have any other day");
        }
    }
}