import java.util.*;
public class main{
    public static void main(String args[]){
         HashMap <String, Integer> hm = new HashMap<>();
           hm.put("yash", 100);
        hm.put("shubham", 50);
        hm.put("chaggan", 90);
      
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
         lhm.put("yash", 100);
        lhm.put("shubham", 50);
        lhm.put("chaggan", 90);
       
        TreeMap<String,Integer> tr = new TreeMap<>();
        tr.put("shubham", 50);
        tr.put("chaggan", 90);
        tr.put("yash", 100);
       System.out.println(tr);
        System.out.println(hm);
        System.out.println(lhm);
        // int population = hm.get("shubham");
        // System.out.println(population);

        // System.out.println(hm.remove("shubham"));
        // // System.out.println(hm.remove("kunl"));
        // System.out.println(hm.containsKey("shubham"));
        // System.out.println(hm.size());
        // System.out.println(hm.isEmpty());
        // System.out.println(hm);

        // Set<String> keys = hm.keySet();
        // // Set<String,Integer> keys = hm.entrySet();
        // // System.out.print(keys);

        // for(String k : keys){
        //     System.out.println( k + " values : " + hm.get(k));
        // }

    }
}