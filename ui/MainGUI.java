
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainGUI implements ActionListener {
    private JFrame frame;


    public MainGUI() {
        frame = new JFrame("JMU IMDB");
        searchPanel();
        display();
    }

    private void display() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
    
    private JPanel searchPanel() {
      JPanel panel = new JPanel();
      frame.add(panel, BorderLayout.NORTH);
      JLabel label = new JLabel("Search");
      JTextField searchText = new JTextField();
      ImageIcon icon = new ImageIcon("mag.png");
      JButton button = new JButton(icon);
      panel.setVisible(true);
      label.setSize(10, 100);
      searchText.setSize(50, 100);
      button.setSize(10, 10);
      panel.add(label).setVisible(true);
      panel.add(searchText).setVisible(true);
      panel.add(button).setVisible(true);
      return panel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
      // TODO Auto-generated method stub
      
    }
    
    public static void main(String[] args) throws IOException {
        MainGUI test = new MainGUI();
        test.display();
    }

}
