package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class Graphs {
    public Graphs() {
    }
    public void ScatterPlot(String title, String xLabel, String yLabel, XYSeriesCollection dataset) {
        // Create the scatter plot
        JFreeChart chart = ChartFactory.createScatterPlot(
                title,  // chart title
                xLabel,             // x-axis label
                yLabel,               // y-axis label
                dataset                       // data
        );

        // Customize the plot
        chart.getXYPlot().setRenderer(new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer(false, true));
        ChartPanel chartPanel = new ChartPanel(chart);

        // Display the plot in a JFrame
        JFrame frame = new JFrame("Predicted vs Actual Prices");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(chartPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    public void BarGraph(DefaultCategoryDataset dataset, String title, String xLabel, String yLabel){
        JFreeChart chart = ChartFactory.createBarChart(
                "Classification Results", // Chart title
                "Classification", // X-axis label
                "Number of Instances", // Y-axis label
                dataset // Dataset
        );

        // Display the chart in a frame
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame("Classification Results");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(chartPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
