
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.*;


public class MainGUI {
    public static JFrame frame;
    public static Dimension screenSize;
    private static JPanel currentPanel;
    private JTextField searchText;
    private JPanel searchBar;
    public static JButton backButton = new JButton("Previous Screen");



    public MainGUI() {
        frame = new JFrame();
        frame.add(searchPanel(), BorderLayout.NORTH);
        currentPanel = welcomePage();
        frame.add(currentPanel);
        display();
    }

    public static void changePanel(JPanel displayMovie) {
        frame.remove(currentPanel);
        currentPanel = displayMovie;
        frame.add(currentPanel);
        frame.revalidate();
        frame.repaint();
    }

    private void display() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setVisible(true);
    }
    
    
    private JPanel searchPanel() {
      searchBar = new JPanel();
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
      searchBar.setVisible(true);
      searchBar.setBackground(new Color(203, 182, 119));
      searchBar.add(label).setVisible(true);
      searchBar.add(searchText).setVisible(true);
      searchBar.add(b).setVisible(true);
      
      searchBar.add(new JLabel("Watch List"));
      JComboBox wl = DropDownList.dropDown();
      searchBar.add(wl);
      backButton.setVisible(false);
      backButton.setSize(50, 50);
      searchBar.add(backButton);
      backButton.setAction(backAction);
      return searchBar;
    }

    private JPanel welcomePage() {
        JLabel welcomeLabel = new JLabel("JMU IMDB");
        welcomeLabel.setForeground(Color.white);
        welcomeLabel.setFont(new Font("Amazon Ember", Font.BOLD, 50));

        JPanel welcome = new JPanel();
        welcome.setLayout(new GridBagLayout());
        welcome.setBounds(searchBar.getX(), searchBar.getY(), frame.WIDTH, frame.HEIGHT);
        welcome.setBackground(new Color(69, 0, 132));
        welcome.add(welcomeLabel);
        welcome.setName("WELCOME_PAGE");

        return welcome;
    }
    JPanel temp; 
    Action searchAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new DataBaseWorker().execute();
        }
    };
    Action backAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	changePanel(temp);
        	MainGUI.backButton.setVisible(false);
        }
    };
    
    public static void main(String[] args) {
        new MainGUI();
    }

    class DataBaseWorker extends SwingWorker<Boolean, Integer>
    {
        Movie[] movies;
        protected Boolean doInBackground() throws Exception
        {
            // Do a time-consuming task.
            movies = DataBase.SearchMovie(searchText.getText());
            return true;

        }

        protected void done()
        {
            try
            {
                changePanel(SearchResults.showSearchResults(movies));
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

