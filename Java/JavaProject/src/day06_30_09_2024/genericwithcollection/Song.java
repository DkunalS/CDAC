package day06_30_09_2024.genericwithcollection;

public class Song extends Media{

    private int srNo;
    private String songTitle;

    public Song(int srNo, String songTitle) {
        super();
        this.songTitle = songTitle;
        this.srNo = srNo;
    }

    @Override
    public String toString() {
        return "Song{" +
                "srNo=" + srNo +
                ", songTitle='" + songTitle + '\'' +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Song is Playing");

    }
}
