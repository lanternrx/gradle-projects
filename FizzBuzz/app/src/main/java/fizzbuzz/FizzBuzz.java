package fizzbuzz;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        StringBuilder sb = new StringBuilder();

        if (number % 3 == 0) {
            sb.append("Fizz");
        }

        if (number % 5 == 0) {
            sb.append("Buzz");
        }

        if (sb.isEmpty()) {
            return String.valueOf(number);
        }
        return sb.toString();
    }
}
