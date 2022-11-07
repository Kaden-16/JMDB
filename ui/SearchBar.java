import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SearchBar{

	
	public static void showSearchMovies(Movie[] results, JFrame frame) {
		JPanel firstResult = new JPanel(new BorderLayout());
		JPanel secondResult = new JPanel();
		JPanel thirdResult= new JPanel();
		JPanel fourthResult= new JPanel();
		JPanel fifthResult= new JPanel();
		JPanel sixthResult= new JPanel();
		JPanel mainPanel = new JPanel(new GridLayout(3,2));
		
		JLabel firstLabel;
		JLabel secondLabel;
		JLabel thirdLabel;
		JLabel fourthLabel;
		JLabel fifthLabel;
		JLabel sixthLabel;
		Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
		
		Color purple = new Color(181,153,206);
		frame.add(mainPanel);
		
		mainPanel.add(firstResult);
		mainPanel.add(secondResult);
		mainPanel.add(thirdResult);
		mainPanel.add(fourthResult);
		mainPanel.add(fifthResult);
		mainPanel.add(sixthResult);
		
		
		firstResult.setSize(250, 75);
		firstResult.setBorder(blackBorder);
		firstResult.setBackground(purple);
		String movieResultOne = String.format("%s (%s)", results[0].getTitle(), results[0].getYear());
		firstLabel = new JLabel(movieResultOne);
		firstLabel.setBackground(Color.blue);
		firstLabel.setHorizontalAlignment(JLabel.CENTER);
		firstResult.add(firstLabel,BorderLayout.NORTH);
		firstResult.setVisible(true);
		
		JButton button1 = new JButton("View Movie");
		button1.setSize(250, 75);
		button1.setHorizontalAlignment(JButton.CENTER);
		firstResult.add(button1, BorderLayout.SOUTH);
		
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
		
		fourthResult.setSize(250, 75);
		fourthResult.setBorder(blackBorder);
		fourthResult.setBackground(purple);
		String movieResultFour = String.format("%s (%s)", results[3].getTitle(), results[3].getYear());
		fourthLabel = new JLabel(movieResultFour);
		fourthLabel.setHorizontalAlignment(JLabel.CENTER);
		fourthLabel.setVerticalAlignment(JLabel.CENTER);
		fourthResult.add(fourthLabel);
		fourthResult.setVisible(true);
		
		fifthResult.setSize(250, 75);
		fifthResult.setBorder(blackBorder);
		fifthResult.setBackground(purple);
		String movieResultFive = String.format("%s (%s)", results[4].getTitle(), results[4].getYear());
		fifthLabel = new JLabel(movieResultFive);
		fifthLabel.setHorizontalAlignment(JLabel.CENTER);
		fifthLabel.setVerticalAlignment(JLabel.CENTER);
		fifthResult.add(fifthLabel);
		fifthResult.setVisible(true);
		
		sixthResult.setSize(250, 75);
		sixthResult.setBorder(blackBorder);
		sixthResult.setBackground(purple);
		String movieResultSix = String.format("%s (%s)", results[5].getTitle(), results[5].getYear());
		sixthLabel = new JLabel(movieResultSix);
		sixthLabel.setHorizontalAlignment(JLabel.CENTER);
		sixthLabel.setVerticalAlignment(JLabel.CENTER);
		sixthResult.add(sixthLabel);
		sixthResult.setVisible(true);
	}
}
