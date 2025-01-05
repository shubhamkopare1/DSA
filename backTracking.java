public class main{
    public static void addValue(int arr[], int i, int value){
        if(i == arr.length){
                printValue(arr);
            return ;
        }
        arr[i] = value;
        addValue(arr, i+1,value+1 );
       arr[i] =  arr[i] -2;
    }
    public static void printValue(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        addValue(arr, 0, 1 );
        printValue(arr);
    }
}