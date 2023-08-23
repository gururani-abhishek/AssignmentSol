package org.hsbc.question4;

import org.hsbc.question3.WrongInputException;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        LearningModule objLearningModule = new LearningModule();

        String learningCode = null;

        try {
            learningCode = objLearningModule.getLearningCode("name0", 0);
            System.out.println(learningCode);
        } catch (WrongInputException eObject) {
            System.out.println("exception - " + eObject);
        }

        try {
            learningCode = objLearningModule.getLearningCode("name1", -1);
            System.out.println(learningCode);
        } catch (WrongInputException eObject) {
            System.out.println("exception - " + eObject);
        }
    }
}
