package homework;

public class FizzBuzzNoneChecker {

    public String checkIfFizz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return "None";
        }
    }

    public String checkBuzz(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "None";
        }
    }

    public String checkFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else {
            return "None";
        }
    }
}
