import java.io.BufferedReader;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class DataBase {

    public static Movie[] SearchMovie(String title) throws IOException {
        Movie[] movieList = new Movie[3];

        URL oracle = new URL(
                "https://imdb-api.com/en/API/SearchMovie/k_mcx0w8kk/" + title);

        InputStream in = oracle.openStream();

        ObjectMapper map = new ObjectMapper();

        JsonNode tree = map.readTree(in);
        for (int i = 0; i < tree.size(); i++) {
            if (i < 3) {
                // System.out.println(tree.get("results").get(i).get("description").asText());

                movieList[i] = new Movie(
                        tree.get("results").get(i).get("title").asText(),
                        tree.get("results").get(i).get("description").asText(),
                        tree.get("results").get(i).get("id").asText());
            } else {
                break;
            }
        }
        return movieList;
    }

    public static Movie SearchMovieByID(String id) throws IOException {
        URL oracle = new URL(
                "https://imdb-api.com/en/API/Title/k_mcx0w8kk/" + id);

        InputStream in = oracle.openStream();

        ObjectMapper map = new ObjectMapper();

        JsonNode tree = map.readTree(in);
        
        //System.out.println(tree.toPrettyString());

        String title = tree.get("title").asText();
        String ID = tree.get("id").asText();
        String director = tree.get("directors").asText();
        String year = tree.get("year").asText();
        String image = tree.get("image").asText();
        String contentRating = tree.get("contentRating").asText();
        String imDbRating = tree.get("imDbRating").asText();
        
        String[] actorList = new String[5];
        
        for (int i = 0; i < actorList.length; i++) {
            actorList[i] = tree.get("actorList").get(i).get("name").asText();
            System.out.println(actorList[i]);

        }
        
        Movie finalMovie = new Movie(title, director, ID, image, actorList,
                imDbRating, contentRating, year);

        return finalMovie;
    }
}
