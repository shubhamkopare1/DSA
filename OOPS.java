// public class OOpS{
//     public static void main(String args[]){
//       Student s1= new Student();
//       s1.name ="shubham";
//       s1.id = 20;
//       s1.marks[0]= 100;
//       s1.marks[1] = 85;
//       s1.marks[2]= 95;


//       Student s3= new Student(s1);

//       s1.marks[2]= 100;

//     //   s1.studentName("shubham");
//     //  s1.name = " vaibhao";
//       System.out.println(s3.name);
//       System.out.println(s3.id);
//       System.out.print(s3.marks[2]);
//     //   Pen p1 = new Pen();
//     //   p1.setColor("blue");
//     //  p1.setThickness(4);
//     //   System.out.print(p1.getColor());
//     //   System.out.print(p1.getThik());
      
//     //   System.out.print(p1.thik);
//     //   Student s2 = new Student();
//     //   s2.name = "shubham";
//     //   System.out.print(s2.name);
//     //   BankAccount myAcc = new BankAccount();
//     //   myAcc.name = "shubham";
//     //   myAcc.changePassword("ghu");

//     //   System.out.print(myAcc.name);
      
//     }
// }
// class BankAccount{
//    public String name;
//    private String pass;
//   public void changePassword(String password){
//     pass = password;
   
//   }

// }

// class Student{
//     String name;
//     int id;
//     int marks[];
//     void studentName(String studentNames){

//         name = studentNames;
//     }
//     void studentId(int studentIds){
//           id = studentIds;
//     }
  
//     Student(){
//          marks = new int[3];
//     }
    //shallow copy constructor 
    // Student(Student s1){
    //      marks = new int[3];
    //     this.name = s1.name;
    //     this.id = s1.id;
    //     this.marks = s1.marks;
    // }
    //deep copy constructor 
//     Student(Student s1){
//          marks = new int[3];
//         this.name = s1.name;
//         this.id = s1.id;
//         for(int i =0; i< 3 ; i++){
//             this.marks[i] = s1.marks[i];
//         }
//     }
// }
// class Pen{
//    private String color;
//    private int thik ;
//      void setColor(String color ){
//         this.color = color;
//      }
//      String getColor(){
//         return this.color;
//      }
//      void setThickness(int thik){
//        this.thik = thik;
//      }
//      int getThik(){
//         return this.thik ;
//      }
// }




// inheritance 
// public class OOPS{
//   public static void main(String args[]){
//   // Fish shark = new Fish();
//   Animal etc = new Animal();
//   Tiger liger = new Tiger();

//   Wild animal = new Wild();
  
//   // Mammle dog = new Mammle();
//   Dog libra = new Dog();
//   // libra.eats();

//   liger.breaths();

//   // shark.eats();
//   }
// }
// // base class
// class Animal{
//   String name;
//    void eats(){
//     System.out.print("veg");
//    }
//    void breaths(){
//     System.out.print("breates");
//    }
// }
// // // deived class 
// // class Fish extends Animal{
// //   String name;

// // }
// // class Tiger extends Animal{
// //    void maeat(){
// //     System.out.print("meat");
// //    }
// // }

// // class Mammle extends Animal{
// //   String leg;
   
// // }
// // class Dog extends Mammle{
// //   String food;
// // }


// // hybrid inheritance 
// //derived class
// class Wild extends Animal{
  
//   void house(){
//     System.out.print("Forest");
//   }

// }
// // derived class
// class pet extends Animal{
//  void house(){
//  System.out.print("city");
//  }

// }
// // derived derived class
// class Tiger extends Wild{
//     void gender(){
//       System.out.print("male");
//     }
// }
// // derived derived class
// class Dog extends pet{
//   void gender(){
//     System.out.print("male");
//   }
// }


// method overriding 
// public class main{
//   public static void main(String args[]){
//   Calculator cal = new Calculator();
//   System.out.print(cal.sum(3,4));
//   System.out.print(cal.sum(3,4,5));
//   System.out.print(cal.sum((float)3.14, (float)3.4));
//   }
// }
// class Calculator{
//   int sum(int a, int b){
//     return a+b;
//   }
//   float sum(float a, float b){
//     return a+b;
//   }
//   int sum(int a,int b, int c){
//     return a+b+c;
//   }
// }

// method overloading 

// public class main{
//   public static void main(String args[]){
//  Deer deer = new Deer();
//  deer.eats();
//   }
// }
// class Animal{
// void eats(){
//   System.out.print("somthing anything");
// }
// }
// class Deer extends Animal {
//   void eats(){
//     System.out.print("grass");
//   }
// }



// Abstraction 

class Abstraction{
  public static void main(String args[]){
    Dog dog = new Dog();
    dog.eats();
   dog.walks();
   System.out.print(dog.dogs());


  }
}

abstract class Animal{
  String color;
     Animal(){
    color ="red";
  }
  void eats(){
    System.out.print("animal eats");
  }
  abstract void walks();
}

class Dog extends Animal{
    void dogs(){
      color = "broun";
    }
   void walks(){
    System.out.print("4 leg");
   }
}