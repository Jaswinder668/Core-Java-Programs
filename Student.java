class Student_1 {
    String name;
    int age;
    String city;
    Long phone;
    String email;

    public Student_1(String name, int age, String city, Long phone, String email) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }
    public void setDetails(String name,int age,String city,Long phone ,String email){
        this.name=name;
        this.age=age;
        this.city=city;
        this.phone=phone;
        this.email=email;

    }

    public void Display() {
        System.out.println("Student Details Are Shown Below");
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("City :" + city);
        System.out.println("Phone :" + phone);
        System.out.print("Email :" + email);
    }

    public static void main(String[] args) {
        Student_1 sc = new Student_1("Devinder Singh", 21, "bilaspur", 999999999L, "devinde@gmail.com");
        sc.Display();
        sc.setDetails("jaswinder Singh", 23, "bilaspur", 78787878L, "jaswinder1@gmail.com");

        sc.Display();
    }
}