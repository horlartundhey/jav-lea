public class Animal {
    protected String name;
    protected String sound;


    // Constructor
    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound;        
    }

    // Method to make the animal speak
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    // Method to demonstrate overriding
    public void eat(){
        System.out.println(name + " is eating.");
    }    
}
