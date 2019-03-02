package tools.tools.guava.bean;

import java.io.Serializable;

public class Movie implements Serializable {

    private int id;
    private String movieName;
    private String movieSeNo;

    public Movie() {
    }

    public Movie(int id, String movieName, String movieSeNo) {
        this.id = id;
        this.movieName = movieName;
        this.movieSeNo = movieSeNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieSeNo() {
        return movieSeNo;
    }

    public void setMovieSeNo(String movieSeNo) {
        this.movieSeNo = movieSeNo;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieSeNo='" + movieSeNo + '\'' +
                '}';
    }
}
