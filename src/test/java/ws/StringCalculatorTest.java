package ws;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StringCalculatorTest {
    private String numberString;
    private Integer result;
    private Exception exception;

    @When("I call add")
    public void iCallAdd() {
        try{
            var sc = new StringCalculator();
            result = sc.add(numberString);
        } catch (Exception e){
            exception = e;
        }
    }
    @Then("I should get {int}")
    public void iShouldGet(Integer int1) {
        Assert.assertEquals(int1, result);
    }

    @Given("a text with two numbers seperated with comma {string}")
    public void aTextWithTwoNumbersSeperatedWithComma(String string) {
        numberString = string;
    }

    @Given("a text with multiple numbers seperated with comma {string}")
    public void aTextWithMultipleNumbersSeperatedWithComma(String string) {
        numberString = string;
    }

    @Given("a text with numbers seperated with comma {string}")
    public void aTextWithNumbersSeperatedWithComma(String string) {
        numberString = string;
    }

    @Given("an empty string")
    public void anEmptyString() {
        numberString = "";
    }

    @Given("a text with negative numbers seperated with comma {string}")
    public void aTextWithNegativeNumbersSeperatedWithComma(String arg0) {
        numberString = arg0;
    }

    @Then("I should get an exception with {string} as error message")
    public void iShouldGetAnExceptionWithAsErrorMessage(String arg0) {
        System.out.printf(exception.getMessage());
        Assert.assertNotNull(exception);
        Assert.assertTrue(exception.getMessage().contains(arg0));
    }
}
