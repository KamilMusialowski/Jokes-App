package musialowski.kamil.jokesapp.jokes;

import java.util.Arrays;
import java.util.List;

public interface Quotes {

    List<String> quotes = Arrays.asList("Default joke");

    String getRandomQuote();
}
