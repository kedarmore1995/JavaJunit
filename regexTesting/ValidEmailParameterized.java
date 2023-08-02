package regexTesting;

import org.example.SampleEmailValidation;
import org.example.ValidEmail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailParameterized {
    private String email2test;
    private boolean expectedResult;

    public ValidEmailParameterized(String email2test, boolean expectedResult){
        this.email2test= email2test;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][] { {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}} );
    }
@Test
    public  void checkIfGivenEmailIsCorrect(){
        SampleEmailValidation validEmail=new SampleEmailValidation();
        boolean result =validEmail.checkValidEmail(this.email2test);
    Assert.assertEquals(this.expectedResult, result);
}
}
