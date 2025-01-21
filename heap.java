import java.util.*;
public class Heaps{
    // static class Student implements Comparable<Student>{
    //     String name;
    //     int rank;
    //     public Student(String name, int rank){
    //         this.name = name;
    //         this.rank = rank;
    //     }
    //     @Override
    //     public int compareTo(Student s2){
    //         return this.rank - s2.rank;
    //     }
    // }
    static class Heap{
        ArrayList<Integer> al = new ArrayList<>();
         void add(int data){
          al.add(data);
          int x = al.size()-1;
          int par = (x-1) / 2;
          while(al.get(x) < al.get(par)){
            int temp = al.get(x);
            al.set(x,par);
            al.set(par,temp);
          }

        }
      
       
    }

    public static void main(String args[]){
        // PriorityQueue<Student> pq = new PriorityQueue<>();
        // pq.add(new Student("A", 4)); 
        // pq.add(new Student("B", 5));
        // pq.add(new Student("D", 1));
     
    //      while (!pq.isEmpty()){
    //     System.out.print(pq.peek().name + " ->"+ pq.peek().rank );
    //     pq.remove();
    // }
   
      Heap h = new Heap();
      h.add(3);   
      h.add(6);   
      h.add(7);
    //    print(al);
   
    }
   
}