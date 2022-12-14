import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Album rhinosh = new Album("HER","Rhinosh");
        rhinosh.addSong("Baateein",4);
        rhinosh.addSong("waqt",3);
        rhinosh.addSong("cover",7);
//        Song toFind=rhinosh.findSong("cover");
//        System.out.println(rhinosh);
        LinkedList<Song> minePlaylist = new LinkedList<>();
        rhinosh.addToPlaylist("waqt",minePlaylist);
        rhinosh.addToPlaylist(3,minePlaylist);
    }
}