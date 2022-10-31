import java.io.BufferedReader;
import java.io.*;
import java.util.*;

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

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println("\n" +inputLine);
   
            ObjectMapper map = new ObjectMapper();
            
            // now get id & value
            String Description = (String) jsonObject.get("description");
            String title = (String) jsonObject.get("title");
           // movieList[i] = new Movie(title, Description);
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
