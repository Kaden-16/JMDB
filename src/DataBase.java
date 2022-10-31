import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DataBase {

    public static Movie[] SearchMovie(String title) throws IOException {
        Movie[] movieList = new Movie[3];

        URL oracle = new URL(
                "https://imdb-api.com/en/API/SearchMovie/k_mcx0w8k/" + title);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));
        
        String inputLine;
                
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            
        }
        
        JSONArray msg = (JSONArray) inputLine;

        for(int i = 0;i < msg.length();i++ ) {
            JSONObject jsonObj = msg.getJSONObject(i);

            //now get id & value
            int year = jsonObj.getInt("year");
            String title = jsonObj.getString("title");

            movieList[i] = new Movie(title, year);
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
