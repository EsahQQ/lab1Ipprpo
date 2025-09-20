public class Song {
    private String title;
    private Artist artist;

    public Song(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "Track: " + title + " (Artist: " + artist.getName() + ")"; // Новая версия
    }
}