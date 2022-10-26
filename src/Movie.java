
public class Movie {
    
    private String title;
    private int year;
    private String director;
    private String poster;
    private String[] actorList;
    private double reviewRating;
    //Might not be able to do it
    private String movieRating;
    
    public Movie(String title, String director, String poster, String[] actorList,
            double reviewRating, String movieRating, int pages, int year) {
        this.title = title;
        this.director = director;
        this.poster = poster;
        this.actorList = actorList;
        this.reviewRating = reviewRating;
        this.movieRating = movieRating;
        this.year = year;
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
    
    public double getReviewRating() {
        return reviewRating;
    }

    public String movieRating() {
        return movieRating;
    }
    
    public int getYear() {
        return year;
    }
    
    
}
