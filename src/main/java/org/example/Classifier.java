package org.example;

import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
import weka.core.converters.CSVLoader;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;
import weka.filters.unsupervised.instance.RemoveWithValues;

import java.io.File;
import java.util.Random;

public class Classifier {
    public Classifier() {
    }

    public void runClassifier() throws Exception {
        // Load titanic.csv file


        // Set target attribute


        // Remove other attributes


        // Remove instances of missing data


        // Shuffle the data


        // Split data into training and test sets


        // Build classifier


        // Evaluate model on test set (call it eval for the output below)


        // Print confusion matrix
        double[][] confusionMatrix = eval.confusionMatrix();
        System.out.println("Confusion Matrix:");
        for (double[] row : confusionMatrix) {
            for (double value : row) {
                System.out.print((int) value + " ");
            }
            System.out.println();
        }

        // Optionally print other evaluation metrics
        System.out.println("Accuracy: " + eval.pctCorrect());
        System.out.println("Precision: " + eval.precision(1));
        System.out.println("Recall: " + eval.recall(1));
        System.out.println("F-Measure: " + eval.fMeasure(1));
    }

}
