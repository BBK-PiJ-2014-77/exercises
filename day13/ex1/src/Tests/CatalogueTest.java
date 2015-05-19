package Tests;

import Classes.LibraryCatalogue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Classes.LibraryCatalogue;
import Classes.LibraryBook;

import static org.junit.Assert.*;

public class CatalogueTest {


    private LibraryBook bladeRunner;
    private LibraryBook endersGame;
    private LibraryBook stark;
    private LibraryCatalogue library;

    @Before
    public void buildup() {
        bladeRunner = new LibraryBook("BladeRunner", 1);
        endersGame = new LibraryBook("EndersGame", 2);
        stark = new LibraryBook("Stark", 3);
        library = new LibraryCatalogue();
    }

    @After
    public void cleanup() {

    }

    @Test
    public void testGet() {
        library.add(bladeRunner);
        String expected = "BladeRunner";
        String output = library.get(1);
        assertEquals(expected, output);
    }

    @Test
    public void testAdd() {
        library.add(bladeRunner);
        String expected = "BladeRunner";
        String output = library.get(1);
        assertEquals(expected, output);
    }

    @Test
    public void testRemove() {
        library.add(bladeRunner);
        library.add(endersGame);
        library.remove(bladeRunner);
        String expected = "NotPresent";
        String output = library.get(1);
        assertEquals(expected, output);

    }

    @Test
    public void testRemove1() {
        library.add(bladeRunner);
        library.add(endersGame);
        library.remove(2);
        String expected = "NotPresent";
        String output = library.get(2);
        assertEquals(expected, output);

    }

    @Test
    public void testEmptyRemove() {
        library.add(bladeRunner);
        library.add(endersGame);
        library.remove(3);
        String expected = "NotPresent";
        String output = library.get(3);
    }

    @Test
    public void testEmptyRemove1() {
        library.add(bladeRunner);
        library.add(endersGame);
        library.remove(3);
        String expected = "NotPresent";
        String output = library.get(stark);
    }


}