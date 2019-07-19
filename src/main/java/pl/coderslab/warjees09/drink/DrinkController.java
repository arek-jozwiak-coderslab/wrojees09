package pl.coderslab.warjees09.drink;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.coderslab.warjees09.storage.StorageService;

import javax.validation.Valid;

@Controller
@RequestMapping("drink")
@Slf4j
public class DrinkController {
    private final DrinkRepository drinkRepository;
    private final StorageService storageService;

    public DrinkController(DrinkRepository drinkRepository, StorageService storageService) {
        this.drinkRepository = drinkRepository;
        this.storageService = storageService;
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

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("drink", new Drink());
        return "drink/add";
    }

    @PostMapping("/add")
    public String addPersonPerform(@RequestParam("file") MultipartFile file,
                                   @ModelAttribute @Valid Drink drink, BindingResult result,
                                   RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "drink/add";
        }
        if (!file.isEmpty()) {
            String store = storageService.store(file);
            drink.setOriginalFileName(file.getOriginalFilename());
            drink.setFileName(store);
        }
        redirectAttributes.addFlashAttribute("message", "Hero dodany prawidłowo ");

        drinkRepository.save(drink);
        return "redirect:/drink/list";
    }
}
