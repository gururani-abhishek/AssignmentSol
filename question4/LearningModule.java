package org.hsbc.question4;

import org.hsbc.question2.InvalidAgeException;
import org.hsbc.question3.WrongInputException;

public class LearningModule {
    public String getLearningCode(String Name, int age) throws WrongInputException {
        try {
            AgeValidator objAgeValidator = new AgeValidator();
            return Name + objAgeValidator.getAgeCode(age);
        }
        catch (InvalidAgeException eObject) {
            throw new WrongInputException("wrong input exception", eObject);
        }
    }
}
