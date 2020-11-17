package guru.springframework.jokesapp.service;

import org.springframework.stereotype.Service;

@Service
public interface JokeService {

  String getRandomJoke();

}
