import java.util.List;

public class Album {
    private String title;
    private int releaseYear;
    private List<Song> songs;

    public Album(String title, int releaseYear, List<Song> songs) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.songs = songs;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    // Другие геттеры по необходимости
}