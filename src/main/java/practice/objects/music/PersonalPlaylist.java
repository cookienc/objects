package practice.objects.music;

public class PersonalPlaylist {
    private Playlist playlist = new Playlist();

    public void append(final Song song) {
        playlist.append(song);
    }

    public void remove(final Song song) {
        playlist.getTracks().remove(song);
        playlist.getSingers().remove(song.getSinger());
    }
}
