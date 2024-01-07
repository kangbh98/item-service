package hello.itemservice.domain.web.basic;

import hello.itemservice.domain.item.Gas;
import hello.itemservice.domain.item.GasRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/basic/items")
@RequiredArgsConstructor
public class BasicItemController {

    private final GasRepository gasRepository;

    @GetMapping
    public String items(Model model) {
        List<Gas> gas = gasRepository.findAll();
        model.addAttribute("gas", gas);
        return "basic/items";
    }

    @GetMapping("/{gasId}")
    public String item(@PathVariable("gasId") Long gasId, Model model) {
        Gas byId = gasRepository.findById(gasId);
        model.addAttribute("gas", byId);
        return "basic/item";
    }

    @GetMapping("/add")
    public String addForm(){
        return "/basic/addForm";
    }
    @PostMapping("/add")
    public String save(
            @RequestParam("gasName") String gasName,
            @RequestParam("harmful") int harmful,
            @RequestParam("quantity") int quantity,
            Model model
    ){
        Gas gas = new Gas();
        gas.setGasName(gasName);
        gas.setHarmful(harmful);
        gas.setQuantity(quantity);
        gasRepository.save(gas);

        model.addAttribute("gas", gas);
        return "/basic/item";
    }

    @GetMapping("/{gasId}/edit")
    public String editForm(@PathVariable("gasId") Long gasId, Model model) {
        Gas byId = gasRepository.findById(gasId);
        model.addAttribute("gas", byId);
        return "/basic/editForm";
    }

    @PostMapping("/{gasId}/edit")
    public String edit(@PathVariable("gasId") Long gasId, @ModelAttribute Gas gas) {

        gasRepository.update(gasId,gas);

        return "redirect:/basic/items/{gasId}";
    }

    @PostConstruct
    public void init() {
        gasRepository.save(new Gas("독방구", 10, 4));
        gasRepository.save(new Gas("똥방구", 7, 8));
        gasRepository.save(new Gas("소리 큰 방구", 3, 6));
    }
}
