public class Task4_3 {
    public static String getFizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        if (n % 3 == 0) return "Fizz";
        if (n % 5 == 0) return "Buzz";
        return String.valueOf(n);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }
}
