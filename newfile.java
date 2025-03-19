class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class PersonInfo {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Bob", 30),
                new Person("Unknown", 0)
        };

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
