import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class DropDownList {
    private static DefaultComboBoxModel<Movie> movieList = new DefaultComboBoxModel<>();
    private static JComboBox<Movie> movies = new JComboBox<>(movieList);

    public static JComboBox<Movie> dropDown() {
        // add if nothing in list

        movies.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (movies.getSelectedItem() != null) {
                    Movie movie = (Movie) movies.getSelectedItem();
                    try {
                        MainGUI.changePanel(MovieDisplay.displayMovie(movie));
                    } catch (MalformedURLException e1) {

                    }
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
