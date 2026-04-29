public class Exercise2_2 {
    public static void main(String[] args){
        double price = 19.99;
        int castedPrice = (int) price;

        System.out.println("Original price: " + price);
        System.out.println("Casted price: " + castedPrice);

        // The original price is 19.99, but after casting to an integer, it becomes 19, which means the decimal part is truncated.

        int number = 10;
        double castedNumber = (double) number;

        System.out.println("Original number: " + number);
        System.out.println("Casted number: " + castedNumber);

        // The original number is 10, but after casting to a double, it becomes 10.0, which means it now has a decimal point, even though the value is the same.
    }
}
