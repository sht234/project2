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
	dataset.addValue(150, "����", "ƻ��");
	dataset.addValue(100, "����", "ƻ��");
	dataset.addValue(120, "����", "����");
	dataset.addValue(80, "����", "����");
	
	dataset.addValue(120, "�Ϻ�", "ƻ��");
	dataset.addValue(90, "�Ϻ�", "�㽶");
	dataset.addValue(80, "�Ϻ�", "����");
	dataset.addValue(130, "�Ϻ�", "����");
	
	dataset.addValue(90, "���", "ƻ��");
	dataset.addValue(110, "���", "�㽶");
	dataset.addValue(100, "���", "����");
	dataset.addValue(80, "���", "����");
		
	
	JFreeChart chart = ChartFactory.createBarChart3D("ˮ������ͼ", "ˮ��", "����", dataset, PlotOrientation.VERTICAL, true, true, false);
	
	ChartUtilities.saveChartAsJPEG(new File("d:\\aaaa\\bar3.jpg"), chart, 700, 500);
	
	
		
	}
	
	
}
