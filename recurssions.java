// class main{
//     public static void incresingOrder(int n){
//         if(n==0){
//             return;
//         }
//         incresingOrder(n-1);
//         System.out.print(n);
//     }
//     public static void main(String[] args){
//         incresingOrder(5);
//     }
// }

 class Main{
    public static int firstOccurence(int arr[],int i){
        int key =4;
       if(i ==arr.length-1 ){
        return 0;
       }
       if(arr[i] == key){
        return i;
       }
   return firstOccurence(arr,i+1);

    }
    public static void main(String args[]){
        int arr[] = {4,1,2,3,4,5,6,3};
        int key = 3;
        int i =0;
        System.out.print(firstOccurence(arr,i));
    }
}