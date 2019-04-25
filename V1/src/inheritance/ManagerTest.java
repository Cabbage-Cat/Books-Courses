package inheritance;

public class ManagerTest {
    public static void main(String[] args){
        var boss = new Manager("SsorryQaQ",80000,1999,12,04);
        boss.setBonus(1000);

        var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("test1",10000,1991,10,3);
        staff[2] = new Employee("test2",10000,1991,10,4);

        for (Employee e:staff){
            System.out.println("name: " + e.getName() + "Salary: " + e.getSalary() + "Day: " + e.getHireDay());
        }
    }
}
