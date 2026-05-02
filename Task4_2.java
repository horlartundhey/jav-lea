public class Task4_2 {
    public static void describe(String text){
        System.out.println("This is a String: " + text);        
    }

    public static void describe(int number){
        System.out.println("This is an integer: " + number);        
    }

    public static void describe(double number){
        System.out.println("This is a double: " + number);        
    }

    public static void main(String[] args){
        describe("Hello, World!");
        describe(42);
        describe(3.14);
    }
    
}
