public class Task3_1{
    public static void main(String[] args){
        int[] testScores = {85, 90, 78, 92, 100};

        for (int score : testScores){
            if (score >= 90 && score <= 100){
                System.out.println(score + " is an A");
            }else if (score >= 80){
                System.out.println(score + " is a B");
            }else if (score >= 70){
                System.out.println(score + " is a C");
            }else if (score >= 60){
                System.out.println(score + " is a D");
            }else{
                System.out.println(score + " is an F");
            }   
        }
    }
}