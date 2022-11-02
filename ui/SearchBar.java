import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SearchBar{


	public  static JPanel firstResult = new JPanel(new GridLayout(2,2));
	public  static JPanel secondResult = new JPanel();
	public  static JPanel thirdResult= new JPanel();
	
	public static JLabel firstLabel;
	public static JLabel secondLabel;
	public static JLabel thirdLabel;
	public static Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
	
	public static void showSearchMovies(Movie[] results, JFrame frame) {
		frame.add(firstResult);
		frame.add(secondResult);
		frame.add(thirdResult);
		
		firstResult.setBounds(500, 50, 250, 75);
		firstResult.setBorder(blackBorder);
		firstResult.setBackground(Color.LIGHT_GRAY);
		String movieResultOne = String.format("%s (%s)", results[0].getTitle(), results[0].getYear());
		firstLabel = new JLabel(movieResultOne);
		firstLabel.setBackground(Color.blue);
		firstLabel.setHorizontalAlignment(JLabel.CENTER);
		firstLabel.setVerticalAlignment(JLabel.CENTER);
		firstResult.add(firstLabel);
		firstResult.setVisible(true);
		
		secondResult.setBounds(500, 150, 250, 75);
		secondResult.setBorder(blackBorder);
		secondResult.setBackground(Color.LIGHT_GRAY);
		String movieResultTwo = String.format("%s (%s)", results[1].getTitle(), results[1].getYear());
		secondLabel = new JLabel(movieResultTwo);
		secondLabel.setHorizontalAlignment(JLabel.CENTER);
		secondLabel.setVerticalAlignment(JLabel.CENTER);
		secondResult.add(secondLabel);
		secondResult.setVisible(true);
		
		thirdResult.setBounds(500, 250, 250, 75);
		thirdResult.setBorder(blackBorder);
		thirdResult.setBackground(Color.LIGHT_GRAY);
		String movieResultThree = String.format("%s (%s)", results[2].getTitle(), results[2].getYear());
		thirdLabel = new JLabel(movieResultThree);
		thirdLabel.setHorizontalAlignment(JLabel.CENTER);
		thirdLabel.setVerticalAlignment(JLabel.CENTER);
		thirdResult.add(thirdLabel);
		thirdResult.setVisible(true);
	}
}
