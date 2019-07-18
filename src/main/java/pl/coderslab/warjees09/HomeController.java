package pl.coderslab.warjees09;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        log.info("Info message");
        log.warn("warn");
        log.error("error message");
        return "home";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "Here you can find some details for logged users";
    }

    @GetMapping("/home")
    public String homeAction() {
        return "home";
    }
}
