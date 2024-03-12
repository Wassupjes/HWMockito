import org.example.ProductManagerOfFilms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerOfFilmsTest {


    ProductManagerOfFilms manager = new ProductManagerOfFilms();


    @Test
    public void addNewFilm() {
        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель Белград";
        String film4 = "Джентельмены";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        String[] expected = {film1, film2, film3,film4};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void findLastLessLimit() {
        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель Белград";
        String film4 = "Джентельмены";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        String[] expected = {film4, film3, film2,film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoreLimit() {
        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель Белград";
        String film4 = "Джентельмены";
        String film5 = "Человек-невидимка";
        String film6 = "Тролли. Мировой тур";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        String[] actual = manager.findLast();
        String[] expected = {film6, film5, film4, film3, film2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastChangeLimitToLarge() {
        ProductManagerOfFilms manager = new ProductManagerOfFilms(6);
        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель Белград";
        String film4 = "Джентельмены";
        String film5 = "Человек-невидимка";
        String film6 = "Тролли. Мировой тур";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        String[] actual = manager.findLast();
        String[] expected = {film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }
}
