package day06_30_09_2024.genericwithcollection;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer{

    public void playMyList(List<? extends Media> mediaList) {
        /* when wild card is used the collection can not be modified*/
//        mediaList.add(new Video()); // doesn't complile
        for (Media media : mediaList) {
            media.play();
        }
    }

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        List<Song> songList = new ArrayList<>();
        songList.add(new Song(123, "Mera mann"));
        songList.add(new Song(124, "Abhi Abhi"));
        songList.add(new Song(125, "Sajde"));

        mediaPlayer.playMyList(songList);
    }
}
