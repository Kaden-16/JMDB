import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class MovieDisplay {

    public static JPanel displayMovie(Movie movie) throws MalformedURLException {
        FlowLayout layout = new FlowLayout();
        layout.setHgap(40);

        JPanel contentPane = new JPanel(layout);

        contentPane.setBorder(new EmptyBorder(50, 200, 50, 200));
        contentPane.setBackground(new Color(181,153,206));

        JPanel posterPanel = new JPanel();
        posterPanel.setOpaque(false);
        contentPane.add(posterPanel);

        JLabel poster = new JLabel();
        URL posterLink = new URL(movie.getPoster());
        ImageIcon posterImage = new ImageIcon(posterLink);
        poster.setIcon(new ImageIcon(posterImage.getImage().getScaledInstance((int) (posterImage.getIconWidth() * 0.5), (int) (posterImage.getIconHeight() * 0.5), Image.SCALE_SMOOTH)));
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

        JLabel yearLabel = new JLabel(String.valueOf(movie.getYear()));
        yearLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        infoPanel.add(yearLabel);
        yearLabel.setOpaque(false);

        JTextArea paragraph = new JTextArea();
        //paragraph.setBackground(new Color(192, 192, 192));
        paragraph.setAlignmentX(Component.LEFT_ALIGNMENT);
        paragraph.setEditable(false);
        paragraph.setWrapStyleWord(true);
        paragraph.setLineWrap(true);
        paragraph.setText(movie.getPlot());
        paragraph.setFont(new Font("Arial", Font.PLAIN, 18));
        paragraph.setOpaque(false);
        paragraph.setColumns(40);
        infoPanel.add(paragraph);


        return contentPane;
    }
}
