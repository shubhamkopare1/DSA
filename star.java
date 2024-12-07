

// // // public class main{
// // //     public static void hallowRectangle(int totalCols ,int totalRow){
// // //    for(int i= 1; i <=totalRow; i++){
// // //     for(int j = 1; j <=totalCols; j++){
// // //         if(i == 1 || i == totalRow || j == 1 || j==totalCols){
// // //             System.out.print("*");
// // //         }else{
// // //             System.out.print(" ");
// // //         }
// // //     }
// // //     System.out.println();
// // //    }

// // //     }
// // // public static void main (String args[]){
// // // hallowRectangle(10,7);
// // // }
// // // }

// // // public class main{
// // //     public static void tringle(int n){
// // //  for(int i= 1; i<= n; i++){
// // //     for(int j=1; j<= n-i; j++){
// // //         System.out.print(" ");
// // //     }
// // //     for(int k=1; k<=i; k++){
// // //         System.out.print("*");
// // //     }
// // //     System.out.println();
// // //  }
// // //     }
// // //     public static void main(String args[]){
// // //  tringle(8);
// // //     }
// // // }

// // // public class main{
// // //     public static void halpPyramid(int n){
// // //         for(int i=0; i<n; i++){
// // //             for(int j=1; j<=n-i; j++){
// // //       System.out.print(j + " ");
// // //             }
           
// // // System.out.println();
// // //         }
        

// // //     }
// // // public static void flodTriangle(int n){
// // //     int num = 1;
// // //     for(int i = 1; i<= 5; i++){
// // //         for(int j=i; j<=i+num; j++ ){
// // //             num++;
// // //             System.out.print(j + "");
// // //         }
// // //         System.out.println();
// // //     }
// // // }
// // //     public static void main(String args[]){
// // //         flodTriangle(8);
// // //     }
// // // }

// // // public class main{
// // //     public static void printTriangle(int n){
// // //         int count=1;
// // //         for(int i=1; i<=n; i++){
// // //             for(int j = 1; j<= i; j++){
// // //  System.out.print(count + " ");
// // //  count++;
// // //             }
// // //              System.out.println();
// // //         }
       
// // //     }
// // //     public static void main(String args[]){
// // //         printTriangle(5);
// // //     }
// // // }

// // // public class main{
// // //     public static void printTriangle(int n){
// // //         int num= 1;
// // //         for(int i= 1; i<=n ; i++){
// // //             for(int j=1; j<=i; j++){
// // //       if(num == 0){
// // //         num = 1;
// // //         System.out.print(num);
    
// // //       }else if(num == 1){
// // //         num = 0;
// // //         System.out.print(num);
// // //       }
// // //             }
// // //             System.out.println();
// // //         }
// // //     }
// // //     public static void main(String args[]){
// // //         printTriangle(5);
// // //     }
// // // }

// // // butterfly pattern 
// // // public class star{
// // //   public static void buterfly(int n){
// // //     for(int i=1; i<=n; i++){
// // //       for(int j = 1; j<=i; j++){
// // //         System.out.print("*");
// // //       }
// // //       for(int j=1; j<=2*(n-i); j++ ){
// // //         System.out.print(" ");
// // //       }
// // //         for(int j = 1; j<=i; j++){
// // //         System.out.print("*");
// // //       }
// // //       System.out.println();
// // //     }
// // //     for(int k=n; k>=1; k--){
// // //       for(int j = 1; j<=k; j++){
// // //         System.out.print("*");
// // //       }
// // //       for(int j=1; j<=2*(n-k); j++ ){
// // //         System.out.print(" ");
// // //       }
// // //         for(int j = 1; j<=k; j++){
// // //         System.out.print("*");
// // //       }
// // //       System.out.println();
// // //     }
  
// // //   }
// // //     public static void main(String args[]){
// // //       buterfly(4);
// // //     }
// // // }

// // // public class main{
// // //   public static void rombus(int n){
// // //     for(int i =1; i<=n; i++){
// // //       for(int j =1; j<=n-i; j++){
// // //         System.out.print(" ");
// // //       }
      
// // //       for(int j=1; j<=n; j++){
// // //         System.out.print("*");
// // //       }
// // //       System.out.println();
// // //     }
// // //   }
// // //   public static void main(String args[]){
// // //     rombus(5);
// // //   }
// // // }

// public class main{
//   public static void print(int n){
//     for(int i =1; i<=n; i++){
//       for(int j = 1; j<=n-i; j++){
//         System.out.print(" ");
//       }
//       if(i==1 || i == n){
//         for(int j = 1; j<=n; j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }else{
//       for(int j=1; j<=1; j++){
//         System.out.print("*");
//       }
//       for(int j=1; j<= n-2; j++){
//         System.out.print(" ");
//       }
//         for(int j=1; j<=1; j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//     }
//   }
//   public static void main(String args[]){
//     print(10);
//   }
// }

// print star pattern 
// public class main{
// public static void star(int n){
// for(int i = 1; i<=n; i++){
//     for(int j=1; j<=(n-i); j++){
//         System.out.print(" ");
//     }
//     for(int j=2; j<=i+i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// for(int i = n; i>=1; i--){
//     for(int j=1; j<=(n-i); j++){
//         System.out.print(" ");
//     }
//     for(int j=2; j<=i+i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// }
// public static void main(String args[]){
//     star(4);
// }
// }

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


public class main{
    public static void printStar(int n){
        for(int i =1; i<= n/2; i++){
              if(i== n/2){
                for(int j=1; j<=n; j++){
                    System.out.print("*");
                }
            }else{

               for(int j= 1; j<= n; j++){
                if(n/2 == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
          
            }
           
        }
      System.out.println();
        for(int i =n/2; i>=1; i--){
             
           

               for(int j= 1; j<= n/2; j++){
                if(n/2 == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
          
         }
    }
    public static void main(String args[]){
        printStar(9);
    }

}

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


