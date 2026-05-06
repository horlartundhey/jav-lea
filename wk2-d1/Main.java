public class Main {
    public static void main(String[] args) {
        // Create a person using the constructor with all parameters
        Person person1 = new Person("Olatunde", 22, "olatunde@email.com");
        // Create a person using the constructor with only name and age
        Person person2 = new Person("Oluwafemi", "Oluwafemi@gm.com");

        Person person3 = new Person("Oluwafemi", 25);

        // Display information of both persons
        System.out.println(person1.getInfo());
        System.out.println(person2.getInfo());  
        System.out.println(person3.getInfo());
    }
}
