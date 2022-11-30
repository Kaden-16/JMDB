import com.fasterxml.jackson.databind.JsonNode;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    public static Movie[] SearchMovie(String title) throws IOException  {
        
        if(containsIllegals(title)) {
            JFrame jFrame = new JFrame();
            
            JOptionPane.showMessageDialog(jFrame, "Please dont enter an illegal charecter to break the search!\n"
                    + "The Program will now exit");
            System.exit(0);
        }
        
        Movie[] movieList = new Movie[10];

        URL oracle = null;
        try {
          if (title.contains(" ") ) {
              title = title.replace(" ", "%20");
          }
          
          oracle = new URL(
                    "https://imdb-api.com/en/API/SearchMovie/k_mcx0w8kk/"
                            + title);
          
        } catch (MalformedURLException e) {
            JFrame jFrame = new JFrame();

            JOptionPane.showMessageDialog(jFrame, "Error Connecting to the API\n The Program will now exit");
            System.exit(0);
        }

        InputStream in = oracle.openStream();

        ObjectMapper map = new ObjectMapper();

        JsonNode tree = map.readTree(in);
//        InputStream is = new URL(url).openStream();
        
//        try {
//          BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
//          String jsonText = readAll(rd);
//          JSONObject json = new JSONObject(jsonText);
//          return json;
//        } finally {
//          is.close();
//        }
        for (int i = 0; i < 6;) {
            try {
                
                movieList[i] = new Movie(
                        tree.get("results").get(i).get("title").asText(), null,
                        tree.get("results").get(i).get("id").asText(), null,
                        null, null, null,
                        tree.get("results").get(i).get("description").asText(),
                        null);
                i++;
            } catch (NullPointerException e) {
                i++;
                movieList[i] = new Movie(
                        tree.get("results").get(i).get("title").asText(), "",
                        tree.get("results").get(i).get("id").asText(), "",
                        null, "", "",
                        tree.get("results").get(i).get("description").asText(),
                        null);
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


    
    public static boolean containsIllegals(String toExamine) {
        Pattern pattern = Pattern.compile("[/~#@*+%{}<>\\[\\]|\"\\_^]");
        Matcher matcher = pattern.matcher(toExamine);
        return matcher.find();
    }
    
}
