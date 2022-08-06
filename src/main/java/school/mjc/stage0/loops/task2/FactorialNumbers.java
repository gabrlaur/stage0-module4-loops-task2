package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int factorial = 1;
        while (counter <= printToInclusive) {
            int digit = counter;
            while (digit > 0) {
                factorial *= digit;
                digit--;
            }
            System.out.println(factorial);
            factorial = 1;
            counter++;
        }
    }
}
