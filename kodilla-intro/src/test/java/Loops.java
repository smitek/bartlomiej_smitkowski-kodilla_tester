import java.util.Random;

public class Loops {
    public static void main (String[] args) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        //return result;
    }
}
