package clone;

public class CloneTest {
    public static void main(String[] args) {
        try{
            Employee e = new Employee("Sorry",100);
            e.setHireDay(2000,10,2);
            Employee cpy = e.clone();
            cpy.raiseSalary(10);
            cpy.setHireDay(1999,12,1);
            System.out.println(e);
            System.out.println(cpy);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
