// // public class leetcode {
// //     public static void plusOne(int num[]){
// //         int length = num.length;
// //         int num2[] = new int[num.length];
// //         int count=0;
// //         int n = num.length - 1;
// //         for(int i = num.length-1; i>=0; i--){
// //                     if(num[i]== 9){
// //                 num2[i] = 0;
// //                 n--;
// //                 count++;
            
// //              }else{
// //             if(num[n] == num[i]){
// //                 num2[i]= num[i] +1;
// //             }else{
// //                 num2[i]= num[i];
// //             }
// //         }
// //         if(count )
// //         }
         
// //         for(int i =0; i< num.length; i++){
// //             System.out.print(num2[i]);
// //         }
// //     }
// //     public static void main(String args[]){
// //    int num[] ={1,6,9};
// //       plusOne(num);
// //     }
// // }

// public class Main {
//     public static void main(String[] args) {
//         String name = " shubham kopare n ";
//         int count = 0;
//         boolean foundChar = false;

//         for (int i = name.length() - 1; i >= 0; i--) {
//             if (name.charAt(i) != ' ') {
//                 foundChar = true;
//                 count++;
//             } else if (foundChar) {
//                 break;
//             }
//         }
//         System.out.println(count);
//     }
// }


// public class leetcode{
//     public static int findValue(int num[],key){
//          int start = 0;
//          int end = num.length -1;
//          while(start<=end){
//             if(num[mid] === key){
//                 return mid;
//             }
//             if(num[mid]> key){
//                 end = mid-1;
//             }else{
//                 start = mid +1;
//             }
//              }
//              return -1;
//     }
//     public static void main(String args[]){
//          int num[] = {2,4,5,3,2};
//           int key = 3,
//         int index =  findValue(num,key);
//         System.out.print(index);
//     }
// }

public class singalNumber{
    public static int singleNum(int num[]){
       for(int i =0; i< num.length ; i++){
        int count =0;
        for(int j=0 ; j<= num.length ; j++){
            if(count < 1){
              count++;
            }else{
                return -1;
            }
        }
        if(count == 0){
            return i;
        }
       }
    }
    public static void main(String args[]){

    }
}