package org.hsbc.question4;

import org.hsbc.question2.InvalidAgeException;

public class AgeValidator {
    public String getAgeCode(int age) throws InvalidAgeException {
        try {
            if (age > 18) {
                return "Adult";
            } else if (age >= 0) {
                return "kid";
            } else {
                throw new InvalidAgeException("invalid age exception");
            }
        }
        catch(InvalidAgeException eObject) {
            throw new InvalidAgeException("invalid age exception", eObject);
        }
    }
}
