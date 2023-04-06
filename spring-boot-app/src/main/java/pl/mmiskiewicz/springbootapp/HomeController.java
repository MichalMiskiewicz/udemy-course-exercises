package pl.mmiskiewicz.springbootapp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mmiskiewicz.springbootapp.repository.UserRepository;

@Controller
@AllArgsConstructor
public class HomeController {

    private final String title = "Test Page";
    private final UserRepository userRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title", title);
        model.addAttribute("users", userRepository.findAll());

        return "index";
    }

    @GetMapping("/home")
    public String home(Model model,
                       @RequestParam(value = "name", required = false, defaultValue = "Guest") String name) {
        model.addAttribute("name", name);
        model.addAttribute("title", title);
        return "home";
    }

    @GetMapping("/user/view/{id}")
    public String singleUserView(@PathVariable("id") int id, Model model){
        model.addAttribute("title", title);
        model.addAttribute("user", userRepository.findById(id).orElseThrow());

        return "user/view";
    }

}
