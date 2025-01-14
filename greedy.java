import java.util.*;
public class Greedy{
    public static void main(String args[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int start[] = {1,7,6,7,6};
        int end[] = {2,4,6,7,8};

                  int startEnd = end[0];
                  ans.add(0);
                  int maxAct = 1;
             for(int i=1; i<end.length; i++){
                   if(start[i]>= startEnd){
                       ans.add(i);
                         startEnd = end[i];
                         maxAct++;
                   }
             }
            for(int i=0; i< ans.size(); i++){
                System.out.print("A"+ ans.get(i) + " ");
            }
            System.out.print("maximum activity " + maxAct);
            
    }
}