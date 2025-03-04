package io.everyonecodes.java.t5_optionals_exceptions.reflection;

public class App {
    public static void main(String[] args) {
        PlaylistMaker playlistMaker = new PlaylistMaker();
        SongPicker picker = new SongPicker();

        System.out.println(picker.pick(playlistMaker.makePlaylist()));
    }
}
