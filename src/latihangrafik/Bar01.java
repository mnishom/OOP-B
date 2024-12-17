package latihangrafik;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.ui.TextAnchor;
import org.jfree.data.category.CategoryDataset;

public class Bar01 {

    private static CategoryDataset createDataset() {
        final String JAN = "JANUARI";
        final String FEB = "FEBRUARI";
        final String MAR = "MARET";
        final String APR = "APRIL";
        final String MEI = "MEI";
        final String JUN = "JUNI";
        final String JUL = "JULI";
        final String AGU = "AGUSTUS";
        final String SEP = "SEPTEMBER";
        final String OKT = "OKTOBER";
        final String NOV = "NOVEMBER";
        final String DES = "DESEMBER";

        final String income = "Income"; //dalam juta
        final String QTY = "Item Terjual";
        final String TRS = "Jumlah Transaksi";
        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        dataset.addValue(1.0, JAN, income);
        dataset.addValue(3.0, JAN, TRS);
        dataset.addValue(5.0, JAN, QTY);

        dataset.addValue(4.0, FEB, income);
        dataset.addValue(6.0, FEB, TRS);
        dataset.addValue(7.0, FEB, QTY);

        dataset.addValue(3.0, MAR, income);
        dataset.addValue(5.0, MAR, TRS);
        dataset.addValue(3.0, MAR, QTY);

        dataset.addValue(9.0, APR, income);
        dataset.addValue(3.0, APR, TRS);
        dataset.addValue(6.0, APR, QTY);

        dataset.addValue(4.0, MEI, income);
        dataset.addValue(4.0, MEI, TRS);
        dataset.addValue(4.0, MEI, QTY);

        dataset.addValue(4.0, JUN, income);
        dataset.addValue(5.0, JUN, TRS);
        dataset.addValue(2.0, JUN, QTY);

        dataset.addValue(7.0, JUL, income);
        dataset.addValue(2.0, JUL, TRS);
        dataset.addValue(9.0, JUL, QTY);

        dataset.addValue(12.0, AGU, income);
        dataset.addValue(6.0, AGU, TRS);
        dataset.addValue(20.0, AGU, QTY);

        dataset.addValue(3.0, SEP, income);
        dataset.addValue(1.0, SEP, TRS);
        dataset.addValue(2.0, SEP, QTY);

        dataset.addValue(4.0, OKT, income);
        dataset.addValue(2.0, OKT, TRS);
        dataset.addValue(3.0, OKT, QTY);

        dataset.addValue(7.0, NOV, income);
        dataset.addValue(3.0, NOV, TRS);
        dataset.addValue(5.0, NOV, QTY);

        dataset.addValue(9.0, DES, income);
        dataset.addValue(4.0, DES, TRS);
        dataset.addValue(7.0, DES, QTY);

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

        CategoryItemRenderer renderer = ((CategoryPlot) chart.getPlot()).getRenderer();
        renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setDefaultItemLabelsVisible(true);
        ItemLabelPosition position = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12,
                TextAnchor.TOP_CENTER);
        renderer.setDefaultPositiveItemLabelPosition(position);

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
