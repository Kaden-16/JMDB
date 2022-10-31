import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class MainGUI {
    private JFrame frame;

    public MainGUI() {
        frame = new JFrame("Visual Bookz");
    }

    private void display() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }

    
    public static void main(String[] args) throws IOException
    {
      
      SwingUtilities.invokeLater(new Runnable()
      {
        @Override
        public void run()
        {
          new MainGUI();
        }
      });
    }
}
