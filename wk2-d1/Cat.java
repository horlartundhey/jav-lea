public class Cat extends Animal{
    public Cat(String name) {
        super(name, "Meow"); // Call the constructor of the superclass (Animal)
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: " + sound);
    }
}