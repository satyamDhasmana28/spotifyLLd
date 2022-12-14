import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Album {
    String AlbumName;
    String singerName;
    int noOfSongs;
    ArrayList<Song> songList;

    public Album(String albumName, String singerName) {
        AlbumName = albumName;
        this.singerName = singerName;
        this.noOfSongs = 0;
        this.songList = new ArrayList<>();
    }
    public Album(){

    }

    public boolean isExist(String songName){
        for(Song song:songList){
            if(song.title==songName)
                return true;
        }
        return  false;
    }
    public boolean addSong(String songName,int duration){
     if(isExist(songName)){
         System.out.println("Song already exists");
         return false;
     }
     else {
         this.noOfSongs++;
//         Song toAdd = new Song(songName, duration);
//         songList.add(toAdd);
         this.songList.add(new Song(songName,duration));
         return true;
     }
    }
    public Song findSong(String songName){
     for(Song song:songList){
     if(song.title==songName)
         return song;
     }
     return  null;
    }

    public boolean isExist(String songTitle,LinkedList<Song> playlist){
        for(int i = 0 ; i < playlist.size();i++){
            if(Objects.equals(playlist.get(i).title, songTitle)){
                return true;
            }
        }
        return false;
    }
    public void addToPlaylist(String songTitle, LinkedList<Song> playlist){
        if(!isExist(songTitle)){
            System.out.println("Song doesn't exists");
        }
        else if(isExist(songTitle,playlist)){
            System.out.println("Already in playlist");
        }
        else{
            playlist.add(findSong(songTitle));
            System.out.println("Succesfully added to "+playlist);
        }
    }

    public boolean isExist(int trackNo,LinkedList<Song> playlist){
        String song = this.songList.get(trackNo-1).title;

        for(int i = 0 ; i < playlist.size() ; i++){
            if(Objects.equals(song,playlist.get(i).title)){
                return true;
            }
        }

        return false;
    }
    public void addToPlaylist(int trackNo,LinkedList<Song> playlist){
        if(trackNo>this.noOfSongs){
            System.out.println(trackNo+"'s song doesn't exist");
        }
        else if(isExist(trackNo,playlist)){
            System.out.println("track alrewady exist in playlist");
        }
        else {
            playlist.add(this.songList.get(trackNo - 1));
            System.out.println("Successfully added to" +playlist);
        }
    }

    @Override
    public String toString(){
        return "Album{"+this.AlbumName+","+this.singerName+","+this.noOfSongs+","+this.songList;
    }
}
