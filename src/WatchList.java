
public class WatchList {

    private String watchList[];
    private int amountMovies = 0;

    private void addToWatchList(String title) {
        watchList[amountMovies] = title;
        amountMovies++;
    }

    private String[] getWatchList() {
        return watchList;
    }
}
