package allQuestions;

import org.junit.Assert;
import org.junit.Test;

import allQuestions.OneCheckAge;


public class TestOneCheckAge {
    OneCheckAge oneCheckAge = new OneCheckAge();

    @Test
    public void convertAgeOnAgeInDays() {
        Assert.assertEquals(("Should return 1170"), 1170, oneCheckAge.checkAge(3, 2, 15));
    }
}
