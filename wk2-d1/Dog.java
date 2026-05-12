public class Dog extends Animal {
    public Dog(String name){
        super(name, "Woof"); // Call the constructor of the superclass (Animal)
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: " + sound);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }
}

