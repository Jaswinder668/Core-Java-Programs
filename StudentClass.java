
class Student{
   String name;
   int age;
  String city;
  Long phone;
  String email;
  public Student(String name,int age,String city,Long phone,String email){
    this.name=name;
    this.age=age;
    this.city=city;
    this.phone=phone;
    this.email=email;
  }
  public void Display(){
    System.out.println("Student Details Are Shown Below");
    System.out.println("Name :"+name);
    System.out.println("Age :"+age);
    System.out.println("City :"+city);
    System.out.println("Phone :"+phone);
    System.out.print("Email :"+email);
  }
}
public class StudentClass {
    public static void main(String[] args) {
     Student sc=new Student("Jaswinder Singh",23,"Bilaspur",7876872289L,"Jaswinderree001@gmail.com");
     sc.Display();
    }
}