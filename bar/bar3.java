package com.offcn.bar;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class bar3 {
	public static void main(String[] args) throws IOException {
	DefaultCategoryDataset dataset=new DefaultCategoryDataset();
	dataset.addValue(150, "北京", "苹果");
	dataset.addValue(100, "北京", "苹果");
	dataset.addValue(120, "北京", "橘子");
	dataset.addValue(80, "北京", "桃子");
	
	dataset.addValue(120, "上海", "苹果");
	dataset.addValue(90, "上海", "香蕉");
	dataset.addValue(80, "上海", "橘子");
	dataset.addValue(130, "上海", "桃子");
	
	dataset.addValue(90, "天津", "苹果");
	dataset.addValue(110, "天津", "香蕉");
	dataset.addValue(100, "天津", "橘子");
	dataset.addValue(80, "天津", "桃子");
		
	
	JFreeChart chart = ChartFactory.createBarChart3D("水果销量图", "水果", "销量", dataset, PlotOrientation.VERTICAL, true, true, false);
	
	ChartUtilities.saveChartAsJPEG(new File("d:\\aaaa\\bar3.jpg"), chart, 700, 500);
	
	
		
	}
	
	
}
