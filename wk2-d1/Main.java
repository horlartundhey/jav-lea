    public class Main {
        public static void main(String[] args) {
            // // Create a person using the constructor with all parameters
            // Person person1 = new Person("Olatunde", 22, "olatunde@email.com");
            // // Create a person using the constructor with only name and age
            // Person person2 = new Person("Oluwafemi", "Oluwafemi@gm.com");

            // Person person3 = new Person("Oluwafemi", 25);

            // // Display information of both persons
            // System.out.println(person1.getInfo());

            // // Testing Invalid age 
            // // person1.setAge(150); // This should throw an exception
            // System.out.println(person2.getInfo());  
            // System.out.println(person3.getInfo());

            // Polymorphism: Animal reference can point to a Dog or Cat object
            Animal[] animals = {
                new Dog("Bingo"),
                new Cat("Cutie")
            };

            // Loop through array and call overridden methods 
            for(Animal animal : animals) {
                animal.makeSound();

            }

            System.out.println();

            // Testing the eat method to demonstrate overriding
            Animal dog = new Dog("Rocky");
            Animal cat = new Cat("Whiskers");

            dog.eat(); // Should call Dog's eat method
            cat.eat(); // Should call Animal's eat method since Cat does not override it


        }
    }
