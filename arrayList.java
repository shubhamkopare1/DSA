import java.util.ArrayList;
// // import java.util.Collections;
import java.util.*;

// public class main{
//     public static void swap(int idx1, int idx2 , ArrayList<Integer>List){
//          int temp =  List.get(idx1);
//          List.set(idx1,List.get(idx2));       
//          List.set(idx2,temp);     

//     }
//     public static void main(String args[]){
//         // ArrayList <Integer> List = new ArrayList<>();
//         // List.add(1);
//         // List.add(5);
//         // List.add(10);
//         // List.set(0,4);

//         // List.remove(0);
//     //    System.out.print(List.contains(5));
//     //     System.out.print(List.get(0));
//     //     System.out.println();
//     //     System.out.println(List.size());
//     //       for(int i=0; i< List.size(); i++){
//     //         System.out.print(List.get(i));
//     //       }
//     //         System.out.println();

//     //       for(int i=List.size()-1; i>=0; i--){
//     //         System.out.print(List.get(i));
//     //       }


//     // int max = Integer.MIN_VALUE;

//     // for(int i = 0; i< List.size(); i++){
//     //     if(max < List.get(i)){
//     //         max =   List.get(i);
//     //     }
//     // }
//     // System.out.print(max);
//     // int idx1 = 0;
//     // int idx2 = 2;
//     // System.out.print(List);
//     // swap(idx1,idx2,List);
//     // System.out.print(List);
//     //  Collections.sort(List,Collections.reverseOrder());
//     //   System.out.print(List);
//     //  Collections.sort(List);
//     // System.out.print(List);



//     //  int swapping = List.get(idx1);
//     //     idx1 = idx2;
//     //     idx2 = swapping;
//     //     List.set(idx1, List.get(idx2));
//     //     List.set(idx2,swapping);
//     //    for(int i=0; i<List.size(); i++){
//     //     System.out.print(List.get(i));
//     //    }


//      ArrayList <ArrayList <Integer>> mainList = new ArrayList<>();
//      ArrayList <Integer> list1 = new ArrayList <>();
//      ArrayList <Integer> list2 =new ArrayList<>();

//      for(int i= 0; i<5; i++){
//            list1.add(i*1);
//            list2.add(i*2);
//      }


//      mainList.add(list1);
//      mainList.add(list2);

//      for(int i= 0; i< mainList.size(); i++){
//         ArrayList<Integer> currList = mainList.get(i); 
//         for(int j=0 ; j<currList.size(); j++ ){
//             System.out.print(currList.get(j));
//         }
//         System.out.println();
//      }
// System.out.print(mainList);

    
//     }

// }



// public class main{
//   public static int conatainer(ArrayList<Integer> num){
//     int maxWaterContainer = 0;
//     int ls =0;
//     int rs = num.size() -1;
//     while(ls < rs){
//          int height = Math.min(num.get(ls) , num.get(rs));
//            int width = rs-ls;
//             maxWaterContainer = Math.max(maxWaterContainer,height*width);

//             if(num.get(ls) < num.get(rs)){
//               ls++;
//             }else{
//               rs--;
//             }
//     }
//     return maxWaterContainer;
//   }
//     public static void main(String args[]){
//     ArrayList<Integer> num = new ArrayList<>();
//     num.add(1);
//     num.add(8);
//     num.add(5);
//     num.add(7);
//     num.add(2);
//     num.add(9);
//     num.add(3);
//     System.out.print(num);
//   // int maxWaterContainer = 0;

//   //   for(int i=0; i< num.size(); i++){
//   //       for(int j=0; j<num.size(); j++){
//   //          int height = Math.min(num.get(i) , num.get(j));
//   //          int width = j-i;
//   //           maxWaterContainer = Math.max(maxWaterContainer,height*width);
//   //       }
//   //   }
//   //   System.out.print(maxWaterContainer);
//   System.out.print(conatainer(num));
//     }
// }


// public class main{
  // public static Boolean pair(ArrayList<Integer> num,int target){
  //    for(int i=0; i<num.size(); i++){
  //     for(int j=0; j<num.size(); j++){
  //       if(num.get(i) + num.get(j) == target){
  //           System.out.print(num.get(i)+ " "+ num.get(j));
  //         return true;
        
  //       }
  //     }
  //    }
  //    return false;
  // }

// public static Boolean pair(ArrayList<Integer> num, int target){
//   int lp =0;
//   int rp = num.size()-1;
//   while(lp < rp){
//     if(num.get(lp) + num.get(rp) == target){
//       return true;
//     }
//     if(num.get(lp)+ num.get(rp) < target){
//       lp++;
//     }else{
//       rp--;
//     }
//   }
//   return false;
//   }

//   public static void main(String args[]){
//       ArrayList<Integer> num = new ArrayList<>();
//     num.add(1);
//     num.add(4);
//     num.add(5);
//     num.add(7);
//     num.add(8);
//     num.add(9);

// int target = 9;

//  System.out.print(pair(num, target));


//   }
// }


public class main{
  public static void lonelyNum(ArrayList<Integer> num,ArrayList<Integer> num2){
// for(int i=0; i<num.size(); i++){
//   Boolean value = true;
//   for(int j=0; j<num.size(); j++){
//     if(num.get(i)+1 == num.get(j) || num.get(i)-1 == num.get(j)){
//       value = false;
//       break;
//     }
    
//   }
//   if(value){
//       num2.add(num.get(i));
//     }

// }
    Arrays.sort()

  }
  public static void main(String args[]){
    ArrayList<Integer> num = new ArrayList<>();
    ArrayList<Integer> num2 = new ArrayList<>();

     num.add(1);
    num.add(4);
    num.add(5);
    num.add(15);
    num.add(8);
    num.add(9);
    lonelyNum(num,num2);
    System.out.print(num2);
  }
}