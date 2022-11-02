
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
      label.setFont(new Font("Sherif", Font.PLAIN, 17));
      JTextField searchText = new JTextField(20);
      searchText.setColumns(22);
      JButton b = new JButton();
      b.setSize(20, 20);
      b.addActionListener(this);
      Image icon = (new ImageIcon("mag.png")).getImage().getScaledInstance(b.getWidth(), b.getHeight(), Image.SCALE_SMOOTH);
      b.setIcon(new ImageIcon(icon));
      panel.setVisible(true);
      panel.setBackground(Color.red);
      panel.add(label).setVisible(true);
      panel.add(searchText).setVisible(true);
      panel.add(b).setVisible(true);
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
