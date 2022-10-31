import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.swing.JFrame;


public class SearchBarTest {
	
	private JFrame frame;

    public SearchBarTest() {
        frame = new JFrame("Visual Bookz");
    }

    private void display() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
    	Movie[] test = new Movie[3];
    	Movie fake1 = new Movie("Inception", 1999);
    	Movie fake2 = new Movie("Pulp Fiction", 2003);
    	Movie fake3 = new Movie("Harry Potter", 3000);
    	test[0] = fake1;
    	test[1] = fake2;
    	test[2] = fake3;
    	
    	SearchBar.showSearchMovies(test);
    	SearchBarTest gui = new SearchBarTest();
		gui.display();
	}
    
}
