package first_20_primes;

public class First20Primes {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while(count < 20){
            boolean isPrime = true;
            for(int i = 2; i < number; i++ ){
                if(number % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
