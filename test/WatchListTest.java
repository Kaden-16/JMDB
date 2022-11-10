import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WatchListTest {
 public static void main(String[] args) {
     // making frame to test button and drop down list
    JFrame frame = new JFrame();
    frame.setLayout(new BorderLayout());
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setSize(screenSize.width, screenSize.height);
    frame.setBackground(Color.GRAY);
    JPanel top = new JPanel();
    top.setBackground(Color.GREEN);
    frame.add(top, BorderLayout.NORTH);
    
    JPanel bottom = new JPanel();
    bottom.setBackground(Color.CYAN);
    frame.add(bottom, BorderLayout.SOUTH);
    frame.add(bottom);
    // add buttons to frame
    EditWatchList edit1 = new EditWatchList("Star Wars");
    bottom.add(edit1.getButton());
    EditWatchList edit2= new EditWatchList("Harry Potter");
    bottom.add(edit2.getButton());
    EditWatchList edit3 = new EditWatchList("Spider Man");
    bottom.add(edit3.getButton());
    
    // add watch list to top
    top.add(new JLabel("Watch List"));
    JComboBox wl = DropDownList.dropDown();
    top.add(wl);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Watch List Drop Down");
    frame.setVisible(true);
}
}
