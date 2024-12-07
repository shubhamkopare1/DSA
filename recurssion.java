class main{
    public static void fact(int n){
        if(n == 1){
            return;
        }
    System.out.print(n);
      fact(n-1);
    
 
      
    }
    public static void main(String args[]){
fact(4);
    }
}