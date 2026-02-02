import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.AfishaManager;

public class AfishaManagerTest {

    @Test

    public void test() {

        AfishaManager afisha = new AfishaManager();

        afisha.add("Film One");
        afisha.add("Film Two");
        afisha.add("Film Three");

        String[] actual = afisha.findAll();
        String[] expected = {"Film One", "Film Two", "Film Three"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        AfishaManager afisha = new AfishaManager();

        afisha.add("Film One");
        afisha.add("Film Two");
        afisha.add("Film Three");
        afisha.add("Film Four");
        afisha.add("Film Five");

        String[] actual = afisha.findLastFilms();
        String[] expected = {"Film Five", "Film Four", "Film Three", "Film Two", "Film One"};
        ;
        Assertions.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void test2() {
//        AfishaManager afisha = new AfishaManager();
//
//        afisha.add("Film One");
//        afisha.add("Film Two");
//        afisha.add("Film Three");
//        afisha.add("Film Four");
//        afisha.add("Film Five");
//
//        String[] actual = afisha.findLastFilms();
//        String[] expected = {"Film Five", "Film Four", "Film Three", "Film Two", "Film One"};;
//        Assertions.assertArrayEquals(expected, actual);
//    }

    @Test
    public void test2() {
        AfishaManager afisha = new AfishaManager();

        afisha.add("Film One");
        afisha.add("Film Two");
        afisha.add("Film Three");
        afisha.add("Film Four");
        afisha.add("Film Five");
        afisha.add("Film Six");

        String[] actual = afisha.findLastFilms();
        String[] expected = {"Film Six", "Film Five", "Film Four", "Film Three", "Film Two"};
        ;
        Assertions.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void test4() {
//        AfishaManager afisha = new AfishaManager();
//
//        afisha.add("Film One");
//        afisha.add("Film Two");
//        afisha.add("Film Three");
//        afisha.add("Film Four");
//        afisha.add("Film Five");
//
//        String[] actual = afisha.findLastFilms();
//        String[] expected = {"Film Five", "Film Four", "Film Three", "Film Two", "Film One"};;
//        Assertions.assertArrayEquals(expected, actual);
//    }

    @Test
    public void test3() {
        AfishaManager afisha = new AfishaManager(7);

        afisha.add("Film One");
        afisha.add("Film Two");
        afisha.add("Film Three");
        afisha.add("Film Four");
        afisha.add("Film Five");
        afisha.add("Film Six");
        afisha.add("Film Seven");

        String[] actual = afisha.findLastFilms();
        String[] expected = {"Film Seven", "Film Six", "Film Five", "Film Four", "Film Three"};
        ;
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test4() {

        AfishaManager afisha = new AfishaManager();

        afisha.add("Film One");
        afisha.add("Film Two");

        String[] actual = afisha.findLastFilms();
        String[] expected = {"Film Two", "Film One"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
