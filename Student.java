public class Student {

    String name;    //instance of class 
    int rollno;
    int age;
    void display(){
    System.out.println("the student name is " + name);//method 
   }
    public static void main(String[] args) {   // main method of the class
        Student id =new Student();// to create object and call the method
        id.name="praveen";
        id.rollno=37;
        id.age=22;
        id.display();
    }
  

}

//doubt in a class can we create one more class but in vs code it's not possible rigth 