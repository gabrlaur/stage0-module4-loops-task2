package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 0;
        boolean isPrime = true;

        while (counter <= printToInclusive) {
            if (counter != 0 && counter != 1 ) {
                for (int i = 2; i <= counter / 2; ++i) {
                    if (counter % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(counter);
                }
            }
            isPrime = true;
            counter++;
        }
    }
}
