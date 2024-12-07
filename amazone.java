
// // stock buy and sell
// public class main{
//     public static int stockProfit(int num[]){
//    int maxProfit = Integer.MAX_VALUE;
//    int stockProfit = 0;
//    int n = num.length;
//      for(int i =0 ; i< n; i++){
//         if(maxProfit < num[i]){
//              int profit = num[i] - maxProfit ; 
//              stockProfit = Math.max(stockProfit , profit);
//         }else{
//             maxProfit = num[i];
//         }
//      }
//      return stockProfit ;
//     }
//     public static void main(String args[]){
//         int num[] = {1,5,3,6,3,2};
//         System.out.print(stockProfit(num));
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

// public class main {
//     public static void spiral(int num[][]){
//         int startRow = 0;
//         int endRow = num.length -1;
//         int startCol = 0;
//         int endCol = num.length-1;
//         while(startRow <= endRow && startCol <= endCol ){
//    // top 
//             for(int i = startCol; i<=endCol; i++ ){
// System.out.print(num[startRow][i]+ " ");
//             }
//             // right
//              for(int j= startRow +1 ; j<=endRow; j++ ){
// System.out.print(num[j][endCol]+ " ");
//             }
//             //bottom 
//              for(int i= endCol-1 ; i >= startCol; i--){
// if(startRow <= startCol){
//     break;
// }
// System.out.print(num[endRow][i] + " ");
//             }
//             //left
//              for(int j= endRow-1 ; j >= startRow +1; j--){
// if(startCol <= endRow){
//     break;
// }
// System.out.print(num[j][startRow] + " ");
//             }
//             startRow ++;
//             endRow--;
//             startCol ++;
//             endCol --;
//         }
//     }

//     public static void main(String args[]){
//         int num[][] = { 
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}
//         };
//         spiral(num);
//     }
    
// }


public class main{
    public static void diagonal(int num[][]){
        int sRow=0;
        int eRow = num.length-1;
        int sCol=0;
        int eCol = num.length-1;
        int n = num.length;
        int pd =0;
        int sd =0;
        for(int i =0; i< n; i++ ){
            for(int j = 0; j< n; j++){
                if(num[i][srow]){
                    pd = pd + num[i][sRow];
                }
                if(num[i][endCol]){
                    sd = sd+ num[i][sCol];
                }
            }
            sRow++;
            endCol--;
        }

    }
    public static void main(String args[]){
        int num[][] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}

        };
        diagonal(num);
    }
}

// convert letter to upparcase question

// public class main{
//    public static void upparcase(String text){
//       StringBuilder sb = new StringBuilder(" ");
     
//       char ch = Character.toUpperCase(text.charAt(0));
//       sb.append(ch);
//       for(int i= 1; i< text.length(); i++){
//          if(text.charAt(i)== ' '){
//             i++;
//             sb.append(" ");
//             sb.append(Character.toUpperCase(text.charAt(i)));
//          }else{
//             sb.append(text.charAt(i));
//          }
         
//    }
//    System.out.print(sb.toString());
//    }
//    public static void main(String args[]){
//       String text = "hey i am shubham";
//      upparcase(text);
//    }
// }


// practise string immutable or not 
// public class main{
//    public static void main(String args[]){
//       String name = new String("shubham");
//       name.setCharAt(1 , 'b');
//       System.out.print(name);
//    }
// }


// String Compression 

// public class main{
//    public static String Compression(String str){
//       StringBuilder sb = new StringBuilder("");
//       int count = 1;
//       for(int i =0; i< str.length()-1; i++){
//          if(str.charAt(i) == str.charAt(i+1) ){
//           count++;
//          }else{
//             sb.append(str.charAt(i));
//             sb.append(count);
//             count =1;
//          }
      
//       }
//       sb.append(str.charAt(str.length()-1));
//       sb.append(count);
     
//       return sb.toString();
//    }
//    public static void main(String args[]){
//       String str = "aaabbcccddd";
//      System.out.print(Compression(str));
//    }
// }


// find loweCase element 
// public class main{
//    public static int lowercase(String name){
//       int count = 0;
//        String sc = name.toUpperCase();
       
//       for(int i =0; i< name.length(); i++){
         
       
//          if(sc.charAt(i) != name.charAt(i)){
//                count++;
//          }
//       }
//       return count;
//    }
//    public static void main(String args[]){
//       String name  = "shuBham";
//      System.out.print(lowercase(name) + " is lower elsement");
//    }
// }
// find anagram or not
// import java.util.*;
// public class main{
//    public static String anagram(String str1, String str2){
      
//   for(int i =0; i< str1.length(); i++){
//    boolean anagram = false;
//    if(str1.length() != str2.length()){
//       return "it is not anagram";
//    }
//    for(int j=0; j< str1.length(); j++){
      
//       if(str2.charAt(i)==str2.charAt(j)){
//          anagram =true;
//       }
//    }
//    if(anagram == false){
//       return " is not anagram";
//    }
//   }
//   return "it is anagram";
//    }
   
//    public static void main(String args[]){
//       String str1= "madam";
//       String str2 = "madam";
//      System.out.print( anagram(str1,str2));
//    }
// }


// public class main{
//    public static void  vowel(String str){
// int count =0;
// String vowel = "";
//      for(int i =0; i< str.length(); i++){
//       if(str.charAt(i) == 'a' || str.charAt(i) == 'i'  || str.charAt(i) == 'e'  || str.charAt(i) == 'o' ||str.charAt(i) == 'u'  ){
//           count++;
//           vowel = vowel + str.charAt(i);
//       }
    

//       }
//       System.out.print(" vowel present in string " + count + " ande vowel is " + vowel);
    
//      }
   
//    public static void main(String args[]){
//       String str = "name";
//       vowel(str);
//    }
// }
import java.util.Arrays;
public class main{
   public static void main(String args[]){
      String str3 = "listen";
      String str4  = "silentt";
       str3 = str3.toLowerCase();
      str4= str4.toLowerCase();
      if(str3.length() == str4.length()){
         char str5[] = str3.toCharArray();
         char str6[] = str4.toCharArray();
         Arrays.sort(str5);
         Arrays.sort(str6);
         Boolean result = Arrays.equals(str5 ,str6);
System.out.print(str5 + " "+ str6);
         if(result){
            System.out.print("it is anagram");
         }else{
            System.out.print("it is not anagram");
         }
      }else{
      System.out.print("it is not anagram");
   }
   }
}