// import java.util.*;
// public class main{
//     public static void creteArray(int num[][]){

//           Scanner sc = new Scanner(System.in);
//           int n = num.length;
//           for(int i = 0; i< n; i++ ){
//             for(int j=0 ; j< num[0].length ; j++){
//                 num[i][j] = sc.nextInt();
//             }
//           }
//     }
//     public static void printArray2d(int num[][]){
//                 int min = Integer.MAX_VALUE;
//         for(int i =0; i< num.length; i++){
//             for(int j=0 ; j< num.length; j++){
//                 if( min > num[i][j] ){
//                      min = num[i][j];
//                 }
//             }
            
//         }
//         System.out.print( " topper of the student mark is " + min );
//     }
//     public static void main(String args[]){
// int num[][] = new int[3][3];
// creteArray(num);
// printArray2d(num);
//     }
// }



// public class main{
//     public static void diagonal(int num[][]){
//         int sRow=0;
//         int eRow = num.length-1;
//         int sCol=0;
//         int eCol = num.length-1;
//         int n = num.length;
//         int pd =0;
//         int sd =0;
//         for(int i =0; i< n; i++ ){
         
                
//                     pd = pd + num[i][sRow];
                
//              if(num[i][sRow] != num[i][eCol ]){
//                 sd = sd+ num[i][eCol ];
//              }
                    
//            sRow++;
//             eCol--;
//             }
           
        
//       System.out.print(sd + " ");
//       System.out.print(pd + " ");
//       System.out.print("total diagonal "+ (sd + pd ));


//     }

//     public static void main(String args[]){
//         int num[][] ={
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}
           

//         };
//         diagonal(num);
//     }
// }



// public class main{
//     public static boolean findKey(int num[][],int key){
//         int sRow = 0;
//         int eCol = num.length -1;
//         while( num[sRow][eCol] == key || eCol > 0){
//           if(num[sRow][eCol] == key ){
//             System.out.print(sRow + " " + eCol);
//             return true;
//           }else if(num[sRow][eCol] < key){
//             sRow++;
//           }else{
//             eCol--;
//           }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int num[][] = {
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16},
//         };
//         int key = 16;
//         findKey(num,key);

//     }
// }


// Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2

// public class main{
//   public static void countElement(int num[][]){
//    int count = 0;
//     int n = 7;
//     for(int i =0; i<num.length; i++ ){
//       for(int j=0; j< num[i].length; j++){
//            if(n == num[i][j]){
//             count++;
//            }
//       }
//     }
//   System.out.print(count);
//   }
//   public static void main(String args[]){
//     int num[][] ={
//       {2,4,7},
//       {4,7,7},
//       {3,6,7}
//     };
      
//       countElement(num);
//   }
// }

// Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18

// public class sumArray{
//   public static int sum(int num[][]){
//    int n = 1;
//    int sum = 0;
//    for(int i =0 ; i< num[n].length ;i++ ){
//    sum= sum + num[n][i];
//    }
//    return sum;
//   }
//   public static void main(String args[]){
//     int num[][]={
//       {2,4,6},
//       {4,7,8},
//       {7,4,3}
//     };
//   System.out.print(sum(num));
//   }
// }

// Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,Matrixa11    a12    a13a21    a22    a23Transposed Matrixa11    a21a12    a22a13    a23

// public class Swapping{
//   public static void swapMatrix(int num[][]){
//    int n2 = 0;
//     int swap[][] = new int[num[n2].length][num.length];
//     for(int i=0; i< num[n2].length ; i++){
//       int n = 0;
     
//       while( n < num.length){
//         swap[i][n] = num[n][i];
//         n++;

//       }
//     }
//     for(int i =0 ; i< swap.length ; i++){
//       for(int j =0; j< swap[i].length ; j++){
//   System.out.print(swap[i][j]);
//       }
//       System.out.println();
//     }
//   }
//   public static void main (String args[]){
//     int num[][] = {
//        {1,4,6},
//        {4,6,8},
      
//     };
//     swapMatrix(num);
//   }
// }
// import java.util.Arrays;
// public class main{
//   public static void main(String args[]){
//     String str = "121";
//     char str1[] = str.toCharArray();
//     char str2 = ' ';
//     char str3 = ' ';
//     for(int i=0; i< str1.length / 2 ; i++){
//        str2 = str2 + str1[i];
//     }
//     for(int i = str1.length -1; i > str1.length / 2 ; i--){
//       str3 = str3 + str1[i];
//     }
//     if(str2 == str3){
//       System.out.print("it is palindrome");
//     }
//   }
// }


