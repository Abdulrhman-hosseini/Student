package CalcClass;

public class Parent {
    public String name;
    public double baseSalary;

    public Parent(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public void calculateSalary(){
        System.out.println("baseSalary :" + baseSalary);
    }

}
