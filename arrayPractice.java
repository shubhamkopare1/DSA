
// import java.util.Arrays;
// public class main{
//     public static int find(int nums[],int target){
//         int start = 0;
//         int end = nums.length -1 ;
       
        
   
    
//         int mid = 0;
//         while(start <= end){
//             mid = (start + end)/2;
//             if(nums[mid]== target){
//                 return 1;
//             }
//             if(nums[mid] > target ){
//         end = mid -1 ;
//             }else{
//                 start = mid +1 ;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int nums[] = {1,5,3,7,4};
//         int target = 1;
//         int output = find(nums ,target);
//         if(output == -1){
//          System.out.print("not found");
//         }else{
//         int num = nums[target];
//         System.out.print(num);
//         }
//     }
// }



// public class main{
//     public static void waterTrapping( int blocks[]){
//         int left[] = new int[blocks.length];
//         int right[] = new int[blocks.length];
//         int n = blocks.length ;
//         int waterTrapping = 0;
//         int waterLevel =0;
//         for(int i = 0 ; i< blocks.length; i++){
//             if(i == 0){
//                 left[i] = blocks[i];
//             }else{
//                 left[i] = Math.max(blocks[i], left[i-1]);
//             }
//         }
    
//         for(int i = n-1;  i>= 0; i--){
//             if(i == n-1){
//                 right[i] = blocks[i];
//             }else{
//                 right[i] = Math.max(blocks[i], right[i+1]);
//             }
//         }
      
//     for(int i =0 ; i< n ; i++){
       
//         if(left[i] > right[i]){
//             waterLevel = right[i];
//         }else{
//             waterLevel = left[i];
//         }
// waterTrapping = waterTrapping + (waterLevel - blocks[i])*1;
//     }
//     System.out.print(" waterTrapping is " + waterTrapping);
// }
//     public static void main(String args[]){
//         int blocks[] = {1,0,2,1,0,1,3,2,1,2,1};
//         waterTrapping(blocks);
//     }
// }


// public class main{
//     public static void printStar(int n){
//         for(int i =1; i<= n; i++){
//               if(i== n){
//                 for(int j=1; j<=n; j++){
//                     System.out.print("*");
//                 }
//             }else{

//                for(int j= 1; j<= n; j++){
//                 if(n/2 == j){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
                
//             }
//             System.out.println();
          
//             }
           
//         }
//       System.out.println();
//         for(int i =n; i>=0; i--){
//             //   if(i== n){
//             //     for(int j=1; j<=n; j++){
//             //         System.out.print("*");
//             //     }
//             //     System.out.println();
//             // }else{

//                for(int j= 1; j<= n; j++){
//                 if(n/2 == j){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//             }
//         // }
//     }
//     public static void main(String args[]){
//         printStar(8);
//     }
// }


// public class main{
//     public static void find(int num[]){
//         int sum[] = new int[num.length];
//         int count = 0;
//     for(int i =0; i< num.length; i++){
//         for(int j = i+1; j<num.length; j++){
//             for(int k= j+1; k< num.length; k++){
//                 if(num[i] + num[j]+ num[k] == 0){
//                      int sum2[] = new int[num.length];
//                         sum2[i] = num[i];
//                          sum2[j] =num[j];
//                          sum2[k] = num[k];
                
//                     sum[count] = sum2[i];
//                     count++;
              
//                 }
//             }
//         }
//     }
//     for(int i =0; i< num.length; i++){
//         System.out.println(sum[i]);
//     }
//     }
//     public static void main(String args[]){
//         int num[] = {-1,0,1,2,-1,-4};
//         find(num);
//     }
// }
// public class Main {
//     public static int[][] sum(int[] num, int target) {
//         for (int i = 0; i < num.length; i++) {
//             for (int j = i + 1; j < num.length; j++) {
//                 if (num[i] + num[j] == target) {
//                   System .out.print(new int[][] {{ i, j }} + " ");
//                 }
//             }
//         }
//         return new int[][] {};
//     }

//     public static void main(String[] args) {
//         int num[] = { 2, 7, 11, 7, 5 };
//         int target = 9;
//         int[][] result = sum(num, target);

//         if (result.length > 0) {
//             System.out.println("Numbers found: " + result[0][0] + ", " + result[0][1]);
//         } else {
//             System.out.println("No pairs found.");
//         }
//     }
// }

// import java.util.*;
// public class main{
//     public static int stock(int num[]){
//         int max = Integer. MIN_VALUE;
        
//         int n = num.length;
//         for(int i=0; i< n; i++ ){
//             for(int j= i+1; j<n; j++){
//              int profit = num[j] - num[i];
//              if(profit > max ){
//                 max = profit;
//              }
//             }
//     }
//     if(max >=1 ){
//         return max;
//     }else{
//         return 0;
//     }
//     }
//     public static void main(String args[]){
//         int num[] = {7,5,3,2,10};
    
//         System.out.print(stock(num));
       
//     }
// }


public class main{
    public static int stockProfit(int num[]){
   int maxProfit = Integer.MAX_VALUE;
   int stockProfit = 0;
   int n = num.length;
     for(int i =0 ; i< n; i++){
        if(maxProfit < num[i]){
             int profit = num[i] - maxProfit ; 
             stockProfit = Math.max(stockProfit , profit);
        }else{
            maxProfit = num[i];
        }
     }
     return stockProfit ;
    }
    public static void main(String args[]){
        int num[] = {1,5,3,6,3,2};
        System.out.print(stockProfit(num));
    }
}