public class Main {
    public static void main(String[] args) {
        MusicService musicService = new MusicService();
        musicService.setupInitialData();

        System.out.println("--- Welcome to the Music Collection App! ---");

        System.out.println("\n--- Finding songs by Queen ---");
        Artist queen = musicService.findArtistByName("Queen");
        if (queen != null) {
            musicService.findSongsByArtist(queen)
                    .forEach(System.out::println);
        } else {
            System.out.println("Artist not found.");
        }

        int yearToFilter = 1991;
        System.out.println("\n--- Filtering albums released in " + yearToFilter + " ---");
        musicService.filterAlbumsByYear(yearToFilter)
                .forEach(album -> System.out.println(album.getTitle() + " (" + album.getReleaseYear() + ")"));

        System.out.println("\n--- End of demonstration ---");
    }
}