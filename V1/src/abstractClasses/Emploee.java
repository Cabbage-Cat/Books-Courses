package abstractClasses;
import java.time.LocalDate;

public class Emploee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Emploee(String name,double salary,int year,int month,int day){
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }


    @Override
    public String getDescription() {
        return String.format("an emploee with a salary of %f , year: %s",getSalary(),getHireDay());
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double percent){
        double raise = salary * percent / 100;
        salary += raise;
    }
}
