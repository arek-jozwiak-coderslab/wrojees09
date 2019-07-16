package pl.coderslab.warjees09;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("drink")

public class DrinkController {
    private final DrinkRepository drinkRepository;

    public DrinkController(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("drinks", drinkRepository.findAll());
        return "drink/list";
    }
}
