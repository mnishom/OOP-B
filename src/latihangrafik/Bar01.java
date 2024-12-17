package latihangrafik;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;

public class Bar01 {
    public static void main(String[] args) {
        // Create a dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "januari", "Omset"); 
        dataset.addValue(2, "februari", "Omset");
        dataset.addValue(20, "januari", "Item Terjual");               
        dataset.addValue(16, "februari", "Item Terjual");
        dataset.addValue(4, "januari", "Jml Transaksi");
        dataset.addValue(4, "februari", "Jml Transaksi");

        
        
        // Create the bar chart
        JFreeChart chart = ChartFactory.createBarChart(
            "Grafik Penjualan",  // Chart title
            "Category",           // X-axis Label
            "Value",              // Y-axis Label
            dataset               // Dataset
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