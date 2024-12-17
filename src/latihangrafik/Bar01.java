package latihangrafik;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import org.jfree.chart.plot.PlotOrientation;

public class Bar01 {
    public static void main(String[] args) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "Series1", "Category1");
        dataset.addValue(20, "Series1", "Category2");
        dataset.addValue(30, "Series1", "Category3");
        dataset.addValue(15, "Series2", "Category1");
        dataset.addValue(25, "Series2", "Category2");
        dataset.addValue(35, "Series2", "Category3");

        // Create the bar chart
        JFreeChart chart = ChartFactory.createBarChart(
            "Multi-Series Bar Chart",   // Chart title
            "Category",                 // X-axis Label
            "Value",                    // Y-axis Label
            dataset,
            PlotOrientation.VERTICAL,           // Orientation (vertical)
            true,                               // Include legend
            true,                                // Tooltips
            false                                // URLs// Dataset
        );
        
       
        // Create and display the chart
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}