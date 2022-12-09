import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class MovieDisplay {

    private static final double imageScale = 0.5;

    public static JPanel displayMovie(Movie movie) throws MalformedURLException {
        FlowLayout layout = new FlowLayout();
        layout.setHgap(40);
        MainGUI.invis.setVisible(false);
        MainGUI.backButton.setVisible(true);
        JPanel contentPane = new JPanel(layout);

        contentPane.setBorder(new EmptyBorder(50, 200, 50, 200));
        contentPane.setBackground(new Color(181,153,206));

        JPanel posterPanel = new JPanel();
        posterPanel.setOpaque(false);
        contentPane.add(posterPanel);

        JLabel poster = new JLabel();
        URL posterLink = new URL(movie.getPoster());
        ImageIcon posterImage = new ImageIcon(posterLink);
        poster.setIcon(new ImageIcon(normalizeImage(posterImage)));
        poster.setHorizontalAlignment(SwingConstants.TRAILING);
        posterPanel.add(poster);

        JPanel infoPanel = new JPanel();
        infoPanel.setOpaque(false);
        contentPane.add(infoPanel);
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel(movie.getTitle());
        titleLabel.setFont(new Font("Arial", Font.BOLD, 32));
        infoPanel.add(titleLabel);
        titleLabel.setOpaque(false);

        JLabel yearLabel = new JLabel("Release Date: " + String.valueOf(movie.getYear()));
        yearLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        infoPanel.add(yearLabel);
        yearLabel.setOpaque(false);
       
        JLabel Directors = new JLabel("Director: " + String.valueOf(movie.getDirector()));
        Directors.setFont(new Font("Arial", Font.PLAIN, 20));
        infoPanel.add(Directors);
        Directors.setOpaque(false);
        
        JLabel runTime = new JLabel("Run Time: " + String.valueOf(movie.getRunTime()));
        runTime.setFont(new Font("Arial", Font.PLAIN, 20));
        infoPanel.add(runTime);
        runTime.setOpaque(false);
        
        JLabel languages = new JLabel("Languages: " + String.valueOf(movie.getLanguages()));
        languages.setFont(new Font("Arial", Font.PLAIN, 20));
        infoPanel.add(languages);
        languages.setOpaque(false);
        
        JTextArea paragraph = new JTextArea();
        //paragraph.setBackground(new Color(192, 192, 192));
        paragraph.setAlignmentX(Component.LEFT_ALIGNMENT);
        paragraph.setEditable(false);
        paragraph.setWrapStyleWord(true);
        paragraph.setLineWrap(true);
        paragraph.setText("\n" + movie.getPlot() + "\n");
        paragraph.setFont(new Font("Arial", Font.PLAIN, 20));
        paragraph.setOpaque(false);
        paragraph.setColumns(30);
        infoPanel.add(paragraph);
        
        JTextArea actorListLabel = new JTextArea();
        //paragraph.setBackground(new Color(192, 192, 192));
        actorListLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        actorListLabel.setEditable(false);
        actorListLabel.setWrapStyleWord(true);
        actorListLabel.setLineWrap(true);
        Actor[] actorlist = movie.getActorList();
        actorListLabel.setText("Stars: \n" 
              + "    1) " + String.valueOf(actorlist[0].getName()) + " (" + actorlist[0].getCharecter() + ")" + "\n" 
              + "    2) " + String.valueOf(actorlist[1].getName()) + " (" + actorlist[1].getCharecter() + ")" +"\n"
              + "    3) " + String.valueOf(actorlist[2].getName()) + " (" + actorlist[2].getCharecter() + ")" + "\n"
              + "    4) " + String.valueOf(actorlist[3].getName()) + " (" + actorlist[3].getCharecter() + ")\n");
        actorListLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        actorListLabel.setOpaque(false);
        actorListLabel.setColumns(30);
        infoPanel.add(actorListLabel);
        

        
        JLabel ratingLabel = new JLabel("Content Rating: " + String.valueOf(movie.getMovieRating()));
        ratingLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        infoPanel.add(ratingLabel);
        ratingLabel.setOpaque(false);
        
        JLabel imdbRating = new JLabel("IMDB Rating: " + String.valueOf(movie.getIMDBRating()) + "/10.0");
        imdbRating.setFont(new Font("Arial", Font.PLAIN, 20));
        infoPanel.add(imdbRating);
        imdbRating.setOpaque(false);
        
        JLabel genres = new JLabel("Genres: " + String.valueOf(movie.getGenres()));
        genres.setFont(new Font("Arial", Font.PLAIN, 20));
        infoPanel.add(genres);
        genres.setOpaque(false);
        
        JLabel countries = new JLabel("Countries: " + String.valueOf(movie.getCountries()));
        countries.setFont(new Font("Arial", Font.PLAIN, 20));
        infoPanel.add(countries);
        countries.setOpaque(false);
        
        JLabel awards = new JLabel("Awards: " + String.valueOf(movie.getAwards()));
        awards.setFont(new Font("Arial", Font.PLAIN, 20));
        infoPanel.add(awards);
        awards.setOpaque(false);
        
        EditWatchList button = new EditWatchList(movie);
        button.setBorder(new EmptyBorder(20,0,0,0));
        infoPanel.add(button.getButton());


        return contentPane;
    }

    private static Image normalizeImage(ImageIcon image) {

        Dimension dimensions = MainGUI.screenSize;
        double idealHeight = dimensions.height * imageScale;
        double idealWidth = (idealHeight / image.getIconHeight()) * image.getIconWidth();
        System.out.println(dimensions);
        System.out.println(idealWidth + " " + idealHeight);

        return image.getImage().getScaledInstance((int) idealWidth, (int) idealHeight, Image.SCALE_SMOOTH);
    }
}
