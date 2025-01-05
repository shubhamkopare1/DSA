//    class Recursion {
//     public static void decresingOrder(int n){
//           if(n== 1){
//          return;
//           }
//           decresingOrder(n-1);
//           System.out.print(n);
//     }
//     public static void main(String args[]){
//         decresingOrder(5);
//     }
// }
class main{
    public static int cal(int n , int a){
        if(a==0){
            return 1;
        }
       return n * cal(n,a-1);
 
    }
    public static void main(String args[]){
       System.out.print(cal(5,3));
    }
}