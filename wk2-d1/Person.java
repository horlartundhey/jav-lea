public class Person{
    private String name;
    private int age;
    private String email;

    // Constructor
    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;         
    }

    // Constructor with only name and email
    public Person(String name, String email){
        this.name = name;
        this.email = email; 

    }

    // Constructor with only name and age
    public Person(String name, int age){
        this.name = name;
        this.age = age; 
        this.email = "Not provided"; 
    }

    // Method to display person information
    public String  getInfo(){
        return "Name: " + name + ", Age: " + age + ", Email: " + email; 
    }
}