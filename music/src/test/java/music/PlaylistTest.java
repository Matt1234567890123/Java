package music;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistTest {
    @Test
    public void testEmptyPlaylist() {
        Playlist playlist = new Playlist();
        assertTrue(playlist.isEmpty());
    }

    @Test
    public void addSingleSongTest() {
        Playlist playlist = new Playlist();
        playlist.add(new Song("Leslie Fish", "The Sun is Also a Warrior", 200));
        assertEquals(1, playlist.size());
    }

    @Test
    public void checkSameElement(){
        Playlist playlist = new Playlist();
        Song piosenka = new Song("Leslie Fish", "The Sun is Also a Warrior", 200);
        playlist.add(piosenka);
        assertEquals(piosenka, playlist.getFirst());
    }

    @Test
    public void checkEqualElement(){
        Playlist playlist = new Playlist();
        Song piosenka = new Song("Leslie Fish", "The Sun is Also a Warrior", 200);
        playlist.add(piosenka);
        Song piosenka2 = new Song("Leslie Fish", "The Sun is Also a Warrior", 200);
        assertEquals(piosenka2, playlist.getFirst());
    }

    @Test
    public void testAtSecond(){
        Playlist playlist = new Playlist();
        Song piosenka = new Song("Leslie Fish", "The Sun is Also a Warrior", 200);
        playlist.add(piosenka);
        Song piosenka2 = new Song("Leslie Fish", "The Day it Fell Apart", 150);
        playlist.add(piosenka2);
        assertEquals(piosenka, playlist.addSecond(100));
        //assertEquals(piosenka2, playlist.addSecond(300));
    }

    public IndexOutOfBoundsException testAtSecondThrowsExeptionCommon(int second) {
        Playlist playlist = new Playlist();
        Song piosenka = new Song("Leslie Fish", "The Sun is Also a Warrior", 200);
        playlist.add(piosenka);
        Song piosenka2 = new Song("Leslie Fish", "The Day it Fell Apart", 150);
        playlist.add(piosenka2);
        return assertThrows(IndexOutOfBoundsException.class, () -> playlist.addSecond(second));
    }

    @Test
    public void testAtSecondThrowsException(){
        IndexOutOfBoundsException exception = testAtSecondThrowsExeptionCommon(3000);
        assertEquals("Ran out of playlist.", exception.getMessage());
    }

    @Test
    public void testAtSecondThrowsExceptionForNegativeSeconds(){
        IndexOutOfBoundsException exception = testAtSecondThrowsExeptionCommon(-1);
        assertEquals("Negative time.", exception.getMessage());
    }
}
