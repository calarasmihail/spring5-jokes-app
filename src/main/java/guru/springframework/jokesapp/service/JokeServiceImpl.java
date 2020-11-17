package guru.springframework.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  // JAVA *TIPS*
  // I am doing a final variable there and so it cannot be changed. I'm initializing it inside
  // the constructor (JokeServiceImpl), so the constructor doesn't need to know anything about
  // it. That way, Spring wiil create once and then will be reused in that class.

  public JokeServiceImpl() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getRandomJoke() {
    return chuckNorrisQuotes.getRandomQuote();
  }
}
