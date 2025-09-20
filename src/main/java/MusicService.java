import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MusicService {
    private final List<Artist> artists = new ArrayList<>();
    private final List<Album> albums = new ArrayList<>();
    private final List<Song> songs = new ArrayList<>();

    public void setupInitialData() {
        Artist queen = new Artist("Queen");
        Artist metallica = new Artist("Metallica");
        artists.add(queen);
        artists.add(metallica);

        Song bohemianRhapsody = new Song("Bohemian Rhapsody", queen);
        Song weWillRockYou = new Song("We Will Rock You", queen);
        Song masterOfPuppets = new Song("Master of Puppets", metallica);
        Song enterSandman = new Song("Enter Sandman", metallica);
        songs.add(bohemianRhapsody);
        songs.add(weWillRockYou);
        songs.add(masterOfPuppets);
        songs.add(enterSandman);

        Album aNightAtTheOpera = new Album("A Night at the Opera", 1975, List.of(bohemianRhapsody));
        Album newsOfTheWorld = new Album("News of the World", 1977, List.of(weWillRockYou));
        Album metallicaAlbum = new Album("Metallica (The Black Album)", 1991, List.of(enterSandman));
        albums.add(aNightAtTheOpera);
        albums.add(newsOfTheWorld);
        albums.add(metallicaAlbum);
    }

    public List<Song> findSongsByArtist(Artist artist) {
        return songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .collect(Collectors.toList());
    }

    public List<Album> filterAlbumsByYear(int year) {
        return albums.stream()
                .filter(album -> album.getReleaseYear() == year)
                .collect(Collectors.toList());
    }

    public Artist findArtistByName(String name) {
        return artists.stream()
                .filter(artist -> artist.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}