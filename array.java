
import java.util.*;
// public class array{
//     public static void main(String args[]){
//         int marks[]= new int[100];
//         Scanner sc = new Scanner(System.in);
//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();
//         marks[0]= marks[0]+1;
//         int percentage = (marks[0] + marks[1]+marks[2])/3;
//         System.out.println("phy :" + marks[0]);
//         System.out.println("math :" + marks[1]);
//         System.out.println("java :" + marks[2]);
//         System.out.println("percentage :" + percentage);

//         // int marks[]= { 99,92,95};
//         // System.out.print("phy :" +marks[0]);
//     }
// }

// public class main{
//     public static void argument(int marks[], int variable){
//         variable = 80;
//         for(int i=0; i <  marks.length; i++){
//            marks[i]= marks[i]+1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[] = { 99,92,80};
//         int variable = 99 ;
//         argument(marks , variable);
//         System.out.println(variable);
//           for(int i =0; i< marks.length; i++){
//             System.out.print(marks[i] + " ");
//           }

//     }
// }

// public class main{
//   public static int array( String menu[],String item){
//    for(int i=0; i< menu.length; i++){
//     if(menu[i] == item){
//  return i;
//     }

//    }
//    return -1;
//   }
//   public static void main(String args[]){
//     int numbers[] = {1,4, 5,6 ,7 ,8,10};
//     String menu[] ={"samosa","dosa","Noodles","kachori","vadapav"};
//     int key = 11;
//     String item ="kachori";
//     int index = array(menu,item);
//     if(index == -1){
//       System.out.print("Not found");
//     }else{
// System.out.print(" your order is no  : "+ index);
//     }
    
//   }
// }


// linear search 
// public class main{
//   public static int largestNum(int number[]){
//     int largest = Integer.MIN_VALUE;
//     int smallest = Integer.MAX_VALUE;
//     for(int i=0; i<number.length; i++){
//       if(largest < number[i]){
//         largest = number[i];
//       }
//       if(smallest > number[i]){
//         smallest=number[i];
//       }
//     }
//     System.out.println("smallest number is " + smallest);
//     return largest;
//   }
//   public static void main(String args[]){
//     int number[] = {1,4,3,5,222,19,33,4,50};
//     int largest = largestNum(number);
//     System.out.println("largest number is : "+ largest);
//   }
// }

// public class main{
//   public static void changeMarks(int marks[]){
// for(int i =0; i< marks.length; i++){
//       marks[i] = marks[i] +1;
// }


//   }
//   public static void main(String args[]){
//      int marks[] = {20,34,53,44};
//      changeMarks(marks);
//      for(int i=0; i<marks.length; i++){
//       System.out.print(marks[i] + " ");
//      }
//   }
// }

// public class main {
//   public static int findElelement(int num[] , int key){
//   for(int i=0; i< num.length; i++){
//       if (num[i] == key) {
//         return i;
//       }
//   }
//   return -1;
//   }
//   public static void main(String args[]){
//    int num[] ={1,5,7,3,2,1,5,8};
//    int key =7;
//    int index=findElelement(num,key);
//    System.out.print( index == -1 ? "Not found" : index);
//   }
// }

//find largest number 

// public class main{
//   public static int largestNum(int num[]){
//     int count =Integer.MIN_VALUE;
//     for(int i =0; i< num.length; i++){
//       if(count < num[i]){
//         count = num[i];
//       }
//     }
//     return count;
//   }
//   public static void main (String args[]){
//     int num[] = {1,4,5,6,3,4};
//    int largestValue =largestNum(num);
//     System.out.print("largest value " +largestValue );
//   }
// }


// public class main{
//   public static int largerSubArr(int num[]){
//     int largest = Integer.MIN_VALUE;
//     int start = 0; int end = 0;
//     for(int i= 0; i< num.length; i++){
//       for(int j=i; j < num.length; j++){
//         int sum = 0;
//          int number = 0;
//         for(int k=i; k<=j; k++){
//            sum = sum + num[k];
           
//         }
//         if(largest < sum){
//           largest = sum;
//           start = i;
//           end = j;
//         }
//         }
       
//       }
//       System.out.print("largest sub array element : ");
//       for(int i = start; i<= end; i++){
//         System.out.print(num[i]);
//       }
//       System.out.println();
//         return largest;
//     }
  
  
//   public static void main (String args[]){
//     int num[] = {1,2,3,4,5,6,7,8,9};
//    System.out.print("larger sub array sum : " +largerSubArr(num));
//   }
// }

// public class main{
//   public static int kadansAlgo(int num[]){
//     int currSum = 0;
//     int add = 0;
//       for(int i=1; i<num.length; i++){
//          add = num[i-1]+ num[i];
        
//          if(add > currSum){
//           currSum = add;
//          }
//           num[i] = add;
//       }
//       return currSum;
//   }
//   public static void main(String args[]){
//     int num[] = {10,-2,-4};
//     System.out.print(kadansAlgo(num));

//   }
// }


// kadans algorithms

public class main{
  public static kadansAlgo(int num[]){
  int maxValue = Integer.MIN_VALUE;
  int mx =num[0];
  for(int i=1; i< num.length; i++){
    mx = mx + num[i];
    if(mx < 0){
        mx =0;
    }
     maxValue= Math.max(maxValue,mx);
  }
  }
  public static void main (String args[]){
    int num[] = {-1,-2,3,4};

  }
}