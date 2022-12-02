import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ActorSearchResults {

	
	public static JPanel showActorSearchResults(Actor[] results) throws MalformedURLException {
		MainGUI.backButton.setVisible(false);
		JPanel firstResult = new JPanel(new BorderLayout());
		JPanel secondResult = new JPanel(new BorderLayout());
		JPanel thirdResult= new JPanel(new BorderLayout());
		JPanel fourthResult= new JPanel(new BorderLayout());
		//JPanel fifthResult= new JPanel(new BorderLayout());
		//JPanel sixthResult= new JPanel(new BorderLayout());
		JPanel mainPanel = new JPanel(new GridLayout(2,2));
		
		
		JLabel firstLabel;
		JLabel secondLabel;
		JLabel thirdLabel;
		JLabel fourthLabel;
		//JLabel fifthLabel;
		//JLabel sixthLabel;
		Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
		
		Color purple = new Color(181,153,206);
		
		mainPanel.add(firstResult);
		mainPanel.add(secondResult);
		mainPanel.add(thirdResult);
		mainPanel.add(fourthResult);
		//mainPanel.add(fifthResult);
		//mainPanel.add(sixthResult);
		
		
		firstResult.setSize(250, 75);
		firstResult.setBorder(blackBorder);
		firstResult.setBackground(purple);
		String actorResultOne = String.format("%s", results[0].getName());
		firstLabel = new JLabel(actorResultOne);
		firstLabel.setBackground(Color.blue);
		firstLabel.setHorizontalAlignment(JLabel.CENTER);
		firstResult.add(firstLabel,BorderLayout.NORTH);
		firstResult.setVisible(true);
		
		
		JButton button1 = new JButton("View " + results[0].getName());
		button1.setSize(50, 10);
		button1.setHorizontalAlignment(JButton.CENTER);
		firstResult.add(button1, BorderLayout.SOUTH);
		
		button1.addActionListener(e -> {
			//try {
				//MainGUI.changePanel(MovieDisplay.displayMovie(DataBase.SearchMovieByID(results[0].getID())));
			//} catch (IOException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			//}
		});
		
		secondResult.setSize(250, 75);
		secondResult.setBorder(blackBorder);
		secondResult.setBackground(purple);
		String actorResultTwo = String.format("%s", results[1].getName());
		secondLabel = new JLabel(actorResultTwo);
		secondLabel.setBackground(Color.blue);
		secondLabel.setHorizontalAlignment(JLabel.CENTER);
		secondResult.add(secondLabel,BorderLayout.NORTH);
		secondResult.setVisible(true);
		
		
		JButton button2 = new JButton("View " + results[1].getName());
		button2.setSize(50, 10);
		button2.setHorizontalAlignment(JButton.CENTER);
		secondResult.add(button2, BorderLayout.SOUTH);
		
		button2.addActionListener(e -> {
			//try {
				//MainGUI.changePanel(MovieDisplay.displayMovie(DataBase.SearchMovieByID(results[1].getID())));
			//} catch (IOException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			//}
		});
		
		thirdResult.setSize(250, 75);
		thirdResult.setBorder(blackBorder);
		thirdResult.setBackground(purple);
		String actorResultThree = String.format("%s", results[2].getName());
		thirdLabel = new JLabel(actorResultThree);
		thirdLabel.setBackground(Color.blue);
		thirdLabel.setHorizontalAlignment(JLabel.CENTER);
		thirdResult.add(thirdLabel,BorderLayout.NORTH);
		thirdResult.setVisible(true);
		
		
		JButton button3 = new JButton("View " + results[2].getName());
		button3.setSize(50, 10);
		button3.setHorizontalAlignment(JButton.CENTER);
		thirdResult.add(button3, BorderLayout.SOUTH);
		
		button3.addActionListener(e -> {
			//try {
				//MainGUI.changePanel(MovieDisplay.displayMovie(DataBase.SearchMovieByID(results[2].getID())));
			//} catch (IOException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			//}
		});
		
		fourthResult.setSize(250, 75);
		fourthResult.setBorder(blackBorder);
		fourthResult.setBackground(purple);
		String actorResultFour = String.format("%s", results[3].getName());
		fourthLabel = new JLabel(actorResultFour);
		fourthLabel.setBackground(Color.blue);
		fourthLabel.setHorizontalAlignment(JLabel.CENTER);
		fourthResult.add(fourthLabel,BorderLayout.NORTH);
		fourthResult.setVisible(true);
		
		
		JButton button4 = new JButton("View " + results[3].getName());
		button4.setSize(50, 10);
		button4.setHorizontalAlignment(JButton.CENTER);
		fourthResult.add(button4, BorderLayout.SOUTH);
		
		button4.addActionListener(e -> {
			//try {
				//MainGUI.changePanel(MovieDisplay.displayMovie(DataBase.SearchMovieByID(results[3].getID())));
			//} catch (IOException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			//}
		});
		
		/*
		 * fifthResult.setSize(250, 75); fifthResult.setBorder(blackBorder);
		 * fifthResult.setBackground(purple); String actorResultFive =
		 * String.format("%s", results[0].getName()); fifthLabel = new
		 * JLabel(actorResultFive); fifthLabel.setBackground(Color.blue);
		 * fifthLabel.setHorizontalAlignment(JLabel.CENTER);
		 * fifthResult.add(fifthLabel,BorderLayout.NORTH); fifthResult.setVisible(true);
		 * 
		 * 
		 * JButton button5 = new JButton("View " + results[0].getName());
		 * button5.setSize(50, 10); button5.setHorizontalAlignment(JButton.CENTER);
		 * fifthResult.add(button5, BorderLayout.SOUTH);
		 * 
		 * button5.addActionListener(e -> { //try {
		 * //MainGUI.changePanel(MovieDisplay.displayMovie(DataBase.SearchMovieByID(
		 * results[4].getID()))); //} catch (IOException e1) { // TODO Auto-generated
		 * catch block //e1.printStackTrace(); //} });
		 * 
		 * sixthResult.setSize(250, 75); sixthResult.setBorder(blackBorder);
		 * sixthResult.setBackground(purple); String actorResultSix =
		 * String.format("%s", results[0].getName()); sixthLabel = new
		 * JLabel(actorResultSix); sixthLabel.setBackground(Color.blue);
		 * sixthLabel.setHorizontalAlignment(JLabel.CENTER);
		 * sixthResult.add(sixthLabel,BorderLayout.NORTH); sixthResult.setVisible(true);
		 * 
		 * 
		 * JButton button6 = new JButton("View " + results[0].getName());
		 * button6.setSize(50, 10); button6.setHorizontalAlignment(JButton.CENTER);
		 * sixthResult.add(button6, BorderLayout.SOUTH);
		 * 
		 * button6.addActionListener(e -> { //try {
		 * //MainGUI.changePanel(MovieDisplay.displayMovie(DataBase.SearchMovieByID(
		 * results[4].getID()))); //} catch (IOException e1) { // TODO Auto-generated
		 * catch block //e1.printStackTrace(); //} });
		 */

		return mainPanel;
	}
}