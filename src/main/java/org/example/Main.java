package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Regression regression = new Regression();
        regression.runRegression();

        Classifier classifier = new Classifier();
        classifier.runClassifier();
    }
}
