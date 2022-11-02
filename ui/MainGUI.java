
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
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
    private JTextField searchText;
    private JPanel panel1;
    private JPanel panel2;


    public MainGUI() {
        frame = new JFrame("JMU IMDB");
        searchPanel();
        moviePanel();
        display();
    }

    private void display() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       // frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
    
    private JPanel searchPanel() {
      panel1 = new JPanel();
      frame.add(panel1, BorderLayout.NORTH);
      JLabel label = new JLabel("Search");
      label.setFont(new Font("Sherif", Font.PLAIN, 17));
      searchText = new JTextField(20);
      searchText.setColumns(22);
      JButton b = new JButton();
      b.setSize(20, 20);
      b.addActionListener(this);
      Image icon = (new ImageIcon("mag.png")).getImage().getScaledInstance(b.getWidth(), b.getHeight(), Image.SCALE_SMOOTH);
      b.setIcon(new ImageIcon(icon));
      panel1.setVisible(true);
      panel1.setBackground(Color.red);
      panel1.add(label).setVisible(true);
      panel1.add(searchText).setVisible(true);
      panel1.add(b).setVisible(true);
      return panel1;
    }
  
    private JPanel moviePanel() {
      panel2 = new JPanel();
      frame.add(panel2);
      panel2.setVisible(true);
      panel2.setBounds(panel1.getX(), panel1.getY(), frame.getWidth(), frame.getHeight());
      panel2.setBackground(Color.blue);
      return panel2;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        try
        {
          SearchBar.showSearchMovies(DataBase.SearchMovie(searchText.getText()), moviePanel());
        }
        catch (IOException e1)
        {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
      
    }
    
    public static void main(String[] args) throws IOException {
        MainGUI test = new MainGUI();
        test.display();
    }

}
