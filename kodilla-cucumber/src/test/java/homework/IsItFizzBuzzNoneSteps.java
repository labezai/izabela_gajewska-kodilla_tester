package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzBuzzNoneSteps implements En {
    private String answer;
    private int number;

    public IsItFizzBuzzNoneSteps() {
        Given("Given number is {int}", number -> {

            // Write code here that turns the phrase above into concrete actions
            this.number = (int) number;

        });


        When("I ask about the password for the given number", () -> {

            // Write code here that turns the phrase above into concrete actions
            FizzBuzzNoneChecker fizzBuzzNoneChecker = new FizzBuzzNoneChecker();
            if (this.answer == fizzBuzzNoneChecker.checkIfFizz(this.number)) {
            } else if (this.answer == fizzBuzzNoneChecker.checkBuzz(this.number)) {
            } else {
                this.answer = fizzBuzzNoneChecker.checkFizzBuzz(this.number);

            }

        });

        Then("You should tell me {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);


        });
        Given("^Given number is \"([^\"]*)\"$", (Integer arg0) -> {
            this.number = arg0;
        });
    }
}

