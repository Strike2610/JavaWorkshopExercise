package org.example;

import org.jfree.data.category.DefaultCategoryDataset;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
import weka.core.converters.CSVLoader;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

import java.io.File;
import java.util.Random;

public class Classifier {
    public Classifier() {
    }

    public void runClassifier() throws Exception {
        // Load titanic.csv file


        // Set target attribute


        //set the attributes to keep


        // Shuffle the data


        // Split data into training and test sets


        // Build classifier


        // Evaluate model on test set (call it eval for the output below)


        // Output evaluation results
        System.out.println(eval.toSummaryString("\nResults\n======\n", false));
        System.out.println("Correctly classified instances: " + eval.correct());
        System.out.println("Incorrectly classified instances: " + eval.incorrect());
        // Create a dataset for the bar chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(eval.correct(), "Correct", "Classification");
        dataset.addValue(eval.incorrect(), "Incorrect", "Classification");

        Graphs graph = new Graphs();
        graph.BarGraph(dataset, "Classification Results", "Correct vs Incorrect", "Count");

    }

}
