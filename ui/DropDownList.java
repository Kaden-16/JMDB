import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class DropDownList {
    private static DefaultComboBoxModel<Movie> movieList = new DefaultComboBoxModel<>();
    private static JComboBox<Movie> movies = new JComboBox<>(movieList);

    public static JComboBox<Movie> dropDown() {
        movies.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Movie movie = (Movie) movies.getSelectedItem();
                try {
                    MainGUI.changePanel(MovieDisplay.displayMovie(movie));
                } catch (MalformedURLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                
                
            }
        });
        return movies;
    }
    public static DefaultComboBoxModel<Movie> movieList() {
        return movieList;
    }

    public static void add(Movie title) {
        movieList.addElement(title);
    }

    public static void remove(Movie title) {
        movieList.removeElement(title);
    }

}
