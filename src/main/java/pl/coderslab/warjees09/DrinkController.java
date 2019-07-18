package pl.coderslab.warjees09;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("drink")
@Slf4j
public class DrinkController {
    private final DrinkRepository drinkRepository;

    public DrinkController(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("drinks", drinkRepository.findAll());
        return "drink/list";
    }
    @GetMapping("/list-page")
    public String listPaged(Model model, Pageable pageable) {
        Page<Drink> page = drinkRepository.findAll(pageable);

        model.addAttribute("page", page);
        return "drink/list-page";
    }

    @GetMapping("/delete/{id}")
    public String list(Model model, @PathVariable int id, RedirectAttributes redirectAttributes) {
        log.info("id: {}", id);
        log.info("id: " + id);
        drinkRepository.deleteById(id);
        redirectAttributes.addFlashAttribute("message", "Usunięty prawidłowo ");
        return "redirect:/drink/list";
    }
}
