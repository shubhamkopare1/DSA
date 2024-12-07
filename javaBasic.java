import java.util.*;

// public class javaBasic {
//     public static void main(String args[]){
//         System.out.print("hellow  \n world ");
//         System.out.print("hey shubham \n");
//     }
// }



// print ******

// public class javaBasic{
//     public static void main(String args[]){
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }


// variables in java 

// public class javaBasic{
//     public static void main(String args[]){
//         int a = 10;
//         String name = "shubham";
//         System.out.println(name);
//         System.out.println(a);
//     }
// }


// sum of a & b

// public class javaBasic{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 2;
//         int sum = a+b;
//         System.out.println(sum);

//     }
// }

// input 
// import java.util.*;
// public class javaBasics{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int input = sc.nextInt();
// System.out.println(input);
// }
// }

// import java.util.*;
// public class javaBasic{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);

//     }
// }


//product of two number 
// import java.util.*;
// public class javaBasic{
//     public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int product =  a*b;
// System.out.println(product);
// int r = sc.nextInt();
//  int mul = r * r ;
//  double area = 3.14 * mul  ;
//  System.out.println(area);
//     }
// }

//// are of circle 

//public class javaBasic{
//     public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
//   float r = sc.nextInt();
//   float area =  3.14f * r*r;
//   System.out.println(area);
//     }
// }

//// type convvesation $ type casting
// public class javaBasic{
//     public static void main(String args[]){
//         float maark = 99.9999f;
//         char b = 'a';
//         int a =  (int) b;
//         System.out.println(a);
//     }
// }


// type promotion

// public class javaBasic{
//     public static void main(String args[]){
//         char a = 'g';
//         double b = 4.0;
//         long c = 23;
//         double sum = a + b+c;
//         System.out.println(sum);

//     }
// }

// public class javaBasic{
//     public static void main(String args[]){
//         byte a = 50;
//         char b = 'b';
//         byte sum = (byte)(a + b);
//         System.out.println(sum);
//     }
// }


/// find average of 3 numbers

// public class javaBasic{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int sum = a + b + c ;
//         int avg = sum / 3;
//         System.out.println(avg);

//     }
// }

// FIND area of square 

// public class javaBasic{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int area = a *b ;
//         System.out.println(area);

//     }
// }

// Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

public class javaBasic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int pencil = sc.nextInt();
        int eraser =sc.nextInt();
        int pen = sc.nextInt();
        float sum = pencil + eraser + pen ;
        float cost = (float)(sum * 18 /100);
        System.out.println(cost);

    }
}