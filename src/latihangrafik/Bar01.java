package latihangrafik;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

public class Bar01 {

    private static CategoryDataset createDataset() {
        final String JAN = "JANUARI";
        final String FEB = "FEBRUARI";
        final String MAR = "MARET";
        
        final String income = "Income"; //dalam juta
        final String QTY = "Item Terjual";
        final String TRS = "Jumlah Transaksi";
        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        dataset.addValue(1.0, JAN, income);
        dataset.addValue(3.0, JAN, TRS);
        dataset.addValue(5.0, JAN, QTY);

        dataset.addValue(5.0, FEB, income);
        dataset.addValue(6.0, FEB, TRS);
        dataset.addValue(10.0, FEB, QTY);

        dataset.addValue(4.0, MAR, income);
        dataset.addValue(2.0, MAR, TRS);
        dataset.addValue(3.0, MAR, QTY);

        return dataset;
    }

    public static void main(String[] args) {
        // Create the bar chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Multi-Series Bar Chart", // Chart title
                "Category", // X-axis Label
                "Value", // Y-axis Label
                createDataset(),
                PlotOrientation.VERTICAL, // Orientation (vertical)
                true, // Include legend
                true, // Tooltips
                false // URLs// Dataset
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
