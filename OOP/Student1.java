package OOP;



// Student.java
public class Student1 {
    // 1. Define fields
    private String name;
    private int age;
    private double gpa;

    // 2. Constructor to initialize fields
    public Student1(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // 3. Methods: displayInfo() and study()
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public void study() {
        System.out.println(name + " is studying...");
    }

    // 4. Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}






















//    public String name;
//    public int age;
//    public double gpa;
//
//
//public Student1(String name ,int age, double gpa){
//    this.name = name;
//    this.age =age;
//    this.gpa = gpa;
//}
//    public void displayInfo(){
//        System.out.println("name " + name);
//        System.out.println("age : "+age);
//        System.out.println("gpa : " +gpa);
//    }
//    public void study(){
//        System.out.println(name);
//
//    }

