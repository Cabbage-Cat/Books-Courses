package abstractClasses;

public class PersonTest {
    public static void main(String[] args){
        var people = new Person[2];

        people[0] = new Emploee("aa",1000,1999,2,19);
        people[1] = new Emploee("aaa",10020,1929,2,19);

        for (Person p : people){
            System.out.println(p.getName() + "," + p.getDescription());
        }
    }
}
