package org.example;

import weka.classifiers.functions.LinearRegression;
import weka.core.Instances;
import weka.core.converters.CSVLoader;
import weka.classifiers.evaluation.Evaluation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.io.File;
import java.util.Random;

public class Regression {
    public Regression() {
    }

    public void runRegression() throws Exception {
        // Load cars.csv file


        // Set target attribute


        // Split data into training and test sets


        // Build Linear Regression model


        // Output model coefficients


        // Evaluate model on test set (call it eval for the output below)


        // Output evaluation results
        System.out.println(eval.toSummaryString("\nResults\n======\n", false));
        System.out.println("Correlation coefficient: " + eval.correlationCoefficient());
        System.out.println("Mean absolute error: " + eval.meanAbsoluteError());
        System.out.println("Root mean squared error: " + eval.rootMeanSquaredError());

        // Make predictions (example with first instance of test data)
        double predictedPrice = model.classifyInstance(testData.instance(0));
        System.out.println("Predicted price for first test instance: " + predictedPrice);
        System.out.println("Actual price for first test instance: " + testData.instance(0).classValue());


        // Create a dataset for the scatter plot
        XYSeries series = new XYSeries("Predicted vs Actual Prices");
        for (int i = 0; i < testData.numInstances(); i++) {
            double predictedPrices = model.classifyInstance(testData.instance(i));
            double actualPrice = testData.instance(i).classValue();
            series.add(predictedPrices, actualPrice);
        }
        Graphs graphs = new Graphs();
        graphs.ScatterPlot("Predicted vs Actual Prices", "Predicted Price", "Actual Price", new XYSeriesCollection(series));

    }
}
