import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataBase {

    public static Movie[] SearchMovie(String title) throws IOException {
        Movie[] movieList = new Movie[3];

        URL oracle = new URL(
                "imdb-api.com/en/API/SearchMovie/k_mcx0w8kk/" + title);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            JSONObject jsonObject = (JSONObject) jsonParser.parse(inputLine);

            // now get id & value
            String Description = (String) jsonObject.get("description");
            String title = (String) jsonObject.get("title");

            movieList[i] = new Movie(title, Description);
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
