// import java.util.*;
// public class main{
// public static void main(String args[]){
//     String name = " shubham";
//     String name2 = new String("shubh");
//     Scanner sc = new Scanner(System.in);
//     String name3 = sc.nextLine();
//     System.out.print(name3);

// }
// }


// find palindrome 

// public class main {
//     public static void palindrome(){
//          String name = "racpar";
//          int length = name.length();
//          int num = length-1;
//          int num2 = 0 ;
         
//         boolean palindrome = true;
//          for( int i =0; i< length/2  ; i++){
//             if(name.charAt(i) != name.charAt(num - i)){
//             palindrome = false;
//             }
//          }
     
//          if(palindrome == true){
//             System.out.print("it is palindrome");
//          }else{
//             System.out.print("it is not palindrome ");
//          }

//     }
//     public static void main(String args[]){
//         palindrome();
//     }
// }


// public class main{
//    public static void shortestDistance(String text){
//       int x2 = 0;
//       int y2 =0;
//       for(int i =0;i< text.length(); i++){
//          if(text.charAt(i) == 'w'){
//             x2--;
//          }
//          if(text.charAt(i) == 'e'){
//             x2++;
//          }
//          if(text.charAt(i) == 'n'){
//             y2++;
//          }
//          if(text.charAt(i) == 's'){
//             y2--;
//          }
//       }
//       int x1 = x2 *x2;
//       int y1 = y2 * y2;
// System.out.println(x2 + " " + y2);
//       System.out.print("shortest distance is " + Math.sqrt(x1 + y1));

//    }
//    public static void main(String args[]){
//       String text = "weeens";
      
//       shortestDistance(text);
//    }
// }

// string compare practice
// public class main{
//    public static void main(String args[]){
//       String s1 = "shubh";
//       String s2 = "shubh";
//       String s3 = new String("shubh");
//       if(s1 == s2){
//          System.out.println("is equals");
//       }else{
//          System.out.println("is not equals");
//       }
//       if(s2.equals(s3)){
//           System.out.print("is equals");
//       }else{
//          System.out.print("is not equals");
//       }
//    };
// }



// substring 


// public class main{
//    public static void main(String args[]){
//       String name= "shubham kopare";
//       String nam2 = "";
// //       for(int i =4; i< name.length(); i++ ){
// // nam2 += name.charAt(i);
// //       }

//       System.out.print(name.substring(4,6));
//    }
// }


// print largest string 


// public class main{
//    public static void largest(String str1, String str2, String str3){
//      int str = str1.compareTo(str2);
//      if(str > 0){
//       str = str1.compareTo(str3);
//       if(str >0){
//          System.out.print("largest " + str1);
//       }else{
//          System.out.print("largest "+ str3);
//       }
//      }else{
//       str = str2.compareTo(str3);
//       if(str > 0){
//          System.out.print("largest " + str2);
//       }else{
//          System.out.print("largest "+ str3);
//       }
//      }
//    }
//    public static void main(String args[]){
//     String str1 = "apple";
//     String str2 = "banana";
//     String str3 = "apple";
//     largest(str1,str2,str3);
//    }
// }


// string Builder

// public class main{
//    public static void main(String args[]){
//       StringBuilder name = new StringBuilder("name");
//       name.toString();
//       for(char i = 'a'; i<= 'z' ; i++){
//          name.append(i);
//       }
//       System.out.print(name);
//    }
// }

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