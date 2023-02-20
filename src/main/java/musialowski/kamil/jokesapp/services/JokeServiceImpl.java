package musialowski.kamil.jokesapp.services;

import musialowski.kamil.jokesapp.jokes.Quotes;
import musialowski.kamil.jokesapp.jokes.chuckNorrisJokes.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final Quotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
