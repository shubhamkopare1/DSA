
// public class main {
//     public static void printHellow(){
//         System.out.println("hellow");
//         System.out.println("hellow world");
//         return ;
//     }
//     public static void main(String args[]){
//  printHellow();

//     }
// }

import java.util.*;
// syntax of parameter
// public class main{
//     public static int calculateSum(int num , int num2){
//     int sum = num + num2;
//     return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       int sum = calculateSum(a,b);
//       System.out.print(sum);
//     }
// }

//swap the number 

// public class main{
//     public static void main(String args[]){
//         int a = 5;
//         int b =4;
//         int temp =a;
//         temp = b;
//         b =a;
//         System.out.print(temp +""+ b);
//     }
// }


// public class main{
//     public static int print(int a){
//      a = 10;
//      return a;
//     }
//     public static void main(String args[]){
//         int a = 5 ;
//         int value = print(a);
//         System.out.print(value);
//         System.out.print(a);

//     }
// }


// find product 

// public class main{
//     public static int product(int a,int b){
//         int sum = a * b;
//         return sum ;
//     }
//     public static void main(String args[]){
//         int a =3;
//         int b= 4;
//        int calculate = product(a,b);
//        System.out.println(calculate);
//     }
// }



// find factorial 

// public class main{
//     public static int factorial(int a){
//  int num=2;
//  int sum=1;
//  for(int i = 1; i<=a; i++){
// sum = sum * i;


//  }
//  return sum;
//     }
//     public static void main(String args[]){
//         int value=4;
//        int calculate= factorial(value);
//        System.out.println(calculate) ;
//     }
// }

// find binomial
// public class main{
//     public static int factorial(int a){
//  int num=2;
//  int sum=1;
//  for(int i = 1; i<=a; i++){
// sum = sum * i;


//  }
//  return sum;
//     }
//     public static void main(String args[]){
//         int n=10;
//         int r =5;

//        int nFactorial= factorial(n);
//        int rFactorial= factorial(r);
//        int nrFactorial= factorial(n-r);
//       int binomial = nFactorial/rFactorial * nrFactorial;
//           System.out.println("binomial is " + binomial);
//     }
// }


// owerloading function

// public class main{
//     public static void sum( int a , int b ){
//             System.out.println(a + b);
//         }
//     public static void sum( int a , int b , int c){
//             System.out.println(a + b);
//         }
//     public static void sum( float a , float b){
//             System.out.println(a + b);
//         }
//     public static void main(String arg[]){
//         sum(4 , 5);
//         sum(1.2f ,3.5f);
//         sum(3,7 ,6);
//     }
    
// }

// prime number 
// public class main {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Boolean isPrime = true;
//         if(n == 2){
//             System.out.println("is a prime number ");
//         }else{
//            for(int i=2; i<=n-1; i++){
//             if(n % i == 0){
//             isPrime=false;
//             }
//         }
//         if(isPrime == true){
//             System.out.println("i a prime number ");
//         }else{
//             System.out.println("is not prime number");
//         }
//     } 
//         }
        
// }

// find prime number using function

// public class main{
//     public static boolean prime(){
//         // corner cases
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n== 2){
//             return true;
//         }
       
      
//         for(int i = 2; i <= n-1; i++){
//             if(n % i == 0){
//            return false;
//             }
//         }
// return true;
//     }
//     public static void main(String args[]){
//     System.out.println(prime());
//     }
// }

// // find prime number with optimized code 
// public class main{
//     public static boolean isPrime(int n ){
//         if(n==2){
// return true;
//         }
//         for(int i = 2; i<=Math.sqrt(n); i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         System.out.println(isPrime(8));
//     }
// }


// public class main{
//     public static void isPrime(){
       
//         for(int i=1 ; i<=10 ; i++){
//              boolean prime = true;
//             if(i <= 1){
//                 prime= false;
//             }
           
//             for(int j=2; j<=Math.sqrt(i); j++){
//                 if(i  % j == 0){
//                     prime = false;
//                 } 
                
//             }
//           System.out.println( i + ","+prime);
//         }
//     }
//     public static void main(String args[]){
//         isPrime();
//     }
// }

//  public class main{
//     public static boolean isPrime(int n ){
//         if(n==2){
// return true;
//         }
//         for(int i = 2; i<=Math.sqrt(n); i++){
//             if(n % i == 0){
              
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void printPrime(int n){
//         for(int i=2; i<=n; i++){
//             if(isPrime(i)){
//                 System.out.println(i +""+ isPrime(i));
//             }
//         }
//     }
//     public static void main(String args[]){
//         printPrime(10);
//     }
// }


// binary to decimal code eg

// public class main{
//     public static void decimal(int n){
//     int dec = 0;
//     int binary = n;
//     int pow = 0;
//  while(n > 0){
//         int lv = n %10;
        
//         dec =  dec + ( lv * (int) Math.pow(2 , pow));
//         n=n / 10 ;
//         pow++;
    
//  }
//  System.out.println("the binary of " + binary+ " is  " + dec + " decimal");
 
//     }
//     public static void main(String args[]){
//     decimal(10);
//     }
// }

//decimal to binary 

// public class main{
//     public static void decimal(int n){
//        int dec =0;
//         int pow = 0 ;
//    while(n>0){
//     dec = dec + ( n%2 * (int)Math.pow(10,pow));

//     n /=2;
//     pow++;
//    }
//    System.out.print(dec);
//     }
//     public static void main (String args[]){
// decimal(8);
//     }
// }

// find average of 3 number 

public class main{
    public static int average(){
        int a = 2;
        int b = 4;
        int c = 7;
        return  a + b + c /3;
    }
    public static void main(String args[]){
    System.out.print(average());
    }
}