package bar;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class bar1 {
	public static void main(String[] args) {
	//	/**sfdvdsfgsfgsdfs/sgfdgdfgdfgd==
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		dataset.addValue(100, "����", "ƻ��");
		dataset.addValue(150, "����", "����");
		dataset.addValue(80, "����", "�㽶");
		dataset.addValue(120, "����", "����");
		
	JFreeChart chart = ChartFactory.createBarChart3D("ˮ������ͼ", "ˮ��", "����", dataset, PlotOrientation.VERTICAL, true, true, false);
	
	try {
		ChartUtilities.saveChartAsJPEG(new File("d:\\aaaa\\bar1.jpeg"), chart, 700, 500);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
