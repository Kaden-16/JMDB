import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DataBase {

    public static String[] SearchMovie(String title) throws IOException {
        String[] movieList = new String[3];

        URL oracle = new URL(
                "https://imdb-api.com/en/API/SearchMovie/k_mcx0w8k/" + title);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));
        
        String inputLine;
        
        int value = 0;
        
        while ((inputLine = in.readLine()) != null) {
            if (value < 2) {
                movieList[value] = inputLine;
                value++;
            } else {
                break;
            }
        }
        in.close();

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
