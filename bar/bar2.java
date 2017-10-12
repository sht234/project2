package com.offcn.bar;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;

public class bar2 {

	public static void main(String[] args) {
		double[][] data= {{150},{120},{80},{30}};
		String[] rowKeys= {"香蕉","苹果","橘子","甘蔗"};
		String[] columsKeys= {"北京"};
	
	CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, columsKeys, data);
	
	JFreeChart chart = ChartFactory.createBarChart3D("水果销量图", "水果", "销量", dataset, PlotOrientation.HORIZONTAL, true, true, false);
		
	
	try {
		ChartUtilities.saveChartAsJPEG(new File("d:\\aaaa\\bar2.jpeg"), chart, 700, 500);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
		
	}
	
}
