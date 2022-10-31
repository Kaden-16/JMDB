import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class MovieGUI {
    private JFrame frame;
    
    public MovieGUI() {
        // create frame fulll screen
        frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setLayout(new BorderLayout());
        // add search panel to top
        JPanel searchPanel = new JPanel();
        // remove later
        searchPanel.add(new JLabel("Search button and search bar here"));
        searchPanel.setBackground(Color.ORANGE);
        frame.add(searchPanel, BorderLayout.NORTH);
        // search results with scroll bar
        JPanel resultsPanel = new JPanel();
        // remove later
        resultsPanel.add(new JLabel("Search results pop up here"));
        resultsPanel.setBackground(Color.RED);
        frame.add(resultsPanel, BorderLayout.WEST);
        // display movie info
        JPanel moviePanel = new JPanel(new BorderLayout());
        moviePanel.add(new JLabel("Movie Tile (year)"), BorderLayout.NORTH);
        JPanel coverPanel = new JPanel();
        coverPanel.add(new JLabel("Photo of movie cover here"));
        coverPanel.setBackground(Color.GREEN);
       moviePanel.add(coverPanel, BorderLayout.WEST);
        
        moviePanel.setBackground(Color.GRAY);
        frame.add(moviePanel);
        display();
        
    }

    private void display() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MovieGUI();
            }
        });
    }

}
