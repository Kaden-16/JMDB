import java.io.BufferedReader;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class DataBase {

    public static Movie[] SearchMovie(String title) throws IOException {
        Movie[] movieList = new Movie[3];

        URL oracle = new URL(
                "https://imdb-api.com/en/API/SearchMovie/k_mcx0w8kk/" + title);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        ObjectMapper map = new ObjectMapper();
        JsonNode tree = map.readTree(in);

        for (int i = 0; i < tree.size(); i++) {
            if (tree.get(i).get("title").asText() != null) {
                movieList[i] = new Movie(tree.get(i).get("title").asText(),
                        tree.get(i).get("description").asText());
                System.out.println(movieList[i]);
            } else {
                break;
            }
        }
        return movieList;
    }

    public void SearchMovieByTitle(String title) throws IOException {
        URL oracle = new URL(
                "https://imdb-api.com/en/API/SearchMovie/k_mcx0w8k/" + title);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
    }
}
