package practice.objects.music;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> trackes = new ArrayList<>();

    public void append(final Song song) {
        getTracks().add(song);
    }

    public List<Song> getTracks() {
        return trackes;
    }
}
