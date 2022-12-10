package practice.objects.music;

public class PersonalPlaylist extends Playlist {
    public void remove(final Song song) {
        getTracks().remove(song);
        getSingers().remove(song.getSinger());
    }
}
