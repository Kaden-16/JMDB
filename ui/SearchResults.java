import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.net.MalformedURLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SearchResults {

	
	public static JPanel showSearchResults(Movie[] results) {

		JPanel firstResult = new JPanel(new BorderLayout());
		JPanel secondResult = new JPanel(new BorderLayout());
		JPanel thirdResult= new JPanel(new BorderLayout());
		JPanel fourthResult= new JPanel(new BorderLayout());
		JPanel fifthResult= new JPanel(new BorderLayout());
		JPanel sixthResult= new JPanel(new BorderLayout());
		JPanel mainPanel = new JPanel(new GridLayout(3,2));
		
		
		JLabel firstLabel;
		JLabel secondLabel;
		JLabel thirdLabel;
		JLabel fourthLabel;
		JLabel fifthLabel;
		JLabel sixthLabel;
		Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
		
		Color purple = new Color(181,153,206);
		
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
		
		
		JButton button1 = new JButton("View " + results[0].getTitle());
		button1.setSize(50, 10);
		button1.setHorizontalAlignment(JButton.CENTER);
		firstResult.add(button1, BorderLayout.SOUTH);
		
		button1.addActionListener(e -> {
			try {
				MainGUI.changePanel(MovieDisplay.displayMovie(results[0]));
			} catch (MalformedURLException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		secondResult.setSize(250, 75);
		secondResult.setBorder(blackBorder);
		secondResult.setBackground(purple);
		String movieResultTwo = String.format("%s (%s)", results[1].getTitle(), results[1].getYear());
		secondLabel = new JLabel(movieResultTwo);
		secondLabel.setHorizontalAlignment(JLabel.CENTER);
		secondResult.add(secondLabel,BorderLayout.NORTH);
		secondResult.setVisible(true);
		
		JButton button2 = new JButton("View " + results[1].getTitle());
		button2.setSize(250, 75);
		button2.setHorizontalAlignment(JButton.CENTER);
		secondResult.add(button2, BorderLayout.SOUTH);
		
		button2.addActionListener(e -> {
			try {
				MainGUI.changePanel(MovieDisplay.displayMovie(results[1]));
			} catch (MalformedURLException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		thirdResult.setSize(250, 75);
		thirdResult.setBorder(blackBorder);
		thirdResult.setBackground(purple);
		String movieResultThree = String.format("%s (%s)", results[2].getTitle(), results[2].getYear());
		thirdLabel = new JLabel(movieResultThree);
		thirdLabel.setHorizontalAlignment(JLabel.CENTER);
		thirdResult.add(thirdLabel,BorderLayout.NORTH);
		thirdResult.setVisible(true);
		
		JButton button3 = new JButton("View " + results[2].getTitle());
		button3.setSize(250, 75);
		button3.setHorizontalAlignment(JButton.CENTER);
		thirdResult.add(button3, BorderLayout.SOUTH);
		
		button3.addActionListener(e -> {
			try {
				MainGUI.changePanel(MovieDisplay.displayMovie(results[2]));
			} catch (MalformedURLException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		fourthResult.setSize(250, 75);
		fourthResult.setBorder(blackBorder);
		fourthResult.setBackground(purple);
		String movieResultFour = String.format("%s (%s)", results[3].getTitle(), results[3].getYear());
		fourthLabel = new JLabel(movieResultFour);
		fourthLabel.setHorizontalAlignment(JLabel.CENTER);
		fourthResult.add(fourthLabel,BorderLayout.NORTH);
		fourthResult.setVisible(true);
		
		JButton button4 = new JButton("View " + results[3].getTitle());
		button4.setSize(250, 75);
		button4.setHorizontalAlignment(JButton.CENTER);
		fourthResult.add(button4, BorderLayout.SOUTH);
		
		button4.addActionListener(e -> {
			try {
				MainGUI.changePanel(MovieDisplay.displayMovie(results[3]));
			} catch (MalformedURLException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		fifthResult.setSize(250, 75);
		fifthResult.setBorder(blackBorder);
		fifthResult.setBackground(purple);
		String movieResultFive = String.format("%s (%s)", results[4].getTitle(), results[4].getYear());
		fifthLabel = new JLabel(movieResultFive);
		fifthLabel.setHorizontalAlignment(JLabel.CENTER);
		fifthResult.add(fifthLabel,BorderLayout.NORTH);
		fifthResult.setVisible(true);
		
		JButton button5 = new JButton("View " + results[4].getTitle());
		button5.setSize(250, 75);
		button5.setHorizontalAlignment(JButton.CENTER);
		fifthResult.add(button5, BorderLayout.SOUTH);
		
		button5.addActionListener(e -> {
			try {
				MainGUI.changePanel(MovieDisplay.displayMovie(results[4]));
			} catch (MalformedURLException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		sixthResult.setSize(250, 75);
		sixthResult.setBorder(blackBorder);
		sixthResult.setBackground(purple);
		String movieResultSix = String.format("%s (%s)", results[5].getTitle(), results[5].getYear());
		sixthLabel = new JLabel(movieResultSix);
		sixthLabel.setHorizontalAlignment(JLabel.CENTER);
		sixthResult.add(sixthLabel,BorderLayout.NORTH);
		sixthResult.setVisible(true);
		
		JButton button6 = new JButton("View " + results[5].getTitle());
		button6.setSize(250, 75);
		button6.setHorizontalAlignment(JButton.CENTER);
		sixthResult.add(button6, BorderLayout.SOUTH);
		
		button6.addActionListener(e -> {
			try {
				MainGUI.changePanel(MovieDisplay.displayMovie(results[5]));
			} catch (MalformedURLException ex) {
				throw new RuntimeException(ex);
			}
		});

		return mainPanel;
	}
}
