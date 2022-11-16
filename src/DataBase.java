import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * DataBase class Accesses the IMDB database with specific inputs given by the
 * user
 * 
 * @author Walker
 *
 */
public class DataBase {

    /**
     * Looks up a list of the top 3 movies based on the title given in the
     * search bar
     * 
     * @param title
     * @return the top 3 movies
     * @throws IOException
     */
    public static Movie[] SearchMovie(String title) throws IOException {
        Movie[] movieList = new Movie[10];

        if (title.contains(" ")) {
            title = title.replace(" ", "%20");
        }

        URL oracle = new URL(
                "https://imdb-api.com/en/API/SearchMovie/k_mcx0w8kk/" + title);

        InputStream in = oracle.openStream();

        ObjectMapper map = new ObjectMapper();

        JsonNode tree = map.readTree(in);

        for (int i = 0; i < 6; i++) {
            // System.out.println(tree.get("results").get(i).get("description").asText());
            try {
                movieList[i] = SearchMovieByID(
                        tree.get("results").get(i).get("id").asText());
            } catch (NullPointerException e) {
                i--;
            }

        }
        return movieList;
    }

    /**
     * Search up a specific movie by the given ID
     * 
     * @param id
     * @return The movies information
     * @throws IOException
     */
    public static Movie SearchMovieByID(String id) throws IOException {
        URL oracle = new URL(
                "https://imdb-api.com/en/API/Title/k_mcx0w8kk/" + id);

        InputStream in = oracle.openStream();

        ObjectMapper map = new ObjectMapper();

        JsonNode tree = map.readTree(in);

        String title = tree.get("title").asText();
        String ID = tree.get("id").asText();
        String director = tree.get("directors").asText();
        String year = tree.get("year").asText();
        String image = tree.get("image").asText();
        String contentRating = tree.get("contentRating").asText();
        String imDbRating = tree.get("imDbRating").asText();
        String plot = tree.get("plot").asText();

        Actor[] actorList = new Actor[5];

//        for (int i = 0; i < 1; i++) {
//
//            String name = tree.get("actorList").get(i).get("name").asText();
//            String id1 = tree.get("actorList").get(i).get("id").asText();
//            String image1 = tree.get("actorList").get(i).get("image").asText();
//            String charecter = tree.get("actorList").get(i).get(
//                    "asCharacter").asText();
//            actorList[i] = new Actor(name, id1, image1, charecter);
//            
//            System.out.println(actorList[0].getName());
//
//            // System.out.println(actorList[i]);
//        }

        Movie finalMovie = new Movie(title, director, ID, image, actorList,
                imDbRating, contentRating, year, plot);

        return finalMovie;
    }

    /**
     * Returns the top 3 Actor Results for a given actor search
     * 
     * @param name
     * @return the list of actors
     * @throws IOException
     */
    public static Actor[] SearchActor(String name) throws IOException {
        Actor[] actorList = new Actor[3];

        URL oracle = new URL(
                "https://imdb-api.com/en/API/SearchName/k_mcx0w8kk/" + name);

        InputStream in = oracle.openStream();

        ObjectMapper map = new ObjectMapper();

        JsonNode tree = map.readTree(in);

        for (int i = 0; i < tree.size(); i++) {
            if (i < 3) {
                // System.out.println(tree.get("results").get(i).get("description").asText());
                // Suggested Actors
                actorList[i] = new Actor(
                        tree.get("results").get(i).get("title").asText(),
                        tree.get("results").get(i).get("id").asText(),
                        tree.get("results").get(i).get("image").asText(),
                        tree.get("results").get(i).get("description").asText());
            } else {
                break;
            }
        }
        return actorList;
    }

//    public static Actor SearchActorByID(String id) throws IOException {
//        Actor actor = null;
//        URL oracle = new URL(
//                "https://imdb-api.com/en/API/SearchName/k_mcx0w8kk/" + id);
//
//        InputStream in = oracle.openStream();
//
//        ObjectMapper map = new ObjectMapper();
//
//        JsonNode tree = map.readTree(in);
//
//        // System.out.println(tree.get("results").get(i).get("description").asText());
//        // Suggested Actors
//        actor = new Actor(tree.get("results").get("title").asText(),
//                tree.get("results").get("id").asText(),
//                tree.get("results").get("image").asText(),
//                tree.get("results").get("description").asText());
//
//        return actor;
//    }

//    public static JPanel MediaPlayer(String id) {
//        JPanel panel = new JPanel();
//        // file you want to play
//        URL mediaURL = new URL(
//                "https://imdb-api.com/en/API/Trailer/k_mcx0w8kk/" + id);
//        // create the media player with the media url
//        VideoPlayer mediaPlayer = Manager.createRealizedPlayer(mediaURL);
//        // get components for video and playback controls
//        Component video = mediaPlayer.getVisualComponent();
//        Component controls = mediaPlayer.getControlPanelComponent();
//        panel.add(video, BorderLayout.CENTER);
//        panel.add(controls, BorderLayout.SOUTH);
//    }

}
