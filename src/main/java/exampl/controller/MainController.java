package exampl.controller;


import exampl.DTO.CatDTO;
import exampl.entity.Cat;
import exampl.service.CatService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "main_method")
@RestController
@RequiredArgsConstructor
public class MainController {

    private final CatService catService;

    @GetMapping("/cats")
    public String getCat() {
        return catService.getAllCats();
    }

    @Operation(
            summary = "Кладет нового котика в базу",
            description = "Принимает DTO кота и собирает его в обычного кота, а после сохраняет его в бд"
    )
    @PostMapping("/cats/add")
    public String addCat(@RequestBody CatDTO catDTO) {
        return catService.addCat(catDTO);
    }

    @DeleteMapping("/cats/add")
    public String deleteCat(@RequestParam Integer id) {
        return catService.deleteCat(id);
    }

    @GetMapping("/cat")
    public String getCat(@RequestParam Integer id) {
        return catService.getCatById(id);
    }

    @PutMapping("/cats/add")
    public String updateCat(@RequestBody Cat cat) {
        return catService.updateCat(cat);
    }
}
