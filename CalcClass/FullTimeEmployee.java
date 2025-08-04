package CalcClass;

public class Child extends Parnet {
   public double bonas;
   public FullTimeEmployee(String name ,double baseSalary,double bonas){
       super(name,baseSalary);
       this.bonas=bonas;

   }
    public void calculateSalary() {
        double total = baseSalary + bonus;
        System.out.println(name + "'s salary with bonus: " + total);
    }
}
