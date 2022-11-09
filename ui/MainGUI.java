
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;


public class MainGUI {
    private JFrame frame;
    private JTextField searchText;
    private JPanel panel1;
    JPanel welcome;


    public MainGUI() {
        frame = new JFrame();
        searchPanel();
       // 
        welcome = new JPanel();
        welcome.setLayout(new GridBagLayout());
        welcome.setBounds(panel1.getX(), panel1.getY(), frame.HEIGHT, frame.WIDTH);
        frame.add(welcome);
        welcome.setBackground(new Color(69, 0, 132));
        JLabel welcomeLabel = new JLabel("JMU IMDB");
        welcomeLabel.setForeground(Color.white);
        welcomeLabel.setFont(new Font("Amazon Ember", Font.BOLD, 50));
        welcome.add(welcomeLabel); 
        display();
    }

    private void display() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setVisible(true);
    }
    
    
    private JPanel searchPanel() {
      panel1 = new JPanel();
      frame.add(panel1, BorderLayout.NORTH);
      JLabel label = new JLabel("Search");
      label.setFont(new Font("Sherif", Font.PLAIN, 17));
      searchText = new JTextField(20);
      searchText.setAction(searchAction);
      searchText.setColumns(22);
      JButton b = new JButton();
      b.setSize(20, 20);
      b.setAction(searchAction);
      Image icon = (new ImageIcon("mag.png")).getImage().getScaledInstance(b.getWidth(), b.getHeight(), Image.SCALE_SMOOTH);
      b.setIcon(new ImageIcon(icon));
      panel1.setVisible(true);
      panel1.setBackground(new Color(255, 243, 109));
      panel1.add(label).setVisible(true);
      panel1.add(searchText).setVisible(true);
      panel1.add(b).setVisible(true);
      return panel1;
    }

    Action searchAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
              welcome.setVisible(false);
                if (searchText != null) {
                    SearchBar.showSearchMovies(DataBase.SearchMovie(searchText.getText()), frame);
                }
            }
            catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }
    };
    
    public static void main(String[] args) throws IOException {
        MainGUI test = new MainGUI();
    }

}
