public class PrimeNumberUnder100 {
    public static void main(String[] args) {
        int count = 1;
        int number = 2;
        while (number < 100) {
            int i = 2;
            boolean isPrime = true;
            for (i = 2; i < number; i++) {
                if (number%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print("Prime number " + count + ":");
                System.out.println(number);
                count++;
            }
            number++;
            isPrime = true;
        }
    }
}
