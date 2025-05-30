package music;

import java.util.ArrayList;

public class Playlist extends ArrayList<Song> {

    public Song addSecond (int time) {
        if (time<0) throw new IndexOutOfBoundsException("Negative time.");
        int sum=0;
        for(Song currentSong : this){
            sum += currentSong.getDuration();
            if(sum > time) return currentSong;
        }
        throw new IndexOutOfBoundsException("Ran out of playlist.");
        //return null;
    }
}
