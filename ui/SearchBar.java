import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SearchBar{

	
	public  static JPanel firstResult = new JPanel();
	public  static JPanel secondResult = new JPanel();
	public  static JPanel thirdResult= new JPanel();
	public static JPanel mainPanel = new JPanel(new GridLayout(3,1));
	
	public static JLabel firstLabel;
	public static JLabel secondLabel;
	public static JLabel thirdLabel;
	public static Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
	
	public static void showSearchMovies(Movie[] results, JFrame frame) {
		Color purple = new Color(197,180,227);
		frame.add(mainPanel);
		
		mainPanel.add(firstResult);
		mainPanel.add(secondResult);
		mainPanel.add(thirdResult);
		
		
		firstResult.setSize(250, 75);
		firstResult.setBorder(blackBorder);
		firstResult.setBackground(purple);
		String movieResultOne = String.format("%s (%s)", results[0].getTitle(), results[0].getYear());
		firstLabel = new JLabel(movieResultOne);
		firstLabel.setBackground(Color.blue);
		firstLabel.setHorizontalAlignment(JLabel.CENTER);
		firstLabel.setVerticalAlignment(JLabel.CENTER);
		firstResult.add(firstLabel);
		firstResult.setVisible(true);
		
		secondResult.setSize(250, 75);
		secondResult.setBorder(blackBorder);
		secondResult.setBackground(purple);
		String movieResultTwo = String.format("%s (%s)", results[1].getTitle(), results[1].getYear());
		secondLabel = new JLabel(movieResultTwo);
		secondLabel.setHorizontalAlignment(JLabel.CENTER);
		secondLabel.setVerticalAlignment(JLabel.CENTER);
		secondResult.add(secondLabel);
		secondResult.setVisible(true);
		
		thirdResult.setSize(250, 75);
		thirdResult.setBorder(blackBorder);
		thirdResult.setBackground(purple);
		String movieResultThree = String.format("%s (%s)", results[2].getTitle(), results[2].getYear());
		thirdLabel = new JLabel(movieResultThree);
		thirdLabel.setHorizontalAlignment(JLabel.CENTER);
		thirdLabel.setVerticalAlignment(JLabel.CENTER);
		thirdResult.add(thirdLabel);
		thirdResult.setVisible(true);
	}
}
