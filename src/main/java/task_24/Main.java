package task_24;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Saratov", "Moskovskaya", 55);
        Person person = new Person("Ivan", address);

        System.out.println(person.toString());
    }
}
