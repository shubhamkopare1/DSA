import java.util.*;
import java.util.Arrays;
public class practice {
    // public static boolean oddEven(){
    //     Scanner sc = new Scanner(System.in);
    //      int number = sc.nextInt();
    //  if(number % 2 == 0 || number==1){
    //        return true;
    //  }else{
    //     return false;
    //  }
    // }
    // public static void main(String args[]){
    //    boolean sum =  oddEven();
    //      if(sum == true){
    //         System.out.print("odd");
    //      }else{
    //         System.out.print("even");
    //      }

    // }

    // public static String incomeTax(int income){
    //     String calculateTax = income < 5 ? " 0% Tax " : income > 10 ? "30% tax" : "10% tax";
    //     return calculateTax ;
    // }
    // public static void gretestNum(int a, int b, int c){
    //        if(a > b && a>c ){
    //             System.out.print("a is big");    
    //        }else if(b > c){           
    //             System.out.print(" bb");
    //         }else{
    //              System.out.print("c is big");
    //         }
    //        }

    // public static int cal(){
    //     Scanner sc =  new Scanner(System.in);
    //     System.out.print("enter first value ");
    //     int num1 = sc.nextInt();
    //        System.out.print("enter second value ");
    //     int num2 = sc.nextInt();
    //        System.out.print("enter opt value ");
    //     char opt = sc.next().charAt(0);

    //     if(opt == '+'){
    //         return num1 + num2;
    //     }else if(opt == '-'){
    //         return num1 -num2;
    //     }else if(opt == '*'){
    //         return num1 * num2;
    //     }else if(opt == '/'){
    //         return num1 / num2 ;
    //     }else{
    //         return 0;
    //     }
     
    // }
    // public static void checkValue(){
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();
    //     if(num < 0){
    //         System.out.print("negative number");
    //     }else{
    //           System.out.print("positive number");
    //     }
    // } 

    // public static void fever(int temp){
    //     if(temp > 100){
    //         System.out.print("you have fever");
    //     }else{
    //           System.out.print("you did not have fever");
    //     }
    // }
        // public static int sumNum(int n){
        //   int sum = 0;
        //   for(int i =1 ; i<= 3; i++){
        //      sum = sum + i;
        //   }
        //   return sum;
        // }

        // public static void sqrPattern(int n){
        //  for(int i =1; i<= n; i++){
        //   for(int j =1 ; j<= n; j++){
        //     System.out.print("*");
        //   }
        //   System.out.println();

        //  }
        // }

        // public static int reverseNum(int num){
        //   int reverse =0;
        //    while(num / 10 != 0){
        //     reverse = reverse + num%10;
        //     num = num /10;
        //    }

        //     return reverse;
           
        // }

        // public static void sumNum(int n){
        //    int sumEven = 0;
        //    int sumOdd = 0;
        //      for(int i=0; i<= n ; i++){
        //       if(i % 2 == 0){
        //        sumEven += i;
               
        //       }else{
        //         sumOdd = sumOdd+ i;
                 
        //       }
        //      }
            
        //            System.out.println(sumOdd);
        //             System.out.println(sumEven);
          
        // }
        // public static int fact(int n){
        //   int count = 1;
        //   for(int i =1; i<= n ; i++){
        //      count = count *i;
             
        //   }
        //   return count ;
        // }
        // public static void mul(int n){
        //   for(int i = 1; i<=10 ; i++){
        //     System.out.println(i*n);
        //   }
        // }
        // public static void printStar(int n){
        // for(int i =1; i<=n; i++){
        //    for(int j=n; j>= i; j--){
        //     System.out.print("*");
        //    }
        //    System.out.println();
        // }
        // }
        // public static void halfPyramid(int n){
        //   for(int i =0 ; i<= n ; i++){
        //     for(int j=1; j<=i; j++){
        //       System.out.print(j);
        //     }
        //     System.out.println();
        //   }
        // }
        // public static void chPattern(int n){
        //   char ch ='A';
        //   for(int i =0; i<=n; i++){
        //     for(int j =0 ; j<=i; j++){
        //        System.out.print(ch);
        //        ch++;
        //     }
        //     System.out.println();
        //   }
        // }
          // public static void hellowRect(int n){
          //   for(int i=0; i<=n; i++){
          //     for(int j=0; j<=n; j++){
          //       if(i== 0 || i== n || j==0 || j==n){
          //         System.out.print("*");
          //       }else{
          //         System.out.print(" ");
          //       }
               
          //     }
          //      System.out.println();
          //   }
          // }

// public static void printStar(int n){
//   for(int i=0; i<=n; i++){
//     for(int j=0; j<=n-i; j++){
//        System.out.print(" ");
//     }
//     for(int j=0; j<=i ; j++){
//       System.out.print("*");
//     }
//     System.out.println();
//   }
// }
//  public static void printStar(int n){
//   for(int i=0; i<=n; i++){
      
//     for(int j=1; j<=n-i; j++){
//     System.out.print(j);
//     }
//     System.out.println();
//   }
//  }
//  public static void printStar(int n){
//   int count = 1;
//   for(int i=0; i<n; i++){
//     for(int j=0; j<=i; j++){
//        System.out.print(count);
//        count++;
//     }
//     System.out.println();
//   }
//  }
//  public static void printStar(int n){
//   boolean pattern = true;
//   for(int i=0; i<=n; i++){
//     for(int j=0; j<=i; j++){
//       if(pattern){
//         System.out.print("1");
//         pattern =false;
//       }else{
//         System.out.print("0");
//         pattern =true;
//       }
//     }
//     System.out.println();
//   }
//  }
//  public static void printStar(int n){
//   for(int i=0; i<=n; i++){
//     for(int j=0; j<=n-i; j++){
      
//     }
//   }
//  }
// public static int fact(int n){
//   int count = 1;
//   for(int i =1; i<= n ; i++){
//      count = count*i;
// }
// return count;
// }
  //  public static int LargestNum(int num[]){
  //   int LargestNum = 0;
  //   for(int i=0; i< num.length; i++){
  //     if(num[i] > LargestNum){
  //       LargestNum = num[i];
  //     }
      
  //  }
  //  return LargestNum;
  //  }

  //  public static int binarySearch(int num[] ,int key){
  //   Arrays.sort(num); 
  //     int length =num.length -1;
  //     int start = 0;
  //     int end = length;
  //      while(start<=end ){
  //       int mid = (start + end) / 2;
  //       if(num[mid] == key){
  //         return mid;
  //       }
  //       if(num[mid] > key){
  //         end = mid-1;
  //       }else{
  //         start = mid +1 ;
  //       }
       
  //      }     
  //      return -1; 
  //    }
  public static void reverseNum(int num[]){
    int count = num.length -1;
    int value =0;
    for(int i =0; i<=num.length/2; i++){
        value = num[i];
        num[i] = num[count];
        num[count] = value;
        count--;
        System.out.println(num[i]);
    }
    for(int i = 0; i<num.length; i++){
      System.out.print(num[i]);
    }
  }
    public static void main(String args[]){
      int num[] = {1,3,4,2,19,2,8,4};
      // int index= binarySearch(num , 19);
       reverseNum(num);
     
      // printStar(5);
    //  System.out.print( fact(5));
      // hellowRect(5);
      // chPattern(5);
      // halfPyramid(5);
      // printStar(6);
    //  System.out.print(fact(5));
    // mul(4);
    //  System.out.print(reverseNum(num));
    // sumNum(10);
    // sqrPattern(4);
    //  System.out.print( sumNum(7));
    }
}