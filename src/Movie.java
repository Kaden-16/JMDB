
public class Movie {

    private String title;
    private int year;
    private String director;
    private String imageLink;
    private Actor[] actorList;
    private String imDbRating;
    // Might not be able to do it
    private String movieRating;
    private String id;
    private String plot;

    public Movie(String title, String director, String id, String poster,
            Actor[] actorList, String imDbRating, String movieRating,
            String year, String plot) {
        this.title = title;
        this.director = director;
        this.id = id;
        this.imageLink = poster;
        this.actorList = actorList;
        this.imDbRating = imDbRating;
        this.movieRating = movieRating;
        this.plot = plot;
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
        return imageLink;
    }

    public String getPlot() {
        return plot;
    }

    public Actor[] getActorList() {
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
