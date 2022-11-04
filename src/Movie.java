
public class Movie {

    private String title;
    private int year;
    private String director;
    private String poster;
    private String[] actorList;
    private String imDbRating;
    // Might not be able to do it
    private String movieRating;
    private String id;
    public Movie(String title, String description) {
        this.title = title;
        String answer;
        if (description.contains("(")) {
            answer = description.substring(description.indexOf("(") + 1,
                    description.indexOf(")"));
        } else {
            answer = description.substring(0, 4).trim();
        }
        try {
            this.year = Integer.parseInt(answer);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
    
    public Movie(String title, String description, String id) {
        this.title = title;
        String answer;
        if (description.contains("(")) {
            answer = description.substring(description.indexOf("(") + 1,
                    description.indexOf(")"));
        } else {
            answer = description.substring(0, 4).trim();
        }
        try {
            this.year = Integer.parseInt(answer);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        this.id = id;
    }

    public Movie(String title, String director, String id, String poster,
            String[] actorList, String imDbRating, String movieRating,
            String year) {
        this.title = title;
        this.director = director;
        this.id = id;
        this.poster = poster;
        this.actorList = actorList;
        this.imDbRating = imDbRating;
        this.movieRating = movieRating;
        try {
            this.year = Integer.parseUnsignedInt(year);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getPoster() {
        return poster;
    }

    public String[] getActorList() {
        return actorList;
    }

    public String getIMDBRating() {
        return imDbRating;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public String getID() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
