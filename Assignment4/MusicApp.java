public class MusicApp {
    public static void main(String[] args) {
        Song[] songs = {new PopSong("Birds of a feather", "Billie Eilish"),
                new RockSong("Kerosene", "The warning"),
                new JazzSong("So easy", "Olivia Dean")
        };

        for(Song song: songs){
            song.play();
        }
    }
}

class Song{
    public String title;
    public String artist;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public void play(){
        System.out.println("Playing song");
    }
}

class PopSong extends Song{
    public PopSong(String title, String artist){
        super(title, artist);
    }

    @Override
    public void play(){
        System.out.println("Pop Song Playing...");
        System.out.println("Playing " + title + " by " + artist);
        System.out.println((" "));
    }
}

class RockSong extends Song{
    public RockSong(String title, String artist){
        super(title, artist);
    }

    @Override
    public void play(){
        System.out.println("Rock song playing...");
        System.out.println("Playing " + title + " by " + artist);
        System.out.println(" ");
    }
}

class JazzSong extends Song{
    public JazzSong(String title, String artist){
        super(title, artist);
    }

    @Override
    public void play(){
        System.out.println("Jazz Song Playing...");
        System.out.println("Playing " + title + " by " + artist);
    }
}
