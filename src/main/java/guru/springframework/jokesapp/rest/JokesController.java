package guru.springframework.jokesapp.rest;

import guru.springframework.jokesapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

  private final JokeService jokeService;

  @Autowired
  public JokesController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @RequestMapping({"/", ""})       // That's going to map out the context root for us. When we get
                                   // a request to the context root, this method on the controller
                                   // will get invoked to go to the JokeService, get a joke, append
                                   // it to the model and return it back to the view layer.
  
  public String showJoke(Model model) {

    // This method will take in a model. We are adding an attribute to the model called Joke and
    // it will be a random joke string from the JokeService and we are returning back the
    // view name of Chuck Norris.

    model.addAttribute("joke", jokeService.getRandomJoke());  // --> here we add an attribute
                                                                 // --> it's property is going to
                                                                 // --> be from the JokeService.

    return "chucknorris"; // ---> here we return View Name
  }

}
