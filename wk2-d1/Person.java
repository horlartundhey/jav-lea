/*
 We make fields private to protect the internal data of the object.
 This prevents direct access from outside the class and allows us
 to control how values are read or changed using getters and setters.
 This improves security, validation, and maintainability.
*/

public class Person{
    private String name;
    private int age;
    private String email;

    // Constructor
    public Person(String name, int age, String email){
        this.name = name;
        setAge(age); // Using setter to validate age
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
        setAge(age); // Using setter to validate age
        this.email = "Not provided"; 
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Age Validation
    public void setAge(int age) {
        if(age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        } else {
            this.age = age;
        }
    }


    // Method to display person information
    public String  getInfo(){
        return "Name: " + name + ", Age: " + age + ", Email: " + email; 
    }
}