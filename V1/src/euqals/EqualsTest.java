package euqals;

public class EqualsTest {
    public static void main(String[] args){
        var alice1 = new Employee("Alice1",75000,1990,2,12);
        var alice2 = alice1;
        var alice3 = new Employee("Alice1",75000,1990,2,12);
        var bob = new Employee("BOB",50000,1992,3,12);

        System.out.println("alice1 == alice2: " + (alice1==alice2));
        System.out.println("alice1 == alice3: " + (alice1==alice3));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob)" + alice1.equals(bob));

        System.out.println("bob.toString(): " + bob);

        System.out.println(alice1.hashCode() + " " + alice2.hashCode());
    }
}
