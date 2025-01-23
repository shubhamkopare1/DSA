import java.util.*;
// // public class main{
// //     public static void main(String args[]){
// //          HashMap <String, Integer> hm = new HashMap<>();
// //            hm.put("yash", 100);
// //         hm.put("shubham", 50);
// //         hm.put("chaggan", 90);
      
// //         LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
// //          lhm.put("yash", 100);
// //         lhm.put("shubham", 50);
// //         lhm.put("chaggan", 90);
       
// //         TreeMap<String,Integer> tr = new TreeMap<>();
// //         tr.put("shubham", 50);
// //         tr.put("chaggan", 90);
// //         tr.put("yash", 100);
// //        System.out.println(tr);
// //         System.out.println(hm);
// //         System.out.println(lhm);
// //         // int population = hm.get("shubham");
// //         // System.out.println(population);

// //         // System.out.println(hm.remove("shubham"));
// //         // // System.out.println(hm.remove("kunl"));
// //         // System.out.println(hm.containsKey("shubham"));
// //         // System.out.println(hm.size());
// //         // System.out.println(hm.isEmpty());
// //         // System.out.println(hm);

// //         // Set<String> keys = hm.keySet();
// //         // // Set<String,Integer> keys = hm.entrySet();
// //         // // System.out.print(keys);

// //         // for(String k : keys){
// //         //     System.out.println( k + " values : " + hm.get(k));
// //         // }

// //     }
// // }

// public class main{
//         public static int majority(int arr[]){
//            HashMap<Integer,Integer> hm =new HashMap<>();
          
//            for(int i=0; i<arr.length; i++){
//             int num = arr[i];
//             if(hm.containsKey(num)){
//                 hm.put(num, hm.get(num)+1);
//             }else{
//                 hm.put(num,1);
//             }
//            }
           
//              for(Integer keys : hm.keySet()){
//                 if((arr.length/ 3) <hm.get(keys)){
//                     System.out.print(keys);
//                 }
           
//         }
//           return -1;
//         }
//     public static void main(String args[]){
//         int arr[] ={1,3,2,5,1,3,1,5,1};
//       majority(arr);
//     }
// }



// find union and intersection 

public class main{
public static String getStart( HashMap<String, String> hm){
   HashMap<String, String> hm2 = new HashMap<>();
     hm.put("channai","bangluru");
      hm.put("mumbai", "delhi");
      hm.put("goa","channai");
      hm.put("delhi","goa");

      for(String key : hm.keySet()){
        hm2.put(hm.get(key), key);
      }
      
      for(String key : hm.keySet()){
        if(!hm2.containsKey(key)){
          return key;
        }
      }
      return null;
}
public static int subset( HashMap<Integer, Integer> hm ,int arr[] ){
  
  int maxLength = 0;
  int sum = 0;
  for(int i=0; i< arr.length; i++){
    sum += arr[i];
    if(hm.containsKey(sum)){
        maxLength = Math.max(maxLength,i- hm.get(sum));
    }else{
      hm.put(sum, i);
    }
  }
  return maxLength;
}

  public static void main(String args[]){
    // HashSet<Integer> set = new HashSet<>();
    HashMap<Integer, Integer> hm = new HashMap<>();
     int arr[] = {15,-2,2,-8,1,7,10,23};
 int result = subset(hm, arr);

        System.out.println("Length of the longest subarray with sum 0: " + result);
    // int arr1[] ={1,2,5,6,4,5};
    // int arr2[] = {5,6,7,9,5,3};
    // for(int i=0; i< arr1.length; i++){
    //   set.add(arr1[i]);
    // }
    // for(int i=0; i< arr1.length; i++){
    //   set.add(arr2[i]);
    // }
       // System.out.print(set);
      // for(int i=0; i< arr1.length; i++){
      //   set.add(arr1[i]);
      // }
      // for(int i=0; i< arr1.length; i++){
      //   if(set.contains(arr2[i])){
      //     System.out.print(arr2[i]);
      //     set.remove(arr2[i]);

      //   }
      // }

      // maumbai -> delhi -> pune 
  //     String start = getStart(hm);
  //     System.out.print(start);
  // for(String keys : hm.keySet()){
  //      System.out.print("->" + hm.get(start));
  //      start = hm.get(start);
  // }
      

  }
}