import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class DropDownList {
    private static DefaultComboBoxModel<String> movieList = new DefaultComboBoxModel<>();
    private static JComboBox<String> movies = new JComboBox<>(movieList);

    public static JComboBox<String> dropDown() {
        return movies;
    }

    public static void add(String title) {
        movieList.addElement(title);
    }

    public static void remove(String title) {
        movieList.removeElement(title);
    }

}
