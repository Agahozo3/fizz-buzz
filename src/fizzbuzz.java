public class fizzbuzz {

        public static void main(String[] args) {
            // Loop from 1 to 100
            for (int i = 1; i <= 100; i++) {
                // Check if divisible by both 3 and 5 first
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // If not divisible by either 3 or 5, print the number
                else {
                    System.out.println(i);
                }
            }
        }
    }

