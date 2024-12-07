// // linear search 
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

// binary search 

// public class main{
//     public static int findIndex(int numbers[],int key){
//         int start = 0;
//         int end= numbers.length -1;
        
//         while(start<=end){
//          int mid = (start+ end )/2;
//          if(numbers[mid] == key){
//          return mid;
//             }  
//             if(numbers[mid] < key){
//                 start = mid +1 ;
//             }else{

//                 end = mid-1;
//             }
//         }
//      return -1;
//     }
//     public static void main(String args[]){
//         int numbers[]= { 1,2,3,4,5,6,7,4};
//         int key = 1;
//        int index = findIndex(numbers, key);
//        if(index == -1){
//         System.out.println("Not found");
//        }else{
//         System.out.print("index of "+index);
//        }
       

//     }
// }

// reverse array

// public class main{
//     public static void reverse(int numbers[]){
//      int start = 0;
//      int last = numbers.length - 1;
//      while(start <= last){
//       int temp = numbers[start];
//       numbers[start]=numbers[last];
//       numbers[last]= temp;
//       start++;
//       last--;


//      }
//     }
//     public static void main(String args[]){
//      int numbers[]= {1,3,4,5,6};
//      reverse(numbers);
//      for(int i =0; i<numbers.length; i++){
//         System.out.print( numbers[i]);
//      }
//     }
// }

// pairs in an array /

// public class main{
//  public static int pairs(int num[]){
//     int totalPair =0 ;
//     for(int i = 0; i< num.length; i++){
//         for(int j = i +1; j< num.length; j++){
//             System.out.print("("+num[i] + ","+ num[j] +")"+  " ");
//             totalPair++;
//         } 
//         System.out.println();
//     }
//    return totalPair;
//  }
//     public static void main(String args[]){
//         int num[]= {1,2,3,4,5,6,3};
//         System.out.print("total pairs "+pairs(num));
//     }
// }

// print sub array 
// public class main{
//     public static int sub(int num[]){
//         int pairs = 0;
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i= 0; i< num.length; i++){
//             for(int j = i; j< num.length; j++){
//                 int sum =0;
//                 for(int k =i; k<= j; k++){
                    
//                  sum = sum + num[k];
//                 } 

//              System.out.print(sum);
//              if(largest < sum){
//                 largest = sum;
//              }
//              if(smallest > sum){
//                 smallest = sum;
//              }
//                 pairs++;
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         System.out.println("largest pair sum is " + largest);
//         System.out.println("smallest pair sum is " + smallest);
//         return pairs;
//     }
//     public static void main(String args[]){
//         int num[] = {1,2,3,4,5,6,7};
//        System.out.print("pairs of this code : "+sub(num));
       
//     }
// }

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

// public class main{
//     public static boolean repeat(int num[]){
//         for(int i =0; i< num.length; i++){
//             for(int j = i+1; j< num.length; j++ ){
//                 if(num[i] == num[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int num[]= {1,2,3,4,3};
//         System.out.print(repeat(num));
//     }
// }


// max subArray using prefix array
// public class main{
//     public static void maxSubArray(int numbers[]){
//         int prefix[] = new int[numbers.length];
//         prefix[0] = numbers[0];
//         int currSum =0;
//         int maxNum = Integer.MIN_VALUE;
//         for(int i =1; i< prefix.length; i++){
//             prefix[i]= prefix[i-1] + numbers[i];
//         }
//         for(int i = 0; i< numbers.length; i++){
//             int start = i;
//             for(int j=i+1; j< numbers.length; j++){
//                 int end = j;
//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
//                 System.out.print("("+currSum + ") ");

//         if(maxNum< currSum){
//             maxNum = currSum;
//         }
//             }
//             System.out.println();
           
//         }
     
//         System.out.print("largest value is " + maxNum);
//     }
//     public static void main(String args[]){
//         int numbers[]={1,2,3,4,5,6};
//         maxSubArray(numbers);
//     }
// }

// max subArray using kadan algorithms

// public class main{
//     public static void maxSubArray(int numbers[]){
//         int cv = 0;
//         int max = Integer.MIN_VALUE;
//         for(int i = 0 ; i< numbers.length; i++){
//             cv = cv + numbers[i];
//             if(cv < 0){
//                 cv = 0;
//             }
//             System.out.print(cv);
//             max = Math.max(cv , max);
//         }
//  System.out.println(" " +max);
//     }
//     public static void main(String args[]){
//         int numbers[]= {-1,-2,-2,1,5};
//         maxSubArray(numbers);
//     }
// }

// trapping rainwater 

// public class main{
//     public static void tarappingRainwater(int height[]){
//         int rightHighest[] = new int[height.length] ;
//         int leftHighest[]= new int[height.length];
//  /// find right highest
//         for(int i = 0; i< height.length; i++){
//             int rightMax =0;
//             if(i == height.length - 1){
//                 rightHighest[i]=height[i];
//             }else{
//                  for(int j= i+1 ; j< height.length; j++){
                
//                 if(rightMax< height[j] ){
//                     rightMax = height[j];
//                 }
//              rightHighest[i]= rightMax;
//             }
               
//             }
           
//         }
//         for(int i =0 ; i< height.length; i++){
//             System.out.print(rightHighest[i] + " ");
//         }
//         System.out.println();
// // find left highest
// for(int i = height.length -1 ; i>= 0; i--){
//     int leftMax = 0 ;
//     if(i == 0){
//         leftHighest[i]= height[i];
//     } else{
//         for(int j = i-1; j >= 0; j--){
//              if(leftMax < height[j]){
//             leftMax = height[j];
//         }
//         } 
//         leftHighest[i]= leftMax;
//     }
   
//     }
 
//  for(int i =0 ; i< height.length; i++){
//             System.out.print(leftHighest[i] + " ");
//         }
//  //actual program 
// int waterContain = 0;
// int water = 0;
// int waterLevel = 0;
//  for(int i = 0; i< height.length; i++){
    
//     if(leftHighest[i] <= rightHighest[i] ){
//      waterLevel =  leftHighest[i] ;
       
//     }else{
//          waterLevel= rightHighest[i] ;
//     } 
   
//    if((waterLevel - height[i])*1 < 0){
//     waterContain =waterContain + 0;
//    }else{
//      waterContain =waterContain + (waterLevel - height[i])*1;
//    }
//     System.out.print(waterLevel+ " ");
   
//  }
//  System.out.print(" contain water in block is " + waterContain);


//     }
//     public static void main(String args[]){
//         int height[]= { 4,2,0,6,3,2,5};
//         tarappingRainwater(height);
//     }
// }

// trapping water 
// public class main{
//     public static void trappingWater(int height[]){
//         int n = height.length;
//         int leftHighest[]=new int[n] ;
//         int rightHighest[] = new int[n];
//         int trappingWater = 0;
//         int width = 1;
//     //left side highest array 
//      for( int i = 0 ; i< n; i++){
//         if(i == 0){
//             leftHighest[i]= height[i];
//         }else{
//             leftHighest[i] = Math.max(height[i],leftHighest[i-1]);
//         }
//      }
//   /// right highest array 
//   for(int i = n-1; i>= 0 ; i--){
//     if(i == n-1 ){
//         rightHighest[i]= height[i];
//     }else{
//         rightHighest[i]=Math.max(height[i] , rightHighest[i+1]);
//     }
//   }
//   // find water level
//   for(int i =0; i<n; i++){
//    int waterLevel = Math.min(leftHighest[i] ,rightHighest[i]);
//        trappingWater = trappingWater + (waterLevel - height[i])* width;
//   }
//   System.out.print(" water contain in blocks is " + trappingWater);
//     }
//     public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5 };
//         trappingWater(height);
//     }
// }



public class main{
    public static int find(int nums[]){

        int start = 0;
        int mid = 0;
        int end = nums.length-1;
        int target = 1;
        int sortArray[] = new int[nums.length];
      
        for(int i = 0; i< nums.length; i++){
         int   minValue = 0;
        for(int j = i; j< nums.length; j++){
            minValue = Math.min(nums[i], nums[j]);
        }
        sortArray[i] = minValue;
        }
        while(start <= end){
            mid = (start+ end)/2;
            if( sortArray[mid] == target){
                return 1 ;
            }else{
                if(sortArray[mid] > target){
                end = mid -1;
                }else{
                    start = mid +1 ;
                }
            }
            if(sortArray[start] == target && sortArray[end] == target){
              return 1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = { 3,4,2,5,1,7};
        int output =  find(nums);
        if(output == 1){
            System.out.print(nums[output]);
        }else{
            System.out.print("not found");
        }
    }
}