import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SearchBar {


	public  static JPanel firstResult = new JPanel();
	public  static JPanel secondResult = new JPanel();
	public  static JPanel thirdResult= new JPanel();
	
	public static JLabel firstLabel;
	public static JLabel secondLabel;
	public static JLabel thirdLabel;
	public static Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
	
	public static void showSearchMovies(Movie[] results) {
		
		firstResult.setBounds(200, 200, 150, 50);
		firstResult.setBorder(blackBorder);
		firstResult.setBackground(Color.LIGHT_GRAY);
		String movieResultOne = String.format("%s (%s)", results[0].getTitle(), results[0].getYear());
		firstLabel = new JLabel(movieResultOne);
		firstLabel.setBackground(Color.blue);
		firstResult.add(firstLabel);
		firstResult.setVisible(true);
		
		secondResult.setBounds(200, 250, 150, 45);
		secondResult.setBorder(blackBorder);
		secondResult.setBackground(Color.LIGHT_GRAY);
		String movieResultTwo = String.format("%s (%s)", results[1].getTitle(), results[1].getYear());
		secondLabel = new JLabel(movieResultTwo);
		secondResult.add(secondLabel);
		secondResult.setVisible(true);
		
		thirdResult.setBounds(200, 300, 150, 45);
		thirdResult.setBorder(blackBorder);
		thirdResult.setBackground(Color.LIGHT_GRAY);
		String movieResultThree = String.format("%s (%s)", results[2].getTitle(), results[2].getYear());
		thirdLabel = new JLabel(movieResultThree);
		thirdResult.add(thirdLabel);
		thirdResult.setVisible(true);
	}
}
