// bubble sort
// public class main{
//     public static void bubbleShort(int num[]){
//         int n = num.length;
//         int temp = 0;
//         for(int i=1; i<= n; i++){
//             int swap =0;
//             for(int j=0; j< n  -i ; j++){
//                 if(num[j] < num[j+1]){
//                   temp = num[j];
//                   num[j] = num[j+1];
//                   num[j+1] =temp;
//                   swap++;
//                 }

//             }
//             System.out.print(swap );
//         }
//         System.out.println();
//     }
//     public static void bShortArray( int num[]){
//         for(int i=0; i< num.length; i++){
//               System.out.print(num[i]+" ");
//         }
      
//     }
//     public static void main(String args[]){
//         int num[] = {1,2,3,4,5};
//         bubbleShort(num);
//         bShortArray(num);
//     }
// }


// selection sort 
// public class sorting{
//     public static void selectionSort(int sort[]){
//         int temp =0;
//         int n = sort.length ;
//         for(int i=0; i< n; i++){
            
//             int min = i;
//             for(int j= i+1; j< n-1; j++){
//                 if(min > sort[j] ){
//                     min = sort[j];
//                 }
//             }
//             temp = sort[i];
//             sort[i]= min;
//             min = temp;
//         }
//     }
//     public static void print(int sort[]){
//         for(int i = 0; i< sort.length ; i++){
//             System.out.print(sort[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int sort[] = {4,5,3,6,2,1};
//         selectionSort(sort);
//         print(sort);
//     }
// }


// insertion sort 
// public class main {
//     public static void insertion(int num[]){
//         int temp= 0;
//         int n = num.length;
//         for(int i=0; i< n ; i++){
//             for(int j= 0; j< i; j++){
//                 if(num[j] >= num[i]){
//                   temp = num[i];
//                   num[i]= num[j];
//                   num[j] = temp;
//                 }
//             }
//         }
//     }
//     public static void print(int num[]){
//         for(int i =0; i<num.length; i++){
//             System.out.print(num[i]);
//         }
//     }
//     public static void main(String args[]){
//         int num[] = {1,5,6,3,7,2};    
//         insertion(num);
//            print(num);
// }}


// inbuilt short 
import java.util.Arrays;
import java.util.Collections;
public class main{
    public static void sort(Integer num[]){
         Arrays.sort(num,0,4 ,Collections.reverseOrder());
    }
    public static void main(String args[]){
        Integer num[] = {1,30,3,12,5,7,3};
        sort(num);
        for(int i=0; i< num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}
