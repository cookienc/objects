package practice.objects.music;

public class Song {
    private String singer;
    private String title;

    public Song(final String singer, final String title) {
        this.singer = singer;
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public String getTitle() {
        return title;
    }
}
