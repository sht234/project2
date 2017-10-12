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
		dataset.addValue(100, "北京", "苹果");
		dataset.addValue(150, "北京", "葡萄");
		dataset.addValue(80, "北京", "香蕉");
		dataset.addValue(120, "北京", "橘子");
		
	JFreeChart chart = ChartFactory.createBarChart3D("水果销量图", "水果", "销量", dataset, PlotOrientation.VERTICAL, true, true, false);
	
	try {
		ChartUtilities.saveChartAsJPEG(new File("d:\\aaaa\\bar1.jpeg"), chart, 700, 500);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
