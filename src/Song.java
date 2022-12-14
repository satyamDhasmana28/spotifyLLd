public class Song {
    String title;
    int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.title+" "+this.duration;
    }
}
