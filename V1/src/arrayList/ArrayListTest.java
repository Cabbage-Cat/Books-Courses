package arrayList;

import euqals.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Carl",75000,1999,12,1));
        staff.add(new Employee("Herry",75000,1992,12,1));
        staff.add(new Employee("Tony",7500,1993,12,1));

        for (Employee e : staff)
            e.raiseSalary(15);

        for (Employee e : staff){
            System.out.println("name: " + e.getName() + ",salary=" + e.getSalary() + ",hireDay:" + e.getHireDay());
        }
    }
}
